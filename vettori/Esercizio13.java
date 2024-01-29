package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Esercizio13 extends Application {

	TextField tVettore = new TextField();
	TextField tErrore = new TextField();
	Label lControllo = new Label();

	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();

		griglia.setVgap(10);
		griglia.setHgap(10);

		Scene scena = new Scene(griglia, 340, 250);

		tVettore.setMinWidth(150);
		tErrore.setMinWidth(150);

		Label lVettore = new Label("Vettore:");
		Label lValore = new Label("Valore:");
		Label lSpaziatura = new Label("/* i numeri sono spaziati da: , */");

		Button pControlla = new Button("CONTROLLA");

		griglia.add(lVettore, 0, 0);
		griglia.add(lValore, 1, 0);
		griglia.add(tErrore, 1, 1);
		griglia.add(tVettore, 0, 1);
		griglia.add(pControlla, 0, 2);
		griglia.add(lControllo, 0, 3);
		griglia.add(lSpaziatura, 0, 5);

		pControlla.setOnAction(e -> Controlla());

		finestra.setScene(scena);
		finestra.setTitle("Esercizio 13");
		finestra.show();

	}

	private void Controlla() {

		int Errore = Integer.parseInt(tErrore.getText());

		String valore = tVettore.getText();

		String numeri[] = valore.split(",");

		int numeri2[] = new int[numeri.length];

		boolean fine = false;

		for (int i = 0; i < numeri.length && fine == false; i++) {

			numeri2[i] = Integer.parseInt(numeri[i]);

			if (numeri2[i] < Errore) {

				fine = true;

			}
		}
		if (fine == true) {

			lControllo.setText("non tutti i numeri sono maggiori di: " + Errore);
		} else {
			lControllo.setText("tutti i numeri sono maggiori di: " + Errore);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
