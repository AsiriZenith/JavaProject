/**
 * created CreditCard class As Singleton
 * */
public class CreditCard {

    private static CreditCard creditCard = null;

    private CreditCard(){ }

    public static CreditCard getInstance(){
        if (creditCard == null){
            creditCard = new CreditCard();
        }
        return creditCard;
    }

    public boolean validate(String cardno, int code){
        boolean result;
        if (cardno.length() == 16){
            if (code%3 == 0){
                result = true;
            }
            else {
                result = false;
            }
        }
        else {
            result = false;
        }
        return result;
    }
}
