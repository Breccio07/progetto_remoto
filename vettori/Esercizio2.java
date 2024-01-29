package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Esercizio2 extends Application{

	ComboBox<String> operazione= new ComboBox<>();
	
	TextField tRange= new TextField();
	TextField tTempo= new TextField();
	
    int tempi[];
	int numTempi;

	Label lVettore= new Label();
	Label lRisultato1= new Label();
	Label lRisultato= new Label("");
	
	public void start(Stage finestra) {
		
		operazione.getItems().add("Somma");
		operazione.getItems().add("Sottrazione");	
		operazione.getItems().add("Moltiplicazione");
		
		GridPane griglia= new GridPane();
		
		griglia.setVgap(10);
		griglia.setHgap(10);
		
		Scene scena= new Scene(griglia, 350, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("SommaVettoriale");
		finestra.show();
		
		Label lRange= new Label("Lunghezza Vettore:");
		Label lQuantità= new Label("Num. Max:");
		Label lVettore1= new Label("Vettore:");
		
		Button pAlloca= new Button("ALLOCA");
		Button pCalcola= new Button("CALCOLA");
		
		pCalcola.setMinWidth(100);
		pAlloca.setMinWidth(100);
		
		griglia.add(lRange, 0, 0);
		griglia.add(lQuantità, 1, 0);
		griglia.add(tRange, 0, 1);
		griglia.add(tTempo, 1, 1);
		griglia.add(pAlloca, 0, 2);
		griglia.add(operazione, 1, 2);
		griglia.add(pCalcola, 0, 3);
		griglia.add(lRisultato, 0, 4);
		griglia.add(lRisultato1, 0, 5);
		griglia.add(lVettore1, 0, 6);
		griglia.add(lVettore, 0, 7, 2, 1);

		
		pAlloca.setOnAction(e -> Alloca());
		pCalcola.setOnAction(e -> Calcola());
	}
	
	private void Alloca() {
		
		numTempi= Integer.parseInt(tTempo.getText());
		
		int Range= Integer.parseInt(tRange.getText());
		
		tempi = new int[numTempi];
		
		for(int i=0; i < numTempi; i++) {
			
			tempi[i]= (int) (Math.random()*Range);		
			
		}
	    
	}
		
	private void Calcola() {
		
		String x = "";
		String vettore="";
		
		int Risultato=0;
		
		String primo = operazione.getValue();
		
		x=primo;
		
		switch (x) {
		case "Somma":
			
			for(int i=0; i < numTempi; i++) {
				
				Risultato+= tempi[i];
				
				if(i == numTempi-1) {
					vettore+= tempi[i];
					
				}else {
					vettore+= tempi[i]+ " - ";
				}
		}
		lRisultato.setText("Somma:");
		lRisultato1.setText(""+Risultato);
		lVettore.setText(""+vettore);
		break;
		
		case "Sottrazione":
		
			for(int i=0; i < numTempi; i++) {
				
				Risultato-= tempi[i];
				
				if(i == numTempi-1) {
					vettore+= tempi[i];
					
				}else {
					vettore+= tempi[i]+ " - ";
				}
		}
		lRisultato.setText("Sottrazione:");
		lRisultato1.setText(""+Risultato);
		lVettore.setText(""+vettore);
		break;
		
		case "Moltiplicazione":
			
			Risultato=1;
			
			for(int i=0; i < numTempi; i++) {
				
				Risultato= Risultato*tempi[i];
				
				if(i == numTempi-1) {
					vettore+= tempi[i];
					
				}else {
					vettore+= tempi[i]+ " - ";
				}
		}
		lRisultato.setText("Moltiplicazione:");
		lRisultato1.setText(""+Risultato);
		lVettore.setText(""+vettore);
		break;
			
	}
		
	}
	
	public static void main (String []args) {
		launch(args);
	}
}