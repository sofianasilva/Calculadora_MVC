package org.example.model;

public class Multiplicacao implements Operacao{
    @Override
    public String getNome() {
        return "Multiplicação";
    }

    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
