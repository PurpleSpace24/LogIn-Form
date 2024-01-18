module org.login.login {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.login.login to javafx.fxml;
    exports org.login.login;
}