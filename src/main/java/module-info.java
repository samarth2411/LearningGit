module com.example.github {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.github to javafx.fxml;
    exports com.example.github;
}