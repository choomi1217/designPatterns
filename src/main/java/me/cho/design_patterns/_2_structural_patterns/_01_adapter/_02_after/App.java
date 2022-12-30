package me.cho.design_patterns._2_structural_patterns._01_adapter._02_after;

import me.cho.design_patterns._2_structural_patterns._01_adapter._02_after.security.LoginHandler;

public class App {

    public static void main(String[] args) {

        AccountUserDetailService service = new AccountUserDetailService(new AccountService());
        LoginHandler loginHandler1 = new LoginHandler(service);
        String login1 = loginHandler1.login("oomi", "oomi");
        System.out.println(login1);

        AccountService accountService = new AccountService();
        LoginHandler loginHandler2 = new LoginHandler(accountService);
        String login2 = loginHandler2.login("ggamji", "ggamji");
        System.out.println(login2);

    }

}
