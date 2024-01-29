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

public class Esercizio3e4e5 extends Application{

	RadioButton cM3= new RadioButton("Numeri Mult. 3");
	RadioButton cNonM3= new RadioButton("Numeri non Mult. 3");
	RadioButton cM3e2= new RadioButton("Numeri Mult. 3 e 2");
	
	int tempi[];
	int numTempi;
	
	TextField tRange= new TextField();
	TextField tTempo= new TextField();
	
	Label lVettore= new Label();
	Label lSomma= new Label();
	
	public void start(Stage finestra) throws Exception {
	
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena=new Scene(griglia, 465 ,275);
		
		finestra.setScene(scena);
		finestra.setTitle("Esercizio 3");
		finestra.show();
		
		ToggleGroup Somma= new ToggleGroup();
		
		cM3.setToggleGroup(Somma);
		cNonM3.setToggleGroup(Somma);
		cM3e2.setToggleGroup(Somma);
		
		Label lRange= new Label("Lunghezza Vettore:");
		Label lTempo= new Label("Num. Max:");
		Label lVettore1= new Label("Vettore:");
		Label lSomma1= new Label("Somma:");
		
		Button pAlloca= new Button("ALLOCA");
		Button pSomma= new Button("SOMMA");
		
		pAlloca.setMinWidth(100);
		pSomma.setMinWidth(100);
		
		griglia.add(lRange, 0, 0);
		griglia.add(lTempo, 1, 0);
		griglia.add(tRange, 0, 1);
		griglia.add(tTempo, 1, 1);
		griglia.add(pAlloca, 0, 3);
		griglia.add(pSomma, 0, 4);
		griglia.add(cM3, 0, 5);
		griglia.add(cNonM3, 1, 5);
		griglia.add(cM3e2, 2, 5);
		griglia.add(lSomma1, 0, 6);
		griglia.add(lSomma, 0, 7, 3, 1);
		griglia.add(lVettore1, 0, 8);
		griglia.add(lVettore, 0, 9, 3, 1);
		
		pAlloca.setOnAction(e -> Alloca());
		pSomma.setOnAction(e -> Somma());
	}
	
	private void Alloca() {
		
		numTempi= Integer.parseInt(tTempo.getText());
		
		int Range= Integer.parseInt(tRange.getText());
		
		tempi = new int[numTempi];
		
		for(int i=0; i < numTempi; i++) {
			
			tempi[i]= (int) (Math.random()*Range);		
			
		}
		
	}
	
	private void Somma() {
		
		String vettore= "";
		
		int Somma= 0;
		
		if(cM3.isSelected()) {
			
			for(int i =0; i < numTempi; i++) {
				
				if(tempi[i] % 3 ==0) {
					
					Somma+=tempi[i];
					
				}
				if(i == numTempi-1) {
					vettore+= tempi[i];
					
				}else {
					vettore+= tempi[i]+ " - ";
				}
			}
			
		}
		
		if(cNonM3.isSelected()) {
			
			for(int i =0; i < numTempi; i++) {
				
				if(tempi[i] % 3 ==0) {
					
				}else {
					
					Somma+=tempi[i];
				}
				if(i == numTempi-1) {
					vettore+= tempi[i];
					
				}else {
					vettore+= tempi[i]+ " - ";
				}
			}
			
		}
		
		if(cNonM3.isSelected()) {
			
			for(int i =0; i < numTempi; i++) {
				
				if(tempi[i] % 3 ==0 && tempi[i] % 2==0) {
					
					Somma+=tempi[i];
					
					
				}
				if(i == numTempi-1) {
					vettore+= tempi[i];
					
				}else {
					vettore+= tempi[i]+ " - ";
				}
			}
			
		}
		
		lSomma.setText(""+Somma);
		lVettore.setText(""+vettore);
	
	}
	public static void main(String []args) {
		launch(args);
	}

}
