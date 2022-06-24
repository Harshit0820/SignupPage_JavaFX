module com.example.signup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.signup to javafx.fxml;
    exports com.example.signup;
}