package main;

import gui.BuergeraemterAnwendersystem;
import gui.guiBuergeraemter.BuergeraemterControl;
import gui.guiStaedtischeEinrichtungen.StaedtischeEinrichtungenControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		//new BuergeraemterAnwendersystem(primaryStage);
		new BuergeraemterControl(primaryStage);
		Stage stage = new Stage();
		new StaedtischeEinrichtungenControl(stage);
		
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
