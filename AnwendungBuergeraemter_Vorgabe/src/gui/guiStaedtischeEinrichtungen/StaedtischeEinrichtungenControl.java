package gui.guiStaedtischeEinrichtungen;

import business.BuergeraemterModel;
import javafx.stage.Stage;
import ownUtil.Observer;

public class StaedtischeEinrichtungenControl implements Observer{
	private StaedtischeEinrichtungenView einrichtungenView;
	
	private BuergeraemterModel buergeraemterModel;
	
	public StaedtischeEinrichtungenControl(Stage stage) {
		this.buergeraemterModel = BuergeraemterModel.getInstance();
		this.einrichtungenView = new StaedtischeEinrichtungenView(stage, buergeraemterModel, this);
		this.buergeraemterModel.addObserver(this);
		
		
	}

	@Override
	public void update() {
		einrichtungenView.zeigeBuergeraemterAn();
		// TODO Auto-generated method stub
		
	}
	
	

}
//package gui.guiBuergeraemter;
//
//import java.io.IOException;
//
//import business.BuergeraemterModel;
//import javafx.stage.Stage;
//
//public class BuergeraemterControl {
//	private BuergeraemterView buergeraemterView;
//	private BuergeraemterModel buergeraemterModel;
//	public BuergeraemterControl(Stage stage) {
//		this.buergeraemterModel = new BuergeraemterModel();
//		this.buergeraemterView = new BuergeraemterView(stage , buergeraemterModel , this);
//		
//	}
//	void schreibeBuergeraemterInDatei(String typ) {
//		try {
//		if ("csv".equals(typ)) {
//			buergeraemterModel.schreibeBuergeraemterInCsvDatei();
//			buergeraemterView.zeigeInformationsfensterAn("saved in csv");
//			
//			
//		}
//		else {
//			buergeraemterModel.schreibeBuergeraemterInTxtDatei();
//			buergeraemterView.zeigeInformationsfensterAn("saved in txt");
////			buergeraemterView.zeigeFehlermeldungsfensterAn("noch nocht implementiert!");
//		}
//		}
//		catch (Exception e) {
//			 buergeraemterView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
//			// TODO: handle exception
//		}
//	}
//
//}
//
