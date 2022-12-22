module com.example.bevel_jamar_finalexalm_barchart {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bevel_jamar_finalexalm_barchart to javafx.fxml;
    exports com.example.bevel_jamar_finalexalm_barchart;
}