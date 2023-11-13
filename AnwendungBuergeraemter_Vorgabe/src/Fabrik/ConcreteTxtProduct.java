package Fabrik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteTxtProduct extends Product{
private BufferedWriter bw;
	public ConcreteTxtProduct() throws IOException {
		 bw = new BufferedWriter(new FileWriter("Buergeraemter.txt", true ));
		
		
	}
		@Override
		public void fuegeInDateiHinzu(Object object) throws IOException {
			Buergeramt buergeramt = (Buergeramt) object;
			bw.write("daten des Burger \n Name \t\t\t "+buergeramt.getName()+"\nArbeitzeit\t\t\t"+buergeramt.getGeoeffnetVon()+"-"+buergeramt.getGeoeffnetBis()+"\nDiesnleistungen des Buergeramts"+buergeramt.getDienstleistungenAlsString('-'));
			
			// TODO Auto-generated method stub
			
		}

		@Override
		public void schliesseDatei() throws IOException {
			// TODO Auto-generated method stub
			bw.flush();
			bw.close();
		}

}
