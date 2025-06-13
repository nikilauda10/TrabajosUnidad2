package mx.edu.utez.demo3b;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label label= new Label("Label");
        Label label1= new Label("Label 1");
        Button button = new Button("button aceptar!!");
        Button button1 = new Button("button cancelar!!");
        button.setOnAction(e -> {
            label.setText("aceptado");
        });
        button1.setOnAction(e -> {
            label.setText("cancelar");
        });
        //StackPane stackPane = new StackPane(label, label1);
        VBox vbox = new VBox(20,label, label1, button, button1);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Hola nicho!");
        Image image = new Image(getClass().getResourceAsStream("Images/solana.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}