package com.calculator.scientific.web;

import org.junit.jupiter.api.*;

public class CalculatorPageAdvancedArithmeticTest extends TestMethods{

    //Test 010 -> find logarithm (to base 10) of a set number test (with numpad input)
    @Test
    @DisplayName("Find Logarithm of Number to Base 10 Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithmic_To_Base_10_Test")
    void log10NumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithmic test (with numpad input)
        logarithmic10CalculationNumPadInputTest(calculatorPage);
    }

    //Test 010a -> find logarithm (to base 10) of a set number test (with random number)
    @Test
    @DisplayName("Find Logarithm of Number to Base 10 Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithmic_To_Base_10_Test")
    void log10NumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithmic test (with random number input)
        logarithmic10CalculationRandomNumberTest(calculatorPage);
    }

    //Test 011 -> raise ten to the power of input number test (with numpad input)
    @Test
    @DisplayName("Raise Ten to the Power of Input Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Ten_To_Power_Of_Number_Test")
    void raiseTenToPowerOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise 10 to the power of input number test (with numpad input)
        tenToPowerOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 011a -> raise ten to the power of input number test (with random number)
    @Test
    @DisplayName("Raise Ten to the Power of Input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Ten_To_Power_Of_Number_Test")
    void raiseTenToPowerOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise 10 to the power of input number test (with random number input)
        raiseTenToPowerOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 012 -> raise input number to the power of two test (with numpad input)
    @Test
    @DisplayName("Raise input Number to the Power of Two Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Two_Test")
    void raiseInputNumberToPowerOfTwoWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input number to the power of two test (with numpad input)
        raiseInputNumberToPowerOfTwoCalculationNumPadInputTest(calculatorPage);
    }

    //Test 012a -> raise input number to the power of two test (with random number)
    @Test
    @DisplayName("Raise input Number to the Power of Two Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Two_Test")
    void raiseInputNumberToPowerOfTwoWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input number to the power of two test (with random number input)
        raiseInputNumberToPowerOfTwoCalculationRandomNumberTest(calculatorPage);
    }

    //Test 013 -> calculate square root of input number test (with numpad input)
    @Test
    @DisplayName("Calculate Square Root of Input Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Square_Root_Of_Input_Number_Test")
    void squareRootOfInputNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate square root of input number test (with numpad input)
        sqrtOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 013a -> calculate square root of input number test (with random number)
    @Test
    @DisplayName("Calculate Square Root of Input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Square_Root_Of_Input_Number_Test")
    void squareRootOfInputNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate square root of input number test (with random number input)
        sqrtOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 014 -> calculate cube root of input number test (with numpad input)
    @Test
    @DisplayName("Calculate Cube Root of Input Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Cube_Root_Of_Input_Number_Test")
    void cubeRootOfInputNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cube root of input number test (with numpad input)
        cubeRootOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 014a -> calculate cube root of input number test (with random number)
    @Test
    @DisplayName("Calculate Cube Root of Input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Cube_Root_Of_Input_Number_Test")
    void cubeRootOfInputNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate square root of input number test (with random number input)
        cubeOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 015 -> raise input number to the power of three test (with numpad input)
    @Test
    @DisplayName("Raise input Number to the Power of Three Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Three_Test")
    void raiseInputNumberToPowerOfThreeWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input number to the power of three test (with numpad input)
        raiseInputNumberToPowerOfThreeCalculationNumPadInputTest(calculatorPage);
    }

    //Test 015a -> raise input number to the power of three test (with random number)
    @Test
    @DisplayName("Raise input Number to the Power of Three Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Three_Test")
    void raiseInputNumberToPowerOfThreeWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input number to the power of three test (with random number input)
        raiseInputNumberToPowerOfThreeCalculationRandomNumberTest(calculatorPage);
    }

    //Test 016 -> calculate y-th root of input number test (with numpad input)
    @Test
    @DisplayName("Calculate y-th Root of input Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Y_Th_Root_Of_Input_Number_Test")
    void yThRootOfInputNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate y-th root of input number test (with numpad input)
        yThRootOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 016a -> calculate y-th root of input number test (with random number)
    @Test
    @DisplayName("Calculate y-th Root of input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Y_Th_Root_Of_Input_Number_Test")
    void yThRootOfInputNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate y-th root of input number test (with random number input)
        yThRootOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 017 -> raise input number to the power of Y test (with numpad input)
    @Test
    @DisplayName("Raise input Number to Power of Y Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Y_Test")
    void raiseInputNumberToPowerOfYWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input number to the power of Y test (with numpad input)
        raiseInputNumberToPowerOfYCalculationNumPadInputTest(calculatorPage);
    }

    //Test 017a -> raise input number to the power of Y test (with random number)
    @Test
    @DisplayName("Raise input Number to Power of Y Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Y_Test")
    void raiseInputNumberToPowerOfYWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input number to the power of Y test (with random number input)
        raiseInputNumberToPowerOfYCalculationRandomNumberTest(calculatorPage);
    }

    //Test 018 -> calculate logarithm input number to base e test (with numpad input)
    @Test
    @DisplayName("Calculate Logarithm of input Number to Base E Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_E_Test")
    void logarithmOfInputNumberToBaseEWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate logarithm input number to base e test (with numpad input)
        logOfInputNumberToBaseECalculationNumPadInputTest(calculatorPage);
    }

    //Test 018a -> calculate logarithm input number to base e test (with random number)
    @Test
    @DisplayName("Calculate Logarithm of input Number to Base E Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_E_Test")
    void logarithmOfInputNumberToBaseEWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate logarithm input number to base e test (with random number input)
        logOfInputNumberToBaseECalculationRandomNumberTest(calculatorPage);
    }

    //Test 019 -> exponential function of the input number test (with numpad input)
    @Test
    @DisplayName("Exponential Function of the input Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Exp_Function_Of_Input_Number_Test")
    void expFunctionOfInputNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //exponential function of the input number test (with numpad input)
        expFunctionOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 019a -> exponential function of the input number test (with random number)
    @Test
    @DisplayName("Exponential Function of the input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Exp_Function_Of_Input_Number_Test")
    void expFunctionOfInputNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //exponential function of the input number test (with random number input)
        expFunctionOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 020 -> calculate logarithm of the input number to base two test (with numpad input)
    @Test
    @DisplayName("Logarithm of the input Number to Base 2 Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_Two_Test")
    void logOfInputNumberToBaseTwoWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithm of the input number to base two test (with numpad input)
        logOfInputNumberToBaseTwoCalculationNumPadInputTest(calculatorPage);
    }

    //Test 020a -> calculate logarithm input number to base e test (with random number)
    @Test
    @DisplayName("Logarithm of the input Number to Base 2 Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_Two_Test")
    void logOfInputNumberToBaseTwoWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithm of the input number to base two test (with random number input)
        logOfInputNumberToBaseTwoCalculationRandomNumberTest(calculatorPage);
    }

    //Test 021 -> two to the power of the input number test (with numpad input)
    @Test
    @DisplayName("Two to the Power of the input Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Two_To_Power_Of_Input_Number_Test")
    void twoToPowerOfInputNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //two to the power of the input number test (with numpad input)
        twoToPowerOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 021a -> two to the power of the input number test (with random number)
    @Test
    @DisplayName("Two to the Power of the input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Two_To_Power_Of_Input_Number_Test")
    void twoToPowerOfInputNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //two to the power of the input number test (with random number input)
        twoToPowerOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //negative number input tests

    //Test 022 -> find logarithm (to base 10) of a set negative number test (with numpad input) (invalid test scenario)
    @Test
    @DisplayName("Find Logarithm of Negative Number to Base 10 Invalid Test (with NumPad input)")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Logarithmic_To_Base_10_Test")
    @Tag("Negative_Number_Input")
    void log10NegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithmic negative number invalid test (with numpad input)
        logarithmic10NegativeNumCalculationNumPadInputTest(calculatorPage);
    }

    //Test 022a -> find logarithm (to base 10) of a set negative number test (with random number) (invalid test scenario)
    @Test
    @DisplayName("Find Logarithm of Negative Number to Base 10 Invalid Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Logarithmic_To_Base_10_Test")
    @Tag("Negative_Number_Input")
    void log10NegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithmic negative number invalid test (with random negative number input)
        logarithmic10NegativeNumCalculationRandomNumberTest(calculatorPage);
    }

    //Test 023 -> raise ten to the power of input negative number test (with numpad input)
    @Test
    @DisplayName("Raise Ten to the Power of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Ten_To_Power_Of_Number_Test")
    @Tag("Negative_Number_Input")
    void raiseTenToPowerOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise 10 to the power of input negative number test (with numpad input)
        tenToPowerOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 023a -> raise ten to the power of input negative number test (with random number)
    @Test
    @DisplayName("Raise Ten to the Power of Input Negative Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Ten_To_Power_Of_Number_Test")
    @Tag("Negative_Number_Input")
    void raiseTenToPowerOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise 10 to the power of input negative number test (with random number input)
        raiseTenToPowerOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 024 -> raise input negative number to the power of two test (with numpad input)
    @Test
    @DisplayName("Raise input Negative Number to the Power of Two Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Two_Test")
    @Tag("Negative_Number_Input")
    void raiseInputNegativeNumberToPowerOfTwoWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input negative number to the power of two test (with numpad input)
        raiseInputNegativeNumberToPowerOfTwoCalculationNumPadInputTest(calculatorPage);
    }

    //Test 024a -> raise input negative number to the power of two test (with random number)
    @Test
    @DisplayName("Raise input Negative Number to the Power of Two Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Two_Test")
    @Tag("Negative_Number_Input")
    void raiseInputNegativeNumberToPowerOfTwoWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input negative number to the power of two test (with random number input)
        raiseInputNegativeNumberToPowerOfTwoCalculationRandomNumberTest(calculatorPage);
    }

    //Test 025 -> calculate square root of input negative number test (with numpad input) (imaginary-complex number)
    @Test
    @DisplayName("Calculate Square Root of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Square_Root_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void squareRootOfInputNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate square root of input negative number test (with numpad input)
        sqrtOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 025a -> calculate square root of input negative number test (with random negative number) (imaginary-complex number)
    @Test
    @DisplayName("Calculate Square Root of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Square_Root_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void squareRootOfInputNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate square root of input negative number test (with random negative number input)
        sqrtOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 026 -> calculate cube root of input negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Cube Root of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Cube_Root_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void cubeRootOfInputNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cube root of input negative number test (with numpad input)
        cubeRootOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 026a -> calculate cube root of input negative number test (with random negative number)
    @Test
    @DisplayName("Calculate Cube Root of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Cube_Root_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void cubeRootOfInputNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate square root of input negative number test (with random negative number input)
        cubeOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 027 -> raise input negative number to the power of three test (with numpad input)
    @Test
    @DisplayName("Raise input negative Number to the Power of Three Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Three_Test")
    @Tag("Negative_Number_Input")
    void raiseInputNegativeNumberToPowerOfThreeWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input negative number to the power of three test (with numpad input)
        raiseInputNegativeNumberToPowerOfThreeCalculationNumPadInputTest(calculatorPage);
    }

    //Test 027a -> raise input negative number to the power of three test (with random number)
    @Test
    @DisplayName("Raise input negative Number to the Power of Three Test (Random negative number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Three_Test")
    @Tag("Negative_Number_Input")
    void raiseInputNegativeNumberToPowerOfThreeWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input negative number to the power of three test (with random negative number input)
        raiseInputNegativeNumberToPowerOfThreeCalculationRandomNumberTest(calculatorPage);
    }

    //Test 028 -> calculate y-th root of input negative number test (with numpad input) (invalid operation  -> y = 4)
    @Test
    @DisplayName("Calculate y-th (4th) Root of input Negative Number Test (with NumPad input)")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Y_Th_Root_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void yThRootOfInputNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate y-th root of input negative number test (with numpad input) (invalid input)
        yThRootOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 028a -> calculate y-th root of input negative number test (with random negative number) (invalid operation  -> y = 4)
    @Test
    @DisplayName("Calculate y-th (4th) Root of input negative Number Test (Random negative number input)")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Y_Th_Root_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void yThRootOfInputNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate y-th root of input negative number test (with random negative number input) (invalid input -> y = 4)
        yThRootOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 029 -> raise input negative number to the power of Y test (with numpad input)
    @Test
    @DisplayName("Raise input negative Number to Power of Y Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Y_Test")
    @Tag("Negative_Number_Input")
    void raiseInputNegativeNumberToPowerOfYWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input negative number to the power of Y test (with numpad input)
        raiseInputNegativeNumberToPowerOfYCalculationNumPadInputTest(calculatorPage);
    }

    //Test 029a -> raise input negative number to the power of Y test (with random number)
    @Test
    @DisplayName("Raise input negative Number to Power of Y Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Raise_Input_Number_To_Power_Of_Y_Test")
    @Tag("Negative_Number_Input")
    void raiseInputNegativeNumberToPowerOfYWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //raise input negative number to the power of Y test (with random negative number input)
        raiseInputNegativeNumberToPowerOfYCalculationRandomNumberTest(calculatorPage);
    }

    //Test 030 -> calculate logarithm input negative number to base e test (with numpad input) (invalid operation)
    @Test
    @DisplayName("Calculate Logarithm of input negative Number to Base E Test (with NumPad input) - Invalid operation")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_E_Test")
    @Tag("Negative_Number_Input")
    void logarithmOfInputNegativeNumberToBaseEWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate logarithm input negative number to base e test (with numpad input) (invalid operation)
        logOfInputNegativeNumberToBaseECalculationNumPadInputTest(calculatorPage);
    }

    //Test 030a -> calculate logarithm input negative number to base e test (with random number) (invalid operation)
    @Test
    @DisplayName("Calculate Logarithm of input negative Number to Base E Test (Random number input) - Invalid operation")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_E_Test")
    @Tag("Negative_Number_Input")
    void logarithmOfInputNegativeNumberToBaseEWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate logarithm input negative number to base e test (with random number input) (invalid operation)
        logOfInputNegativeNumberToBaseECalculationRandomNumberTest(calculatorPage);
    }

    //Test 031 -> exponential function of the input negative number test (with numpad input)
    @Test
    @DisplayName("Exponential Function of the input negative Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Exp_Function_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void expFunctionOfInputNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //exponential function of the input negative number test (with numpad input)
        expFunctionOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 031a -> exponential function of the input negative number test (with random negative number)
    @Test
    @DisplayName("Exponential Function of the input Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Exp_Function_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void expFunctionOfInputNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //exponential function of the input negative number test (with random negative number input)
        expFunctionOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 032 -> calculate logarithm of the input negative number to base two test (with numpad input) (invalid operation)
    @Test
    @DisplayName("Logarithm of the input negative Number to Base 2 Test (with NumPad input) - Invalid Operation")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_Two_Test")
    @Tag("Negative_Number_Input")
    void logOfInputNegativeNumberToBaseTwoWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithm of the input negative number to base two test (with numpad input) (invalid operation)
        logOfInputNegativeNumberToBaseTwoCalculationNumPadInputTest(calculatorPage);
    }

    //Test 032a -> calculate logarithm input number to base e test (with random negative number) (invalid operation)
    @Test
    @DisplayName("Logarithm of the input negative Number to Base 2 Test (Random negative number input) - Invalid Operation")
    @Tag("Invalid_Advanced_Arithmetic_Test")
    @Tag("Logarithm_Of_Input_Number_To_Base_Two_Test")
    @Tag("Negative_Number_Input")
    void logOfInputNegativeNumberToBaseTwoWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //logarithm of the input negative number to base two test (with random negative number input) (invalid operation)
        logOfInputNegativeNumberToBaseTwoCalculationRandomNumberTest(calculatorPage);
    }

    //Test 033 -> two to the power of the input negative number test (with numpad input)
    @Test
    @DisplayName("Two to the Power of the input negative Number Test (with NumPad input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Two_To_Power_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void twoToPowerOfInputNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //two to the power of the input negative number test (with numpad input)
        twoToPowerOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 033a -> two to the power of the input negative number test (with random number)
    @Test
    @DisplayName("Two to the Power of the input negative Number Test (Random number input)")
    @Tag("Valid_Advanced_Arithmetic_Test")
    @Tag("Two_To_Power_Of_Input_Number_Test")
    @Tag("Negative_Number_Input")
    void twoToPowerOfInputNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //two to the power of the input negative number test (with random number input)
        twoToPowerOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

}
