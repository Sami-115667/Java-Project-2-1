package com.example.hall_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SigninController {

    @FXML
    private Button login;
    @FXML
    private Label label1;
    private Stage stage;
    private Scene scene;
    private Parent root1;

    private Parent root2;
    private Parent root3;
    private Parent root4;
    private Parent root5;
    private Parent root6;


    @FXML
    void loginPage(ActionEvent event) {
        label1.setText("SUkanto");

    }

    public void teacherLogin(ActionEvent event) throws IOException {

        root1 = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root1,818,670);
        stage.setTitle("Deshboard");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    public void enterRegistration(ActionEvent event) throws IOException {

        root2 = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root2,818,670);
        stage.setTitle("Registration Form");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



    public void about(ActionEvent event) throws IOException {

        root3 = FXMLLoader.load(getClass().getResource("About.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root3,818,670);
        stage.setTitle("About");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void halls(ActionEvent event) throws IOException {

        root4 = FXMLLoader.load(getClass().getResource("Halls.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root4,818,670);
        stage.setTitle("All Hall");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    public void canteen(ActionEvent event) throws IOException {

        root5 = FXMLLoader.load(getClass().getResource("Canteen.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root5,818,670);
        stage.setTitle("Canteen");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}

