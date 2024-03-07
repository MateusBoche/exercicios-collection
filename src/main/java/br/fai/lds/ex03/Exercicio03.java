package br.fai.lds.ex03;

import br.fai.lds.ex03.models.Animal;
import br.fai.lds.ex03.models.Cachorro;
import br.fai.lds.ex03.models.Gato;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        Exercicio03 app = new Exercicio03();
        app.start();
    }

    private void start() {
//        Animal cachorro =new Cachorro();
//        Animal segundoCachorro =new Cachorro("Tiburcinho");
//        System.out.println("nome do segundo cachorro: " + segundoCachorro.getNome());
//        Cachorro cachorro = new Cachorro("vida que segue");
//        cachorro.som();
//
//        Gato gato = new Gato();
//        gato.som();

        Cachorro primeiroCachorro = new Cachorro("Tiburssinho");
        Cachorro segundoCachorro = new Cachorro("Aroldo");

        primeiroCachorro.setCor("Azul");

        List<Cachorro>cachorros = new ArrayList<>();
        cachorros.add(primeiroCachorro);
        cachorros.add(segundoCachorro);

        for(Cachorro cachorro: cachorros){
            System.out.println("Nome do cachorro: " + cachorro.getNome());
            System.out.println("Cor do cachorro: " + cachorro.getCor());
            System.out.println("Idade do cachorro: " + cachorro.getIdade());

            cachorro.som();
            cachorro.oQueGostoDeFazer();
            cachorro.dizerMeuNome();

            System.out.println("--------------");
        }
        Gato primeiroGato = new Gato();
        Gato segundoGato = new Gato("Amarelo");

        List<Gato>gatos = new ArrayList<>();

        gatos.add(primeiroGato);
        gatos.add(segundoGato);

        for (int i = 0; i < gatos.size(); i++) {
            Gato gato = gatos.get(i);
            System.out.println("Nome do gato: " + gato.getNome());
            System.out.println("Idade do gato: " + gato.getIdade());
            System.out.println("cor do gato: " + gato.getCor());

            gato.som();
            gato.dizerMeuNome();
            gato.oQuefacoDuranteANoite();
            System.out.println("---------------------------------------");

        }

        List<Animal>animais = new ArrayList<>();
        animais.add(primeiroCachorro);
        animais.add(segundoCachorro);
        animais.add(primeiroGato);
        animais.add(segundoGato);


        for (Animal animal:animais){
            animal.som();
            animal.dizerMeuNome();

            if(animal instanceof Cachorro){
                Cachorro cachorro = (Cachorro) animal;
                cachorro.oQueGostoDeFazer();
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                gato.oQuefacoDuranteANoite();


            }
        }


    }

}
