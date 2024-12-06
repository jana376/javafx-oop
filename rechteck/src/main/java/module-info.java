module ch.blj.oop.rechteck {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.blj.oop.rechteck to javafx.fxml;
    exports ch.blj.oop.rechteck;
}