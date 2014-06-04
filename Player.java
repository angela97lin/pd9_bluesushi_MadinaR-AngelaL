/*=======================================
 Player Class
 -details what a player/user in this game 
 is capable of.
 ========================================*/
public class Player {

    //INSTANCE VARIABLE
    private Hand myHand;

    //CONSTRUCTOR: instantiate player with a hand
    public Player(ArrayList<Card> cards){
	myHand = new Hand(cards);
    }

    //ACCESOR METHOD
    public Hand getHand(){
	return myHand;
    }
}
