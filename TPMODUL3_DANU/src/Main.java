import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.print("Enter Customer ID : ");
            var customerID = userInput.nextInt();
            System.out.print("Enter how much food to made : ");
            var orderQty = userInput.nextInt();

            Thread restaurant = new Thread(new Restaurant());
            Thread waiters = new Thread(new Waiters(orderQty,customerID));

            restaurant.start();
            waiters.start();
            restaurant.join();
            waiters.join();

        }catch (Exception e){
            System.out.println("Input must be Integer");
        }

    }
}





