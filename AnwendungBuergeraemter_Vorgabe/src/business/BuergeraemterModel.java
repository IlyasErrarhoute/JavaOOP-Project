package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Fabrik.ConcreteCsvCreator;
import Fabrik.ConcreteTxtCreator;
import Fabrik.Creator;
import Fabrik.Product;

public class BuergeraemterModel {
	private Buergeramt buergeramt;
	
	public Buergeramt getBuergeramt() {
		return buergeramt;
	}

	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
	}

	public void schreibeBuergeraemterInCsvDatei() throws IOException {
//		BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv", true ));
//		aus.write(this.getBuergeramt().gibBuergeramtZurueck(';'));
//		aus.close();
		Creator csvC = new ConcreteCsvCreator();
		Product csvP = csvC.csvFactory();
		csvP.fuegeInDateiHinzu(this.buergeramt);
		csvP.schliesseDatei();
		
	}
	public void schreibeBuergeraemterInTxtDatei() throws IOException {
//		BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv", true ));
//		aus.write(this.getBuergeramt().gibBuergeramtZurueck(';'));
//		aus.close();
		Creator txtC = new ConcreteTxtCreator();
		Product txtP = txtC.csvFactory();
		txtP.fuegeInDateiHinzu(this.buergeramt);
		txtP.schliesseDatei();
		
	}

}
