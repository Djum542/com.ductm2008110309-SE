/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.ductm2008110309;

import java.util.Scanner;

public class UITerminal {
    private static Scanner scanner = new Scanner(System.in);
    private Account account;
    private String prompt;// thong bao hop thoai
    private String command;

    /**
     * @param account
     */
    public UITerminal(Account account) {
        this.account = account;
    }

    

    /**
     * @return the prompt
     */
    public String getPrompt() {
        return prompt;
    }

   
    

   

}