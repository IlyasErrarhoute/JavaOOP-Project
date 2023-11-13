package Fabrik;

import java.io.IOException;

public class ConcreteTxtCreator  extends Creator{

	@Override
	public Product csvFactory() throws IOException {
		// TODO Auto-generated method stub
		return new ConcreteTxtProduct();
	}

}
