package Fgsfds.cardCheck;

//Could also be used as a debit card
public class CreditCard {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public Boolean checkTheCard(){

        int[] cardDigits = this.cardNumber.chars().map(Character::getNumericValue).toArray();
        int sum = 0;
        for (int i = cardDigits.length-1; i>=0; i--){

            if(((i-cardDigits.length)%2)==0){
                sum+= ((cardDigits[i]*2)<=9) ? (cardDigits[i]*2) : (((cardDigits[i]*2)%10)+(int)((cardDigits[i]*2)/10));
            } else {
                sum+= cardDigits[i];
            }
        }
        return (sum%10==0);
    }
}
