package mx.edu.utez.u2_ti_05_forms;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblNombre= new Label("Nombre: ");
        TextField tfNombre= new TextField();
        Label lblApellido= new Label("Apellido: ");
        TextField tfApellido= new TextField();
        Label lblEdad= new Label("Edad: ");
        TextField tfEdad= new TextField();
        Label lblRol= new Label("Rol: ");
        ObservableList<String> cbRol = FXCollections.observableArrayList("estudiante", "profesor", "administrador");
        ComboBox<String> cbRolComboBox= new ComboBox<String>(cbRol);
        Button btnCrear= new Button("Crear");
        Button btnReset= new Button("Resetear");
        Label lblResultado= new Label();

        GridPane grid= new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-padding: 20");

        grid.add(lblNombre, 0, 0);
        grid.add(tfNombre, 1, 0);
        grid.add(lblApellido, 0, 1);
        grid.add(tfApellido, 1, 1);
        grid.add(lblEdad, 0, 2);
        grid.add(tfEdad, 1, 2);
        grid.add(lblRol, 0, 3);
        grid.add(cbRolComboBox, 1, 3);
        grid.add(btnCrear, 0, 4);
        grid.add(btnReset, 1, 4);
        grid.add(lblResultado, 0, 5);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String edad = tfEdad.getText();
            String rol = cbRolComboBox.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || rol == null) {
                grid.setStyle("-fx-background-color: pink");
                lblResultado.setStyle("-fx-background-color: pink");
                lblResultado.setText("debes de ingresar todos los datos");
            } else{
                lblResultado.setText("El nombre es " + nombre + " Apellido es " + apellido + " Edad es " + edad + " Rol es " + rol);
                lblResultado.setStyle("-fx-background-color:turquoise");
                grid.setStyle("-fx-background-color: lightgreen");

            }

        });
        btnReset.setOnAction(e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cbRolComboBox.getSelectionModel().clearSelection();
            lblResultado.setText("");
            grid.setStyle("-fx-padding: 20");
            grid.setStyle("-fx-background-color: white" );
        });

        Scene scene = new Scene(grid, 600, 550);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}