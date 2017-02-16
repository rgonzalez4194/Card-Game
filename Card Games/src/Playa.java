
public class Playa extends Player {

	public Playa(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Removes and returns a legal card from the player's hand.
     */
    public Card play(Eights eights, Card prev) {
        Card card = searchForBestMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    } 
  
