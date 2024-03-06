package br.fai.lds;

import java.util.HashMap;
import java.util.Map;

public class Exercicio02 {
    private Map<String, String> mapa = new HashMap<>();
    public static void main(String[] args) {

        Exercicio02 app = new Exercicio02();
        app.start();
    }

    private void start() {
        adicionarItensNoMapa();
        iterarMapa();
        exibirValorDoMapaPelaChave("ZORO");
        exibirValorDoMapaPelaChave("MG");
        mapa.put("SRS", "Santa Rita");
        iterarMapa();
    }

    private void exibirValorDoMapaPelaChave(String chave) {

        try {
            if (mapa.containsKey(chave)) {
                System.out.println("Valor da chave: " + chave + ":" + mapa.get(chave));
            } else {
                System.out.println("Chave " + chave +" não existe");
                throw new  RuntimeException("Chave inexixtente");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("-------------------------------");
        }


    }

    private void iterarMapa() {
        for (String chave : mapa.keySet()){
            String valor= mapa.get(chave);

            System.out.println("Chave: " + chave + " | Valor: " + valor);
        }

    }

    private void adicionarItensNoMapa() {

        mapa.put("SRS","Santa Rita do Sapucaí ");
        mapa.put("PA","Pouso Alegre");
        mapa.put("ITA","Itajubá ");
        mapa.put("ZORO","Conceição dos Ouros ");
        mapa.put("CAXU","Cachoeira de Minas ");

    }

}
