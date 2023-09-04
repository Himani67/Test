package Test;
import java.util.Random;
import java.util.Scanner;
public class classtest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String User = "Deerwalk";
        String Pass = "dwit1234";
        System.out.print("Enter username:");
        String username = scan.nextLine();
        System.out.print("Enter password:");
        String password = scan.nextLine();
        if (username.equals(User) && password.equals(Pass)) {
            System.out.println("Welcome!");
            System.out.println("Choose a tool");
            System.out.println("1. Calculator");
            System.out.println("2. Guessing Game");
            System.out.println("3. SI Calculator");
            System.out.println("4. Vowel Consonant Check");
            int tool=scan.nextInt();

            switch (tool){
                case 1 :
                    System.out.println("You choose Calculator");
                    System.out.print ("Enter Operation (+,-,*,/): ");
                    String operation=scan.next();
                    System.out.print("First Number: ");
                    double firstnum=scan.nextDouble();
                    System.out.print("Second Number: ");
                    double secondnum=scan.nextDouble();
                    double num_1,num_2;
                    double great = Math.max(firstnum, secondnum);
                    if (great==firstnum){
                        num_1=firstnum;
                        num_2=secondnum;
                    }
                    else if (great==secondnum){
                        num_2=firstnum;
                        num_1=secondnum;
                    }
                    else{
                        num_1=firstnum;
                        num_2=secondnum;
                    }

                    switch (operation) {
                        case "+" -> System.out.println("The sum is:" + (firstnum + secondnum));
                        case "-" -> System.out.println("The difference is:" + (num_1 - num_2));
                        case "*" -> System.out.println("The result is:" + (num_1 * num_2));
                        case "/" -> System.out.println("The division is:" + (num_1 / num_2));
                        default -> System.out.println("Operation Not Found");
                    }
                case 2:
                    Random random = new Random();
                    int chosenNumber = random.nextInt(51);

                    System.out.println("Guessing Game");
                    while (true) {
                        System.out.print("Enter your guess (1-50): ");
                        int guess = scan.nextInt();
                        if (guess == chosenNumber) {
                            System.out.println("Your Guess is Correct");
                            break;
                        } else if (guess < chosenNumber) {
                            System.out.println("Try High.");
                        } else {
                            System.out.println("Try Low.");
                        }
                    }
                case 3:
                    System.out.println(" SI Calculator");
                    System.out.println("Enter Principle: ");
                    double principle=scan.nextDouble();
                    System.out.println("Enter Time");
                    double time=scan.nextDouble();
                    System.out.println("Enter Rate");
                    double rate=scan.nextDouble();

                    double SI=(principle*time*rate)/100;
                    System.out.println("SI is"+SI);

                case 4:
                    System.out.println("You choose Vowel Consonant Check");
                    System.out.println("Enter a character");
                    String character=scan.next().toLowerCase();
                    if (character.length()==1){
                        switch (character){
                            case "a","e","i","o","u" :
                                System.out.println("It is Vowel");
                            default:
                                System.out.println("It is Consonant");
                        }
                    }
                    else{
                        System.out.println("Enter only one valid character");
                    }
                    break;
                default:
                    System.out.println("Invalid tool");

            }

        } else {
            System.out.println("Invalid Login!");
        }
    }
}

