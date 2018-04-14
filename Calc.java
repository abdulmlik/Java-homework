/*
/////////// ********************************************************************************************* \\\\\\\\\\\
|                     This program simulation Simple Calculator                                                     |
|                                                                                                                   |
|                                         Written by Abdulmalik Ben Ali                                             |
\\\\\\\\\\\ ********************************************************************************************* ///////////
*/

package calc;
import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {

        
        //Loop: while(true)
        //{
            System.out.println("\t\t\t Name           : عبدالملك مصطفى بن علي");
            System.out.println("\t\t\t Student Number : 213010551");
            
            
            System.out.println("Simple Calculator");
            System.out.println("\nHere are your options:");
            System.out.println("\n1. Addition \'+\'");
            System.out.println("2. Subtraction \'-\'");
            System.out.println("3. Division \'/\'");
            System.out.println("4. Multiplication \'*\'");
            System.out.println("Press Enter to continue");
            
            System.out.print("\nchoice your number?: ");

            String choice;
            Scanner input;
            input = new Scanner(System.in);
            choice = input.next();  // ادخال نص

            System.out.println();
            switch(choice)
            {
                case "1": sum();
                    break;
                case "2": sub();
                    break;
                case "3": div();
                    break;
                case "4": mul();
                    break;
                default:
                    //break Loop;
            }
        //}
        System.out.println();
        input.close();
    }

    public static void sum()
    {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nFirst Number: ");
        number1 = input.nextInt();
        System.out.print("\nSecond Number: ");
        number2 = input.nextInt();
        input.close();
        System.out.println("\nSum: " + number1 + " + " + number2 + " = " + (number1 + number2));
    }

    public static void sub()
    {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nFirst Number: ");
        number1 = input.nextInt();
        System.out.print("\nSecond Number: ");
        number2 = input.nextInt();
        input.close();
        System.out.println("\nSub: " + number1 + " - " + number2 + " = " + (number1 - number2));
    }

    public static void div(){
        float number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nFirst Number: ");
        number1 = input.nextInt();
        System.out.print("\nSecond Number: ");
        number2 = input.nextInt();
        input.close();
        if(number2 != 0)
        {
            System.out.println("\nSum: " + number1 + " / " + number2 + " = " + (number1 / number2));
        }else{
            System.out.println("لايمكن القسمة على صفر في الرياضيات");
        }
    }

    public static void mul(){
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nFirst Number: ");
        number1 = input.nextInt();
        System.out.print("\nSecond Number: ");
        number2 = input.nextInt();
        input.close();
        System.out.println("\nSum: " + number1 + " x " + number2 + " = " + (number1 * number2));
    }
}
