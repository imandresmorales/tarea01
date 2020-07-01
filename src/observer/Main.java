package observer;

import javafx.stage.Stage;      
import javafx.scene.Scene;             
import javafx.application.Application;


public class Main extends Application{
	
	private Scene scene;
	private Stage stage;
	

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage){
		stage=primaryStage;
		setInicio();	
	}
	
	
	public void setInicio() {
		Ventana ventana=new Ventana();
		scene = new Scene( ventana.getRoot(), 600, 400 );
		stage.setTitle("Ventana Principal");
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
	
	
}