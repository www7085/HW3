package homework;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
		// TODO Auto-generated method stub
	    private ArrayList<Card> usedCard = new ArrayList<Card>();
		private ArrayList<Card> cards;
		public int nUsed;
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			for(int i=0;i<nDeck;i++)
			{
			for(Card.Suit j:Card.Suit.values())
			{
			 for(int rank=1; rank<=13; rank++)
			 {
			    	  Card c =new Card(j,rank);
			    	  cards.add(c);
			      }  
			      }
			}
shuffle();
		}	
		
		public void printDeck(){
			for(int i=0;i<cards.size();i++){
				Card x  = cards.get(i);
				x.printCard();
			}

			

		}
		public ArrayList<Card> getAllCards(){
			return cards;
		}

		public void shuffle(){
			Random a = new Random();
			for(int n=1;n<=52;n++){
				int one=a.nextInt(51);
				int two=a.nextInt(51);
				Card z=cards.get(one);
				cards.set(one,cards.get(two));
				cards.set(two, z);
			}
			usedCard.clear();
			nUsed=0;
		}
		public Card getOneCard(){
			int q=usedCard.size();
			usedCard.add(cards.get(q));
			nUsed++;
			return(usedCard.get(q));
			
		}
	}


