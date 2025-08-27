package org.example.model;

public class Divisao implements Operacao{
    @Override
    public String getNome() {
        return "Divisão";
    }

    @Override
    public double executar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}
