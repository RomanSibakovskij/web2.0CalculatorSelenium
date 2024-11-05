package com.calculator.scientific.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CalculatorRandomNumberInputPage extends CalculatorPage{

    //calculator page web elements
    @FindBy(xpath = "//input[@id='input']")
    private WebElement numberInputField;

    //valid input data
    private int numberOne;
    private int numberTwo;

    //valid input data (for atanh /asin/ acos functions)
    private double funcNumberOne;

    //negative numbers
    private int negativeNumberOne;
    private int negativeNumberTwo;

    public CalculatorRandomNumberInputPage(WebDriver driver) {
        super(driver);
    }

    //input data getter
    public void inputDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomNumber1();
        numberTwo = testDataGenerator.generateRandomNumber2();

        System.out.println("Data generated for calculation: " + "\n");
        logger.info("Number one: " + numberOne);
        logger.info("Number two: " + numberTwo);
        System.out.println("\n");
    }

    //input data getter (for division)
    public void inputDivisionDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomDivisionNumber1();
        numberTwo = testDataGenerator.generateRandomDivisionNumber2();

        if (numberOne < numberTwo) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }

        System.out.println("Data generated for division: " + "\n");
        logger.info("Number one (for division): " + numberOne);
        logger.info("Number two (for division): " + numberTwo);
        System.out.println("\n");
    }

    //input data getter (negative numbers)
    public void inputNegativeNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNumberOne = testDataGenerator.generateRandomNegativeNumber1();
        negativeNumberTwo = testDataGenerator.generateRandomNegativeNumber2();

        System.out.println("Data generated for calculation: " + "\n");
        logger.info("Negative number one: " + negativeNumberOne);
        logger.info("Negative number two: " + negativeNumberTwo);
        System.out.println("\n");
    }
    //input data getter (for negative number division)
    public void inputNegativeNumDivisionDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomDivisionNumber1();
        negativeNumberTwo = testDataGenerator.generateRandomDivisionNegativeNumber2();

        System.out.println("Data generated for division: " + "\n");
        logger.info("Number one (for negative division): " + numberOne);
        logger.info("Negative number two (for negative division): " + negativeNumberTwo);
        System.out.println("\n");
    }

    //input data getter (for single-number function)
    public void inputSingleNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomNumber1();

        System.out.println("Data generated for single number calculation: " + "\n");
        logger.info("Number generated for single number function: " + numberOne);
        System.out.println("\n");
    }

    //input data getter (for 'single-negative-number' calculations)
    public void inputSingleNegativeNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNumberOne = testDataGenerator.generateRandomNegativeNumber1();

        System.out.println("Data generated for single negative number calculation: " + "\n");
        logger.info("Negative number generated for single number function: " + negativeNumberOne);
        System.out.println("\n");
    }

    //input data getter (for 'rise-to-power-of' function)
    public void inputPowerNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomPowerNumber();

        System.out.println("Data generated for rise to the power of: " + "\n");
        logger.info("Raise to the power of: " + numberOne);
        System.out.println("\n");
    }

    //input data getter (for negative 'rise-to-power-of' function)
    public void inputNegativePowerNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNumberOne = Integer.parseInt("-" + testDataGenerator.generateRandomPowerNumber());

        System.out.println("Data generated for negative rise to the power of: " + "\n");
        logger.info("Raise to the negative power of: " + negativeNumberOne);
        System.out.println("\n");
    }

    //input data getter (small single number)
    public void inputSmallSingleNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomPowerNumber();

        System.out.println("Data number generated: " + "\n");
        logger.info("Single number: " + numberOne);
        System.out.println("\n");
    }

    //input data getter (small single negative number)
    public void inputSmallSingleNegativeNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNumberOne = Integer.parseInt("-" + testDataGenerator.generateRandomPowerNumber());

        System.out.println("Data (negative) number generated: " + "\n");
        logger.info("Single negative number: " + negativeNumberOne);
        System.out.println("\n");
    }

    //input data getter (for nCr calculation)
    public void inputNcRDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomNcRNumber1();
        numberTwo = testDataGenerator.generateRandomNcRNumber2();

        //assert number one is always greater than number two
        if (numberTwo > numberOne) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }

        System.out.println("Data generated for calculation: " + "\n");
        logger.info("Number one (for nCr): " + numberOne);
        logger.info("Number two (for nCr): " + numberTwo);
        System.out.println("\n");
    }

    //input negative data getter (for invalid nCr calculation)
    public void inputNegativeNcRDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNumberOne = Integer.parseInt("-" + testDataGenerator.generateRandomNcRNumber1());
        negativeNumberTwo = Integer.parseInt("-" + testDataGenerator.generateRandomNcRNumber2());

        //assert number one is always greater than number two
        if (negativeNumberTwo > negativeNumberOne) {
            int temp = negativeNumberOne;
            negativeNumberOne = negativeNumberTwo;
            negativeNumberTwo = temp;
        }

        System.out.println("Data generated for invalid calculation (nCr): " + "\n");
        logger.info("Negative number one (for nCr): " + negativeNumberOne);
        logger.info("Negative number two (for nCr): " + negativeNumberTwo);
        System.out.println("\n");
    }

    //input data getter (for atanh / asin / acos functions)
    public void inputATanHNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        funcNumberOne = testDataGenerator.generateRandomATanHInputNumber();

        System.out.println("Data generated for single number calculation (aTanH / asin / acos): " + "\n");
        logger.info("Number generated for single number function (aTanH / asin / acos): " + funcNumberOne);
        System.out.println("\n");
    }

    //input data getter (for aCot function)
    public void inputACotNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        numberOne = testDataGenerator.generateRandomACotInputNumber();

        System.out.println("Data generated for single number calculation (aCot): " + "\n");
        logger.info("Number generated for single number function (aCot): " + numberOne);
        System.out.println("\n");
    }

    //input data getter (for negative aCot function)
    public void inputACotNegativeNumberDataGetter(){
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        negativeNumberOne = Integer.parseInt("-" + testDataGenerator.generateRandomACotInputNumber());

        System.out.println("Data generated for single negative number calculation (aCot): " + "\n");
        logger.info("Negative number generated for single number function (aCot): " + negativeNumberOne);
        System.out.println("\n");
    }

    //data input methods
    public void inputNumberOne(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberInputField));
        numberInputField.click();
        numberInputField.sendKeys(String.valueOf(numberOne));
    }
    public void inputNumberTwo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberInputField));
        numberInputField.sendKeys(String.valueOf(numberTwo));
    }

    //data input methods (negative numbers)
    public void inputNegativeNumberOne(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberInputField));
        numberInputField.click();
        numberInputField.sendKeys(String.valueOf(negativeNumberOne));
    }
    public void inputNegativeNumberTwo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberInputField));
        numberInputField.sendKeys(String.valueOf(negativeNumberTwo));
    }

    //data input methods (for atanh/ asin / acos functions)
    public void inputNumberOneForArcFunctions(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.visibilityOf(numberInputField));
        numberInputField.click();
        numberInputField.sendKeys(String.valueOf(funcNumberOne));
    }

    //numberOne and numberTwo getters
    public int getNumberOne(){return numberOne;}
    public int getNumberTwo(){return numberTwo;}

    //arc function number getter
    public double getNumberOneForArcFunction(){return funcNumberOne;}

    //(negative) numberOne and numberTwo getters
    public int getNegativeNumberOne(){return negativeNumberOne;}
    public int getNegativeNumberTwo(){return negativeNumberTwo;}

}
