module ch.makery.prog {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens ch.makery.prog.controller to javafx.fxml;
    exports ch.makery.prog;
}