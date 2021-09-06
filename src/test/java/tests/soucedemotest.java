package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class soucedemotest extends basic {

    @Test
    public void locatorid() {
        boolean username = driver.findElement(By.id("user-name")).isDisplayed();
        Assert.assertTrue(username, "отображается");

    }

    @Test
    public void locatorname() {
        boolean password = driver.findElement(By.name("login-button")).isDisplayed();
        Assert.assertTrue(password, "отображается");
    }

    //CSSselector
    //.class
    @Test
    public void cssclass() {
        boolean cssclass = driver.findElement(By.cssSelector(".form_group")).isDisplayed();
        Assert.assertTrue(cssclass, "отображается");

    }

    //ID
    @Test
    public void id() {
        boolean id = driver.findElement(By.cssSelector("[id='user-name']")).isDisplayed();
        Assert.assertTrue(id, "отображается");
    }

    //tagname
    @Test
    public void tagname() {
        boolean tagname = driver.findElement(By.cssSelector("input")).isDisplayed();
        Assert.assertTrue(tagname, "отображается");
    }

    @Test
    public void tagnameclass() {
        boolean tagnameclass = driver.findElement(By.cssSelector("input.input_error")).isDisplayed();
        Assert.assertTrue(tagnameclass, "отображается");
    }

    @Test
    //("//div")
    public void xpathdiv() {
        boolean xpathdiv = driver.findElement(By.xpath("//div/form/div/input")).isDisplayed();
        Assert.assertTrue(xpathdiv, "отображается");
    }

    @Test
    //("*/div")
    public void xpathdivbefore() {
        boolean xpathdivbefore = driver.findElement(By.xpath("//*/div/input")).isDisplayed();
        Assert.assertTrue(xpathdivbefore, "отображается");
    }

    @Test
    //("@attribute=value")
    public void xpathdattribute() {
        boolean xpathdatribute = driver.findElement(By.xpath("//link[@rel='manifest']")).isDisplayed();
        Assert.assertFalse(xpathdatribute, "отображается");
    }

    @Test
    //("@attribute=value")
    public void xpathdattribute1() {
        boolean xpathdatribute1 = driver.findElement(By.xpath("//div[@class='bot_column']")).isDisplayed();
        Assert.assertTrue(xpathdatribute1, "отображается");
    }

    @Test
    //("/tag[text()='текст']")
    public void xpathdtext() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        boolean xpathtext = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
        Assert.assertTrue(xpathtext, "отображается");

    }

    @Test
    //("/tag[contains(text()='текст')]")
    public void xpathdcontainstext() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        boolean xpathcontainstext1 = driver.findElement(By.xpath("//div[contains(text(),'Backpack')]")).isDisplayed();
        Assert.assertTrue(xpathcontainstext1, "отображается");

    }
}
