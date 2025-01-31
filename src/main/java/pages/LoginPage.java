package pages;

public class LoginPage {

    // Webdriver locator = driver.findElement(By.id("username"));

    public LoginPage enterEmail(String username){
        // locator.sendKeys(username);
        System.out.println("Entering username: " + username);
        return this;
    }

    public LoginPage enterPassword(String password){
        // locator.sendKeys(password);
        System.out.println("Entering password: " + password);
        return this;
    }

    public void clickLoginButton(){
        // locator.click();
        System.out.println("Clicking on login button");
    }

    public HomePage doLogin(String username, String password){
        enterEmail(username);
        enterPassword(password);
        clickLoginButton();
        return new HomePage();
    }
}
