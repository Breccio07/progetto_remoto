package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Esercizio8 extends Application{

	TextField tNumeri= new TextField();
	TextField tValore= new TextField();
	
	Label lVettore= new Label();
	Label lTotale= new Label();
	
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setVgap(10);
		griglia.setHgap(10);
		
		Scene scena= new Scene(griglia, 350, 225);
		
		finestra.setScene(scena);
		finestra.setTitle("Esercizio 8");
		finestra.show();
		
		Label lNumeri= new Label("numeri:");
		Label lValore= new Label("numero da tenere sotto controllo:");
		Label lVettore1= new Label("Vettore:");
		Label lSpaziatura= new Label("/* i numeri sono spaziati da: - */");
		
		Button pCalcola= new Button("TROVA NUM.");
		
		griglia.add(lNumeri, 0, 0);
		griglia.add(lValore, 1, 0);
		griglia.add(tNumeri, 0, 1);
		griglia.add(tValore, 1, 1);
		griglia.add(pCalcola, 0, 2);
		griglia.add(lVettore1, 0, 3);
		griglia.add(lVettore, 0, 4, 2, 1);
		griglia.add(lTotale, 0, 5, 2, 1);
		griglia.add(lSpaziatura, 0, 6, 2, 1);
		
		pCalcola.setOnAction(e -> Trova());
	}
	
	private void Trova() {
		
		String valore= tNumeri.getText();
		
		String numeri[]= valore.split("-");
		
		int numeri2[]= new int[numeri.length];
		
		int v= Integer.parseInt(tValore.getText());
		
		int Trova=0;
		
		String s = "";
		
		for(int i =0; i<numeri2.length; i++) {
			
			numeri2[i]=Integer.parseInt(numeri[i]);
			
			if(numeri2[i] == v) {
				
				Trova++;
				
			}
			
			s+=numeri2[i] + " ";
			
		}
		
		lVettore.setText(s);
		lTotale.setText("il valore "+v+" è stato trovato "+Trova+" nel vettore inserito");
		
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
