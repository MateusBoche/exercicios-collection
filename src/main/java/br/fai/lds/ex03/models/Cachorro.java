package br.fai.lds.ex03.models;

public class Cachorro  extends Animal{

    public Cachorro(String nome){
        setNome(nome);

    }

    @Override
    public void som() {
        System.out.println("Eu gosto de latir");
    }

    public void oQueGostoDeFazer(){
        System.out.println("Gosto de morder carteiros");
    }
}
