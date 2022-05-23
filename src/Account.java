/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.ductm2008110309;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static StoredFiles accounts = new StoredFiles("accounts.json");

    private String username;
    private Integer password;
    private String email;
    private boolean loggedIn;

    /**
     * 
     */
    public Account() {
        this.username = null;
        this.password = null;
        this.email = null;
        this.loggedIn = false;
    }

    /**
     * @param username
     * @param password
     * @param email
     */

    public Account(String username, Integer password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loggedIn = false;
    }

    public void logIn() {

    }

    public void logOut() {

    }

    public boolean checkLoggedIn() {
        return this.loggedIn;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    public static StoredFiles getAccounts() {
        return accounts;
    }
}