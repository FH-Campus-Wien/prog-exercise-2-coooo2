package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {

        new java.text.DecimalFormat("0.00").format(1.742545452562);

        Scanner scan = new Scanner(System.in);

        System.out.print("Number 1: ");         double num1 = scan.nextInt();

        if (num1 <= 0){

            System.out.println("No number entered.");

            return;
        }

        System.out.print("Number 2: ");         double num2 = scan.nextInt();

        System.out.print("Number 3: ");         double num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){

            System.out.println("The largest number is " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("The largest number is " + num2);

        }else System.out.print("The largest number is " + num3);



    }


    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
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