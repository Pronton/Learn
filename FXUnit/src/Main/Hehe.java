package Main;

import java.awt.Color;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Hehe extends Application{

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane root = new BorderPane();
		HBox hB = new HBox();
		hB.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 640, 480);
		/**
		 * Toggle group created.
		 */
		ToggleGroup tGroup = new ToggleGroup();
		
		ToggleButton tB1 = new ToggleButton("Green");

		ToggleButton tB2 = new ToggleButton("Red");

		ToggleButton tB3 = new ToggleButton("Blue");
		
		/**
		 * Setting group to toggle buttons.
		 */
		
		tB1.setToggleGroup(tGroup);
		tB2.setToggleGroup(tGroup);
		tB3.setToggleGroup(tGroup);
		
		tB1.setUserData(javafx.scene.paint.Color.GREEN);
		tB2.setUserData(javafx.scene.paint.Color.RED);
		tB3.setUserData(javafx.scene.paint.Color.BLUE);
		
		tB1.setStyle("-fx-base: green");
		tB2.setStyle("-fx-base: red");
		tB3.setStyle("-fx-base: blue");
		
	
		
		Rectangle rec = new Rectangle(70,70);
		rec.setFill(javafx.scene.paint.Color.WHITE);
		rec.setStroke(javafx.scene.paint.Color.BLACK);
		rec.setStrokeWidth(2);
		rec.setArcHeight(50);
		rec.setArcWidth(50);
		
		tGroup.selectedToggleProperty().addListener(event ->{
			if(tGroup.getSelectedToggle()!=null)
			{rec.setFill((javafx.scene.paint.Color)tGroup.getSelectedToggle().getUserData());}
			else {rec.setFill(javafx.scene.paint.Color.WHITE);}
		});
		
		tB2.setSelected(true);
		
		hB.getChildren().addAll(tB1, tB2, tB3);
		
		root.setTop(hB);
		root.setCenter(rec);
		stage.setTitle("Cool color things.");
		stage.setScene(scene);
		stage.show();
	}

}
