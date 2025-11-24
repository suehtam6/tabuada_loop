package br.senai.sp.jandira.tabuada.gui;
import br.senai.sp.jandira.tabuada.model.tabuada;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Optional;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        // stage.setWidth(400); // Colocando a largura da tela
        // stage.setHeight(600); // Colocando a altura da tela
        stage.setResizable(false); // Não estou deixando a pagina ser aumentada e nem diminuida
        stage.setTitle("Tabuada"); // Colocando um nome no aplicativo


        // Criar o root = componente de leiuate principal
        // O nome root é usado por ser uma boa pratica quando vamos usar o JavaFx

        VBox root = new VBox();
        Scene scene = new Scene(root); // Criando a cena e colocamos o root nela
        root.setStyle("-fx-background-color: rgb(162,162,162);");

        stage.setScene(scene); // Adicionamos a cena

        // Criando o header da tela
        VBox header = new VBox();
        // header.setPrefHeight(100); // Tamanho do header
        header.setStyle("-fx-background-color: rgb(121,115,115);");
        header.setStyle("-fx-padding: 10;");

        // Colocar o conteúdo no header
        Label lblTitulo = new Label("Tabuada"); // Criando uma label para o titulo
        lblTitulo.setPadding(new Insets(8, 8 , 0, 8)); // Colocando paddind (espaço)
        lblTitulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white; -fx-font-weight: bold;"); // Mudando o formato das fontes

        Label lblSubTitulo = new Label("Crie a tabuada que a sua imaginação mandar!"); // Criando uma label para o subtitulo
        lblSubTitulo.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-text-fill: white;"); // Mudando o formato das fontes
        lblSubTitulo.setPadding(new Insets(8, 8, 0, 8)); // Colocando paddind (espaço)
        // Colocar os label dentro do header
        header.getChildren().addAll(lblTitulo,lblSubTitulo);

        //Criar o grid de formulario
        GridPane gridFormulario = new GridPane(); // Criando o grid
        // gridFormulario.setPrefHeight(100); // Colocando tamanho no grid
        gridFormulario.setStyle("-fx-background-color: rgba(126,126,126,0.5);"); // Colocando cor no grid
        gridFormulario.setVgap(15);
        gridFormulario.setHgap(15);
        gridFormulario.setPadding(new Insets(16, 8, 16, 8));

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
        Pane paneButtons = new Pane(); // Criando um painel de botões
        paneButtons.setPadding(new Insets(16, 0, 16, 8)); // Colocando o espaço entre os botões
        paneButtons.getChildren().add(boxBotoes);
        // boxBotoes.setPrefHeight(100);
        boxBotoes.setPadding(new Insets(8));
        boxBotoes.setSpacing(10); //espaçamento entre os botões
        // boxBotoes.setStyle("-fx-background-color: rgba(126,126,126,0.5);");

        // Criando os botões
        Button btnCalcular = new Button("Calcular");
        Button btnLimpar = new Button("Limpar");
        Button btnSair = new Button("Sair");

        // Colocando o conteúdo no botão
        boxBotoes.getChildren().addAll(btnCalcular, btnLimpar, btnSair);

        // Criar a caixa de resultados
        VBox boxResultado = new VBox();
        // boxResultado.setPrefHeight(300);
        // boxResultado.setStyle("-fx-background-color: rgba(126,126,126,0.5);");

        // Criando o conteúdo da caixa resultado
        Label lblResultado = new Label("Resultado:");
        lblResultado.setPadding(new Insets(8, 8 , 8, 8));
        lblResultado.setStyle("-fx-text-fill: blue; -fx-font-size: 18px;");

        ListView listaTabuada = new ListView();
        listaTabuada.setPadding(new Insets(8));
        listaTabuada.setPrefHeight(200);




        // Colocando o label e a listView na caixa resultado
        boxResultado.getChildren().add(lblResultado);




        // Adicionar as cenas dentro do root
        root.getChildren().add(header); // getChildren = filho do root, sempre que for colocar algo no root, devemos colocar o getChildren.
        root.getChildren().add(gridFormulario); // Colocando o grid no root
        root.getChildren().add(paneButtons); // Colocando os botões no root
        root.getChildren().add(boxResultado); // Colocando a caixa de resultados no root
        root.getChildren().add(listaTabuada); // Colocando a caixa da lista no root

        // Colocamos a cena no palco
        stage.show();


        btnCalcular.setOnAction(e -> {
            tabuada tabuada = new tabuada();

            tabuada.multiplicando = Integer.parseInt(tfMultiplicando.getText()); //Colocando o int do multiplicando e transformando em um texto

            tabuada.multiplicadorInicial = Integer.parseInt(tfMenorMultiplicando.getText());

            tabuada.multiplicadorFinal = Integer.parseInt(tfMaiorMultiplicando.getText());

            String[] resultado = tabuada.calcularTabuada(); // transformando em vetor para poder adicionar na listView
            listaTabuada.getItems().addAll(resultado);

            // Gravar os dados da tabuada no arquivo csv
            Path arquivo = Path.of("C:\\Users\\25203742\\DS1T\\tabuada\\dados_tabuada.csv");

            String dados = tfMultiplicando.getText() + ";" + tfMenorMultiplicando.getText() + ";" + tfMaiorMultiplicando.getText() + ";" + LocalDateTime.now() + "\n";

            try {//mostra o erro para gente e também serve para testar o arquivo
                Files.writeString(arquivo,dados, StandardOpenOption.APPEND);
            } catch (IOException erro){ // Captura o erro
                System.out.println(erro.getMessage()); // Me diz qual foi o erro que aconteceu sem quebrar a aplicação
            }


        });

        btnLimpar.setOnAction(e -> {
            tfMultiplicando.clear();
            tfMenorMultiplicando.clear(); // Tirando os Textos antigos
            tfMaiorMultiplicando.clear();
            listaTabuada.getItems().clear(); // Limpar a listView
            tfMultiplicando.requestFocus();

        });

        btnSair.setOnAction(e -> {
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION,"Deseja fechar o aplicativo?", ButtonType.YES, ButtonType.NO);

            Optional<ButtonType> resposta = alerta.showAndWait();
            if (resposta.get() == ButtonType.YES) {
                System.exit(0);
            }

            System.out.println(resposta.get().getText());

        });
    }





}
