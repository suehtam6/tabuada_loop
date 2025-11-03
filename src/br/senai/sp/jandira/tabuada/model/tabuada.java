package br.senai.sp.jandira.tabuada.model;

import java.util.Scanner;

public class tabuada {


    int multiplicadorInicial;
    int multiplicando;
    int multiplicadorFinal;
    int situacao;
    int [] calcularFinal = new int [multiplicadorFinal];



      public void obterDados() {

          Scanner leitor = new Scanner(System.in);

          System.out.println("======================");
          System.out.println("Qual o número que vai ser multiplicado?");
          multiplicando = leitor.nextInt();

          System.out.println("Qual vai ser o miltiplicador inicial?");
          multiplicadorInicial = leitor.nextInt();

          System.out.println("Qual vai ser o miltiplicador final?");
          multiplicadorFinal = leitor.nextInt();


        trocarDados();


      }

      public void trocarDados() {



          System.out.println(multiplicadorInicial);
          System.out.println(multiplicadorFinal);

      }



}
