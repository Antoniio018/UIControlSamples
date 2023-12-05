module es.ieslosmontecillos.uicontrolsamples {
    requires javafx.controls;
    requires javafx.fxml;


    exports es.ieslosmontecillos.uicontrolsamples;
    exports es.ieslosmontecillos.uicontrolsamples.tooltipsample;
    exports es.ieslosmontecillos.uicontrolsamples.checkboxsample;
    exports es.ieslosmontecillos.uicontrolsamples.tableviewsample;
    exports es.ieslosmontecillos.uicontrolsamples.customtextfieldsample;
    opens es.ieslosmontecillos.uicontrolsamples to javafx.fxml;
    opens es.ieslosmontecillos.uicontrolsamples.checkboxsample to javafx.fxml;
    opens es.ieslosmontecillos.uicontrolsamples.tooltipsample to javafx.fxml;
    opens es.ieslosmontecillos.uicontrolsamples.tableviewsample to javafx.fxml;
    opens es.ieslosmontecillos.uicontrolsamples.customtextfieldsample to javafx.fxml;
}