package Kat;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Type anything ");
        String userInput = scan.nextLine();


        String revString= "";

        for(int i=userInput.length()-1;i>=0;i--){

            revString+=userInput.charAt(i);
        }

        System.out.println(revString);
        scan.close();

    }
}
