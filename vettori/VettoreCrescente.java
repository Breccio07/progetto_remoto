package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VettoreCrescente extends Application{

	TextField tVettore= new TextField();
	
	Label lRisultato= new Label("Il vettore è crescente?");
	
	public void start(Stage finestra) throws Exception {

		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena=new Scene(griglia, 300 ,225);
		
		finestra.setScene(scena);
		finestra.setTitle("Vettore Crescente");
		finestra.show();

		Label lVettore= new Label("Vettore: ");
		Label lSpaziatura = new Label("/* i numeri sono spaziati da: , */");
		
		Button pVerifica= new Button("VERIFICA");
		
		tVettore.setMinWidth(300);
		
		griglia.add(lVettore, 0, 0);
		griglia.add(tVettore, 0, 1);
		griglia.add(pVerifica, 0, 2);
		griglia.add(lRisultato, 0, 3);
		griglia.add(lSpaziatura, 0, 5);
		
		pVerifica.setOnAction(e -> Verifica());

	}
	
	private void Verifica() {
		
		String valore = tVettore.getText();

		String numeri[] = valore.split(",");

		int vettore[] = new int[numeri.length];

		boolean fine = false;
		
		for(int i=0; i < vettore.length; i++) {
			
			vettore[i] = Integer.parseInt(numeri[i]);
			
		}
		
		for(int i=0; i < vettore.length && fine== false; i++) {
			
			if(vettore[i] < vettore[i+1]) {
				
			}else {
				fine=true;
			}
			
		}
		
		
		if(fine== true) {
			
			lRisultato.setText("NON è crescente");
			
		}else {
			lRisultato.setText("è crescente");
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
