package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Esercizio9 extends Application{

	Label lStampa1= new Label();
	
	TextField tVettore= new TextField();
	
	public void start(Stage finestra)  {
		
		GridPane griglia= new GridPane();
		
		griglia.setVgap(10);
		griglia.setHgap(10);
		
		Scene scena= new Scene(griglia, 300, 225);
		
		finestra.setScene(scena);
		finestra.setTitle("Esercizio 9");
		finestra.show();
		
		tVettore.setMinWidth(300);
		
		Label lVettore= new Label("Vettore:");
		Label lStampa= new Label("Stampa numeri con posizione positiva: ");
		Label lSpaziatura= new Label("/* i numeri sono spaziati da: - */");
		
		Button pStampa= new Button("STAMPA");
		
		griglia.add(lVettore, 0, 0);
		griglia.add(tVettore, 0, 1);
		griglia.add(pStampa, 0, 2);
		griglia.add(lStampa, 0, 3, 2, 1);
		griglia.add(lStampa1, 0, 4);
		griglia.add(lSpaziatura, 0, 5);
		
		pStampa.setOnAction(e -> Stampa());
		
	}

	private void Stampa() {
		
		String valore= tVettore.getText();
		
		String numeri[]= valore.split("-");
		
		int numeri2[]= new int [numeri.length];
		
		String s = "";
		
		for(int i=0; i<numeri.length; i++) {
			
			numeri2[i]=Integer.parseInt(numeri[i]);
			
			if(i%2==0) {

				s= s+numeri[i];
				
			}
		}
		lStampa1.setText(s);
	}	
	public static void main(String[] args) {
		launch(args);
	}
	
}
