package Kat;

import java.util.Scanner;

public class AnnounceDeveloperTeatime {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        announceDeveloperTeaTime();


    }

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer teatime...");
        System.out.println("Are we going to Announce it!?/ Enter [yes]/[no]");
        String announce =scan.next().toLowerCase();
        if(announce.equals("yes")){

            System.out.println("TeaTime is Here for everyone!");

        }

        else{

            System.out.println("Waiting .. waiting .....");
        }

    }
}
