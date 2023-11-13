package gui;

import java.io.IOException;

import business.BuergeraemterModel;
import javafx.stage.Stage;

public class BuergeraemterControl {
	private BuergeraemterView buergeraemterView;
	private BuergeraemterModel buergeraemterModel;
	public BuergeraemterControl(Stage stage) {
		this.buergeraemterModel = new BuergeraemterModel();
		this.buergeraemterView = new BuergeraemterView(stage , buergeraemterModel , this);
		
	}
	void schreibeBuergeraemterInDatei(String typ) {
		try {
		if ("csv".equals(typ)) {
			buergeraemterModel.schreibeBuergeraemterInCsvDatei();
			buergeraemterView.zeigeInformationsfensterAn("saved in csv");
			
			
		}
		else {
			buergeraemterModel.schreibeBuergeraemterInTxtDatei();
			buergeraemterView.zeigeInformationsfensterAn("saved in txt");
//			buergeraemterView.zeigeFehlermeldungsfensterAn("noch nocht implementiert!");
		}
		}
		catch (Exception e) {
			 buergeraemterView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
			// TODO: handle exception
		}
	}

}
