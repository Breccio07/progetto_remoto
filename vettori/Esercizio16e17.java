package it.edu.iisgubbio.Vettore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Esercizio16e17 extends Application {

	RadioButton cMaggiore = new RadioButton("MAGGIORE");
	RadioButton cMinore = new RadioButton("MINORE");

	TextField tVettore = new TextField();
	TextField tValore = new TextField();

	Label lControllo = new Label();

	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();

		griglia.setVgap(10);
		griglia.setHgap(10);

		Scene scena = new Scene(griglia, 340, 250);

		finestra.setScene(scena);
		finestra.setTitle("Esercizio 16 e 17");
		finestra.show();

		ToggleGroup genere = new ToggleGroup();

		cMaggiore.setToggleGroup(genere);
		cMinore.setToggleGroup(genere);

		tVettore.setMinWidth(150);
		tValore.setMinWidth(150);

		Label lVettore = new Label("Vettore:");
		Label lValore = new Label("Valore:");
		Label lSpaziatura = new Label("/* i numeri sono spaziati da: - */");

		Button pControlla = new Button("CONTROLLA");

		griglia.add(lValore, 0, 0);
		griglia.add(lVettore, 1, 0);
		griglia.add(tValore, 0, 1);
		griglia.add(tVettore, 1, 1);
		griglia.add(cMaggiore, 0, 2);
		griglia.add(cMinore, 1, 2);
		griglia.add(pControlla, 0, 3);
		griglia.add(lControllo, 0, 4, 2, 1);
		griglia.add(lSpaziatura, 0, 6);

		pControlla.setOnAction(e -> Controlla());
	}

	private void Controlla() {

		int num = Integer.parseInt(tValore.getText());

		String valore = tVettore.getText();

		String numeri[] = valore.split(",");

		int numeri2[] = new int[numeri.length];

		boolean fine = false;

		if (cMaggiore.isSelected()) {

			for (int i = 0; i < numeri2.length && fine == false; i++) {

				numeri2[i] = Integer.parseInt(numeri[i]);

				if (num < numeri2[i]) {

					fine = true;
					lControllo.setText("almeno un numero è maggiore di: " + num);
				}

			}
		}
		if (cMinore.isSelected()) {

			for (int i = 0; i < numeri2.length && fine == false; i++) {

				numeri2[i] = Integer.parseInt(numeri[i]);

				if (num > numeri2[i]) {

					fine = true;
					lControllo.setText("almeno un numero è minore di: " + num);
				}

			}
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
