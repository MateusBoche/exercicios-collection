package br.fai.lds.ex03.models;

public abstract class  Animal {
    private String cor = "preto";
    private int idade = 5;
    private String nome = "não definido";



    public  void som(){
        System.out.println("Este é o som padrão de um animal: zzzz");
    }
    public void dizerMeuNome(){
        System.out.println("Nome do animal: xxx");
    }
    private void dizerMinhaIdade(){
        System.out.println("Minha idade é: xxx");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
}

