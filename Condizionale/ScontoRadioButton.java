package it.edu.iisgubbio.Condizionale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ScontoRadioButton extends Application{
	
	RadioButton c10= new RadioButton("10%");
	RadioButton c20= new RadioButton("20%");
	
	TextField tPrezzo= new TextField();
	Label lRisultato= new Label("Calcola lo sconto");

	public void start( Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);;
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Sconto");
		finestra.show();
		
		ToggleGroup genere = new ToggleGroup();
		
		c10.setToggleGroup(genere);
		c20.setToggleGroup(genere);
		
		Button pCalcola= new Button("CALCOLA");
		Label lPrezzo =new Label("Prezzo");
		
		griglia.add(lPrezzo, 0, 0);
		griglia.add(tPrezzo, 1, 0);
		griglia.add(pCalcola, 0, 3);
		griglia.add(c10, 1, 1);
		griglia.add(c20, 1, 2);
		griglia.add(lRisultato, 1, 3);
		
		pCalcola.setOnAction(e -> Sconto());
	}
	
	public void Sconto() {
		
		int Prezzo, Sconto;
		
		Prezzo = Integer.parseInt(tPrezzo.getText());
		
		if (c10.isSelected()) {
			Sconto= Prezzo*10/100;
			Prezzo= Prezzo-Sconto;
			lRisultato.setText(""+Prezzo);
		}else {
			Sconto= Prezzo*20/100;
			Prezzo= Prezzo-Sconto;
			lRisultato.setText(""+Prezzo);
		}
		
		Prezzo = Integer.parseInt(tPrezzo.getText());
		
	}
	public static void main(String [] args) {
		launch(args);
	}
}
