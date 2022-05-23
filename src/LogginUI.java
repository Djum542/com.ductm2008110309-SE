package main.java.com.ductm2008110309;

public class LoginUI {
    private LogginAccount LogginAccount;
    private String command;

    public LoginUI(main.java.com.ductm2008110309.LogginAccount logginAccount, String command) {
        LogginAccount = logginAccount;
        this.command = null;
    }

    public static List<Object> accountValid(String username, String email) {
        List<Object> list = new ArrayList<>();

        int index = 0;
        index = accounts.search("un", username);
        if (index != -1) {
            list.add(false);
            list.add("[USERNAME EXISTS] An user with that username already exists.");
            return list;
        }
        // check email
        index = accounts.search("email", email);
        if (index != -1) {
            list.add(false);
            list.add("[EMAIL EXISTS] An email with that mail already exists.");
            return list;
        }

        if (index == -1) {
            list.add(true);
            list.add("[ACCOUNT CREATED] An account has been created.");
        }

        return list;
    }

    public void handleInputs() {

        if (this.command.equals("LI")) {
            Account account = LoginUI();

            this.LoginUI(account.getUsername(), account.getPassword());
        }

    }
    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if (this.command.equals(Actions.LO)) {
            return "Logging out ...";
        } else if (this.command.equals(Actions.LI)) {
            return "Enter a username, a password";
        } else {
            return "Unkown command.";
        }
    public Account getAccount() {
        return account;
    }
}
