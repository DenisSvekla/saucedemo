package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class logintest extends basic {

    @Test
    public void login() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void userNameShouldBeRequired() {
        loginPage.open();
        loginPage.login("", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username is required", "сообщение об ошибке некорректно");
    }

    @Test
    public void passwordShouldBeRequired() {
        loginPage.open();
        loginPage.login(USER, "");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Password is required", "сообщение об ошибке некорректно");
    }

    @Test
    public void passwordAndUserNameShouldBeRequireds() {
        loginPage.open();
        loginPage.login("", "");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username is required", "сообщение об ошибке некорректно");
    }

    @Test
    public void passwordIsNotCorrect() {
        loginPage.open();
        loginPage.login(USER, "123");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service", "сообщение об ошибке некорректно");
    }
}
