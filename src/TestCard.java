import static org.junit.Assert.*;

import org.junit.Test;

public class TestCard {

	@Test
	public void testConstructor() {
		Card AoH= new Card("Ace", "Hearts", 12);
		assertEquals("Ace", AoH.rank());
		assertEquals("Hearts",AoH.suit());
		assertEquals(12,AoH.pointValue());
		
	}
	@Test
	public void testMatches() throws Exception {
		Card QoS = new Card("Queen", "Spades", 11);
		Card QoS2 = new Card("Queen", "Spades", 11);
		Card JoD = new Card("Jack", "Diamonds", 10);
		assertEquals(true,QoS.matches(QoS2));
		assertFalse(QoS.matches(JoD));
	}
	
	@Test
	public void testToString() throws Exception {
		Card ToC = new Card("Ten", "Clubs", 10);
		assertEquals("Ten of Clubs (point value = 10)", ToC.toString());
	}

}
