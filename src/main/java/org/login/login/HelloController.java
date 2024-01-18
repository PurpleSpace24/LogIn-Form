package org.login.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private final int v = 600;
    private final int v1 = 400;

    @FXML
    private Label messageLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    protected void buttonClicked() throws IOException {

            String user = username.getText();
            String pass = password.getText();

            if (user.isEmpty() || pass.isEmpty()){
                messageLogIn.setText("You must fill in all fields");
            }else {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), v, v1);
                Stage stage = (Stage) username.getScene().getWindow();
                stage.setScene(scene);


            }

    }
}