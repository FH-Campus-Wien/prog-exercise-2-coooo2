package at.ac.fhcampuswien;

import java.util.Locale;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        int counter = 2;
        float number = 0;
        float largest = number;

        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        number = input.nextFloat();

        if (number <= 0){
            System.out.println("No number entered.");
            return;
        }

        while(counter > 0)
        {
            System.out.print("Number "+counter);
            System.out.print(": ");
            number = input.nextFloat();
            counter++;

            if(number > largest){
                largest = number;
            }

            if (number == 0){
                break;
            }

        }
        System.out.print("The largest number is ");
        System.out.format("%.2f", largest);
    }



        //todo Task 2
    public void stairs(){                                                                                               //https://www.geeksforgeeks.org/java-program-to-display-floyds-triangle/

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        number = input.nextInt();
        int p =1;

        if(number <= 0){
            System.out.println("Invalid number!");
            return;
        }
        for(int i = 0; i < number; i++)
        {
            for(int j = 0; j < number; j++)
            {
                if(i >= j)
                {
                    System.out.print(p+++" ");
                }
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){                                                                                         // https://www.programiz.com/java-programming/examples/pyramid-pattern

        int rows = 6, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}