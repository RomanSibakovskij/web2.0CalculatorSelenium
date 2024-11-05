package com.calculator.scientific.web;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CalculatorNumPadInput extends CalculatorPage{

    //calculator page web elements
    @FindBy(xpath = "//input[@id='input']")
    private WebElement numberInputField;
    @FindBy(xpath = "//div[@id='inputhelper']")
    private WebElement numberInputHelperButton;
    //calculator keyboard input web element
    //first button row
    @FindBy(xpath = "//div[@id='btns']//button[@id='Btn2nd']")
    private WebElement secondFunctionBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnPi']")
    private WebElement piBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnE']")
    private WebElement eBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnMatrix']")
    private WebElement matrixBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnVar']")
    private WebElement varBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnParanL']")
    private WebElement leftParenthesisBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnColon']")
    private WebElement colonBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnParanR']")
    private WebElement rightParenthesisBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnLeft']")
    private WebElement leftArrowBtn;
    @FindBy(xpath = "//div[@id='btns']//button[@id='BtnBack']")
    private WebElement backspaceBtn;
    //second button row
    @FindBy(xpath = "//button[@id='BtnSin']")
    private WebElement sinBtn;
    @FindBy(xpath = "//button[@id='BtnSinH']")
    private WebElement sinHBtn;
    @FindBy(xpath = "//button[@id='BtnCot']")
    private WebElement cotBtn;
    @FindBy(xpath = "//button[@id='BtnSqrtY']")
    private WebElement yRootXBtn;
    @FindBy(xpath = "//button[@id='BtnPowXY']")
    private WebElement powerXYBtn;
    //third button row
    @FindBy(xpath = "//button[@id='BtnCos']")
    private WebElement cosBtn;
    @FindBy(xpath = "//button[@id='BtnCosH']")
    private WebElement cosHBtn;
    @FindBy(xpath = "//button[@id='BtnSec']")
    private WebElement secBtn;
    @FindBy(xpath = "//button[@id='BtnSqrt3']")
    private WebElement cubeRootBtn;
    @FindBy(xpath = "//button[@id='BtnPow3']")
    private WebElement power3Btn;
    //fourth button row
    @FindBy(xpath = "//button[@id='BtnTan']")
    private WebElement tanBtn;
    @FindBy(xpath = "//button[@id='BtnTanH']")
    private WebElement tanHBtn;
    @FindBy(xpath = "//button[@id='BtnCsc']")
    private WebElement cscBtn;
    @FindBy(xpath = "//button[@id='BtnSqrt']")
    private WebElement sqrtBtn;
    @FindBy(xpath = "//button[@id='BtnPow2']")
    private WebElement power2Btn;
    //fifth button row
    @FindBy(xpath = "//button[@id='BtnNcR']")
    private WebElement nCrBtn;
    @FindBy(xpath = "//button[@id='BtnNpR']")
    private WebElement nPrBtn;
    @FindBy(xpath = "//button[@id='BtnPer']")
    private WebElement percentBtn;
    @FindBy(xpath = "//button[@id='BtnLog10']")
    private WebElement logBtn;
    @FindBy(xpath = "//button[@id='BtnPow10']")
    private WebElement power10Btn;
    //dropdown buttons
    @FindBy(xpath = "//button[@id='BtnOpD1']")
    private WebElement dropdown1Btn;
    //dropdown menu 2 (has the same dropdown menu buttons as first)
    @FindBy(xpath = "//button[@id='BtnOpD2']")
    private WebElement dropdown2Btn;
    //dropdown 1 menu buttons
    @FindBy(xpath = "//button[@id='ButtonLn']")
    private WebElement naturalLogBtn;
    @FindBy(xpath = "//button[@id='ButtonExp']")
    private WebElement expBtn;
    @FindBy(xpath = "//button[@id='ButtonLg2']")
    private WebElement logBase2Btn;
    @FindBy(xpath = "//button[@id='Button2X']")
    private WebElement twoToPowerOfInputBtn;
    //keypad buttons
    @FindBy(xpath = "//button[@id='Btn0']")
    private WebElement zeroBtn;
    @FindBy(xpath = "//button[@id='Btn1']")
    private WebElement oneBtn;
    @FindBy(xpath = "//button[@id='Btn2']")
    private WebElement twoBtn;
    @FindBy(xpath = "//button[@id='Btn3']")
    private WebElement threeBtn;
    @FindBy(xpath = "//button[@id='Btn4']")
    private WebElement fourBtn;
    @FindBy(xpath = "//button[@id='Btn5']")
    private WebElement fiveBtn;
    @FindBy(xpath = "//button[@id='Btn6']")
    private WebElement sixBtn;
    @FindBy(xpath = "//button[@id='Btn7']")
    private WebElement sevenBtn;
    @FindBy(xpath = "//button[@id='Btn8']")
    private WebElement eightBtn;
    @FindBy(xpath = "//button[@id='Btn9']")
    private WebElement nineBtn;
    @FindBy(xpath = "//button[@id='BtnSign']")
    private WebElement plusMinusBtn;
    @FindBy(xpath = "//button[@id='BtnDot']")
    private WebElement decimalBtn;
    @FindBy(xpath = "//button[@id='BtnPlus']")
    private WebElement addBtn;
    @FindBy(xpath = "//button[@id='BtnMinus']")
    private WebElement subtractBtn;
    @FindBy(xpath = "//button[@id='BtnMult']")
    private WebElement multiplyBtn;
    @FindBy(xpath = "//button[@id='BtnDiv']")
    private WebElement divideBtn;
    @FindBy(xpath = "//button[@id='BtnClear']")
    private WebElement clearBtn;
    @FindBy(css = "#BtnCalc")
    private WebElement equalsBtn;
    @FindBy(xpath = "//button[@id='BtnCalcEqual']")
    private WebElement equationEqualsBtn;
    //options buttons row
    @FindBy(xpath = "//div[@class='options']/label[@title='Degree']")
    private WebElement degreeBtn;
    @FindBy(xpath = "//div[@class='options']/label[@title='Radian']")
    private WebElement radianBtn;
    @FindBy(xpath = "//div[@class='options']/div[@id='hist']")
    private WebElement historyBtn;
    //history log web element
    @FindBy(xpath = "//div[@id='histframe']/ul/li/p[@class='r']")
    private WebElement calculationResultLog;
    //additional buttons web elements
    @FindBy(xpath = "//div[@class='options']/button[1]")
    private WebElement scrollDownBtn;
    @FindBy(xpath = "//div[@class='options']/button[2]")
    private WebElement scrollUpBtn;
    @FindBy(xpath = "//div[@class='options']/button[@id='addclipboard']")
    private WebElement addClipboardBtn;
    @FindBy(xpath = "//div[@class='options']/a")
    private WebElement drawGraphBtn;
    //browse questions button
    @FindBy(xpath = "//div[@class='row']//form/button[@type='submit']")
    private WebElement browseQuestionsBtn;
    //constants modal web elements
    @FindBy(xpath = "//input[@id='inputName']")
    private WebElement constantNameInputField;
    @FindBy(xpath = "//input[@id='inputValue']")
    private WebElement constantValueInputField;
    @FindBy(xpath = "//input[@class='form-control unit']")
    private WebElement constantFormControlUnitInputField;
    @FindBy(xpath = "//select[@id='constantslist']")
    private WebElement constantsList;
    @FindBy(xpath = "//select[@id='constantslist']/option[@value='96485.3365  [C mol^-1]']")
    private WebElement faradayConstant;
    @FindBy(xpath = "//button[@class='insert btn btn-primary pull-right']")
    private WebElement constantInsertButton;

    public CalculatorNumPadInput(WebDriver driver) {super(driver);}

    //numpad button click methods
    public void clickNumberZeroButton(){zeroBtn.click();}
    public void clickNumberOneButton(){oneBtn.click();}
    public void clickNumberTwoButton(){twoBtn.click();}
    public void clickNumberThreeButton(){threeBtn.click();}
    public void clickNumberFourButton(){fourBtn.click();}
    public void clickNumberFiveButton(){fiveBtn.click();}
    public void clickNumberSixButton(){sixBtn.click();}
    public void clickNumberSevenButton(){sevenBtn.click();}
    public void clickNumberEightButton(){eightBtn.click();}
    public void clickNumberNineButton(){nineBtn.click();}

    //decimal button click method
    public void clickDecimalButton(){decimalBtn.click();}

    //logical operator buttons click methods

    //click addition button method
    public void clickAdditionButton(){addBtn.click();}
    //click subtraction button method
    public void clickSubtractionButton(){subtractBtn.click();}
    //click multiplication button method
    public void clickMultiplicationButton(){multiplyBtn.click();}
    //click division button method
    public void clickDivisionButton(){divideBtn.click();}
    //click 'equal' button
    public void clickEqualButton(){equalsBtn.click();}

    //click 'Plus-minus' button method
    public void clickPlusMinusButton(){plusMinusBtn.click();}

    //click 'History'' dropdown button
    public void clickHistoryDropdownButton(){historyBtn.click();}

    //advanced arithmetic button click methods

    //click 'log to base 10 button method
    public void clickLog10Button(){logBtn.click();}
    //click 'raise ten to the power of number' button
    public void clickPower10Button(){power10Btn.click();}
    //click 'raise input number to the power of two' button
    public void clickRaiseNumberToPowerOfTwoButton(){power2Btn.click();}
    //click 'square root of input number' button method
    public void clickSqrtOfInputNumberButton(){sqrtBtn.click();}
    //click 'cube root of input number' button method
    public void clickCubicRootOfInputNumberButton(){cubeRootBtn.click();}
    //click 'raise input number to the power of three' button method
    public void clickRaiseNumberToPowerOfThreeButton(){power3Btn.click();}
    //click 'calculate y-th root of input number' button method
    public void clickYThRootOfInputNumberButton(){yRootXBtn.click();}
    //click 'raise input number to power of y' button method
    public void clickRaiseNumberToPowerOfYButton(){powerXYBtn.click();}
    //click 'sine of input number' button method
    public void clickSineOfInputNumberButton(){sinBtn.click();}
    //click 'hyperbolic sine (sihH) of input number' button method
    public void clickSineHOfInputNumberButton(){sinHBtn.click();}
    //click 'cosine of input number' button method
    public void clickCosineOfInputNumberButton(){cosBtn.click();}
    //click 'hyperbolic cosine(cosH) of input number' button method
    public void clickCosHOfInputNumberButton(){cosHBtn.click();}
    //click 'tangent of input number' button function
    public void clickTanOfInputNumberButton(){tanBtn.click();}
    //click 'hyperbolic tangent (tanH) of input number' button function
    public void clickTanHOfInputNumberButton(){tanHBtn.click();}
    //click 'cotangent of input number' button function
    public void clickCotOfInputNumberButton(){cotBtn.click();}
    //click 'secant of input number' button method
    public void clickSecOfInputNumberButton(){secBtn.click();}
    //click 'Co secant of input number' button method
    public void clickCo_secantOfInputNumberButton(){cscBtn.click();}
    //click 'combo from n choose r of input number' button method
    public void clickNcROfInputNumberButton(){nCrBtn.click();}
    //click permutations (nPr) button method
    public void clickNpROfInputNumberButton(){nPrBtn.click();}
    //click 'percentage equivalent of input number' button method
    public void clickPercentOfInputNumberButton(){percentBtn.click();}

    //supplementary functions
    //click 'var' button method
    public void clickXButton(){varBtn.click();}
    //click equation equal method
    public void clickEquationEqualButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(equationEqualsBtn));
        equationEqualsBtn.click();
    }
    //click 'Euler's number' button method
    public void clickEButton(){eBtn.click();}
    //click 'pi' button
    public void clickPiConstButton(){piBtn.click();}
    //click 'matrix' button
    public void clickGridMatrixButton(){matrixBtn.click();}

    //additional trigonometric functions
    //click 'Additional trigonometric functions menu' button method
    public void click2ndButton(){secondFunctionBtn.click();}

    //dropdown hover button buttons
    //click 'logarithm of input number to base e' button method
    public void clickLogOfInputNumberToBaseEButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(naturalLogBtn));
        naturalLogBtn.click();
    }
    //click 'exponential function of input number' button method
    public void clickExpFunctionButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(expBtn));
        expBtn.click();
    }
    //click 'logarithm of input number to base 2' button method
    public void clickLogOfInputNumberToBaseTwoButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(logBase2Btn));
        logBase2Btn.click();
    }
    //click '2 to power of input number' button method
    public void clickTwoToPowerOfInputNumberButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(twoToPowerOfInputBtn));
        twoToPowerOfInputBtn.click();
    }

    //hover above dropdown 1 button method
    public void hoverAboveDropdown1Button(){
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown1Btn).perform();
    }

    //constants list methods

    //input set constant into input field method
    public void inputFaradayConstantIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(constantNameInputField));
        constantNameInputField.sendKeys("Faraday constant");
    }

    //click 'Faraday constant' option method
    public void clickFaradayConstantOption(){faradayConstant.click();}

    //constant getters
    public String getConstantValue(){return constantValueInputField.getAttribute("value");}
    public String getConstantFormControlUnit(){return constantFormControlUnitInputField.getAttribute("value");}
    public String getFaradayConstantFromList(){return faradayConstant.getText();}

    //click 'Insert' constant button method
    public void clickInsertButton(){constantInsertButton.click();}
}
