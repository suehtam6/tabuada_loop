package br.senai.sp.jandira.tabuada.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
        root.setStyle("-fx-background-color: #cccfd0;");

        stage.setScene(scene); // Adicionamos a cena

        // Criando o header da tela
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: rgb(121,115,115);");
        header.setStyle("-fx-padding: 10;");

        // Colocar o conteúdo no header
        Label lblTitulo = new Label("Tabuada"); // Criando uma label para o titulo
        lblTitulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;"); // Mudando o formato das fontes
        Label lblSubTitulo = new Label("Crie a tabuada que a sua imaginação mandar!"); // Criando uma label para o subtitulo
        lblSubTitulo.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-text-fill: white;");

        // Colocar os label dentro do header
        header.getChildren().addAll(lblTitulo,lblSubTitulo);

        //Criar o grid de formulario
        GridPane gridFormulario = new GridPane(); // Criando o grid
        gridFormulario.setPrefHeight(100); // Colocando tamanho no grid
        gridFormulario.setStyle("-fx-background-color: rgba(126,126,126,0.5);"); // Colocando cor no grid

        // Criar o conteúdo do grid
        Label lblMultiplicando = new Label("Multiplicando: "); // Criando a Label multiplicando
        TextField tfMultiplicando = new TextField();
        lblMultiplicando.setStyle("-fx-font-size:15px;");

        Label lblMenorMultiplicando = new Label("Menor Multiplicando: ");
        TextField tfMenorMultiplicando = new TextField();
        lblMenorMultiplicando.setStyle("-fx-font-size:15px;");

        Label lblMaiorMultiplicando = new Label("Maior Multiplicando: ");
        TextField tfMaiorMultiplicando = new TextField();
        lblMaiorMultiplicando.setStyle("-fx-font-size:15px;");

        // Colocar as label e TextField no gridpane
        gridFormulario.add(lblMultiplicando, 0, 0);
        gridFormulario.add(tfMultiplicando, 1, 0);
        gridFormulario.add(lblMenorMultiplicando, 0, 1);
        gridFormulario.add(tfMenorMultiplicando, 1, 1);
        gridFormulario.add(lblMaiorMultiplicando, 0, 2);
        gridFormulario.add(tfMaiorMultiplicando, 1, 2);



        //Criar caixa dos botãos
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: rgba(126,126,126,0.5);");

        // Criando os botões
        Button btnCalcular = new Button("Calcular");
        Button btnLimpar = new Button("Limpar");
        Button btnSair = new Button("Sair");

        // Colocando o conteúdo no botão
        boxBotoes.getChildren().addAll(btnCalcular, btnLimpar, btnSair);

        // Criar a caixa de resultados
        VBox boxResultado = new VBox();
        boxResultado.setPrefHeight(100);
        boxResultado.setStyle("-fx-background-color: rgba(126,126,126,0.5);");

        // Criando o conteúdo da caixa resultado
        Label lblResultado = new Label("Resultado:");
        ListView listaTabuada = new ListView();
        String cidades[] = new String[5];
        cidades[0] = "Itapevi";
        cidades[1] = "Jandira";
        cidades[2] = "Barueri";
        cidades[3] = "Carapicuiba";
        cidades[4] = "osasco";
        listaTabuada.getItems().addAll(cidades);

        // Colocando o label e a listView na caixa resultado
        boxResultado.getChildren().addAll(lblResultado, listaTabuada);




        // Adicionar as cenas dentro do root
        root.getChildren().add(header); // getChildren = filho do root, sempre que for colocar algo no root, devemos colocar o getChildren.
        root.getChildren().add(gridFormulario); // Colocando o grid no root
        root.getChildren().add(boxBotoes); // Colocando os botões no root
        root.getChildren().add(boxResultado); // Colocando a caixa de resultados no root

        // Colocamos a cena no palco
        stage.show();

    }





}
