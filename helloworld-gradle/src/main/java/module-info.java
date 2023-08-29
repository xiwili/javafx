module helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.xiwili.javafx to javafx.fxml;
    exports org.xiwili.javafx;
}