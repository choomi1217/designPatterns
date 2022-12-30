package me.cho.design_patterns._2_structural_patterns._01_adapter._02_after;

import me.cho.design_patterns._2_structural_patterns._01_adapter._02_after.security.UserDetails;
import me.cho.design_patterns._2_structural_patterns._01_adapter._02_after.security.UserDetailsService;

public class AccountService implements UserDetailsService {

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


    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
