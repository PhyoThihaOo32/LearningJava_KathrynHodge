package Kat;

import java.util.Scanner;

public class PracticeDataTypes {

    public static void main(String[] args){

        //Primitive Data Types
        int studentAge = 15;
        double studentGPA = 4.5;
        String studentFirstName = "Phyo";
        String studentLastName = "Oo";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        //Reference Data Type




        System.out.println(studentAge);

        System.out.println(studentFirstName+" "+studentLastName+" has a GPA of "+studentGPA);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);

        System.out.println("What do you want to update it for?");

        Scanner scan = new Scanner(System.in);
        studentGPA = scan.nextDouble();

        System.out.println(studentFirstName+" "+studentLastName+" now has a GPA of "+studentGPA);

        System.out.println("Please input any Words");
        String userInput = scan.next();

        int index = userInput.length()-1;
        char lastChar = userInput.charAt(index);

        System.out.print("last Char from the String is " + lastChar);



        }





}
