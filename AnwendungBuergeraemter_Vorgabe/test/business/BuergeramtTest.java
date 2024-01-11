package business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuergeramtTest {
	private Buergeramt buergeramt;

	@BeforeEach
	void setUp() throws Exception {
		String[] arr = {"Hauptwohnsitz","Nebenwohnsitz"};
		this.buergeramt = new Buergeramt("Querenburg", 9.0f, 17.0f , "Querenburger Höhe 256 ", arr);
	}

	@Test
	void test() {
		assertTrue(()->this.buergeramt.getName().equals("Querenburg"));
	}
	@Test
	void test2() {
		
//Throwable exc = assertThrows(IllegalArgumentException.class, ()-> new Buergeramt("Querenburg", 9.0f, 17.0f , "Querenburger Höhe 256 ", null));
//	assertEquals("Die vorgegebene Dienstleistungen sind nicht korrekt...", exc.getMessage());
	
	
	Throwable exc = assertThrows(NullPointerException.class, ()-> new Buergeramt("Querenburg", 9.0f, 17.0f , "Querenburger Höhe 256 ", null));
	assertEquals("Die vorgegebene Dienstleistungen sind nicht korrekt...", exc.getMessage());
	
	}

}
