package Main;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FXUn extends Application{

	Stage stageOne;
	@Override
	public void start(Stage stage) throws Exception { 
	
		this.stageOne = stage;
		BorderPane root = new BorderPane();

		HBox hB = new HBox(10);
		hB.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 640, 480);
		
		HBox pict = new HBox();
		pict.setAlignment(Pos.CENTER);
		
		
		
		
		ToggleGroup TG = new ToggleGroup();
		
		
		RadioButton rB1 = new RadioButton("cat");
		
//		rB1.setOnAction(event ->{
//			if(rB1.selectedProperty() != null) {
//			pict.getChildren().add(iM);
//			}
//			else 
//			{
//				pict.getChildren().add(null);
//			}
//		});

		RadioButton rB2 = new RadioButton("dog");

		RadioButton rB3 = new RadioButton("humster");
		
		rB1.setToggleGroup(TG);

		rB2.setToggleGroup(TG);

		rB3.setToggleGroup(TG);
		
		
		rB1.setUserData("cat");

		rB2.setUserData("dog");

		rB3.setUserData("humster");
		
		ImageView iM = new ImageView();
		
		
		TG.selectedToggleProperty().addListener(event ->
		{
			Image image = new Image(getClass().getResourceAsStream(TG.getSelectedToggle().getUserData()+".jpg"));
			iM.setImage(image);
			iM.setFitHeight(300);
			iM.setFitWidth(300);
			
			
		});
		

		rB2.setSelected(true);
		
		
		hB.getChildren().addAll(rB1, rB2, rB3);
		pict.getChildren().add(iM);
		root.setTop(hB);
		root.setCenter(pict);
		
		stageOne.setTitle("Good things.");
		stageOne.setResizable(false);
		
		stageOne.setScene(scene);
		stageOne.show();
		
		
	}
			public static void main(String[] args)
	{
		launch(args);
	}



}
