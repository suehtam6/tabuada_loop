package br.senai.sp.jandira.tabuada.model;

import java.util.Scanner;

public class tabuada {


    public String[] tabuada;
    public int multiplicadorInicial;
    public int multiplicando;
    public int multiplicadorFinal;


    public void obterDados() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Qual o número que vai ser multiplicado?");
        multiplicando = leitor.nextInt();

        System.out.print("Qual vai ser o multiplicador inicial?");
        multiplicadorInicial = leitor.nextInt();

        System.out.print("Qual vai ser o multiplicador final?");
        multiplicadorFinal = leitor.nextInt();


        calcularTabuada();
    }

    public void calcularTabuada() {

        int apoio = 0;
        if (multiplicadorFinal < multiplicadorInicial) {
            apoio = multiplicadorFinal;
            multiplicadorFinal = multiplicadorInicial;
            multiplicadorInicial = apoio;
        }

        int tamanho = multiplicadorFinal - multiplicadorInicial + 1 ;
        tabuada = new String[tamanho];

        int i = 0;
        while (i < tamanho) {
            int produto = multiplicando * multiplicadorInicial;
            tabuada[i] = multiplicando + " X " + multiplicadorInicial + " = " + produto;
            multiplicadorInicial = multiplicadorInicial + 1;
            i = i + 1;


        }

        exibirTabuada();
    }

        public void exibirTabuada() {
            System.out.println("===========================");
            System.out.println("RESULTADO DA TABUADA");
            System.out.println("===========================");

            int i = 0;
            while (i < tabuada.length) {
                System.out.println(tabuada[i]);
                i++; // i = i + 1
            }

            System.out.println("===========================");
            System.out.println("FIM DA TABUADA");
            System.out.println("===========================");

        }

}
