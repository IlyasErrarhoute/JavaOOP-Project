package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import Fabrik.ConcreteCsvCreator;
import Fabrik.ConcreteTxtCreator;
import Fabrik.Creator;
import Fabrik.Product;
import ownUtil.Observable;
import ownUtil.Observer;

public class BuergeraemterModel implements Observable {
	private Vector<Observer> observers = new Vector<Observer>();
//	private Buergeramt buergeramt = null;
	private ArrayList<Buergeramt> buergeramt = new ArrayList<Buergeramt>();
	
	
	private static BuergeraemterModel  buergeraemterModel;
	private BuergeraemterModel() {}
	public static BuergeraemterModel getInstance() {
		if (buergeraemterModel != null) {
			return buergeraemterModel;
			
		} else {
			buergeraemterModel = new BuergeraemterModel();
			return buergeraemterModel;

		}
		
	}
	
//	public Buergeramt getBuergeramt() {
//		return buergeramt;
//	}
//
//	public void setBuergeramt(Buergeramt buergeramt) {
//		this.buergeramt = buergeramt;
//		notifyObservers();
//	}
	public ArrayList<Buergeramt> getBuergeramt() {
		return buergeramt;
	}
	
public void addBuergeramt(Buergeramt buergeramt) {
	this.buergeramt.add(buergeramt);
	notifyObservers();
	
}
	public void schreibeBuergeraemterInCsvDatei() throws IOException {
//		BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv", true ));
//		aus.write(this.getBuergeramt().gibBuergeramtZurueck(';'));
//		aus.close();
		Creator csvC = new ConcreteCsvCreator();
		Product csvP = csvC.csvFactory();
		for (Buergeramt buergeramt2 : buergeramt) {
			
			csvP.fuegeInDateiHinzu(buergeramt2);
		}
		csvP.schliesseDatei();
		
	}
	public void schreibeBuergeraemterInTxtDatei() throws IOException {
//		BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv", true ));
//		aus.write(this.getBuergeramt().gibBuergeramtZurueck(';'));
//		aus.close();
		Creator txtC = new ConcreteTxtCreator();
		Product txtP = txtC.csvFactory();
		for (Buergeramt buergeramt2 : buergeramt) {
			
			txtP.fuegeInDateiHinzu(buergeramt2);
		}
		txtP.schliesseDatei();
		
	}
	@Override
	public void addObserver(Observer obs) {
		observers.addElement(obs);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		observers.removeElement(obs);
	}
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
		// TODO Auto-generated method stub
		
	}

}
