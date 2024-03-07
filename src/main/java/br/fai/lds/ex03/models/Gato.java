package br.fai.lds.ex03.models;

public class Gato extends Animal {

    public Gato() {
        setCor("branco");
    }
    public Gato(String cor){
        setCor(cor);

    }

    @Override
    public void som() {
        super.som();
        System.out.println("Eu gosto de miar");
    }

    public void oQuefacoDuranteANoite(){
        System.out.println("Gosto de pular a cerca toda noite");
    }
}
