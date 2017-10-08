package Fgsfds.cardCheck;

import java.util.stream.IntStream;

//Could also be used as a debit card
public class CreditCard {
    private final String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public Boolean isValid() {

        final int[] cardDigits = this.cardNumber.chars().map(Character::getNumericValue).toArray();
        //I didn't like this solution at first
        //But when it worked - i started to dislike it even more
        final int sum = IntStream.range(0, cardDigits.length)
                .map(i -> cardDigits.length - i - 1)
                .map(i -> (i % 2 == 0) ? (cardDigits[i] * 2) : (cardDigits[i]))
                .map(i -> (i >= 9) ? (i % 10) + (i / 10) : i)
                .sum();
//        for (int i = cardDigits.length-1; i>=0; i--){
//
//            if(((i-cardDigits.length)%2)==0){
//                sum+= ((cardDigits[i]*2)<=9) ? (cardDigits[i]*2) : (((cardDigits[i]*2)%10)+(int)((cardDigits[i]*2)/10));
//            } else {
//                sum+= cardDigits[i];
//            }
//        }
        return (sum%10==0);
    }
}
