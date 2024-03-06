package br.fai.lds.ex03.models;

public class Cachorro  extends Animal{
    public Cachorro() {
        setId(2);
        setIdade(10);
        setNome("aroldo");
        String nome = getNome();
        System.out.println("Nome do cachorro: " + nome);

    }
    public Cachorro(String nomeDoCachorro){
        setNome(nomeDoCachorro);
    }
}
