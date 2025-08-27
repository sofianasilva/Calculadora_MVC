package org.example.controller;

import org.example.model.Operacao;
import org.reflections.Reflections;

import java.util.*;

public class CalculadoraController {
    private final Map<Integer, Operacao> operacoes = new HashMap<>();

    public CalculadoraController() {
        carregarOperacoes();
    }

    private void carregarOperacoes() {
        Reflections reflections = new Reflections("org.example.model");
        Set<Class<? extends Operacao>> classes = reflections.getSubTypesOf(Operacao.class);

        int index = 1;
        for (Class<? extends Operacao> clazz : classes) {
            try {
                Operacao op = clazz.getDeclaredConstructor().newInstance();
                operacoes.put(index++, op);
            } catch (Exception e) {
                System.out.println("Erro ao carregar operação: " + clazz.getName());
                e.printStackTrace();
            }
        }
    }

    public void listarOperacoes() {
        operacoes.forEach((i, op) -> System.out.println(i + " - " + op.getNome()));
    }

    public double executarOperacao(int escolha, double a, double b) {
        Operacao op = operacoes.get(escolha);
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida!");
        }
        return op.executar(a, b);
    }
}
