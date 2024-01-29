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

public class NewLook extends Application{

	TextField tChilometri= new TextField();
	
	RadioButton rNuoto= new RadioButton("nuoto");
	RadioButton rCorsa= new RadioButton("corsa");
	RadioButton rBici= new RadioButton("bici");
	RadioButton rSiB= new RadioButton("si");
	RadioButton rNoB= new RadioButton("no");
	RadioButton rSiC= new RadioButton("si");
	RadioButton rNoC= new RadioButton("no");

	Label lRisulato= new Label();
	
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 500);
		
		finestra.setScene(scena);
		finestra.setTitle("Divisori");
		finestra.show();
		
		Label lKm= new Label("KM");
		Label lPercorso= new Label("Tipo di percorso");

		Label lBracciali= new Label("Bracciali");
		Label lCavigliere= new Label("Cavigliere");
		
		ToggleGroup percorso = new ToggleGroup();
		rNuoto.setToggleGroup(percorso);
		rCorsa.setToggleGroup(percorso);
		rBici.setToggleGroup(percorso);
		
		ToggleGroup bracciali = new ToggleGroup();
		rSiB.setToggleGroup(bracciali);
		rNoB.setToggleGroup(bracciali);
		ToggleGroup cavigliere = new ToggleGroup();
		rSiC.setToggleGroup(cavigliere);
		rNoC.setToggleGroup(cavigliere);
		
		Button pCalcola=new Button("CALCOLO CALORIE");
		
		griglia.add(tChilometri, 0, 0);
		griglia.add(lKm, 1, 0);
		griglia.add(lPercorso, 0, 1);
		griglia.add(rNuoto, 0, 2);
		griglia.add(rCorsa, 0, 3);
		griglia.add(rBici, 0, 4);
		griglia.add(lBracciali, 0, 5);
		griglia.add(rSiB, 0, 6);
		griglia.add(rNoB, 0, 7);
		griglia.add(lCavigliere, 0, 8);
		griglia.add(rSiC, 0, 9);
		griglia.add(rNoC, 0, 10);
		griglia.add(pCalcola, 0, 11);
		griglia.add(lRisulato, 0, 12, 2, 12);
		
		pCalcola.setOnAction(e -> Calcola());
	}
	
	private void Calcola() {
		double km = Integer.parseInt(tChilometri.getText());
		
		if (rNuoto.isSelected()) {
			km= km*21;
		}
		if (rCorsa.isSelected()) {
			km= km*12;
		}
		if (rBici.isSelected()) {
			km= km*7;
		}
		if (rSiB.isSelected()) {
			km= km*1.8;
		}
		if (rSiC.isSelected()) {
			km= km*1.35;
		}
		lRisulato.setText("Hai bruciato: "+km);
	}

	public static void main(String [] args) {
		launch(args);
	}
}