package com.ductm2008110309;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Handler;

import javax.swing.Action;

import main.java.com.ductm2008110309.Createccount;

public class BootTrap {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Createccount createccount = new Createccount(account);
        Createccount createccount2;
        NewaccountUi newaccountUi = new NewaccountUi(createccount);
        System.out.println("Welcome to the cinema Reservation System(CRS)!\n (To exit type exitsts)");
        while (true) {
            String displayOpition;
            String rep = scanner.nextLine();
            Thread.sleep(3000);
            displayOpition(createccount);
            // chon
            System.out.println(uiTerminal.getPromt(createccount));
            String rescmd;
            String cmd = handleCommand(rep);
            if (rescmd != null && !rescmd.equals("Unkown command")) {
                System.out.println(cmd);
                UITerminal.handlerInput();
            }
        }

    }

    private static String handleCommand(String rep) {
        return null;
    }

    public void displayOptions(Createccount createccount) {

        System.out.println("~~~~~~~~~~~~~MENU~~~~~~~~~~~");

        // check
        if (!createAccount.getAccount.checkLoggedIn()) {
            this.prompt = "Enter one of the commands in the brackets [] \n" +
                    "[CA] Create account\n" +
                    "[LI] Login";
        } else if (rep.toUpperCase().equals(Action.LI) || rep.toUpperCase().equals(Action.LO)) {
            this.prompt = "LOGGED IN AS # " + account.getUsername() +
                    "\n Enter on of the commands in brackets:\n" +
                    "[LO] Logout";
        }

    }

    public void getPrompt() {

    }
}
