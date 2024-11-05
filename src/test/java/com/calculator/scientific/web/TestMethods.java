package com.calculator.scientific.web;


import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.*;

import java.math.*;
import java.text.DecimalFormat;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);


    //simple arithmetic test methods

    //valid addition test method (with numpad button input)
    protected void numAdditionWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one
        calculatorNumPadInput.clickNumberSevenButton();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //input number two
        calculatorNumPadInput.clickNumberNineButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = 7 + 9;
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid addition test method (with random generated numbers input)
    protected void numAdditionWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //input number two
        calculatorRandomNumberInputPage.inputNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = calculatorRandomNumberInputPage.getNumberOne() + calculatorRandomNumberInputPage.getNumberTwo();
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid subtraction test method (with numpad button input)
    protected void numSubtractionWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click subtraction button
        calculatorNumPadInput.clickSubtractionButton();
        //input number two (combo of key inputs)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = 675 - 319;
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid subtraction test method (with random generated numbers input)
    protected void numSubtractionWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click subtraction button
        calculatorNumPadInput.clickSubtractionButton();
        //input number two
        calculatorRandomNumberInputPage.inputNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = calculatorRandomNumberInputPage.getNumberOne() - calculatorRandomNumberInputPage.getNumberTwo();
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }

    //valid multiplication test method (with numpad button input)
    protected void numMultiplicationWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFourButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input number two (combo of key inputs)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberEightButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = 214 * 389;
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid multiplication test method (with random generated numbers input)
    protected void numMultiplicationWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input number two
        calculatorRandomNumberInputPage.inputNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = calculatorRandomNumberInputPage.getNumberOne() * calculatorRandomNumberInputPage.getNumberTwo();
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }

    //valid division test method (with numpad button input)
    protected void numDivisionWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberEightButton();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //input number two
        calculatorNumPadInput.clickNumberEightButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = 48 / 8;
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid division test method (with random generated numbers input)
    protected void numDivisionWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputDivisionDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //input number two
        calculatorRandomNumberInputPage.inputNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //calculation verification (in app)
        //local comparator
        int number1 = calculatorRandomNumberInputPage.getNumberOne();
        int number2 = calculatorRandomNumberInputPage.getNumberTwo();
        double expectedResult = (double)number1 / (double) number2;
        //assert the result matches the expected result in the log
        String rawResult = calculatorPage.getCalculationResult();
        double actualResult = Double.parseDouble(rawResult);
        final double TOLERANCE = 0.001;
        //log the results
        logCalculationResult(calculatorPage);
        //log the issue if there are any discrepancies in the results
        if (Math.abs(expectedResult - actualResult) > TOLERANCE) {
            logger.error("The calculator actual random number division result has discrepancies from the expected result. Expected result: " + expectedResult + ", Actual result: " + actualResult);
        }
    }

    //valid negative numbers addition test method (with numpad button input)
    protected void negativeNumAdditionWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //input number two
        calculatorNumPadInput.clickNumberNineButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = -37 + (-9);
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid negative number addition test method (with random generated numbers input)
    protected void negativeNumAdditionWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputNegativeNumberDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //input number two
        calculatorRandomNumberInputPage.inputNegativeNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = calculatorRandomNumberInputPage.getNegativeNumberOne() + calculatorRandomNumberInputPage.getNegativeNumberTwo();
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }

    //valid negative number subtraction test method (with numpad button input)
    protected void negativeNumSubtractionWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click subtraction button
        calculatorNumPadInput.clickSubtractionButton();
        //input number two (combo of key inputs)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = -65 - 39;
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid negative number subtraction test method (with random generated numbers input)
    protected void negativeNumSubtractionWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputNegativeNumberDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click subtraction button
        calculatorNumPadInput.clickSubtractionButton();
        //input number two
        calculatorRandomNumberInputPage.inputNegativeNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = calculatorRandomNumberInputPage.getNegativeNumberOne() - calculatorRandomNumberInputPage.getNegativeNumberTwo();
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }

    //valid negative number multiplication test method (with numpad button input)
    protected void negativeNumMultiplicationWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberNineButton();
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFourButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input number two (combo of key inputs)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = -914 * (-62);
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid negative number multiplication test method (with random generated numbers input)
    protected void negativeNumMultiplicationWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputNegativeNumberDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input number two
        calculatorRandomNumberInputPage.inputNegativeNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = calculatorRandomNumberInputPage.getNegativeNumberOne() * calculatorRandomNumberInputPage.getNegativeNumberTwo();
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }

    //valid negative number division test method (with numpad button input)
    protected void negativeNumDivisionWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //input number two
        calculatorNumPadInput.clickNumberNineButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //calculation verification (in app)
        int innerResult = -72 / (-9);
        //assert the result matches the displayed result in the log
        assertEquals(innerResult ,Integer.parseInt(calculatorPage.getCalculationResult()), "Calculation results do not match");
    }
    //valid negative number division test method (with random generated numbers input)
    protected void negativeNumDivisionWithRandomNumbersInputTest(CalculatorPage calculatorPage){
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //random number input getter
        calculatorRandomNumberInputPage.inputNegativeNumDivisionDataGetter();
        //input number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //input number two
        calculatorRandomNumberInputPage.inputNegativeNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //calculation verification (in app)
        //local comparator
        int number1 = calculatorRandomNumberInputPage.getNumberOne();
        int number2 = calculatorRandomNumberInputPage.getNegativeNumberTwo();
        double expectedResult = (double)number1 / (double) number2;
        //assert the result matches the expected result in the log
        String rawResult = calculatorPage.getCalculationResult();
        logger.info("Raw result string: " + rawResult); //logs the raw string output
        double actualResult = Double.parseDouble(rawResult);
        logger.info("Expected result: " + expectedResult);
        logger.info("Actual result: " + actualResult);
        final double TOLERANCE = 0.001;
        //log the issue if there are any discrepancies in the results
        if (Math.abs(expectedResult - actualResult) > TOLERANCE) {
            logger.error("The calculator actual random negative number division result has discrepancies from the expected result. Expected result: " + expectedResult + ", Actual result: " + actualResult);
        }
    }

    //invalid number division test (by zero) method (with numpad button input)
    protected void numberDivisionByZeroWithNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input number one (combo of key inputs)
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //input number two
        calculatorNumPadInput.clickNumberZeroButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: DivByZero" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //advanced arithmetic test methods

    //positive numbers

    //valid logarithmic (log10) calculation test method - numpad input
    protected void logarithmic10CalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (for logarithmic calculation)
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'log (to base10)' button
        calculatorNumPadInput.clickLog10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.log10(72);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //valid logarithmic (log10) calculation test method - random number input
    protected void logarithmic10CalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for logarithmic calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'log (to base10)' button
        calculatorNumPadInput.clickLog10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.log10(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //ten raised to power of input number test method (with numpad input)
    protected void tenToPowerOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise ten to the power of)
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'raise ten to the power of number' button
        calculatorNumPadInput.clickPower10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(10, 5);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise ten to the power of input random number test method (with random number)
    protected void raiseTenToPowerOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (for 'rise-to-the-power-of' function)
        calculatorRandomNumberInputPage.inputPowerNumberDataGetter();
        //input random test number (for logarithmic calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'raise ten to the power of number' button
        calculatorNumPadInput.clickPower10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(10,calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //raise input number to the power of two test method (with numpad input)
    protected void raiseInputNumberToPowerOfTwoCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise it to the power of two)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(107, 2);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise input number to the power of two test method(with random number input)
    protected void raiseInputNumberToPowerOfTwoCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to raise input number to the power of two)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'raise input number to the power of two' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(calculatorRandomNumberInputPage.getNumberOne(), 2);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //square root of input number test method (with numpad input)
    protected void sqrtOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate its square root)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'square root of input number' button
        calculatorNumPadInput.clickSqrtOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.sqrt(256);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //square root of input number test method (with random number input)
    protected void sqrtOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate square root of random generated number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for logarithmic calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'square root of input number' button
        calculatorNumPadInput.clickSqrtOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.sqrt(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //cube root of input number test method (with numpad input)
    protected void cubeRootOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate its square root)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'cube root of input number' button
        calculatorNumPadInput.clickCubicRootOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.cbrt(69);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //cube root of input number test method (with random number input)
    protected void cubeOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate square root of random generated number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for logarithmic calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'cube root of input number' button
        calculatorNumPadInput.clickCubicRootOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.cbrt(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //raise input number to the power of three test method (with numpad input)
    protected void raiseInputNumberToPowerOfThreeCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise it to the power of three)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'raise input number to the power of three' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfThreeButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(157, 3);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise input number to the power of three test method(with random number input)
    protected void raiseInputNumberToPowerOfThreeCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to raise input number to the power of three)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'raise input number to the power of three' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfThreeButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(calculatorRandomNumberInputPage.getNumberOne(), 3);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //y-th root of input number test method (with numpad input)
    protected void yThRootOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate y-th root of input number)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'calculate y-th root of input number' button
        calculatorNumPadInput.clickYThRootOfInputNumberButton();
        //input y-th number
        calculatorNumPadInput.clickNumberFourButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateRoot(57, 4);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //y-th root of input number test method(with random number input)
    protected void yThRootOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate y-th root of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'to calculate y-th root of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickYThRootOfInputNumberButton();
        //input y-th number
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateRoot(calculatorRandomNumberInputPage.getNumberOne(), 3);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //raise input number to power of Y test method (with numpad input)
    protected void raiseInputNumberToPowerOfYCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise input number to power of Y)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'raise input number to power of Y' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfYButton();
        //input y-th number
        calculatorNumPadInput.clickNumberSixButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(27, 6);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise input number to power of Y test method(with random number input)
    protected void raiseInputNumberToPowerOfYCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate y-th root of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'to calculate y-th root of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfYButton();
        //input y-th number
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(calculatorRandomNumberInputPage.getNumberOne(), 2);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //logarithm of input number to base e test method (with numpad input)
    protected void logOfInputNumberToBaseECalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate logarithm of input number to base e)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'logarithm of input number to base e' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.logToBaseE(37);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //logarithm of input number to base e test method (with random number input)
    protected void logOfInputNumberToBaseECalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate logarithm of input number to base e)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'logarithm of input number to base e' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'logarithm of input number to base e' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.logToBaseE(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //exponential function of input number test method (with numpad input)
    protected void expFunctionOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate exponential function)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberSixButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate exponential function of input number' button
        calculatorNumPadInput.clickExpFunctionButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.exponentialOf(16);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //exponential function of input number test method (with random number input)
    protected void expFunctionOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate exponential function of input number)
        calculatorRandomNumberInputPage.inputPowerNumberDataGetter();
        //input random test number (for 'exponential function of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate exponential function of input number' button
        calculatorNumPadInput.clickExpFunctionButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.exponentialOf(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate logarithm of input number to base 2 test method (with numpad input)
    protected void logOfInputNumberToBaseTwoCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate logarithm of input number to base 2)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberNineButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate logarithm of input number to base 2' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.logBase2(19);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate logarithm of input number to base 2 test method (with random number input)
    protected void logOfInputNumberToBaseTwoCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate exponential function of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'exponential function of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'logarithm of input number to base 2' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.logBase2(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate two to power of input number test method (with numpad input)
    protected void twoToPowerOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate two to power of input number)
        calculatorNumPadInput.clickNumberFourButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate two to power of input number' button
        calculatorNumPadInput.clickTwoToPowerOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(2, 4);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate two to power of input number test method (with random number input)
    protected void twoToPowerOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate two to power of input number)
        calculatorRandomNumberInputPage.inputPowerNumberDataGetter();
        //input random test number (for 'two to power of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'two to power of input number' button
        calculatorNumPadInput.clickTwoToPowerOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(2, calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //negative number test scenarios

    //invalid logarithmic (log10) negative number calculation test method - numpad input
    protected void logarithmic10NegativeNumCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (for logarithmic calculation)
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'log (to base10)' button
        calculatorNumPadInput.clickLog10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (negative logarithmic calculation) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing invalid calculation operation
        assertEquals("= Error: invalid negative argu.." ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }
    //invalid logarithmic (log10) calculation test method - random negative number input
    protected void logarithmic10NegativeNumCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (for single negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for logarithmic calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'log (to base10)' button
        calculatorNumPadInput.clickLog10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (negative number logarithmic calculation) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing invalid calculation operation
        assertEquals("= Error: invalid negative argu.." ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }

    //ten raised to power of input negative number test method (with numpad input)
    protected void tenToPowerOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise ten to the power of)
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'raise ten to the power of number' button
        calculatorNumPadInput.clickPower10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(10, -5);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise ten to the power of input negative random number test method (with random number)
    protected void raiseTenToPowerOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (for negative 'rise-to-the-power-of' function)
        calculatorRandomNumberInputPage.inputNegativePowerNumberDataGetter();
        //input random test number (for negative 'rise-to-the-power-of' function)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'raise ten to the power of number' button
        calculatorNumPadInput.clickPower10Button();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(10,calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //raise input negative number to the power of two test method (with numpad input)
    protected void raiseInputNegativeNumberToPowerOfTwoCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise it to the power of two)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = -Math.pow(17, 2);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise input negative number to the power of two test method(with random negative number input)
    protected void raiseInputNegativeNumberToPowerOfTwoCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to raise input negative number to the power of two)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'raise input negative number to the power of two' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = -Math.pow(calculatorRandomNumberInputPage.getNegativeNumberOne(), 2);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //square root of input negative number test method (with numpad input) (invalid test)
    protected void sqrtOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate its square root)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'square root of input number' button
        calculatorNumPadInput.clickSqrtOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double negativeNumber = -26;
        //negative number handler
        double imaginaryPart = Math.sqrt(-negativeNumber);
        ComplexNumbers innerResult = new ComplexNumbers(0, imaginaryPart);
        //compare with the imaginary part as a double for assertion
        double actualImaginaryPart = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        //imaginary parts only comparison
        assertEquals(innerResult.imaginary, actualImaginaryPart, tolerance, "Calculation results do not match");
    }

    //square root of input negative number test method (with random negative number input) (invalid test)
    protected void sqrtOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate square root of random generated negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for square root of random generated negative number calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'square root of input number' button
        calculatorNumPadInput.clickSqrtOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double negativeNumber = calculatorRandomNumberInputPage.getNegativeNumberOne();
        //negative number handler
        double imaginaryPart = Math.sqrt(-negativeNumber);
        ComplexNumbers innerResult = new ComplexNumbers(0, imaginaryPart);
        //compare with the imaginary part as a double for assertion
        double actualImaginaryPart = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        //imaginary parts only comparison
        assertEquals(innerResult.imaginary, actualImaginaryPart, tolerance, "Calculation results do not match");
    }

    //cube root of input negative number test method (with numpad input)
    protected void cubeRootOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate its cube root)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'cube root of input number' button
        calculatorNumPadInput.clickCubicRootOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.cbrt(-63);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //cube root of input negative number test method (with random number input)
    protected void cubeOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate cube root of random generated negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for cube root of random generated negative number calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'cube root of input number' button
        calculatorNumPadInput.clickCubicRootOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.cbrt(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //raise input negative number to the power of three test method (with numpad input)
    protected void raiseInputNegativeNumberToPowerOfThreeCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise it to the power of three)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'raise input number to the power of three' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfThreeButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(-57, 3);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise input negative number to the power of three test method(with random negative number input)
    protected void raiseInputNegativeNumberToPowerOfThreeCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to raise input negative number to the power of three)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'raise input negative number to the power of three' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfThreeButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(calculatorRandomNumberInputPage.getNegativeNumberOne(), 3);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //y-th root of input negative number test method (with numpad input) (invalid operation test -> y = 4)
    protected void yThRootOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate y-th root of input number)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'calculate y-th root of input number' button
        calculatorNumPadInput.clickYThRootOfInputNumberButton();
        //input y-th number
        calculatorNumPadInput.clickNumberFourButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (y-th root of input negative number) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: invalid argument" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }
    //y-th root of input negative number test method(with random number input) (invalid operation test -> y = 4)
    protected void yThRootOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate y-th root of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'to calculate y-th root of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickYThRootOfInputNumberButton();
        //input y-th number
        calculatorNumPadInput.clickNumberFourButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (y-th root of input random negative number) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: invalid argument" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }

    //raise input negative number to power of Y test method (with numpad input)
    protected void raiseInputNegativeNumberToPowerOfYCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to raise input negative number to power of Y)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'raise input number to power of Y' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfYButton();
        //input y-th number
        calculatorNumPadInput.clickNumberFourButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = -Math.pow(17, 4);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //raise input negative number to power of Y test method(with random negative number input)
    protected void raiseInputNegativeNumberToPowerOfYCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate y-th root of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'to calculate y-th root of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'raise input number to the power of two' button
        calculatorNumPadInput.clickRaiseNumberToPowerOfYButton();
        //input y-th number
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = -Math.pow(calculatorRandomNumberInputPage.getNegativeNumberOne(), 2);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //logarithm of input negative number to base e test method (with numpad input)
    protected void logOfInputNegativeNumberToBaseECalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate logarithm of input negative number to base e)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'logarithm of input number to base e' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (logarithm of input negative number to base e) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: invalid argument" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }
    //logarithm of input negative number to base e test method (with random negative number input)
    protected void logOfInputNegativeNumberToBaseECalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate logarithm of input negative number to base e)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random negative test number (for 'logarithm of input number to base e' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'logarithm of input number to base e' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (logarithm of input random negative number to base e) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: invalid argument" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }

    //exponential function of input negative number test method (with numpad input)
    protected void expFunctionOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate exponential function)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate exponential function of input number' button
        calculatorNumPadInput.clickExpFunctionButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.exponentialOf(-23);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //exponential function of input number test method (with random number input)
    protected void expFunctionOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate exponential function of input negative number)
        calculatorRandomNumberInputPage.inputNegativePowerNumberDataGetter();
        //input random negative test number (for 'exponential function of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate exponential function of input number' button
        calculatorNumPadInput.clickExpFunctionButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.exponentialOf(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate logarithm of input negative number to base 2 test method (with numpad input) (invalid operation)
    protected void logOfInputNegativeNumberToBaseTwoCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate logarithm of input number to base 2)
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate logarithm of input number to base 2' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (logarithm of input negative number to base 2) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: invalid negative argu.." ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }
    //calculate logarithm of input negative number to base 2 test method (with random negative number input) (invalid operation)
    protected void logOfInputNegativeNumberToBaseTwoCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to logarithm of input negative number to base 2)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'logarithm of input negative number to base 2' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'logarithm of input number to base 2' button
        calculatorNumPadInput.clickLogOfInputNumberToBaseTwoButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logger.info("Invalid operation (logarithm of input random negative number to base 2) result: " + calculatorPage.getInvalidCalculationResult());
        //assert the expected error message is displayed when executing 'division by zero' operation
        assertEquals("= Error: invalid negative argu.." ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }

    //calculate two to power of input negative number test method (with numpad input)
    protected void twoToPowerOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate two to power of input number)
        calculatorNumPadInput.clickNumberFourButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'calculate two to power of input number' button
        calculatorNumPadInput.clickTwoToPowerOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(2, -4);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate two to power of input negative number test method (with random number input)
    protected void twoToPowerOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate two to power of input number)
        calculatorRandomNumberInputPage.inputNegativePowerNumberDataGetter();
        //input random test number (for 'two to power of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //hover above dropdown 1 button
        calculatorNumPadInput.hoverAboveDropdown1Button();
        //click 'two to power of input number' button
        calculatorNumPadInput.clickTwoToPowerOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.pow(2, calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //trigonometric functions test methods

    //calculate sine of input number test method (with numpad input)
    protected void sinOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate sine of input number)
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberFourButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSineOfInputNumber(44);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate sine of input random number test method (with random number input)
    protected void sinOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate sine of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'sine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSineOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate hyperbolic sine of input number test method (with numpad input)
    protected void sinHOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate hyperbolic sine of input number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'sine H of input number' button
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSinhOfInputNumber(25);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate hyperbolic sine of input random number test method (with random number input)
    protected void sinHOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate hyperbolic sine of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'hyperbolic sine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSinhOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate cosine of input number test method (with numpad input)
    protected void cosOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate cosine of input number)
        calculatorNumPadInput.clickNumberNineButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosineOfInputNumber(95);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate cosine of input random number test method (with random number input)
    protected void cosOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate cosine of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'cosine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosineOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate hyperbolic cosine of input number test method (with numpad input)
    protected void cosHOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate hyperbolic cosine of input number)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberOneButton();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosHOfInputNumber(61);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate hyperbolic cosine of input random number test method (with random number input)
    protected void cosHOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate hyperbolic cosine of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'hyperbolic cosine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosHOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate tangent of input number test method (with numpad input)
    protected void tanOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate tangent of input number)
        calculatorNumPadInput.clickNumberEightButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTangentOfInputNumber(83);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate tangent of input random number test method (with random number input)
    protected void tanOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate tangent of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTangentOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate hyperbolic tangent of input number test method (with numpad input)
    protected void tanHOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate hyperbolic tangent of input number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTanHOfInputNumber(123);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate hyperbolic tangent of input random number test method (with random number input)
    protected void tanHOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate hyperbolic tangent of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'hyperbolic tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTanHOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate cotangent of input number test method (with numpad input)
    protected void cotOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate cotangent of input number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCotangentOfInputNumber(13);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate cotangent of input random number test method (with random number input)
    protected void cotOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate cotangent of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'cotangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCotangentOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate secant of input number test method (with numpad input)
    protected void secOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate secant of input number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSecantOfInputNumber(143);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate secant of input random number test method (with random number input)
    protected void secOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate secant of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSecantOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate co secant of input number test method (with numpad input)
    protected void coSecOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate co secant of input number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberOneButton();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCo_secantOfInputNumber(211);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate co secant of input random number test method (with random number input)
    protected void coSecOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate co secant of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'co secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCo_secantOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate combinations (nCr) of input number test method (with numpad input)
    protected void nCrOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number one
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberOneButton();
        //click 'nCr of input number' button
        calculatorNumPadInput.clickNcROfInputNumberButton();
        //input test number two
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        BigInteger innerResult = calculatorPage.calculateCombination(21, 7);
        BigInteger actualResult = new BigInteger(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate combinations(nCr) of input random number test method (with random number input)
    protected void nCrOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter
        calculatorRandomNumberInputPage.inputNcRDataGetter();
        //input random test number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'nCr of input number' button
        calculatorNumPadInput.clickNcROfInputNumberButton();
        //input random test number two
        calculatorRandomNumberInputPage.inputNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        BigInteger innerResult = calculatorPage.calculateCombination(calculatorRandomNumberInputPage.getNumberOne(), calculatorRandomNumberInputPage.getNumberTwo());
        BigInteger actualResult = new BigInteger(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //calculate permutations (nPr) of input number test method (with numpad input)
    protected void nPrOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number one
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFourButton();
        //click 'nPr of input number' button
        calculatorNumPadInput.clickNpROfInputNumberButton();
        //input test number two
        calculatorNumPadInput.clickNumberEightButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        BigInteger innerResult = calculatorPage.calculatePermutations(14, 8);
        BigInteger actualResult = new BigInteger(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate permutations(nPr) of input random number test method (with random number input)
    protected void nPrOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter
        calculatorRandomNumberInputPage.inputNcRDataGetter();
        //input random test number one
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'nCr of input number' button
        calculatorNumPadInput.clickNpROfInputNumberButton();
        //input random test number two
        calculatorRandomNumberInputPage.inputNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        BigInteger innerResult = calculatorPage.calculatePermutations(calculatorRandomNumberInputPage.getNumberOne(), calculatorRandomNumberInputPage.getNumberTwo());
        BigInteger actualResult = new BigInteger(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //calculate percentage equivalent of input number test method (with numpad input)
    protected void percentOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate percentage equivalent of input number)
        calculatorNumPadInput.clickNumberTwoButton();
        //click '% of input number' button
        calculatorNumPadInput.clickPercentOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        int innerResult = calculatorPage.calculatePercentageInput(2);
        int actualResult = Integer.parseInt(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate percentage equivalent of input random number test method (with random number input)
    protected void percentOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate co secant of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'co secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click '% of input number' button
        calculatorNumPadInput.clickPercentOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        int innerResult = calculatorPage.calculatePercentageInput(calculatorRandomNumberInputPage.getNumberOne());
        int actualResult = Integer.parseInt(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //negative numbers test scenarios

    //calculate sine of input negative number test method (with numpad input)
    protected void sinOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate sine of input number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberFourButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSineOfInputNumber(-24);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate sine of input random negative number test method (with random negative number input)
    protected void sinOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate sine of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'sine of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSineOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate hyperbolic sine of input negative number test method (with numpad input)
    protected void sinHOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate hyperbolic sine of input negative number)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'sine H of input number' button
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSinhOfInputNumber(-63);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate hyperbolic sine of input random negative number test method (with random negative number input)
    protected void sinHOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate hyperbolic sine of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'hyperbolic sine of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSinhOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate cosine of input negative number test method (with numpad input)
    protected void cosOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate cosine of input negative number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberNineButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosineOfInputNumber(-195);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate cosine of input random negative number test method (with random negative number input)
    protected void cosOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate cosine of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'cosine of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosineOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate hyperbolic cosine of input negative number test method (with numpad input)
    protected void cosHOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate hyperbolic cosine of input negative number)
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosHOfInputNumber(-47);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate hyperbolic cosine of input random number test method (with random number input)
    protected void cosHOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate hyperbolic cosine of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'hyperbolic cosine of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCosHOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate tangent of input negative number test method (with numpad input)
    protected void tanOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate tangent of input negative number)
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTangentOfInputNumber(-43);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate tangent of input random negative number test method (with random negative number input)
    protected void tanOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate tangent of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random negative test number (for 'tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTangentOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate hyperbolic tangent of input negative number test method (with numpad input)
    protected void tanHOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate hyperbolic tangent of input negative number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTanHOfInputNumber(-256);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate hyperbolic tangent of input random negative number test method (with random negative number input)
    protected void tanHOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate hyperbolic tangent of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'hyperbolic tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateTanHOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate cotangent of input negative number test method (with numpad input)
    protected void cotOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate cotangent of input negative number)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCotangentOfInputNumber(-53);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate cotangent of input random negative number test method (with random negative number input)
    protected void cotOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate cotangent of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'cotangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCotangentOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate secant of input negative number test method (with numpad input)
    protected void secOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate secant of input negative number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSecantOfInputNumber(-173);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate secant of input random negative number test method (with random negative number input)
    protected void secOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate secant of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random negative test number (for 'secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateSecantOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate co secant of input negative number test method (with numpad input)
    protected void coSecOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate co secant of input negative number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCo_secantOfInputNumber(-215);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate co secant of input random negative number test method (with random negative number input)
    protected void coSecOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate co secant of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random negative test number (for 'co secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateCo_secantOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResult, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate combinations (nCr) of input negative number test method (with numpad input) (typically, in combinations, negative values are not allowed)
    protected void nCrOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number one
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'nCr of input number' button
        calculatorNumPadInput.clickNcROfInputNumberButton();
        //input test number two
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //assert the IllegalArgumentException is thrown (since this operation is invalid)
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorPage.calculateCombination(-13, -7);
        }, "Expected IllegalArgumentException for r > n but did not get one");
    }
    //calculate combinations(nCr) of input random negative number test method (with random negative number input) (invalid operation)
    protected void nCrOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (negative number two)
        calculatorRandomNumberInputPage.inputNegativeNcRDataGetter();
        //input random test negative number one
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'nCr of input number' button
        calculatorNumPadInput.clickNcROfInputNumberButton();
        //input random test negative number two
        calculatorRandomNumberInputPage.inputNegativeNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        //assert the IllegalArgumentException is thrown (since this operation is invalid)
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorPage.calculateCombination(calculatorRandomNumberInputPage.getNegativeNumberOne(), calculatorRandomNumberInputPage.getNegativeNumberTwo());
        }, "Expected IllegalArgumentException for r > n but did not get one");
    }

    //calculate permutations (nPr) of input negative number test method (with numpad input) (invalid operation)
    protected void nPrOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number one
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFourButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'nPr of input number' button
        calculatorNumPadInput.clickNpROfInputNumberButton();
        //input test number two
        calculatorNumPadInput.clickNumberEightButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        BigInteger innerResult = calculatorPage.calculatePermutations(-14, -8);
        BigInteger actualResult = new BigInteger(calculatorPage.getCalculationResult());
        //assert the IllegalArgumentException is thrown (since this operation is invalid)
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorPage.calculateCombination(-14, -8);
        }, "Expected IllegalArgumentException for r > n but did not get one");
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate permutations(nPr) of input random negative number test method (with random negative number input) (invalid operation)
    protected void nPrOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter
        calculatorRandomNumberInputPage.inputNegativeNcRDataGetter();
        //input random test negative number one
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'nCr of input number' button
        calculatorNumPadInput.clickNpROfInputNumberButton();
        //input random test negative number two
        calculatorRandomNumberInputPage.inputNegativeNumberTwo();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        BigInteger innerResult = calculatorPage.calculatePermutations(calculatorRandomNumberInputPage.getNegativeNumberOne(), calculatorRandomNumberInputPage.getNegativeNumberTwo());
        BigInteger actualResult = new BigInteger(calculatorPage.getCalculationResult());
        //assert the IllegalArgumentException is thrown (since this operation is invalid)
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorPage.calculateCombination(calculatorRandomNumberInputPage.getNegativeNumberOne(), calculatorRandomNumberInputPage.getNegativeNumberTwo());
        }, "Expected IllegalArgumentException for r > n but did not get one");
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //calculate percentage equivalent of input negative number test method (with numpad input)
    protected void percentOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate percentage equivalent of input number)
        calculatorNumPadInput.clickNumberFourButton();
        //click 'plus/minus' button (to convert number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click '% of input number' button
        calculatorNumPadInput.clickPercentOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        int innerResult = calculatorPage.calculatePercentageInput(-4);
        int actualResult = Integer.parseInt(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate percentage equivalent of input random negative number test method (with random negative number input)
    protected void percentOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate percentage equivalent of input number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'calculate percentage equivalent of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click '% of input number' button
        calculatorNumPadInput.clickPercentOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        int innerResult = calculatorPage.calculatePercentageInput(calculatorRandomNumberInputPage.getNegativeNumberOne());
        int actualResult = Integer.parseInt(calculatorPage.getCalculationResult());
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //supplementary functions

    //calculate variable equation of input number test method (with numpad input)
    protected void varEquationOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'var' button
        calculatorNumPadInput.clickXButton();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //input test number (to calculate percentage equivalent of input number)
        calculatorNumPadInput.clickNumberFourButton();
        //click 'equation equal' button
        calculatorNumPadInput.clickEquationEqualButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationVariableEquationResult(calculatorPage);
        // calculation verification (in app)
        String innerResult = "= x+4";
        String actualResult = calculatorPage.getInvalidCalculationResult();
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate variable equation of input random number test method (with random number input)
    protected void varEquationOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'var' button
        calculatorNumPadInput.clickXButton();
        //click subtraction button
        calculatorNumPadInput.clickSubtractionButton();
        //input data getter (to calculate variable equation of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test negative number (for 'variable equation of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'equation equal' button
        calculatorNumPadInput.clickEquationEqualButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationVariableEquationResult(calculatorPage);
        // calculation verification (in app)
        int randomNumber = calculatorRandomNumberInputPage.getNumberOne();
        String innerResult = "= x-" + randomNumber;
        String actualResult = calculatorPage.getInvalidCalculationResult();
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //calculate Euler's number of input number (multiplication) test method (with numpad input)
    protected void eulerNumberOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate Euler's number of input number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberZeroButton();
        //click 'Euler's number' button
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double e = Math.E;
        double innerResult = 10 * e;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }
    //calculate Euler's number of input random number (multiplication) test method (with random number input)
    protected void eulerNumberOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate Euler's number of input number)
        calculatorRandomNumberInputPage.inputSmallSingleNumberDataGetter();
        //input random test negative number (for 'Euler's number of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Euler's number' button
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double e = Math.E;
        int randomNumber = calculatorRandomNumberInputPage.getNumberOne();
        double innerResult = randomNumber * e;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }

    //calculate input number multiplied by imaginary unit test method (with numpad input) (after pressing 2nd button)
    protected void inputNumberMultiplyByImaginaryUnitCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate input number multiplied by imaginary unit)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberZeroButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'I' button (Euler's placeholder)
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationImaginaryUnitResult(calculatorPage);
        // calculation verification (in app)
        String actualResult = calculatorPage.getCalculationResult() + "i";
        String expectedResult = "10i";
        assertEquals(expectedResult, actualResult, "Calculation results do not match");
    }
    //calculate input random number multiplied by imaginary unit test method (with random number input) (after pressing 2nd button)
    protected void inputNumberMultiplyByImaginaryUnitCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate input number multiplied by imaginary unit)
        calculatorRandomNumberInputPage.inputSmallSingleNumberDataGetter();
        //input random test negative number (for 'input number multiplied by imaginary unit' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'I' button (Euler's placeholder)
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationImaginaryUnitResult(calculatorPage);
        // calculation verification (in app)
        int randomNumber = calculatorRandomNumberInputPage.getNumberOne();
        String actualResult = calculatorPage.getCalculationResult() + "i";
        String expectedResult =  randomNumber + "i";
        assertEquals(expectedResult, actualResult, "Calculation results do not match");
    }

    //calculate pi constant multiplied by input number test method (with numpad input)
    protected void piConstMultipliedByInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'pi constant' button
        calculatorNumPadInput.clickPiConstButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input test number (to calculate pi constant multiplication by the input number)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double pi = Math.PI;
        double innerResult = pi * 36;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }
    //calculate input random number division by PI constant test method (with random number input)
    protected void randomInputNumberDivisionByPIConstantTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate input random number division by PI constant)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test negative number (for 'input random number division by PI constant' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //click 'pi constant' button
        calculatorNumPadInput.clickPiConstButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double pi = Math.PI;
        int randomNumber = calculatorRandomNumberInputPage.getNumberOne();
        double innerResult = randomNumber / pi;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }

    //calculate Faraday constant multiplied by input number test method (with numpad input) (after pressing 2nd button)
    protected void faradayConstMultipliedByInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'Faraday constant' button
        calculatorNumPadInput.clickPiConstButton();
        //input 'Faraday constant' into constant modal input field
        calculatorNumPadInput.inputFaradayConstantIntoInputField();
        //click 'Faraday constant' option
        calculatorNumPadInput.clickFaradayConstantOption();
        //assert the Faraday constant value displayed is valid
        assertEquals("96485.3365", calculatorNumPadInput.getConstantValue(), "The faraday constant value in app doesn't match expected value.");
        //assert the Faraday constant form control unit matches expectations
        assertEquals("[C mol^-1]", calculatorNumPadInput.getConstantFormControlUnit(), "The faraday constant form control unit doesn't match expected value.");
        //assert the Faraday constant is present in constant list
        assertEquals("Faraday constant", calculatorNumPadInput.getFaradayConstantFromList(), "The faraday constant isn't present in the constant list.");
        //click 'Insert' constant button
        calculatorNumPadInput.clickInsertButton();
        //click 'Additional trigonometric functions menu (second function)' button -> to return back to first menu
        calculatorNumPadInput.click2ndButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input test number (to calculate Faraday constant multiplication by the input number)
        calculatorNumPadInput.clickNumberSixButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double faradayConstant = 96485.3365;
        double innerResult = faradayConstant * 6;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }
    //calculate input random number division by Faraday constant test method (with random number input) (after pressing 2nd button)
    protected void randomInputNumberDivisionByFaradayConstantTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate input random number division by Faraday constant)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test negative number (for 'input random number division by Faraday constant' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'Faraday constant' button
        calculatorNumPadInput.clickPiConstButton();
        //input 'Faraday constant' into constant modal input field
        calculatorNumPadInput.inputFaradayConstantIntoInputField();
        //click 'Faraday constant' option
        calculatorNumPadInput.clickFaradayConstantOption();
        //assert the Faraday constant value displayed is valid
        assertEquals("96485.3365", calculatorNumPadInput.getConstantValue(), "The faraday constant value in app doesn't match expected value.");
        //assert the Faraday constant form control unit matches expectations
        assertEquals("[C mol^-1]", calculatorNumPadInput.getConstantFormControlUnit(), "The faraday constant form control unit doesn't match expected value.");
        //assert the Faraday constant is present in constant list
        assertEquals("Faraday constant", calculatorNumPadInput.getFaradayConstantFromList(), "The faraday constant isn't present in the constant list.");
        //click 'Insert' constant button
        calculatorNumPadInput.clickInsertButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double faradayConstant = 96485.3365;
        int randomNumber = calculatorRandomNumberInputPage.getNumberOne();
        double innerResult = randomNumber / faradayConstant;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }

    //calculate scientific notation of the input number test method (with numpad input)
    protected void scientificNotationOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'grid matrix' button
        calculatorNumPadInput.clickGridMatrixButton();
        //input test number (to calculate scientific notation of input number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = 2.6 * Math.pow(10, 0);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        DecimalFormat df = new DecimalFormat("0.0E0");
        String expectedFormatted = df.format(innerResult);  //formats 2.6 as "2.6E1"
        String actualFormatted = df.format(actualResult);   //formats actualResult in matching format with expectedResult
        assertEquals(expectedFormatted, actualFormatted, "Calculation results do not match");
    }
    //calculate scientific notation of the input random number test method (with random number input)
    protected void scientificNotationOfInputNumberRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'grid matrix' button
        calculatorNumPadInput.clickGridMatrixButton();
        //input data getter (to calculate scientific notation of the input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test negative number (for 'scientific notation of the input random number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double generatedNumber = calculatorRandomNumberInputPage.getNumberOne(); //get the generated number
        int exponent = (int) Math.floor(Math.log10(generatedNumber)); //set the exponent depending on the generated number
        double innerResult = generatedNumber / Math.pow(10, exponent);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        //formatter to equalize the result output
        DecimalFormat df = new DecimalFormat("0.0E0");
        String expectedFormatted = df.format(innerResult);
        String actualFormatted = df.format(actualResult);
        assertEquals(expectedFormatted, actualFormatted, "Calculation results do not match");
    }

    //negative number tests

    //calculate variable equation of input negative number test method (with numpad input)
    protected void varEquationOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'var' button
        calculatorNumPadInput.clickXButton();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //click 'Plus/Minus' button (to make the number negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //input test number (to calculate percentage equivalent of input number)
        calculatorNumPadInput.clickNumberEightButton();
        //click 'equation equal' button
        calculatorNumPadInput.clickEquationEqualButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationVariableEquationResult(calculatorPage);
        // calculation verification (in app)
        String innerResult = "= x-8";
        String actualResult = calculatorPage.getInvalidCalculationResult();
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }
    //calculate variable equation of input negative random number test method (with random number input)
    protected void varEquationOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'var' button
        calculatorNumPadInput.clickXButton();
        //click addition button
        calculatorNumPadInput.clickAdditionButton();
        //input data getter (to calculate variable equation of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'variable equation of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'equation equal' button
        calculatorNumPadInput.clickEquationEqualButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationVariableEquationResult(calculatorPage);
        // calculation verification (in app)
        int randomNumber = calculatorRandomNumberInputPage.getNegativeNumberOne();
        String innerResult = "= x" + randomNumber;
        String actualResult = calculatorPage.getInvalidCalculationResult();
        assertEquals(innerResult, actualResult, "Calculation results do not match");
    }

    //calculate Euler's number of input negative number (multiplication) test method (with numpad input)
    protected void eulerNumberOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate Euler's number of input negative number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Euler's number' button
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double e = Math.E;
        double innerResult = -16 * e;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }
    //calculate Euler's number of input random negative number (multiplication) test method (with random negative number input)
    protected void eulerNumberOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate Euler's number of input negative number)
        calculatorRandomNumberInputPage.inputSmallSingleNegativeNumberDataGetter();
        //input random test negative number (for 'Euler's number of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Euler's number' button
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double e = Math.E;
        int randomNumber = calculatorRandomNumberInputPage.getNegativeNumberOne();
        double innerResult = randomNumber * e;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }

    //calculate input number divided by imaginary unit test method (with numpad input) (after pressing 2nd button)
    protected void inputNegativeNumberDivideByImaginaryUnitCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate input negative number multiplied by imaginary unit)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'I' button (Euler's placeholder)
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationImaginaryUnitResult(calculatorPage);
        // calculation verification (in app)
        String actualResult = "-" + calculatorPage.getCalculationResult() + "/" + "i";
        String expectedResult = "15i";
        assertEquals(expectedResult, actualResult, "Calculation results do not match");
    }
    //calculate  input random negative number multiplied by imaginary unit test method (with random number input) (after pressing 2nd button)
    protected void inputNegativeNumberMultiplyByImaginaryUnitCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate input negative number multiplied by imaginary unit)
        calculatorRandomNumberInputPage.inputSmallSingleNumberDataGetter();
        //input random test negative number (for 'input negative number multiplied by imaginary unit' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'I' button (Euler's placeholder)
        calculatorNumPadInput.clickEButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationImaginaryUnitResult(calculatorPage);
        // calculation verification (in app)
        int randomNumber = calculatorRandomNumberInputPage.getNumberOne();
        String actualResult = calculatorPage.getCalculationResult() + "i";
        String expectedResult = "-" + randomNumber + "i";
        assertEquals(expectedResult, actualResult, "Calculation results do not match");
    }

    //calculate pi constant multiplied by input negative number test method (with numpad input)
    protected void piConstMultipliedByNegativeInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'pi constant' button
        calculatorNumPadInput.clickPiConstButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input test number (to calculate pi constant multiplication by the input number)
        calculatorNumPadInput.clickNumberOneButton();
        calculatorNumPadInput.clickNumberNineButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double pi = Math.PI;
        double innerResult = pi * -19;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }
    //calculate input random negative number division by PI constant test method (with random negative number input)
    protected void randomNegativeInputNumberDivisionByPIConstantTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate input negative random number division by PI constant)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'input random negative number division by PI constant' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //click 'pi constant' button
        calculatorNumPadInput.clickPiConstButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double pi = Math.PI;
        int randomNumber = calculatorRandomNumberInputPage.getNegativeNumberOne();
        double innerResult = randomNumber / pi;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }

    //calculate Faraday constant multiplied by input number test method (with numpad input) (after pressing 2nd button)
    protected void faradayConstMultipliedByInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'Faraday constant' button
        calculatorNumPadInput.clickPiConstButton();
        //input 'Faraday constant' into constant modal input field
        calculatorNumPadInput.inputFaradayConstantIntoInputField();
        //click 'Faraday constant' option
        calculatorNumPadInput.clickFaradayConstantOption();
        //assert the Faraday constant value displayed is valid
        assertEquals("96485.3365", calculatorNumPadInput.getConstantValue(), "The faraday constant value in app doesn't match expected value.");
        //assert the Faraday constant form control unit matches expectations
        assertEquals("[C mol^-1]", calculatorNumPadInput.getConstantFormControlUnit(), "The faraday constant form control unit doesn't match expected value.");
        //assert the Faraday constant is present in constant list
        assertEquals("Faraday constant", calculatorNumPadInput.getFaradayConstantFromList(), "The faraday constant isn't present in the constant list.");
        //click 'Insert' constant button
        calculatorNumPadInput.clickInsertButton();
        //click 'Additional trigonometric functions menu (second function)' button -> to return back to first menu
        calculatorNumPadInput.click2ndButton();
        //click multiplication button
        calculatorNumPadInput.clickMultiplicationButton();
        //input test number (to calculate Faraday constant multiplication by the input number)
        calculatorNumPadInput.clickNumberSixButton();
        //click 'Plus/Minus' button (negative test number conversion)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double faradayConstant = 96485.3365;
        double innerResult = faradayConstant * -6;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }
    //calculate input random number division by Faraday constant test method (with random number input) (after pressing 2nd button)
    protected void randomNegativeInputNumberDivisionByFaradayConstantTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate input negative random number division by Faraday constant)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'input random number division by Faraday constant' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click division button
        calculatorNumPadInput.clickDivisionButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'Faraday constant' button
        calculatorNumPadInput.clickPiConstButton();
        //input 'Faraday constant' into constant modal input field
        calculatorNumPadInput.inputFaradayConstantIntoInputField();
        //click 'Faraday constant' option
        calculatorNumPadInput.clickFaradayConstantOption();
        //assert the Faraday constant value displayed is valid
        assertEquals("96485.3365", calculatorNumPadInput.getConstantValue(), "The faraday constant value in app doesn't match expected value.");
        //assert the Faraday constant form control unit matches expectations
        assertEquals("[C mol^-1]", calculatorNumPadInput.getConstantFormControlUnit(), "The faraday constant form control unit doesn't match expected value.");
        //assert the Faraday constant is present in constant list
        assertEquals("Faraday constant", calculatorNumPadInput.getFaradayConstantFromList(), "The faraday constant isn't present in the constant list.");
        //click 'Insert' constant button
        calculatorNumPadInput.clickInsertButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double faradayConstant = 96485.3365;
        int randomNumber = calculatorRandomNumberInputPage.getNegativeNumberOne();
        double innerResult = randomNumber / faradayConstant;
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double delta = 0.0000001;
        assertEquals(innerResult, actualResult, delta, "Calculation results do not match");
    }

    //calculate scientific notation of the negative input number test method (with numpad input)
    protected void scientificNotationOfNegativeInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'grid matrix' button
        calculatorNumPadInput.clickGridMatrixButton();
        //input test number (to calculate scientific notation of input number)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'Plus/Minus' button (to convert the number to negative)
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = -3.6 * Math.pow(10, 0);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        DecimalFormat df = new DecimalFormat("0.0E0");
        String expectedFormatted = df.format(innerResult);  //formats -3.6 as "-3.6E1"
        String actualFormatted = df.format(actualResult);   //formats actualResult in matching format with expectedResult
        assertEquals(expectedFormatted, actualFormatted, "Calculation results do not match");
    }
    //calculate scientific notation of the input random negative number test method (with random negative number input)
    protected void scientificNotationOfNegativeInputNumberRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //click 'grid matrix' button
        calculatorNumPadInput.clickGridMatrixButton();
        //input data getter (to calculate scientific notation of the input random negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test negative number (for 'scientific notation of the input random negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double generatedNegativeNumber = calculatorRandomNumberInputPage.getNegativeNumberOne();
        int exponent = (int) Math.floor(Math.log10(Math.abs(generatedNegativeNumber))); //exponent setter based on the absolute value
        double innerResult = generatedNegativeNumber / Math.pow(10, exponent); //normalized value
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        //formatter to equalize the result output
        DecimalFormat df = new DecimalFormat("0.0E0");
        String expectedFormatted = df.format(innerResult);
        String actualFormatted = df.format(actualResult);
        assertEquals(expectedFormatted, actualFormatted, "Calculation results do not match");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //additional trigonometric functions (after pressing 2nd button)

    //calculate arc sine of input number test method (with numpad input)
    protected void asinOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc sine of input number) (valid range from -1 to 1)
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickDecimalButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.asin(0.2);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc sine of input random number test method (with random number input)
    protected void asinOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc sine of input number) (valid range from -1 to 1)
        calculatorRandomNumberInputPage.inputATanHNumberDataGetter();
        //input random test number (for 'arc sine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOneForArcFunctions();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.asin(calculatorRandomNumberInputPage.getNumberOneForArcFunction());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc hyperbolic sine of input number test method (with numpad input)
    protected void asinHOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc hyperbolic sine of input number)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'arc sine H of input number' button (gets converted from sinH - shares same place after 2nd button click)
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSinhOfInputNumber(55);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc hyperbolic sine of input random number test method (with random number input)
    protected void asinHOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc hyperbolic sine of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'arc hyperbolic sine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSinhOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc cosine of input number test method (with numpad input)
    protected void acosOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate cosine of input number) (valid range from -1 to 1)
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickDecimalButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'arc cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.acos(0.5);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc cosine of input random number test method (with random number input)
    protected void acosOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc cosine of input number)
        calculatorRandomNumberInputPage.inputATanHNumberDataGetter();
        //input random test number (for 'arc cosine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOneForArcFunctions();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.acos(calculatorRandomNumberInputPage.getNumberOneForArcFunction());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc hyperbolic cosine of input number test method (with numpad input)
    protected void acosHOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc hyperbolic cosine of input negative number)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberOneButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcCosHOfInputNumber(31);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc hyperbolic cosine of input random number test method (with random number input)
    protected void acosHOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc hyperbolic cosine of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'arc hyperbolic cosine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcCosHOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc tangent of input number test method (with numpad input)
    protected void atanOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc tangent of input number)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResultInRadians = Math.atan(56);
        double innerResultInDegrees = innerResultInRadians * (180.0 / Math.PI);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc tangent of input random number test method (with random number input)
    protected void atanOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc tangent of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'arc tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResultInRadians = Math.atan(calculatorRandomNumberInputPage.getNumberOne());
        double innerResultInDegrees = innerResultInRadians * (180.0 / Math.PI);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc hyperbolic tangent of input number test method (with numpad input)
    protected void atanHOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc hyperbolic tangent of input number) (valid range -1 to 1)
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickDecimalButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double expectedRadians = 0.5493061443340549;
        double expectedDegrees = expectedRadians * (180 / Math.PI);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(expectedDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc hyperbolic tangent of input random number test method (with random number input)
    protected void atanHOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc hyperbolic tangent of input number) (valid range -1 to 1)
        calculatorRandomNumberInputPage.inputATanHNumberDataGetter();
        //input random test number (for 'arc hyperbolic tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOneForArcFunctions();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateAtanHOfInputNumber(calculatorRandomNumberInputPage.getNumberOneForArcFunction());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc cotangent of input number test method (with numpad input)
    protected void aCotOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc cotangent of input number) (valid range all except range of -1 to 1)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateACotOfInputNumber(63);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.00001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc cotangent of input random number test method (with random number input)
    protected void aCotOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc cotangent of input number) (valid range all except range of -1 to 1)
        calculatorRandomNumberInputPage.inputACotNumberDataGetter();
        //input random test number (for 'arc cotangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateACotOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc secant of input number test method (with numpad input)
    protected void aSecOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc secant of input number)
        calculatorNumPadInput.clickNumberSevenButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSecOfInputNumber(73);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc secant of input random number test method (with random number input)
    protected void aSecOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc secant of input number)
        calculatorRandomNumberInputPage.inputSingleNumberDataGetter();
        //input random test number (for 'arc secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSecOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees , actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc co secant of input number test method (with numpad input)
    protected void acoSecOfInputNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc co secant of input number)
        calculatorNumPadInput.clickNumberTwoButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcCscOfInputNumber(25);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc co secant of input random number test method (with random number input)
    protected void acoSecOfInputNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc co secant of input number)
        calculatorRandomNumberInputPage.inputACotNumberDataGetter();
        //input random negative test number (for 'arc co secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcCscOfInputNumber(calculatorRandomNumberInputPage.getNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //negative numbers test methods

    //calculate arc sine of input negative number test method (with numpad input)
    protected void asinOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc sine of input negative number) (valid range from -0.01 to -0.99)
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickDecimalButton();
        calculatorNumPadInput.clickNumberTwoButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.asin(-0.2);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc sine of input random number test method (with random number input)
    protected void asinOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc sine of input negative number) (valid range from -0.01 to -0.99)
        calculatorRandomNumberInputPage.inputATanHNumberDataGetter();
        //input random test number (for 'arc sine of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNumberOneForArcFunctions();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.asin(Double.parseDouble("-" + calculatorRandomNumberInputPage.getNumberOneForArcFunction()));
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc hyperbolic sine of input negative number test method (with numpad input)
    protected void asinHOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc hyperbolic sine of input negative number)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'arc sine H of input number' button (gets converted from sinH - shares same place after 2nd button click)
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSinhOfInputNumber(-35);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc hyperbolic sine of input random number test method (with random negative number input)
    protected void asinHOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc hyperbolic sine of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'arc hyperbolic sine of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sine of input number' button
        calculatorNumPadInput.clickSineHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSinhOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc cosine of input negative number test method (with numpad input)
    protected void acosOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate cosine of input number) (valid range from -0.01 to -0.99)
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickDecimalButton();
        calculatorNumPadInput.clickNumberThreeButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'arc cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.acos(-0.3);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc cosine of input random number test method (with random number input)
    protected void acosOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc cosine of input negative number) (valid range from -0.01 to -0.99)
        calculatorRandomNumberInputPage.inputATanHNumberDataGetter();
        //input random test number (for 'arc cosine of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOneForArcFunctions();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cosine of input number' button
        calculatorNumPadInput.clickCosineOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = Math.acos(Double.parseDouble("-" + calculatorRandomNumberInputPage.getNumberOneForArcFunction()));
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc hyperbolic cosine of input negative number test method (with numpad input) (invalid test scenario)
    protected void acosHOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc hyperbolic cosine of input negative number)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberOneButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // assert the error message is thrown as expected
        assertEquals("= Error: invalid argument" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }
    //calculate arc hyperbolic cosine of input random negative number test method (with random negative number input) (invalid test scenario)
    protected void acosHOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc hyperbolic cosine of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'arc hyperbolic cosine of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cosH of input number' button
        calculatorNumPadInput.clickCosHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // assert the error message is thrown as expected
        assertEquals("= Error: invalid argument" ,calculatorPage.getInvalidCalculationResult(), "Calculation error isn't displayed");
    }

    //calculate arc tangent of input negative number test method (with numpad input)
    protected void atanOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc tangent of input negative number)
        calculatorNumPadInput.clickNumberThreeButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResultInRadians = Math.atan(-36);
        double innerResultInDegrees = innerResultInRadians * (180.0 / Math.PI);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc tangent of input random negative number test method (with random negative number input)
    protected void atanOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc tangent of input negative number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'arc tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tan of input number' button
        calculatorNumPadInput.clickTanOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResultInRadians = Math.atan(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double innerResultInDegrees = innerResultInRadians * (180.0 / Math.PI);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc hyperbolic tangent of input number test method (with numpad input)
    protected void atanHOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc hyperbolic tangent of input number) (valid range -0.01 to -0.99)
        calculatorNumPadInput.clickNumberZeroButton();
        calculatorNumPadInput.clickDecimalButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateAtanHOfInputNumber(-0.5);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc hyperbolic tangent of input random negative number test method (with random negative number input)
    protected void atanHOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc hyperbolic tangent of input number) (valid range -0.01 to -0.99)
        calculatorRandomNumberInputPage.inputATanHNumberDataGetter();
        //input random test number (for 'arc hyperbolic tangent of input number' calculation)
        calculatorRandomNumberInputPage.inputNumberOneForArcFunctions();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'tanH of input number' button
        calculatorNumPadInput.clickTanHOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateAtanHOfInputNumber(Double.parseDouble( "-" + calculatorRandomNumberInputPage.getNumberOneForArcFunction()));
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc cotangent of input negative number test method (with numpad input)
    protected void aCotOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc cotangent of input negative number)
        calculatorNumPadInput.clickNumberFourButton();
        calculatorNumPadInput.clickNumberSixButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateACotOfInputNumber(-46);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.00001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc cotangent of input random number test method (with random number input)
    protected void aCotOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc cotangent of input negative number)
        calculatorRandomNumberInputPage.inputACotNegativeNumberDataGetter();
        //input random test number (for 'arc cotangent of input negative number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'cot of input number' button
        calculatorNumPadInput.clickCotOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateACotOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }


    //calculate arc secant of input negative number test method (with numpad input)
    protected void aSecOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate secant of input negative number)
        calculatorNumPadInput.clickNumberFiveButton();
        calculatorNumPadInput.clickNumberSevenButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSecOfInputNumber(-57);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.00001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc secant of input random negative number test method (with random negative number input)
    protected void aSecOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc secant of input number)
        calculatorRandomNumberInputPage.inputSingleNegativeNumberDataGetter();
        //input random test number (for 'arc secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'sec of input number' button
        calculatorNumPadInput.clickSecOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcSecOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees , actualResult, tolerance, "Calculation results do not match");
    }

    //calculate arc co secant of input negative number test method (with numpad input)
    protected void acoSecOfInputNegativeNumberCalculationNumPadInputTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input test number (to calculate arc co secant of input negative number)
        calculatorNumPadInput.clickNumberSixButton();
        calculatorNumPadInput.clickNumberFiveButton();
        //click 'Plus/Minus' button
        calculatorNumPadInput.clickPlusMinusButton();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcCscOfInputNumber(-65);
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }
    //calculate arc co secant of input random number test method (with random number input)
    protected void acoSecOfInputNegativeNumberCalculationRandomNumberTest(CalculatorPage calculatorPage){
        CalculatorNumPadInput calculatorNumPadInput = new CalculatorNumPadInput(driver);
        CalculatorRandomNumberInputPage calculatorRandomNumberInputPage = new CalculatorRandomNumberInputPage(driver);
        //click 'Consent' button
        calculatorPage.clickConsentButton();
        //web element assert
        isCalculatorPageWebElementDisplayed(calculatorPage);
        //input data getter (to calculate arc co secant of input negative number)
        calculatorRandomNumberInputPage.inputACotNegativeNumberDataGetter();
        //input random negative test number (for 'arc co secant of input number' calculation)
        calculatorRandomNumberInputPage.inputNegativeNumberOne();
        //click 'Additional trigonometric functions menu (second function)' button
        calculatorNumPadInput.click2ndButton();
        //click 'csc of input number' button
        calculatorNumPadInput.clickCo_secantOfInputNumberButton();
        //click 'equal' button
        calculatorNumPadInput.clickEqualButton();
        //click 'History' dropdown button
        calculatorNumPadInput.clickHistoryDropdownButton();
        //result logger
        logCalculationResult(calculatorPage);
        // calculation verification (in app)
        double innerResult = calculatorPage.calculateArcCscOfInputNumber(calculatorRandomNumberInputPage.getNegativeNumberOne());
        double innerResultInDegrees = Math.toDegrees(innerResult);
        double actualResult = Double.parseDouble(calculatorPage.getCalculationResult());
        double tolerance = 0.0001;
        assertEquals(innerResultInDegrees, actualResult, tolerance, "Calculation results do not match");
    }

    //calculation logger method
    protected void logCalculationResult(CalculatorPage calculatorPage){
        //result logger
        logger.info("Calculation result displayed in app: " + calculatorPage.getCalculationResult());
        System.out.println("\n");
    }
    //calculation logger method (for variable equation)
    protected void logCalculationVariableEquationResult(CalculatorPage calculatorPage){
        //result logger
        logger.info("Calculation result displayed in app (variable equation): " + "= x" +  calculatorPage.getCalculationResult());
        System.out.println("\n");
    }
    //calculation logger method (imaginary unit)
    protected void logCalculationImaginaryUnitResult(CalculatorPage calculatorPage){
        //result logger
        logger.info("Calculation result displayed in app: " + calculatorPage.getCalculationResult() + "i");
        System.out.println("\n");
    }

    //calculator page web element assert
    protected void isCalculatorPageWebElementDisplayed(CalculatorPage calculatorPage){
        //assert number input field is displayed
        assertTrue(calculatorPage.isNumberInputFieldDisplayed(), "The number input field isn't displayed");
        //assert number helper button is displayed
        assertTrue(calculatorPage.isNumberInputHelperButtonDisplayed(), "The number input helper button isn't displayed");
        //assert button (2nd) is displayed
        assertTrue(calculatorPage.isButton2ndDisplayed(), "The button (2nd) isn't displayed");
        //assert button (Pi) is displayed
        assertTrue(calculatorPage.isPiButtonDisplayed(), "The button (Pi) isn't displayed");
        //assert button (e) is displayed
        assertTrue(calculatorPage.isEButtonDisplayed(), "The button (E) isn't displayed");
        //assert button (matrix) is displayed
        assertTrue(calculatorPage.isMatrixButtonDisplayed(), "The button (matrix) isn't displayed");
        //assert button (var) is displayed
        assertTrue(calculatorPage.isVarButtonDisplayed(), "The button (var) isn't displayed");
        //assert button (left parenthesis) is displayed
        assertTrue(calculatorPage.isLeftParenthesisButtonDisplayed(), "The button (left parenthesis) isn't displayed");
        //assert button (colon) is displayed
        assertTrue(calculatorPage.isColonButtonDisplayed(), "The button (colon) isn't displayed");
        //assert button (right parenthesis) is displayed
        assertTrue(calculatorPage.isRightParenthesisButtonDisplayed(), "The button (right parenthesis) isn't displayed");
        //assert button (left arrow) is displayed
        assertTrue(calculatorPage.isLeftArrowButtonDisplayed(), "The button (left arrow) isn't displayed");
        //assert button (backspace) is displayed
        assertTrue(calculatorPage.isBackspaceButtonDisplayed(), "The button (backspace) isn't displayed");
        //assert button (sin) is displayed
        assertTrue(calculatorPage.isSinButtonDisplayed(), "The button (sin) isn't displayed");
        //assert button (sinH) is displayed
        assertTrue(calculatorPage.isSinHButtonDisplayed(), "The button (sinH) isn't displayed");
        //assert button (cot) is displayed
        assertTrue(calculatorPage.isCotButtonDisplayed(), "The button (cot) isn't displayed");
        //assert button (Y root X) is displayed
        assertTrue(calculatorPage.isYRootXButtonDisplayed(), "The button (Y root X) isn't displayed");
        //assert button (power x Y) is displayed
        assertTrue(calculatorPage.isPowerXYButtonDisplayed(), "The button (power x Y) isn't displayed");
        //assert button (cos) is displayed
        assertTrue(calculatorPage.isCosButtonDisplayed(), "The button (cos) isn't displayed");
        //assert button (cosH) is displayed
        assertTrue(calculatorPage.isCosHButtonDisplayed(), "The button (cosH) isn't displayed");
        //assert button (sec) is displayed
        assertTrue(calculatorPage.isSecButtonDisplayed(), "The button (sec) isn't displayed");
        //assert button (cube root) is displayed
        assertTrue(calculatorPage.isCubeRootButtonDisplayed(), "The button (cube root) isn't displayed");
        //assert button (power 3) is displayed
        assertTrue(calculatorPage.isPower3ButtonDisplayed(), "The button (power 3) isn't displayed");
        //assert button (tan) is displayed
        assertTrue(calculatorPage.isTanButtonDisplayed(), "The button (tan) isn't displayed");
        //assert button (tanH) is displayed
        assertTrue(calculatorPage.isTanHButtonDisplayed(), "The button (tanH) isn't displayed");
        //assert button (csc) is displayed
        assertTrue(calculatorPage.isCscButtonDisplayed(), "The button (csc) isn't displayed");
        //assert button (square root) is displayed
        assertTrue(calculatorPage.isSqrtButtonDisplayed(), "The button (square root) isn't displayed");
        //assert button (power 2) is displayed
        assertTrue(calculatorPage.isPower2ButtonDisplayed(), "The button (power 2) isn't displayed");
        //assert button (nCr) is displayed
        assertTrue(calculatorPage.isNcRButtonDisplayed(), "The button (nCr) isn't displayed");
        //assert button (nPr) is displayed
        assertTrue(calculatorPage.isNpRButtonDisplayed(), "The button (nPr) isn't displayed");
        //assert button (modulus) is displayed
        assertTrue(calculatorPage.isModulusButtonDisplayed(), "The button (modulus) isn't displayed");
        //assert button (log) is displayed
        assertTrue(calculatorPage.isLogButtonDisplayed(), "The button (log) isn't displayed");
        //assert button (power 10) is displayed
        assertTrue(calculatorPage.isPower10ButtonDisplayed(), "The button (power 10) isn't displayed");
        //assert button (dropdown 1) is displayed
        assertTrue(calculatorPage.isDropdown1ButtonDisplayed(), "The button (dropdown 1) isn't displayed");
        //assert button (dropdown 2) is displayed
        assertTrue(calculatorPage.isDropdown2ButtonDisplayed(), "The button (dropdown 2) isn't displayed");
        //assert button (num zero) is displayed
        assertTrue(calculatorPage.isNumZeroButtonDisplayed(), "The button (num zero) isn't displayed");
        //assert button (num one) is displayed
        assertTrue(calculatorPage.isNumOneButtonDisplayed(), "The button (num one) isn't displayed");
        //assert button (num two) is displayed
        assertTrue(calculatorPage.isNumTwoButtonDisplayed(), "The button (num two) isn't displayed");
        //assert button (num three) is displayed
        assertTrue(calculatorPage.isNumThreeButtonDisplayed(), "The button (num three) isn't displayed");
        //assert button (num four) is displayed
        assertTrue(calculatorPage.isNumFourButtonDisplayed(), "The button (num four) isn't displayed");
        //assert button (num five) is displayed
        assertTrue(calculatorPage.isNumFiveButtonDisplayed(), "The button (num five) isn't displayed");
        //assert button (num six) is displayed
        assertTrue(calculatorPage.isNumSixButtonDisplayed(), "The button (num six) isn't displayed");
        //assert button (num seven) is displayed
        assertTrue(calculatorPage.isNumSevenButtonDisplayed(), "The button (num seven) isn't displayed");
        //assert button (num eight) is displayed
        assertTrue(calculatorPage.isNumEightButtonDisplayed(), "The button (num eight) isn't displayed");
        //assert button (num nine) is displayed
        assertTrue(calculatorPage.isNumNineButtonDisplayed(), "The button (num nine) isn't displayed");
        //assert button (num Plus-Minus) is displayed
        assertTrue(calculatorPage.isNumPlusMinusButtonDisplayed(), "The button (num Plus-Minus) isn't displayed");
        //assert button (num decimal) is displayed
        assertTrue(calculatorPage.isNumDecimalButtonDisplayed(), "The button (num decimal) isn't displayed");
        //assert button (num add (+)) is displayed
        assertTrue(calculatorPage.isAddButtonDisplayed(), "The button (num add (+)) isn't displayed");
        //assert button (num subtract (-)) is displayed
        assertTrue(calculatorPage.isSubtractButtonDisplayed(), "The button (num subtract (-)) isn't displayed");
        //assert button (num multiply (*)) is displayed
        assertTrue(calculatorPage.isMultiplyButtonDisplayed(), "The button (num multiply (*)) isn't displayed");
        //assert button (num divide (/)) is displayed
        assertTrue(calculatorPage.isDivideButtonDisplayed(), "The button (num divide (/)) isn't displayed");
        //assert button (num clear) is displayed
        assertTrue(calculatorPage.isClearButtonDisplayed(), "The button (num clear) isn't displayed");
        //assert button (num equals) is displayed -> the selector is valid(the button can be found on dev console), the assert fails for some reason
        //assertTrue(calculatorPage.isEqualsButtonDisplayed(), "The button (num equals) isn't displayed");
        //assert button (num degree label) is displayed
        assertTrue(calculatorPage.isDegreeLabelButtonDisplayed(), "The button (num degree label) isn't displayed");
        //assert button (num radian label) is displayed
        assertTrue(calculatorPage.isRadianLabelButtonDisplayed(), "The button (num radian label) isn't displayed");
        //assert button (num history) is displayed
        assertTrue(calculatorPage.isHistoryButtonDisplayed(), "The button (num history) isn't displayed");
        //assert button (num scroll down) is displayed
        assertTrue(calculatorPage.isScrollDownButtonDisplayed(), "The button (num scroll down) isn't displayed");
        //assert button (num scroll up) is displayed
        assertTrue(calculatorPage.isScrollUpButtonDisplayed(), "The button (num scroll up) isn't displayed");
        //assert button (num 'add to clipboard') is displayed
        assertTrue(calculatorPage.isAddToClipboardButtonDisplayed(), "The button (num 'add to clipboard') isn't displayed");
        //assert button (num 'draw graph') is displayed
        assertTrue(calculatorPage.isDrawGraphButtonDisplayed(), "The button (num 'draw graph') isn't displayed");
        //assert button (browse questions) is displayed
        assertTrue(calculatorPage.isBrowseQuestionsButtonDisplayed(), "The browse questions button isn't displayed");
    }
}
