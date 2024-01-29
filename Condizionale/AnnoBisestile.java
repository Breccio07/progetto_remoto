package it.edu.iisgubbio.Condizionale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AnnoBisestile extends Application{
	
	TextField tAnno= new TextField();
	Label lRisposta= new Label();
	
	public void start( Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene( griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Anno Bisetile");
		finestra.show();
		
		Label lAnno= new Label("ANNO");
		Button pVerifica= new Button("VERIFICA");
		
		griglia.add(tAnno, 0, 0);
		griglia.add(pVerifica, 0, 1);
		griglia.add(lAnno, 1, 0);
		griglia.add(lRisposta, 1, 1);
		
		pVerifica.setOnAction(e -> Verifica());
 	}
	
	public void Verifica() {
		int Anno = Integer.parseInt(tAnno.getText());
		
		if (Anno % 4 == 0 ) {
			if (Anno % 100 == 0) {
				if (Anno % 400 == 0) {
					lRisposta.setText("L'anno è bisestile");
				} else {
					lRisposta.setText("L'anno non è bisestile");
				}
			}else {
				lRisposta.setText("L'anno è bisestile");
			}
		}else {
			lRisposta.setText("L'anno non è bisestile");
		}
	}
	public static void main( String [] args) {
		
		launch(args);
	}

}
