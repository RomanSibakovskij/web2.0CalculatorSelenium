package com.calculator.scientific.web;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.math.*;

public class CalculatorPage extends BasePage{

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
    private WebElement tanhHBtn;
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
    //popup consent button
    @FindBy(xpath = "//button[@aria-label='Consent']")
    private WebElement consentButton;

    public CalculatorPage(WebDriver driver) {super(driver);}

    //y-th root of input number function
    public double calculateRoot(double number, double root) {return Math.pow(number, 1.0 / root);}
    //logarithm of input number to base e function
    public double logToBaseE(double inputNumber) {return Math.log(inputNumber);}
    //exponential function of input number function
    public double exponentialOf(double inputNumber) {return Math.exp(inputNumber);}
    //logarithm of input number to base 2 function
    public double logBase2(double inputNumber) {return Math.log(inputNumber) / Math.log(2);}

    //trigonometric functions method

    //calculate sine of input number function
    public double calculateSineOfInputNumber(double inputNumber){
        double radians = Math.toRadians(inputNumber); //degrees conversion to radians
        return Math.sin(radians);
    }
    //calculate hyperbolic sine of input number function
    public double calculateSinhOfInputNumber(double inputNumber) {
        double radians = Math.toRadians(inputNumber);
        return Math.sinh(radians);
    }
    //calculate cosine of input number function
    public double calculateCosineOfInputNumber(double inputNumber){
        double radians = Math.toRadians(inputNumber); //degrees conversion to radians
        return Math.cos(radians);
    }
    //calculate hyperbolic cosine of input number function
    public double calculateCosHOfInputNumber(double inputNumber) {
        double radians = Math.toRadians(inputNumber);
        return Math.cosh(radians);
    }
    //calculate tangent of input number function
    public double calculateTangentOfInputNumber(double inputNumber){
        double radians = Math.toRadians(inputNumber); //degrees conversion to radians
        return Math.tan(radians);
    }
    //calculate hyperbolic tangent of input number function
    public double calculateTanHOfInputNumber(double inputNumber) {
        double radians = Math.toRadians(inputNumber);
        return Math.tanh(radians);
    }
    //calculate cotangent of input number function
    public double calculateCotangentOfInputNumber(double inputNumber){
        double radians = Math.toRadians(inputNumber); //degrees conversion to radians
        return 1.0 / Math.tan(radians); //for cotangent output
    }
    //calculate secant of input number function
    public double calculateSecantOfInputNumber(double inputNumber){
        double radians = Math.toRadians(inputNumber); //degrees conversion to radians
        return 1.0 / Math.cos(radians); //for cosine output
    }
    //calculate co secant of input number function
    public double calculateCo_secantOfInputNumber(double inputNumber){
        double radians = Math.toRadians(inputNumber); //degrees conversion to radians
        return 1.0 / Math.sin(radians); //for co secant output
    }

    // Calculate combinations (nCr) function
    public BigInteger calculateCombination(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("n and r must be non-negative.");
        }
        if (r > n) {
            throw new IllegalArgumentException("r cannot be greater than n.");
        }
        return factorial(BigInteger.valueOf(n))
                .divide(factorial(BigInteger.valueOf(r)).multiply(factorial(BigInteger.valueOf(n - r))));
    }

    // BigInteger (factorial) function
    private BigInteger factorial(BigInteger num) {
        if (num.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }

    // Calculate permutations (nPr) function
    public BigInteger calculatePermutations(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("n and r must be non-negative.");
        }
        if (r > n) {
            throw new IllegalArgumentException("r must be less than or equal to n.");
        }
        return factorial(BigInteger.valueOf(n)).divide(factorial(BigInteger.valueOf(n - r)));
    }

    //percentage calculation function
    public int calculatePercentageInput(int input) {return input;}

    //additional trigonometric functions (after '2nd' button click)
    //calculate arc hyperbolic sine of input number function
    public double calculateArcSinhOfInputNumber(double inputNumber) {return Math.log(inputNumber + Math.sqrt(inputNumber * inputNumber + 1));} //since java.math here doesn't have Math.asinh();
    //calculate arc hyperbolic cosine of input number function
    public double calculateArcCosHOfInputNumber(double inputNumber) {return Math.log(inputNumber + Math.sqrt(inputNumber * inputNumber - 1));}
    //calculate arc hyperbolic tangent of input number function
    public double calculateAtanHOfInputNumber(double inputNumber) {return Math.log((1 + inputNumber) / (1 - inputNumber)) / 2;}
    //calculate arc cotangent of input number function
    public double calculateACotOfInputNumber(double inputNumber) {
        if (inputNumber == 0) {
            throw new ArithmeticException("aCot undefined for x = 0");
        }
        if (inputNumber < 0) {
            return Math.atan(1 / inputNumber);
        } else {
            return Math.PI / 2 - Math.atan(inputNumber);
        }
    }

    //calculate arc secant of input number function
    public double calculateArcSecOfInputNumber(double inputNumber) {
        if (Math.abs(inputNumber) < 1) {throw new IllegalArgumentException("Input must be >= 1 or <= -1 for asec calculation.");}
        return Math.acos(1 / inputNumber);
    }

    //calculate arc co secant of input number function
    public double calculateArcCscOfInputNumber(double inputNumber) {
        if (inputNumber <= -1 || inputNumber >= 1) {
            return Math.asin(1 / inputNumber); //returns the result in radians
        } else {
            throw new IllegalArgumentException("Input must be <= -1 or >= 1 for arccsc calculation.");
        }
    }


    //consent button click method
    public void clickConsentButton(){consentButton.click();}

    //result getter method
    public String getCalculationResult(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1400));
        wait.until(ExpectedConditions.visibilityOf(calculationResultLog));
        return calculationResultLog.getText().replaceAll("[^0-9.-]", "");
    }
    //result getter method (for invalid calculation operations)
    public String getInvalidCalculationResult() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1400));
        wait.until(ExpectedConditions.visibilityOf(calculationResultLog));
        return calculationResultLog.getText();
    }

    //calculator page web element assert methods
    public boolean isNumberInputFieldDisplayed(){return numberInputField.isDisplayed();}
    public boolean isNumberInputHelperButtonDisplayed(){return numberInputHelperButton.isDisplayed();}
    public boolean isButton2ndDisplayed(){return secondFunctionBtn.isDisplayed();}
    public boolean isPiButtonDisplayed(){return piBtn.isDisplayed();}
    public boolean isEButtonDisplayed(){return eBtn.isDisplayed();}
    public boolean isMatrixButtonDisplayed(){return matrixBtn.isDisplayed();}
    public boolean isVarButtonDisplayed(){return varBtn.isDisplayed();}
    public boolean isLeftParenthesisButtonDisplayed(){return leftParenthesisBtn.isDisplayed();}
    public boolean isColonButtonDisplayed(){return colonBtn.isDisplayed();}
    public boolean isRightParenthesisButtonDisplayed(){return rightParenthesisBtn.isDisplayed();}
    public boolean isLeftArrowButtonDisplayed(){return leftArrowBtn.isDisplayed();}
    public boolean isBackspaceButtonDisplayed(){return backspaceBtn.isDisplayed();}
    public boolean isSinButtonDisplayed(){return sinBtn.isDisplayed();}
    public boolean isSinHButtonDisplayed(){return sinHBtn.isDisplayed();}
    public boolean isCotButtonDisplayed(){return cotBtn.isDisplayed();}
    public boolean isYRootXButtonDisplayed(){return yRootXBtn.isDisplayed();}
    public boolean isPowerXYButtonDisplayed(){return powerXYBtn.isDisplayed();}
    public boolean isCosButtonDisplayed(){return cosBtn.isDisplayed();}
    public boolean isCosHButtonDisplayed(){return cosHBtn.isDisplayed();}
    public boolean isSecButtonDisplayed(){return secBtn.isDisplayed();}
    public boolean isCubeRootButtonDisplayed(){return cubeRootBtn.isDisplayed();}
    public boolean isPower3ButtonDisplayed(){return power3Btn.isDisplayed();}
    public boolean isTanButtonDisplayed(){return tanBtn.isDisplayed();}
    public boolean isTanHButtonDisplayed(){return tanhHBtn.isDisplayed();}
    public boolean isCscButtonDisplayed(){return cscBtn.isDisplayed();}
    public boolean isSqrtButtonDisplayed(){return sqrtBtn.isDisplayed();}
    public boolean isPower2ButtonDisplayed(){return power2Btn.isDisplayed();}
    public boolean isNcRButtonDisplayed(){return nCrBtn.isDisplayed();}
    public boolean isNpRButtonDisplayed(){return nPrBtn.isDisplayed();}
    public boolean isModulusButtonDisplayed(){return percentBtn.isDisplayed();}
    public boolean isLogButtonDisplayed(){return logBtn.isDisplayed();}
    public boolean isPower10ButtonDisplayed(){return power10Btn.isDisplayed();}
    public boolean isDropdown1ButtonDisplayed(){return dropdown1Btn.isDisplayed();}
    public boolean isDropdown2ButtonDisplayed(){return dropdown2Btn.isDisplayed();}
    public boolean isNumZeroButtonDisplayed(){return zeroBtn.isDisplayed();}
    public boolean isNumOneButtonDisplayed(){return oneBtn.isDisplayed();}
    public boolean isNumTwoButtonDisplayed(){return twoBtn.isDisplayed();}
    public boolean isNumThreeButtonDisplayed(){return threeBtn.isDisplayed();}
    public boolean isNumFourButtonDisplayed(){return fourBtn.isDisplayed();}
    public boolean isNumFiveButtonDisplayed(){return fiveBtn.isDisplayed();}
    public boolean isNumSixButtonDisplayed(){return sixBtn.isDisplayed();}
    public boolean isNumSevenButtonDisplayed(){return sevenBtn.isDisplayed();}
    public boolean isNumEightButtonDisplayed(){return eightBtn.isDisplayed();}
    public boolean isNumNineButtonDisplayed(){return nineBtn.isDisplayed();}
    public boolean isNumPlusMinusButtonDisplayed(){return plusMinusBtn.isDisplayed();}
    public boolean isNumDecimalButtonDisplayed(){return decimalBtn.isDisplayed();}
    public boolean isAddButtonDisplayed(){return addBtn.isDisplayed();}
    public boolean isSubtractButtonDisplayed(){return subtractBtn.isDisplayed();}
    public boolean isMultiplyButtonDisplayed(){return multiplyBtn.isDisplayed();}
    public boolean isDivideButtonDisplayed(){return divideBtn.isDisplayed();}
    public boolean isClearButtonDisplayed(){return clearBtn.isDisplayed();}
    public boolean isEqualsButtonDisplayed(){return equalsBtn.isDisplayed();}
    public boolean isDegreeLabelButtonDisplayed(){return degreeBtn.isDisplayed();}
    public boolean isRadianLabelButtonDisplayed(){return radianBtn.isDisplayed();}
    public boolean isHistoryButtonDisplayed(){return historyBtn.isDisplayed();}
    public boolean isScrollDownButtonDisplayed(){return scrollDownBtn.isDisplayed();}
    public boolean isScrollUpButtonDisplayed(){return scrollUpBtn.isDisplayed();}
    public boolean isAddToClipboardButtonDisplayed(){return addClipboardBtn.isDisplayed();}
    public boolean isDrawGraphButtonDisplayed(){return drawGraphBtn.isDisplayed();}
    public boolean isBrowseQuestionsButtonDisplayed(){return browseQuestionsBtn.isDisplayed();}
}
