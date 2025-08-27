package org.example.model;

public class Soma implements Operacao{
    @Override
    public String getNome(){
        return "Soma";
    }

    @Override
    public double executar(double a, double b){
        return a + b;
    }
}
