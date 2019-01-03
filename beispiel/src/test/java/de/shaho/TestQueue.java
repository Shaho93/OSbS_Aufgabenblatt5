package de.shaho;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {

	@Before
	public void testQueue() {
		try {
			Queue wsch0 = new Queue(3);
		} catch (Exception e) {
			
			fail("Falsche Größe für Array gewählt");
		}
		
	}

	@Test
	public void testEnqueue() {
		try {
		Queue wsch = new Queue(3);
		wsch.enqueue(1);
		wsch.enqueue(-1);
		wsch.enqueue(333);
		wsch.enqueue(9);
		}
		catch(Exception e) {
		fail("Falscher Datentyp eingegeben");
		}
	}

	@Test
	public void testDequeue() {
		try {
			Queue wsch = new Queue(3);
			wsch.enqueue(1);
			wsch.enqueue(333);
			wsch.enqueue(9);
			wsch.enqueue(3);
			
			Queue wsch2 = new Queue(3);
			wsch2.enqueue(1);
			wsch2.enqueue(333);
			wsch2.enqueue(9);
			wsch2.enqueue(3);
			
			Queue wsch3 = new Queue(0);
			int temp = wsch.dequeue();
			int temp2 =wsch2.queue[(wsch2.head++)% 3];
			for(int i=0; i<3; i++)
			{
				assertTrue(temp == temp2);
			}
			int temp3 = wsch3.dequeue();
			System.out.print("Test abgeschlossen");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			fail("Der Test ist Fehlgeschlagen");
		}
	}

}
