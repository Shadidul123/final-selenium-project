package page_objects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    //this page is to capture error messages.

    //Locators
    private By loginError = By.xpath("/a[contains(text(),'Recover Your Account')]");
    private By signUpError = By.xpath("//div[@role='alert']"); //i added this
    private By genderError = By.xpath("//div[@class='_5633 _5634 _53ij']");
    private By passwordError = By.xpath("//div[@class='_4rbf _53ij']");
    private By messengerError = By.xpath("//div[text()='Incorrect email or phone number']");
    private By emailError = By.xpath("//div[contains(text(),'Please enter a valid')]");

    //Methods
    public String getErrorMessage() {
        return getValueFromElement(loginError);
    }
    public String getSignError() {
        return getValueFromElement(signUpError);
    }
    public String getGenderError(){
        return getValueFromElement(genderError);
    }
    public String getPassError(){
        return getValueFromElement(passwordError);
    }
    public String getMessengerError(){
        return getValueFromElement(messengerError);
    }

    public String getEmailError(){
        return getValueFromElement(emailError);
    }

}
