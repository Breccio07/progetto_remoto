package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TempoPiscina extends Application{

	TextField tNumero= new TextField();
	
	TextField tTempo= new TextField();
	
	Label lVettore= new Label();
	Label lMedia= new Label();
	
    int tempi[];
	int numTempi;
	int pos;
	int Media;
	int Valore;
	
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setVgap(10);
		griglia.setHgap(10);
		
		Scene scena= new Scene(griglia, 330, 300);
		
		finestra.setScene(scena);
		finestra.setTitle("Tempo Piscina");
		finestra.show();
		
		Label lNumero= new Label("Numero");
		Label lQuantità= new Label("Quantità");
		Label lElenco= new Label("Elenco:");
		Label lMedia1= new Label("Media:");
		
		Button pAlloca= new Button("ALLOCA");
		Button pInserisci= new Button("INSERISCI");
		Button pStampa= new Button("STAMPA");
		
		pAlloca.setMinWidth(100);
		pInserisci.setMinWidth(100);
		pStampa.setMinWidth(100);
		
		griglia.add(lNumero, 0, 0);
		griglia.add(lQuantità, 1, 0);
		griglia.add(tNumero, 0, 1);
		griglia.add(tTempo, 1, 1);
		griglia.add(pAlloca, 0, 2);
		griglia.add(pInserisci, 0, 3);
		griglia.add(pStampa, 0, 4);
		griglia.add(lElenco, 0, 6);
		griglia.add(lVettore, 0, 5, 2, 6);
		griglia.add(lMedia1, 0, 9);
		griglia.add(lMedia, 0, 8, 2, 8);
		
		pAlloca.setOnAction(e -> Alloca());
		
		pInserisci.setOnAction(e -> Inserisci());
		
		pStampa.setOnAction(e -> Stampa());
	}
	
	private void Alloca() {
		
		numTempi= Integer.parseInt(tTempo.getText());
		tempi = new int[numTempi];
	    pos = 0;
	    
	}
	
	private void Inserisci() {
		
		if(pos < numTempi) {
			tempi[pos++]=Integer.parseInt(tNumero.getText());
	        tNumero.setText("");
		}
		
	}
	
	private void Stampa() {
		
		String Stampa="";
		
		for (int i= 0; i<numTempi; i++) {
			
			
			if(i == numTempi-1) {
				Stampa+= tempi[i];
				
			}else {
				Stampa+= tempi[i]+ " - ";
			}
			Media= Media + tempi[i];
		}
		
		Media= Media/numTempi;
		
		lVettore.setText(Stampa); 
		lMedia.setText(""+Media);
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}

