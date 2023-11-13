package Fabrik;

import java.io.IOException;

public class ConcreteCsvCreator extends Creator {

	@Override
	public Product csvFactory() throws IOException {
		// TODO Auto-generated method stub
		return new ConcreteCsvProduct();
	}

}
