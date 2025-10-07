module jamaica.tc.seguimientos {
    requires javafx.controls;
    requires javafx.fxml;


    opens jamaica.tc.seguimientos to javafx.fxml;
    exports jamaica.tc.seguimientos;

    opens jamaica.tc.seguimientos.Septiembre23.controller to javafx.fxml;
    exports jamaica.tc.seguimientos.Septiembre23.controller;

    opens jamaica.tc.seguimientos.Septiembre23.model to javafx.fxml;
    exports jamaica.tc.seguimientos.Septiembre23.model;

    opens jamaica.tc.seguimientos.Septiembre25.controller to javafx.fxml;
    exports jamaica.tc.seguimientos.Septiembre25.controller;

    opens jamaica.tc.seguimientos.Septiembre25.model to javafx.fxml;
    exports jamaica.tc.seguimientos.Septiembre25.model;

    opens jamaica.tc.seguimientos.Octubre02.viewcontroller to javafx.fxml;
    exports jamaica.tc.seguimientos.Octubre02.viewcontroller;

}