package OOP;

import java.util.Scanner;

public class BankAccountBalance {

    double initialAmount;
    double depositAmount;
    double withdrawalAmount;

    Scanner scan = new Scanner(System.in);

//    BankAccountBalance(double initialAmount, double depositAmount, double withdrawalAmount) {
//        this.initialAmount = initialAmount;
//        this.depositAmount = depositAmount;
//        this.withdrawalAmount = withdrawalAmount;
//
//    }


    BankAccountBalance() {
        System.out.println("Your Initial Amount?");
        this.initialAmount = scan.nextDouble();


    }


    public void deposit() {



            System.out.println("Deposit Amount?");

            double newAmount = this.initialAmount + scan.nextDouble();

            this.initialAmount = newAmount;
            System.out.println("New Amount is " + newAmount);


    }

    public void withdrawal() {

        System.out.println("Withdrawal Amount?");


        double newAmount = this.initialAmount - scan.nextDouble();
        this.initialAmount = newAmount;
        System.out.println("New Amount is " + newAmount);
    }

    public void checkBalance() {

        System.out.println("Your Final Balance is" + this.initialAmount);


    }

    //HappyLearning


}
