package main.java.com.ductm2008110309;

public class CreateAccountUI {
    private Createccount createccount;
    private Action command;

    public Createccount(Createccount createccount, Action command) {
        this.createccount = createccount;
        this.command = null;
    }

    public static void createAccount(String username, Integer password, String email) {

        // username/email check;
        // ...
        List<Object> list = accountValid(username, email);
        if (!(boolean) list.get(0)) {// false
            System.out.println(list.get(1));
        } else {
            // theem c
            // sdl => StoredFiles
            // un: mssen
            // ps: 123
            // mail:mssen@gmail.com
            Accounts.getAccounts.update(username, password, email);
            accounts.write();
        }

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

    public Account getAccount() {
        return account;
    }
}
