package Fgsfds;

import Fgsfds.cardCheck.CreditCard;
import Fgsfds.map.MyMap;

/**
 * Say Hello to my little World!
 */
public class App 
{
    public static void main( String[] args )
    {
        CreditCard creditCard = new CreditCard("5104690006336210");
        if (creditCard.checkTheCard()) System.out.println("this is a card!");

        MyMap<CreditCard> creditCards = new MyMap<>();

        creditCards.put("myCard", creditCard);

        if (creditCards.get("myCard").checkTheCard()){
            System.out.println("I checked the card from the map and it's number is real");
        }

    }
}
