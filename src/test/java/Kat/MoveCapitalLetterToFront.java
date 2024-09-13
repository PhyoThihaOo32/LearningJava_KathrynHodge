package Kat;

public class MoveCapitalLetterToFront {

    public static void main(String [] args){

        System.out.println(moveCapitalLetterToFront("Once Upon A Time!"));


    }

    public static String moveCapitalLetterToFront(String str){

        StringBuilder capitalLetter = new StringBuilder();
        StringBuilder lowerCaseLetter = new StringBuilder();

        for(char chr : str.toCharArray()){

            if(Character.isUpperCase(chr)){

                capitalLetter.append(chr);
            }

            else{

                lowerCaseLetter.append(chr);
            }
        }
           return capitalLetter.append(lowerCaseLetter).toString();

    }
}
