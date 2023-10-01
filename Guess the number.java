import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int randomNumber = (int)(Math.random()*100);
        System.out.print("Enter a number between 1 - 100 : ");
        Scanner sc = new Scanner(System.in);
        int userNumber;

        do {
            userNumber = sc.nextInt();

            if (userNumber == randomNumber)
            {
                System.out.println("Woohoo... YOU GUESSED THE CORRECT NUMBER!!!");
                break;
            }
            else if (userNumber > 100 || userNumber <= 0)
            {
                System.out.println("Number is out of range");
                break;
            }
            else if (userNumber > randomNumber)
            {
                System.out.println("Your number is large enter a smaller number");
            }
            else
            {
                System.out.println("Your number is small enter a large number");
            }

        }while(userNumber > 0);

        System.out.print("My number was ");
        System.out.println(randomNumber);
    }
}
