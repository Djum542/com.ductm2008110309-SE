package main.java.com.ductm2008110309;

import java.util.Scanner;

import com.ductm2008110309.Account;

public class CreateccountUI {
    private Account account;

public CreateAccountUI(){
        this.account = account;
    }

    public static Account createAccountInputs() {
        System.out.println("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        Integer password = scanner.nextInt();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();
        return new Account(username, password, email);
    }

    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = cmd;

        if (this.command.equals("CA")) {
            return "Enter an username, a password, a email";
        } else {
            return "unknown command.";
        }

    }


    public void handlerInput() {

        if (this.command.equals("CA")) {
            Account account = createAccountInputs();

            this.createAccount(account.getUsername(), account.getPassword(), account.getEmail());
        }

    }

}
