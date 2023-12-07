package gui.guiBuergeraemter;

import java.io.IOException;

import business.BuergeraemterModel;
import javafx.stage.Stage;
import ownUtil.Observer;

public class BuergeraemterControl implements Observer{
	private BuergeraemterView buergeraemterView;
	private BuergeraemterModel buergeraemterModel;
	public BuergeraemterControl(Stage stage) {
		this.buergeraemterModel = BuergeraemterModel.getInstance();
		this.buergeraemterView = new BuergeraemterView(stage , buergeraemterModel , this);
		this.buergeraemterModel.addObserver(this);
		
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
	@Override
	public void update() {
		buergeraemterView.zeigeBuergeraemterAn();
		// TODO Auto-generated method stub
		
	}

}
