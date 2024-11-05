package com.calculator.scientific.web;

import org.junit.jupiter.api.*;

public class CalculatorPageSimpleArithmeticTest extends TestMethods{

    //Test 001 -> valid addition test with number input on numpad
    @Test
    @DisplayName("Number Addition Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Addition_Test")
    void numberAdditionCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //addition test
        numAdditionWithNumPadInputTest(calculatorPage);
    }

    //Test 001a -> valid addition test with random number input
    @Test
    @DisplayName("Number Addition Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Addition_Random_Numbers_Test")
    void numberAdditionCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //addition test
        numAdditionWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 002 -> valid subtraction test with number input on numpad
    @Test
    @DisplayName("Number Subtraction Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Subtraction_Test")
    void numberSubtractionCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //subtraction test
        numSubtractionWithNumPadInputTest(calculatorPage);
    }

    //Test 002a -> valid subtraction test with random number input
    @Test
    @DisplayName("Number Subtraction Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Subtraction_Random_Numbers_Test")
    void numberSubtractionCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //subtraction test
        numSubtractionWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 003 -> valid multiplication test with number input on numpad
    @Test
    @DisplayName("Number Multiplication Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Multiplication_Test")
    void numberMultiplicationCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //multiplication test
        numMultiplicationWithNumPadInputTest(calculatorPage);
    }

    //Test 003a -> valid multiplication test with random number input
    @Test
    @DisplayName("Number Subtraction Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Multiplication_Random_Numbers_Test")
    void numberMultiplicationCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //multiplication test
        numMultiplicationWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 004 -> valid division test with number input on numpad
    @Test
    @DisplayName("Number Division Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Division_Test")
    void numberDivisionCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //division test
        numDivisionWithNumPadInputTest(calculatorPage);
    }

    //Test 004a -> valid division test with random number input
    @Test
    @DisplayName("Number Division Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Division_Random_Numbers_Test")
    void numberDivisionCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //division test
        numDivisionWithRandomNumbersInputTest(calculatorPage);
    }

    //negative number test scenarios (add, subtract, multiply, divide)

    //Test 005 -> valid negative number addition test with number input on numpad
    @Test
    @DisplayName("Negative Number Addition Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Addition_Test")
    void negativeNumberAdditionCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //addition test (with negative numbers)
        negativeNumAdditionWithNumPadInputTest(calculatorPage);
    }

    //Test 005a -> valid negative number addition test with random number input
    @Test
    @DisplayName("Negative Number Addition Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Addition_Random_Numbers_Test")
    void negativeNumAdditionCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //addition test (with negative numbers)
        negativeNumAdditionWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 006 -> valid negative number subtraction test with number input on numpad
    @Test
    @DisplayName("Negative Number Subtraction Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Subtraction_Test")
    void negativeNumSubtractionCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //subtraction test (with number one as negative number)
        negativeNumSubtractionWithNumPadInputTest(calculatorPage);
    }

    //Test 006a -> valid negative number subtraction test with random number input
    @Test
    @DisplayName("Negative Number Subtraction Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Subtraction_Random_Numbers_Test")
    void negativeNumSubtractionCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //subtraction test (with negative number)
        negativeNumSubtractionWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 007 -> valid negative number multiplication test with number input on numpad
    @Test
    @DisplayName("Negative Number Multiplication Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Multiplication_Test")
    void negativeNumMultiplicationCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //multiplication test (with negative numbers)
        negativeNumMultiplicationWithNumPadInputTest(calculatorPage);
    }

    //Test 007a -> valid negative number multiplication test with random number input
    @Test
    @DisplayName("Negative Number Subtraction Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Multiplication_Random_Numbers_Test")
    void negativeNumMultiplicationCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //multiplication test (with negative numbers)
        negativeNumMultiplicationWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 008 -> valid negative number division test with number input on numpad
    @Test
    @DisplayName("Negative Number Division Test With NumPad Button Input")
    @Tag("Valid_Calculation_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Division_Test")
    void negativeNumDivisionCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //division test (with negative numbers)
        negativeNumDivisionWithNumPadInputTest(calculatorPage);
    }

    //Test 008a -> valid negative number division test with random number input
    @Test
    @DisplayName("Negative Number Division Test With Random Number Input")
    @Tag("Valid_Calculation_Random_Numbers_Test")
    @Tag("Valid_Negative_Number_Calculation_Test")
    @Tag("Division_Random_Numbers_Test")
    void negativeNumDivisionCalcWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //division test (with negative numbers)
        negativeNumDivisionWithRandomNumbersInputTest(calculatorPage);
    }

    //Test 009 -> invalid division test (by zero) with number input on numpad
    @Test
    @DisplayName("Number Division Test With NumPad Button Input")
    @Tag("Invalid_Calculation_Test")
    @Tag("Division_By_Zero_Test")
    void numberDivisionByZeroCalcWithButtonInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //division test
        numberDivisionByZeroWithNumPadInputTest(calculatorPage);
    }
}
