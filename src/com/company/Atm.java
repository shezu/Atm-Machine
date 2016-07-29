package com.company; /**
 * Created by Shez on 7/24/2016.
 */
import java.util.Scanner;
public class Atm {
    int totalCash = 50000;
    int withDrawn;
    int remainingCash;
    int pincode = 1234;
    int check = 0;
    public void getPassword(){
        System.out.println("Enter your Pin Code");
        int pinCode2;
        Scanner Scan = new Scanner(System.in);
        pinCode2 =  Scan.nextInt();
        check++;
        if (pinCode2 == pincode){
            ShowOptions();
        }
        else if (check > 3){
            System.out.println("You dont know the correct pincode, program will exit now");
        }
        else{
            System.out.println("Your Pin code is incorrect");
            getPassword();
        }
    }

    public void ShowOptions(){
        System.out.println(" Press 1 for Deposit \n Press 2 for WithDraw \n Press 3 for Display \n Press 4 to exit ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){

            case 1:
                Deposit();
                showMainMenu();
                break;
            case 2:
                withDraw();
                showMainMenu();
                break;
            case 3:
                Display();
                showMainMenu();
                break;
            case 4:
                System.out.println("Thank You for using our services");
                break;
        }


    }

    public void Deposit(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter amount u want to deposit");
        int cashAmount = scn.nextInt();
        totalCash += cashAmount;
        System.out.println("your total cash after deposit is "+totalCash);
    }
    public void withDraw(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter amount u want to withDraw");
        int cashAmount = scn.nextInt();

        totalCash -= cashAmount;
        System.out.println("your total cash after withDraw is "+totalCash);
    }
    public void Display(){
        System.out.println("Your total Cash is : "+totalCash);
    }
    public void showMainMenu(){
        Scanner scn = new Scanner(System.in);
        System.out.println("press m to return to main menu or any other key to exit");
        String str = scn.next();
        if (str.toLowerCase().equals("m")){
            ShowOptions();
        }
        else{
            System.out.println("Thank You for using our services");
        }
    }
}
