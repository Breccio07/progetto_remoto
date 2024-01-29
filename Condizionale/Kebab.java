package it.edu.iisgubbio.Condizionale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab extends Application{
	
	CheckBox cCipolla= new CheckBox();
	CheckBox cCarne= new CheckBox();
	CheckBox cPane= new CheckBox();
	CheckBox cPomodoro= new CheckBox();
	CheckBox cInsalata= new CheckBox();
	CheckBox cSalsa= new CheckBox();
	
	TextField tPanini= new TextField();
	Label  lCosto= new Label();
	
public void start( Stage finestra ) {
	GridPane griglia= new GridPane();
	
	griglia.setHgap(10);
	griglia.setVgap(10);
	
	Scene scena= new Scene(griglia, 300, 250);
	finestra.setScene(scena);
	finestra.setTitle("Kebab");
	finestra.show();
	
	Label lPanini= new Label("Num. Panini: 1$");
	Label lPane= new Label("Pane:0,50$");
	Label lCarne= new Label("Carne: 3$");
	Label lCipolla= new Label("Cipolla: 0,10");
	Label lPomodoro= new Label("Pomodoro:0,20$");
	Label lInsalata= new Label("Insalata:0,15$");
	Label lSalsa= new Label("Salsa:0,15$");
	
	Button pCalcola= new Button("CALCOLA");
	
	griglia.add(lPanini, 0, 0);
	griglia.add(tPanini, 1, 0);
	griglia.add(cCarne, 0, 1 );
	griglia.add(cPane, 0, 2);
	griglia.add(cCipolla, 0, 3);
	griglia.add(cPomodoro, 0, 4);
	griglia.add(cInsalata, 0, 5);
	griglia.add(cSalsa, 0, 6);
	griglia.add(lCarne, 1, 1);
	griglia.add(lPane, 1, 2);
	griglia.add(lCipolla, 1, 3);
	griglia.add(lPomodoro, 1, 4);
	griglia.add(lInsalata, 1, 5);
	griglia.add(lSalsa, 1, 6);
	griglia.add(pCalcola, 0, 7);
	griglia.add(lCosto, 1, 7);

	pCalcola.setOnAction(e -> Calcola());
}

	public void Calcola() {
		Double Panini= (double) Integer.parseInt(tPanini.getText());
		Panini= Panini*1;
		Double Prezzo= Panini;
		
		Double Sconto;
		
		if (cCipolla.isSelected()) {
			Prezzo= Prezzo+0.10;
		} else {
			Prezzo = Prezzo+0;
		}
		
		if (cCarne.isSelected()) {
			Prezzo= Prezzo+3;
		}else {
			Prezzo=Prezzo+0;
		}
		
		if (cPane.isSelected() ) {
			Prezzo= Prezzo+0.50;
		}else {
			Prezzo= Prezzo+0;
		}
		
		if (cPomodoro.isSelected()) {
			Prezzo= Prezzo+0.20;
		} else {
			Prezzo = Prezzo+0;
		}
		
		if (cInsalata.isSelected()) {
			Prezzo= Prezzo+0.10;
		} else {
			Prezzo = Prezzo+0;
		}
		
		if (cCipolla.isSelected()) {
			Prezzo= Prezzo+0.10;
		} else {
			Prezzo = Prezzo+0;
		}
		
		if (cSalsa.isSelected()) {
			Prezzo= Prezzo+0.15;
		} else {
			Prezzo = Prezzo+0;
		}
		if (Prezzo <= 10) {
			lCosto.setText("Devi pagare"+Prezzo+"$: nessuno sconto");
		}else {
			if (Prezzo >=11 && Prezzo<=20) {
				Sconto= Prezzo*3/100;
				Prezzo= Prezzo-Sconto;
				lCosto.setText("Devi pagare"+Prezzo+"$: sconto del 3%");
			}else {
				if (Prezzo >=21 && Prezzo<=30) {
					Sconto= Prezzo*5/100;
					Prezzo= Prezzo-Sconto;
					lCosto.setText("Devi pagare"+Prezzo+"$: sconto del 5%");
				}else {
					Sconto= Prezzo*8/100;
					Prezzo= Prezzo-Sconto;
					lCosto.setText("Devi pagare"+Prezzo+"$: sconto del 8%");
				}
			}
		}
	}
	public static void main(String [] args) {
	
		launch(args);
	}
}

