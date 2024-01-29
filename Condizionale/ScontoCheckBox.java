package it.edu.iisgubbio.Condizionale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ScontoCheckBox extends Application{
	
	TextField tPrezzo= new TextField();
	CheckBox c10= new CheckBox("10%");
	CheckBox c20= new CheckBox("20%");
	Label lRisultato= new Label("Calcola lo sconto");

	public void start( Stage finestra) {
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);;
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Sconto");
		finestra.show();
		
		Button pCalcola= new Button("CALCOLA");
		Label lPrezzo =new Label("Prezzo");
		
		griglia.add(lPrezzo, 0, 0);
		griglia.add(tPrezzo, 1, 0);
		griglia.add(c10, 1, 1);
		griglia.add(c20, 1, 2);
		griglia.add(pCalcola, 0, 3);
		griglia.add(lRisultato, 1, 3);
		
		pCalcola.setOnAction(e -> Sconto());
	}
	
	public void Sconto() {
		
		int Prezzo, Sconto;
		
		Prezzo = Integer.parseInt(tPrezzo.getText());
		
		if (c10.isSelected() && c20.isSelected()) {
			Sconto= Prezzo*30/100;
			Prezzo = Prezzo-Sconto;	
			lRisultato.setText(""+Prezzo);
			
		} else {
			if (c10.isSelected()) {
				Sconto= Prezzo*10/100;
				Prezzo= Prezzo-Sconto;
				lRisultato.setText(""+Prezzo);
			}else {
				Sconto= Prezzo*20/100;
				Prezzo= Prezzo-Sconto;
				lRisultato.setText(""+Prezzo);
			}
		}
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
