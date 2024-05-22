import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class LatinTranslator extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Button sinisterButton = new Button("Sinister");
		Button dexterButton = new Button("Dexter");
		Button mediumButton = new Button("Medium");

		Label outputLabel = new Label();
		
		sinisterButton.setOnAction(e ->
		{
			outputLabel.setText("Left");
		});
		
		dexterButton.setOnAction(e ->
		{
			outputLabel.setText("Right");
		});
		
		mediumButton.setOnAction(e ->
		{
			outputLabel.setText("Center");
		});
		
		VBox vbox = new VBox(10, sinisterButton, dexterButton, mediumButton, outputLabel);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(10));
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
