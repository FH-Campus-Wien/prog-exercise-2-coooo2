package at.ac.fhcampuswien;

import java.util.Locale;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        int counter = 1;
        double number = 0;
        double largest = number;
        double number1;

        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        number1 = input.nextDouble();


        if (number1 <= 0){
            System.out.println("No number entered.");
            return;
        }

        while(counter > 0)
        {
            counter++;
            System.out.print("Number "+counter);
            System.out.print(": ");
            number = input.nextFloat();


            if(number > largest ){
                largest = number;
            } else if (number1 > largest) {
                largest = number1;
            }

            if (number == 0){
                break;
            }

        }
        System.out.print("The largest number is ");
        System.out.printf("%.2f", largest);
        System.out.println();
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


        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);

        if(h % 2 == 0){
            System.out.print("Invalid number!");
            System.out.println();
            return;
        }else{

            for(int i = 1; i < h/2+1 ;i++){
                for(int j = i; j<=h/2+1;j++){
                    System.out.print(" ");
                }
                for(int k = i; k > 0; k--){
                   char x = ((char) (c-k+1));
                    System.out.print(x);
                }
                for(int l = 1; l < i; l++){
                    char y = ((char) (c-l));
                    System.out.print(y);
                }
                System.out.println();
            }

            for(int i = 1; i < h/2 ; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(" ");
                }
                for (int k = i; k < h/2 ; k++){
                    char x = ((char) (c-k+1));
                    System.out.print(x);
                }
                for(int l = i; l <= h/2 ; l++){
                    char y = ((char) (c-l));
                    System.out.print(y);
                }
                System.out.println();
            }

        }


    }
    //todo Task 5
    public void marks(){

       int sum = 0;
       int counter = 1;
       int mark;
       float negmark = 0;
       float average = 0;
       int mark1;
       int averagemark = 0;
       Scanner input = new Scanner(System.in);
       System.out.print("Mark 1: ");
       mark1 = input.nextInt();

       while(counter > 0){
           counter++;
           System.out.print("Mark " +counter);
           System.out.print(": ");
           mark = input.nextInt();



           if(mark > 0 && mark < 5){
               sum = sum + mark + mark1;

               averagemark++;

           }

           if(mark < 0 || mark > 5){
               System.out.println("Invalid mark!");
           }

           if (mark == 5 || mark1 == 5){
               negmark++;
           }

           if(mark == 0){
               break;
           }

           average = sum / averagemark;

       }

       System.out.println("Average: "+average);
       System.out.println("Negative Marks: "+negmark);
       }


    //todo Task 6
    public int happyNumbers(){

               /*The following 13 lines of Code have been taken from the Internet | URL, last visit: dd.mm.yyyy
                *  https://www.w3resource.com/java-exercises/numbers/java-number-exercise-10.php#:~:text=Java%20Numbers%3A%20Exercise%2D10%20with%20Solution&text=Happy%20number%3A%20Starting%20with%20any,number%20that%20is%20not%20happy.
                *14.10.2022 */


                Scanner scan = new Scanner(System.in);
                System.out.print("n: ");
                int number = scan.nextInt();
                int happy = number,
                sum = 0;


                while (sum != number) {
                    sum = 0;
                    while (happy != 0) {
                        int dig = happy%10;
                        sum += dig*dig;
                        happy /= 10;
                    }
                    if (sum == number) {
                        System.out.println("Sad number!");
                    }
                    if (sum == 1) {
                        System.out.println("Happy number!");
                        break;
                    }
                    happy = sum;
                }
        return number;
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