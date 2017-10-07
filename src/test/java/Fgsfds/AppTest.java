package Fgsfds;

import Fgsfds.cardCheck.CreditCard;
import Fgsfds.map.MyMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest

{
    @Test
    @DisplayName("Map Test")
    void mapTest() {
        MyMap map = new MyMap();
        List<String> rhcp = new ArrayList<>();
        rhcp.add("Anthony Kiedis");
        rhcp.add("Flea");
        rhcp.add("Hillel Slovak");
        rhcp.add("Jack Irons");
        map.put("RHCP", rhcp);

        assertEquals(rhcp,map.get("RHCP"));


        map.put("FormedIn", 1983);

        assertEquals(1983, map.get("FormedIn"));

        map.put("Hello", "World");
        assertEquals("World", map.get("Hello"));
        map.put("Hello", "Fgsfds");
        assertEquals("Fgsfds", map.get("Hello"));


    }

    @Test
    @DisplayName("Card test")
    void cardCheckerTest() {
        //these are all real cards
        //pls don't steal my money
        String[] cards = {
                "5104690006336210",
                "5536913759194299",
                "5321300241007884",
                "5106214000289693",
                "5422550220961588",
                "4276670024517566"
        };

        List<CreditCard> creditCards = new ArrayList<>();
        for (String card : cards) {
            creditCards.add(new CreditCard(card));
        }

        creditCards.forEach(card -> assertTrue(card.checkTheCard()));


        CreditCard falseCard = new CreditCard("9482758492928577");
        assertFalse(falseCard.checkTheCard());

    }
}
