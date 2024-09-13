package Kat;

import java.util.Scanner;

public class MusicLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isMusicPlaying = true;
        while (isMusicPlaying) {


            boolean isOnRepeat = true;

            while (isOnRepeat) {


                System.out.println("Repeat: type [yes] / Next: type [Next] ");
                String userInput = scan.next();

                if (userInput.equals("yes")) {

                    System.out.println("Playing the current song");

                } else {

                    isOnRepeat = false;
                }

            }

            System.out.println("Playing Next ");
            System.out.println("Enter [Stop] if you want to stop the music/ [ continue ] to keep it playing");
            String stopTheMusic = scan.next().toLowerCase();

            if (stopTheMusic.equals("stop")) {

                isMusicPlaying = false;
            } else {
                System.out.println("Keep it playing");
            }


        }

        System.out.println("Music player has stopped");


    }

}

