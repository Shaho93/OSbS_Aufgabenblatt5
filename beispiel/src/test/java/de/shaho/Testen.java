package de.shaho;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testen {

	@Test
	
	public void testIstErstesHalbjahr() {
		try {
		Util.istErstesHalbjahr(3);
		//fail("Artimetischer Fehler nicht eingetroffen");
		}
		
		catch(ArithmeticException e)
		{
			
		}
	}
	
	

}
