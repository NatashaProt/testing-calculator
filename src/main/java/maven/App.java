package maven;

import java.util.Scanner;

public class App{

    public static void main(String args[]) {
        int firstnumber, secondnumber;
        int x=1;
        System.out.println("CALCULATOR OF INTEGERS");
        do {
            try {
                Scanner var = new Scanner(System.in);
                Scanner textvar = new Scanner(System.in);

                System.out.print("Enter 1st number: ");
                firstnumber = var.nextInt();
                System.out.print("Enter 2nd number: ");
                secondnumber = var.nextInt();

                System.out.println("+ for Sum");
                System.out.println("- for Subtraction");
                System.out.println("* for Multiplication");
                System.out.println("/ for Division");
                System.out.print("Enter symbol: ");

                char symbol = textvar.nextLine().charAt(0);
                calculator(firstnumber, secondnumber, symbol);
                x++;
            }
            catch (Exception e) {
                System.out.println("Wrong input. Try again.");
                System.out.println();
            }
        } while (x==1);
    }

    public static int calculator(int numberOne, int numberTwo, char symbol) {
        int result = 1;

        switch (symbol) {
            case '+':
                result = numberOne + numberTwo;
                System.out.print(numberOne + "+" + numberTwo + "=" + result);
                return result;

            case '-':
                result = numberOne - numberTwo;
                System.out.print(numberOne + "-" + numberTwo + "=" + result);
                return result;

            case '*':
                result = numberOne * numberTwo;
                System.out.print(numberOne + "*" + numberTwo + "=" + result);
                return result;

            case '/':
                result = numberOne / numberTwo;
                if (numberTwo != 0){
                    if (result < 1) System.out.println("This is a factor " + numberOne + "/" + numberTwo + " < 1");
                    else System.out.print(numberOne + "/" + numberTwo + "=" + result);
                }
                return result;

            default:
                System.out.println("Entered the wrong operation");
                result = 0;
                return result;
        }
        //System.out.print(numberOne + symbol + numberTwo + "<" + 1);
    }
}
