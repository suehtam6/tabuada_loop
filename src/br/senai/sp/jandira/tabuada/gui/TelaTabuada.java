package br.senai.sp.jandira.tabuada.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        stage.setWidth(500); // Colocando a largura da tela
        stage.setHeight(500); // Colocando a altura da tela
        stage.setResizable(false); // Não estou deixando a pagina ser aumentada e nem diminuida
        stage.setTitle("Tabuada"); // Colocando um nome no aplicativo


        // Criar o root = componente de leiuate principal
        // O nome root é usado por ser uma boa pratica quando vamos usar o JavaFx

        VBox root = new VBox();
        Scene scene = new Scene(root); // Criando a cena e colocamos o root nela
        stage.setScene(scene); // Adicionamos a cena




        stage.show();

    }





}
