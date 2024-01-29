package it.edu.iisgubbio.Condizionale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Media extends Application{

	TextField tNumero= new TextField();
	
	int contatore = 10;
	double Media=0.0;
	
	Label lContatore= new Label();

	Label lRisultato= new Label();
	
	public void start(Stage finestra) {
		
		lContatore.setText(""+contatore);
		
		GridPane griglia = new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 150);
		
		Button pCalcola= new Button("CALCOLA");
		Button pResetta= new Button("RESETTA");
		
		griglia.add(tNumero, 0, 0);
		griglia.add(lContatore, 1, 0);
		griglia.add(pCalcola, 0, 1);
		griglia.add(pResetta, 1,1);
		griglia.add(lRisultato, 0, 2, 2, 2);
		
		finestra.setScene(scena);
		finestra.setTitle("MEDIA");
		finestra.show();
		
		pCalcola.setOnAction(e -> Calcola());
		pResetta.setOnAction(e -> Resetta());
	}
	
	private void Calcola() {
		
		
		if(contatore >= 1) {
			
			int numero= Integer.parseInt(tNumero.getText());
			
			Media= Media+numero;
			contatore-=1;
			tNumero.setText("");
			
			lContatore.setText(""+contatore);
			
		}else {
			
			Media= Media / 10;
			
			lRisultato.setText("la media è di: "+Media);

		}
		
	}
	
	private void Resetta() {
		
		contatore=10;
		Media=0;
		
		lContatore.setText(""+contatore);
		
		tNumero.setText("");
		
		lRisultato.setText("");
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
