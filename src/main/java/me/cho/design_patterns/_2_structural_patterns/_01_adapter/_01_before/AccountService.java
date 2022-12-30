package me.cho.design_patterns._2_structural_patterns._01_adapter._01_before;

public class AccountService {

    public Account findAccountByUsername(String username){
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account){

    }

    public void updateAccount(Account account){

    }


}
