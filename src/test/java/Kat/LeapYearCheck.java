package Kat;

import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year YYYY");

        int inputYear = scanner.nextInt();

        if(inputYear%4==0){

            System.out.println(inputYear+" is a leap Year");
        }

        else{

            System.out.println(inputYear+" is not a leap year");
        }

        System.out.println("if you want to know more about leap year Enter [yes]/ else [No]");
        String ifYes = scanner.next().toLowerCase();

        if(ifYes.equals("yes")){

            System.out.println("A leap year is a year that has 366 days instead of the usual 365 days. This extra day is added to the calendar in order to keep the calendar year synchronized with the Earth’s orbit around the Sun, which takes approximately 365.25 days.\n" +
                    "\n" +
                    "The rules for determining a leap year are:\n" +
                    "\n" +
                    "\t1.\tA year is a leap year if it is divisible by 4.\n" +
                    "\t2.\tHowever, if the year is divisible by 100, it is not a leap year, unless:\n" +
                    "\t3.\tThe year is also divisible by 400, in which case it is a leap year.\n" +
                    "\n" +
                    "Examples:\n" +
                    "\n" +
                    "\t•\t2020 is a leap year (divisible by 4, not divisible by 100).\n" +
                    "\t•\t1900 is not a leap year (divisible by 100 but not by 400).\n" +
                    "\t•\t2000 is a leap year (divisible by 400).\n" +
                    "\n" +
                    "In leap years, February has 29 days instead of 28.");

        }

        else {
            System.out.println("Thank you for using this program");
        }


    }
}
