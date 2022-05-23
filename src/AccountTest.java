package com.ductm2008110309;

import java.util.List;

public class AccountTest {
    public static void main(String[] args) {
        List<Object> list = Account.accountValid("mrdam", "damdan@gmail.com");
        Account.createAccount("mrdam", "damdd", "damdan@gmail.com");
        System.out.println(list.get(0) + "#######" + list.get(1));
        Account account = new Account();
        account.Login("mr ha", "haddp");
    }
}
