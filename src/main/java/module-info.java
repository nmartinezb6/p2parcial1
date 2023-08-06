module com.example.p2parcial1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.p2parcial1 to javafx.fxml;
    exports com.example.p2parcial1;
}