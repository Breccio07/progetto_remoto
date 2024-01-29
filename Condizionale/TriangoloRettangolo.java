package it.edu.iisgubbio.Condizionale;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TriangoloRettangolo extends Application{
	
	TextField tBase = new TextField();
	TextField tAltezza = new TextField();
	TextField tIpotenusa = new TextField();
	Label lRisposta= new Label();
	

	public void start(Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena = new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Triangolo rettangolo");
		finestra.show();
				
		Label lBase= new Label("BASE");
		Label lAltezza= new Label("ALTEZZA");
		Label lIpotenusa= new Label("IPOTENUSA");
		
		Button pVerifica = new Button("VERIFICA");

		griglia.add(tBase,  0 ,0);
		griglia.add(tAltezza,  0 ,1);
		griglia.add(tIpotenusa,  0 ,2);
		griglia.add(pVerifica,  0 ,3);
		griglia.add(lBase,  1 ,0);
		griglia.add(lAltezza,  1 ,1);
		griglia.add(lIpotenusa,  1 ,2);
		griglia.add(lRisposta,  1 ,3);
		
		pVerifica.setOnAction (e -> verifica());
		
	}
		
		public void verifica() {
			
			double Ipotenusa =Integer.parseInt(tIpotenusa.getText());
			double Base =Integer.parseInt(tBase.getText());
			double Altezza =Integer.parseInt(tAltezza.getText());
			
			if (Ipotenusa * Ipotenusa == (Altezza*Altezza+Base*Base)) {
				lRisposta.setText("il trinagolo è rettangolo");
			} else {
				lRisposta.setText("il triangolo non è rettangolo");
			}	
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
