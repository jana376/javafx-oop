module ch.blj.oop.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.blj.oop.helloworld to javafx.fxml;
    exports ch.blj.oop.helloworld;
}