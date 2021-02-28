module gui{
    requires logic;
    requires javafx.controls;
    opens com.dqrapps.gui to javafx.graphics;
}