package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Esecizio6e7 extends Application{

	TextField tNumeri= new TextField();	
	
	Label lRisultato= new Label();
	Label lVettore= new Label();
	
	RadioButton cPari= new RadioButton("Pari");
	RadioButton cDispari= new RadioButton("Dispari");
	
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("Esercizio 6 - 7");
		finestra.show();
		
		Label lNumeri= new Label("Numeri");
		Label lSpaziatura= new Label("/* i numeri sono spaziati da: - */");
		Label lVettore1= new Label("Vettore: ");
		Label lSomma= new Label("Somma");
		
		ToggleGroup operazioni= new ToggleGroup();
		
		cPari.setToggleGroup(operazioni);
		cDispari.setToggleGroup(operazioni);
		
		tNumeri.setMinWidth(300);
		
		Button pCalcola= new Button("Calcola");
		
		griglia.add(lNumeri, 0, 0);
		griglia.add(tNumeri, 0, 1, 2, 1);
		griglia.add(cPari, 0, 2);
		griglia.add(cDispari, 1, 2);
		griglia.add(pCalcola, 0, 3);
		griglia.add(lVettore1, 0, 4);
		griglia.add(lVettore, 0, 5, 2, 1);
		griglia.add(lSomma, 0, 6);
		griglia.add(lRisultato, 0, 7);
		griglia.add(lSpaziatura, 0, 8);
		
		pCalcola.setOnAction(e -> Calcola());
	}
	
	private void Calcola() {
		
		String valore= tNumeri.getText();
		
		String numeri[]= valore.split("-");
		
		int numeri2[]= new int[numeri.length];
		
		int Somma=0;
		
		String s = "";
		
		for(int i=0; i<numeri2.length; i++) {
			
			numeri2[i]=Integer.parseInt(numeri[i]);
			
			if(cPari.isSelected()) {
				
				if(numeri2[i] % 2 ==0) {
					
					Somma+=numeri2[i];
					
				}
				
			}
			if(cDispari.isSelected()) {
				
				if(numeri2[i] % 2 !=0) {
					
					Somma+=numeri2[i];
					
				}
				
			}
			s+=numeri2[i] + " ";
			
		}
		lRisultato.setText(""+Somma);
		lVettore.setText(""+s);
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}
