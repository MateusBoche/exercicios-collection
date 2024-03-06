package br.fai.lds.ex03;

import br.fai.lds.ex03.models.Animal;
import br.fai.lds.ex03.models.Cachorro;
import br.fai.lds.ex03.models.Gato;

public class Exercicio03 {
    public static void main(String[] args) {
        Exercicio03 app = new Exercicio03();
        app.start();
    }

    private void start() {
        Animal cachorro =new Cachorro();
        Animal segundoCachorro =new Cachorro("Tiburcinho");
        System.out.println("nome do segundo cachorro: " + segundoCachorro.getNome());

    }

}
