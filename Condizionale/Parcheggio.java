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

public class Parcheggio extends Application{
	
	RadioButton cSi= new RadioButton("Si (+5$)");
	RadioButton cNo= new RadioButton("No");
	RadioButton cCamion= new RadioButton("Camion (+10$)");
	RadioButton cCamper= new RadioButton("Camper (+5$)");
	RadioButton cAuto= new RadioButton("Automobile (+3,50$)");
	RadioButton cSi2= new RadioButton("Si (+5,00$)");
	RadioButton cNo2= new RadioButton("No");
	
	Label lTotale= new Label();
	
	TextField tOre= new TextField();
	
	
	public void start( Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia,300,500);
		finestra.setScene(scena);
		finestra.setTitle("Parcheggio");
		finestra.show();
		
		Label lOre= new Label("Num. di ore");
		Label lCoperto= new Label("Coperto");
		Label lMacchina = new Label( "tipo di macchina");
		Label lGiorno= new Label("Intero Giorno");
		
		Button pPrezzo= new Button("PREZZO");
		
		ToggleGroup coperto = new ToggleGroup();
		
		cSi.setToggleGroup(coperto);
		cNo.setToggleGroup(coperto);
		
		ToggleGroup macchina = new ToggleGroup();
		
		cCamion.setToggleGroup(macchina);
		cCamper.setToggleGroup(macchina);
		cAuto.setToggleGroup(macchina);
		
		ToggleGroup giorno = new ToggleGroup();
		
		cSi2.setToggleGroup(giorno);
		cNo2.setToggleGroup(giorno);
		
		griglia.add(lOre, 0, 0);
		griglia.add(tOre, 1, 0);
		griglia.add(lCoperto, 0, 1);
		griglia.add(cSi, 0, 2);
		griglia.add(cNo, 0, 3);
		griglia.add(lMacchina, 0, 4);
		griglia.add(cCamion, 0, 5);
		griglia.add(cCamper, 0, 6);
		griglia.add(cAuto, 0, 7);
		griglia.add(lGiorno, 0, 8);
		griglia.add(cSi2, 0, 9);
		griglia.add(cNo2, 0, 10);
		griglia.add(pPrezzo, 0, 11);
		griglia.add(lTotale, 0, 12);
		
		pPrezzo.setOnAction(e -> prezzo());
	}
	
	public void prezzo() {
	
		int ore = Integer.parseInt(tOre.getText());;
		
		double Prezzo= 0;
		
		double CostoOra=0;
		
		if(cSi2.isSelected()) {
			Prezzo=Prezzo+5;
		}
		if(cCamion.isSelected()) {
			CostoOra= 10;
		}
		if(cCamper.isSelected()) {
			CostoOra=+5;
		}
		if(cAuto.isSelected()) {
			CostoOra=CostoOra+3.50;
		}
		if(cSi.isSelected()) {
			Prezzo= Prezzo+5+CostoOra*ore; 
		}else {
			Prezzo= Prezzo+CostoOra*ore;	
		}
		lTotale.setText("Dovrai pagare: "+Prezzo);
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
