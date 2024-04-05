module JanielMarkJavier_COMP228Lab4 {
	requires javafx.controls;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	exports exercise1 to javafx.graphics;
}
