package Kat;

import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number 1 to 10");
        int number = scanner.nextInt();

        if (number > 5) {

            System.out.println("you will win the lottery");
        }

        else{

            System.out.println("dont forget to bring umbrella today");
        }

    }
}
