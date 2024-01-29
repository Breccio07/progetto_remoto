package it.edu.iisgubbio.Condizionale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NumeroCasuale extends Application{
	
	TextField tNumero= new TextField();
	Label lRisposta= new Label();
	
	int Casuale= (int) (Math.random()*100);
	int contatore =0;
	
	public void start(Stage finestra) {
	
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		lRisposta.setMinWidth(100);
		
		Scene scena= new Scene(griglia, 350, 250);
		finestra.setScene(scena);
		finestra.setTitle("Numero casuale");
		finestra.show();
		
		Label lNumero= new Label("Numero casuale tra 1 e 100");
		Button pIndovina= new Button("INDOVINA");
		
		griglia.add(tNumero, 0, 0);
		griglia.add(lNumero, 1, 0);
		griglia.add(lRisposta, 0, 1);
		griglia.add(pIndovina, 0, 2);

		pIndovina.setOnAction(e -> Indovina());
			
		}
	public void Indovina() {

		
		int Numero = Integer.parseInt(tNumero.getText());
		
		if (Numero < Casuale) {
			
			contatore= contatore + 1;
			
			lRisposta.setText("il numero è maggiore");
		}
		if (Numero > Casuale) {
			
			contatore= contatore + 1;
			
			lRisposta.setText("il numero è minore");
		}
		if (Numero == Casuale) {
			
			contatore= contatore + 1;
			
			lRisposta.setText("il numero è giusto ed hai fatto "+contatore+ " tentativi");
		}
	}

		public static void main(String [] args) {
		launch(args);
	}
}
