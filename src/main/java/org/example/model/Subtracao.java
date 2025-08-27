package org.example.model;

public class Subtracao implements Operacao{
    @Override
    public String getNome(){
        return "Subtração";
    }

    @Override
    public double executar(double a, double b){
        return a - b;
    }
}
