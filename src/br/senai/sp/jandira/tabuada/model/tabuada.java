package br.senai.sp.jandira.tabuada.model;

import java.util.Scanner;

public class tabuada {

    double multiplicando;
    double multiplicadorInicial;
    double multiplicadorFinal;


      public void exibirDados() {

          Scanner leitor = new Scanner(System.in);

          System.out.println("======================");
          System.out.println("Qual o número que vai ser multiplicado?");
          multiplicando = leitor.nextDouble();

          System.out.println("Qual vai ser o miltiplicador inicial?");
          multiplicadorInicial = leitor.nextDouble();

          System.out.println("Qual vai ser o miltiplicador final?");
          multiplicadorFinal = leitor.nextDouble();


      }





    }




}
