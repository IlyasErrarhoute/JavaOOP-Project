package Fabrik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteCsvProduct extends Product{
private BufferedWriter bw ;

public ConcreteCsvProduct() throws IOException {
	 bw = new BufferedWriter(new FileWriter("Buergeraemter.csv", true ));
	
	
}
	@Override
	public void fuegeInDateiHinzu(Object object) throws IOException {
		Buergeramt buergeramt = (Buergeramt) object;
		bw.write(buergeramt.gibBuergeramtZurueck(';'));
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		bw.flush();
		bw.close();
	}

}
