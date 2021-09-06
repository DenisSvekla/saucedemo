package tests;

import org.testng.annotations.Test;

public class ProductsTest extends basic {

    @Test
    public void productShouldBeAddedIntoCart() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        ProductPage.addToCard("Test.AllTheThings() T-Shirt (RED)");
        cartPage.open();
        //TODO VALIDATE NAME NAD PRICE

    }
}
