package com.parkingsystem;

import java.io.*;

//This is the framwork of the whole application, through this file, all Consels has been called.

public class Main {

    public static void main(String[] args) throws IOException {

        //The welcome messages from the application.
        System.out.println("== Welcome to the Parking Lot System ==");
        System.out.println("Press 1 -> Admin");
        System.out.println("Press 2 -> Operator");
        System.out.println("Press 3 -> Customer ");
        System.out.println("Press 0 -> Quite ");
        System.out.println("Please Choose The Console");

        char i = (char) System.in.read();

        while(i != '0'){

            //Satrt different User Type
            if(i == '1'){
                // Admin User
                Admin admin = new Admin();
                admin.showMessages();
            }
            if(i == '2'){
                //The Operator User
                OperatorCons operatorcons = new OperatorCons();
                operatorcons.showMessages();
            }
            if(i == '3'){
                System.out.println("Console Not Available.");
            }
        }


    }
}


