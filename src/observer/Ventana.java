package observer;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Ventana {
	private VBox root;
	private HBox buttonHolder;
	private Button botonAzul;
	private Button botonAmarillo;
	private Button botonRojo;
	
	public Ventana() {
		inicializar();
	}
	
	public void inicializar() {
		root = new VBox();
		root.setAlignment(Pos.CENTER);
		
		buttonHolder=new HBox();
		buttonHolder.setAlignment(Pos.CENTER);
		buttonHolder.setSpacing(10);
		
		setButtons();
		setButtonEvents();
		
		root.getChildren().add(buttonHolder);
		
	}
	
	public void setButtons() {
		botonAzul=new Button("Azul");
		botonAzul.setPrefSize(100, 50);
		botonAzul.setStyle("-fx-base: #DAA520");
		botonAzul.setFont(Font.font("Comic Sans MS",FontWeight.BLACK,16));
		
		botonRojo=new Button("Rojo");
		botonRojo.setPrefSize(100, 50);
		botonRojo.setStyle("-fx-base: #DAA520");
		botonRojo.setFont(Font.font("Comic Sans MS",FontWeight.BLACK,16));
		
		botonAmarillo=new Button("Amarillo");
		botonAmarillo.setPrefSize(100, 50);
		botonAmarillo.setStyle("-fx-base: #DAA520");
		botonAmarillo.setFont(Font.font("Comic Sans MS",FontWeight.BLACK,16));
		
		
		buttonHolder.getChildren().addAll(botonAzul,botonRojo,botonAmarillo);
		
	}
	
	public void setButtonEvents() {
		botonAzul.setOnAction(e-> changeBackgroundColor("azul"));
		botonRojo.setOnAction(e-> changeBackgroundColor("rojo"));
		botonAmarillo.setOnAction(e-> changeBackgroundColor("amarillo"));
	}
	
	public void changeBackgroundColor(String color) {
		if(color.equals("azul")) {
			root.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
		}else if(color.equals("rojo")) {
			root.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
		}else {
			root.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
		}
		
	}
	
	public Pane getRoot() {
		return root;
	}
}
