package org.example;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

    LoginPage loginPage = new LoginPage();
    //HomePage homepage = new HomePage();

    @Test
    public void loginTest(){

        // First Approach

        loginPage.enterEmail("heena.vasadani@intimetec.com");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();
        System.out.println("login test");

        // Second Approach - Using Object chaining/ Fluent pattern
        loginPage.enterEmail("heena").enterPassword("password").clickLoginButton();

        // Third Approcah -- write single method
        HomePage homepage = loginPage.doLogin("heena", "password");


    }
}
