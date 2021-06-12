import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        int code = 0;
        String cardno = "";
        CreditCard creditCard = CreditCard.getInstance();

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter CreditCard Number : ");
        cardno = myObj.nextLine();
        System.out.print("Enter CreditCard Code : ");
        code = myObj.nextInt();

        if (creditCard.validate(cardno,code)){
            System.out.println("Valid CreditCard!!");
        }
        else {
            System.out.println("Invalid CreditCard!!");
        }

        // Verify that both objects refer to a single CreditCard object
        CreditCard newInstance = CreditCard.getInstance();

        if (creditCard == newInstance){
            System.out.println("Same Object");
        }
        else {
            System.out.println("Different Object");
        }
    }
}
