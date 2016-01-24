import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTester {
	String[] suits= {"Clubs", "Diamonds"};
	String[] ranks = {"Queen", "King"};
	int[] values = {11,12};
	Deck tester =  new Deck(ranks, suits, values);
	@Test
	public void testDeck() {
		assertEquals("Queen of Clubs (point value = 11)", tester.getCards().get(0).toString());
		assertEquals(4, tester.getCards().size());
	}
	@Test
	public void testDeal(){
		Card c = tester.deal();
		assertEquals(tester.getCards().get(3),c);
		assertEquals(3,tester.size());;
		Card d = tester.deal();
		assertEquals(tester.getCards().get(2),d);
		assertEquals(2,tester.size());
		
		System.out.println(tester.getCards().toString());
	}
	
	

}
