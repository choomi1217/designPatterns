package me.cho.design_patterns._2_structural_patterns._01_adapter._02_after;

import me.cho.design_patterns._2_structural_patterns._01_adapter._02_after.security.UserDetails;
import me.cho.design_patterns._2_structural_patterns._01_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }

}
