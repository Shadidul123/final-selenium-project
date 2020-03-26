package page_objects;

import org.openqa.selenium.By;
import test_scripts.DriverWrapper;

public class LandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    //private By firstName = By.xpath("//input[@name='firstname']"); //i edited this line
    private By lastName = By.xpath("//input[@name='lastname']");
    private By phoneNumber = By.xpath("//input[@name = 'reg_email__']");
    private By newPass = By.xpath("//input[@autocomplete='new-password']");
    private By signUpButton = By.xpath("//button[@id='u_0_13']");
    private By messengerButton = By.xpath("//a[@href='https://messenger.com/']");
    private By signInButton = By.xpath("//button[@value='1']");
    private By enterMobileOrEmail = By.xpath("//input[@id='u_0_r']");
    private By selectGender = By.xpath("//input[@type='radio']");
    private By searchBar = By.xpath("//label[@for='twotabsearchtextbox']");
    private By email = By.id("email");
    private By pass = By.id("pass");
    By firstName = By.name("firstname");
    By passWordResetLink =  By.linkText("Forgot account?");
    By passPartialReset = By.partialLinkText("Forgot");
    By tryPrime = By.linkText("Try Prime");
    By FreeDelivery = By.partialLinkText("Fast, FREE");
    By ShopBargain = By.partialLinkText("Bargain Finds");
    By newSign = By.xpath("//button[text()='Sign Up']");  //xpath using
    private By fandangoEmail = By.id("UsernameBox");
    private By fandangoPass = By.id("PasswordBox");
    private By fandangoSigninButton = By.xpath("//a[@id='ctl00_GlobalBody_SignOnControl_SignInButton']");
    private By nikeSignUp = By.xpath("//div[@id='AccountNavigationContainer']//span[text()='Join/Log In To Nike Member Profile']");
    private By nikeEmail = By.xpath("//input[@type='email']");  ////input[@type='email']
    private By neimanEmail = By.xpath("//input[@id='login_email']");
    private By neimanPass = By.xpath("//input[@type='password']");
    private By neimanSignInButton = By.xpath("//input[@id='signInBtn']");
    private By nemLogoutButton = By.xpath("//button[contains(text(),'Your Account')]");
    private By loginSuccess = By.xpath("//div[@id='globalSignin']//span[contains(@class,'myGlobalSignedIn')][contains(text(),'Hello')]");
    private By bloomEmail = By.xpath("//input[@id='email']");
    private By bloomPass = By.xpath("//input[@id='pw-input']");
    private By bloomSignIn = By.xpath("//button[@id='sign-in']");
    private By bloomSecurityAlert = By.xpath("//p[contains(text(),'technical issues. Please contact')]");
    private By spoofEmail = By.xpath("//input[@id='username']");
    private By spoofPass = By.xpath("//input[@id='password']");
    private By spoofLog = By.xpath("//input[@id='login']");
    private By makeCallButton = By.xpath("//img[@id='navMakeCall']");
    private By fromNum = By.xpath("//input[@name='fromNumber']");
    private By toNum = By.xpath("//input[@name='toNumber']");
    private By spoofNum = By.xpath("//input[@name='toCallerIDNumber']");
    private By placeCallButton = By.xpath("//button[text()='Place Call']");
    private By secondPlaceCallButton = By.xpath("//button[text()='Place Call']");


    //spoofmethods
    public void cursorFromNum(){
        clickOn(fromNum);
    }
    public void cursorSpoofNum(){
        clickOn(spoofNum);
    }
    public void cursortoNum(){
        clickOn(toNum);
    }

   public void finalCall(){
       clickOn(secondPlaceCallButton);
   }
    public void placeCall(){
        clickOn(placeCallButton);
    }
    public void enterFromNum(String value){
        setValue(fromNum,value);

    }

    public void enterSpoofNum(String value){
        setValue(spoofNum,value);
    }

    public void enterToNum(String value){
        setValue(toNum,value);
    }
    public void clickCall(){
        clickOn(makeCallButton);
    }
    public void enterSpoofEmail(String value){
        setValue(spoofEmail,value);
    }
    public void enterSpoofPass(String value){
        setValue(spoofPass, value);
    }
    public void clickSpoofLogIn(){
        clickOn(spoofLog);
    }

    //bloom functions

    public void enterBloomEmail(String value){
        setValue(bloomEmail, value);
    }

    public void enterBloomPass(String value){
        setValue(bloomPass,value);
    }

    public void clickBloom(){
        clickOn(bloomSignIn);
    }

    public boolean isBloomSecurity(){
        return isElementDisplayed(bloomSecurityAlert);
    }
    public boolean logOutNeiman(){
         return isElementDisplayed(loginSuccess);
    }


    private By fbSignUpButton = By.xpath("//h2[text()='Sign Up']");

    //method

    public boolean isFbButtonDisplayed(){
        return  isElementDisplayed(fbSignUpButton);
    }


    //nike methods

    public void clickNikeSignUp(){
        clickOn(nikeSignUp);
    }
    public void enterNikeEmail(String value){
        setValue(nikeEmail,value);
    }



    //fandango stuff
    public void enterNeimanEmail(String Value){
        setValue(neimanEmail, Value);
    }
    public void enterNeimanPass(String Value){
        setValue(neimanPass, Value);
    }

    public void clickSigninNeiman(){
        clickOn(neimanSignInButton);
    }

    //nike methods










    //Methods
    public void enterEmail(String value){
        setValue(emailTextField, value);
    }

    public void enterPassword(String value) {
        setValue(passTextField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void clickSignUpButton(){
        clickOn(signUpButton);
    }


    // i am adding these method below

    public void enterName(String value) {
        setValue(firstName,value);

    }

    public void enterLName(String value){
        setValue(lastName, value);
    }

    public void enterNumber(String value){
        setValue(phoneNumber, value);
    }

    public void enterNewPass(String value){
        setValue(newPass, value);
    }

    public void EnterNumber(String value){
        setValue(phoneNumber, value);
    }

    public void clickMessenger(){
        clickOn(messengerButton);

    }

    public void clickSignINbutton(){
        clickOn(signInButton);
    }

    public void enterMobileorEmailButton(String value){
        setValue(enterMobileOrEmail, value);

    }
    public void clickGender(){
        clickOn(selectGender);
    }
    public void enterSearchAmazon(String value){
        setValue(searchBar, value);
    }

    public void enterEmailById(String value){
        setValue(email,value);

    }
    public void enterPass(String Value){
        setValue(pass,Value);
    }
    public void enterFirstName(String Value){
        setValue(firstName, Value);
    }
    public void assReset(){
        clickOn(passPartialReset);
    }
    public void clickPrime(){
        clickOn(tryPrime);
    }
    public void FreeDelivery(){
        clickOn(FreeDelivery);
    }
    public void shopBargain(){
        clickOn(ShopBargain);
    }
    public void newShit(){
        clickOn(newSign);
    }

    public void clearField(){
        DriverWrapper.getDriver().findElement(lastName).clear();
        DriverWrapper.getDriver().findElement(firstName).clear();
        DriverWrapper.getDriver().findElement(phoneNumber).clear();
        DriverWrapper.getDriver().findElement(enterMobileOrEmail).clear();
        DriverWrapper.getDriver().findElement(newPass).clear();

    }


    public boolean isLoginButtonDisplayed(){
        return isElementDisplayed(loginButton);
    }
}
