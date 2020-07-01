package observer;

import javafx.stage.Stage;             // |
import javafx.scene.Group;             // |\ Librerías necesarias
import javafx.scene.Scene;             // |/ Para el ejemplo

import java.awt.Insets;

import javafx.application.Application; // |
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;  


public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	
	public void start( Stage primaryStage ){
		VBox root = new VBox();
		//El grupo que se desea agregar, y el tamaño ancho y alto
		Scene scene = new Scene( root, 300, 500 );
		//Titulo de la ventana
		primaryStage.setTitle("JavaFx");
		//Se agrega la scena
		primaryStage.setScene( scene );
		//root.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null))); cambia color 

		//Creacion del boton
		Button boton = new Button("Amarillo");
		boton.setDefaultButton(true);
		//Tamaño del boton
		boton.setPrefSize(100, 50);
		//Tamaño del boton
		//Posicion dle boton
		boton.setLayoutX(105);
		boton.setLayoutY(100);
		boton.setOnAction((event) -> {    // lambda expression
			root.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
	      });
		
		Button boton2 = new Button("Azul");
		boton2.setDefaultButton(true);
		//Tamaño del boton
		boton2.setPrefSize(100, 50);
		//Tamaño del boton
		//Posicion dle boton
		boton2.setLayoutX(105);
		boton2.setLayoutY(200);
		boton2.setOnAction((event) -> {    // lambda expression
			root.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
	      });
		
		Button boton3 = new Button("Rojo");
		boton3.setDefaultButton(true);
		//Tamaño del boton
		boton3.setPrefSize(100, 50);
		//Tamaño del boton
		//Posicion dle boton
		boton3.setLayoutX(105);
		boton3.setLayoutY(300);
		boton3.getBackground();
		boton3.setOnAction((event) -> {    // lambda expression
			root.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
	      });
		
		//Se agrega el boton
		root.getChildren().addAll(boton,boton2,boton3);
		
		//Para mostrar la visible, semejante al setVisible(true)
		primaryStage.show();
		
		
	}
	
	
}