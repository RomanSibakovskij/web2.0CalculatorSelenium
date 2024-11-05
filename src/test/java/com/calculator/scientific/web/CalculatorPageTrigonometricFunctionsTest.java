package com.calculator.scientific.web;

import org.junit.jupiter.api.*;

public class CalculatorPageTrigonometricFunctionsTest extends TestMethods{

    //Test 034 -> calculate sine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Sine of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_Of_Input_Number_Test")
    void sinOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate sine of a set number test (with numpad input)
        sinOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 034a -> calculate sine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Sine of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_Of_Input_Number_Test")
    void sinOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate sine of a random generated number test (with random generated number input)
        sinOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 035 -> calculate hyperbolic sine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Hyperbolic Sine of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_H_Of_Input_Number_Test")
    void sinHOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic sine of a set number test (with numpad input)
        sinHOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 035a -> calculate hyperbolic sine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Hyperbolic Sine of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_H_Of_Input_Number_Test")
    void sinHOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic sine of a random generated number test (with random generated number input)
        sinHOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 036 -> calculate cosine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Cosine of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_Of_Input_Number_Test")
    void cosOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cosine of a set number test (with numpad input)
        cosOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 036a -> calculate cosine e of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Cosine of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_Of_Input_Number_Test")
    void cosOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cosine of a random generated number test (with random generated number input)
        cosOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 037 -> calculate hyperbolic cosine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Hyperbolic Cosine of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_H_Of_Input_Number_Test")
    void cosHOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic cosine of a set number test (with numpad input)
        cosHOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 037a -> calculate hyperbolic cosine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Hyperbolic Cosine of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_H_Of_Input_Number_Test")
    void cosHOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic cosine of a random generated number test (with random generated number input)
        cosHOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 038 -> calculate tangent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Tangent of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_Of_Input_Number_Test")
    void tanOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a set number test (with numpad input)
        tanOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 038a -> calculate tangent of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Tangent of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_Of_Input_Number_Test")
    void tanOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a random generated number test (with random generated number input)
        tanOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 039 -> calculate hyperbolic tangent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Hyperbolic Tangent of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_H_Of_Input_Number_Test")
    void tanHOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic tangent of a set number test (with numpad input)
        tanHOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 039a -> calculate hyperbolic tangent of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Hyperbolic Tangent of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_H_Of_Input_Number_Test")
    void tanHOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic tangent of a random generated number test (with random generated number input)
        tanHOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 040 -> calculate cotangent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Cotangent of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cotangent_Of_Input_Number_Test")
    void cotOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cotangent of a set number test (with numpad input)
        cotOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 040a -> calculate cotangent of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Cotangent of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cotangent_Of_Input_Number_Test")
    void cotOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cotangent of a random generated number test (with random generated number input)
        cotOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 041 -> calculate secant of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Secant of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Secant_Of_Input_Number_Test")
    void secOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate secant of a set number test (with numpad input)
        secOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 041a -> calculate secant of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Secant of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Secant_Of_Input_Number_Test")
    void secOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate secant of a random generated number test (with random generated number input)
        secOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 042 -> calculate co secant of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Co secant of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Co_secant_Of_Input_Number_Test")
    void coSecOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate co secant of a set number test (with numpad input)
        coSecOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 042a -> calculate co secant of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Co secant of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Co_secant_Of_Input_Number_Test")
    void coSecOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate co secant of a random generated number test (with random generated number input)
        coSecOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 043 -> calculate combination (nCr) of a set numbers test (with numpad input)
    @Test
    @DisplayName("Calculate Combination (nCr) of Input Numbers Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Combination_NcR_Of_Input_Numbers_Test")
    void nCrOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate combination (nCr) of a set numbers test (with numpad input)
        nCrOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 043a -> calculate combination (nCr) of a random generated input numbers test (with random numbers generated input)
    @Test
    @DisplayName("Calculate Combination (nCr) of Input Numbers Test (Random numbers input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Combination_NcR_Of_Input_Numbers_Test")
    void nCrcOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate combination (nCr) of a random generated numbers test (with random generated numbers input)
        nCrOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 044 -> calculate permutations (nPr) of a set numbers test (with numpad input)
    @Test
    @DisplayName("Calculate Permutations (nPr) of Input Numbers Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Permutations_NpR_Of_Input_Numbers_Test")
    void nPrOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate permutations (nPr) of a set numbers test (with numpad input)
        nPrOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 044a -> calculate permutations (nPr) of a random generated input number test (with random numbers generated input)
    @Test
    @DisplayName("Calculate Permutations (nPr) of Input Numbers Test (Random numbers input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Permutations_NpR_Of_Input_Numbers_Test")
    void nPrcOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate permutations (nPr) of a random generated numbers test (with random generated numbers input)
        nPrOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 045 -> calculate percentage equivalent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Percentage Equivalent of Input Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Percentage_Of_Input_Number_Test")
    void percentEquivalentOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate percentage equivalent  of a set number test (with numpad input)
        percentOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 045a -> calculate percentage equivalent of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Percentage Equivalent of Input Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Percentage_Of_Input_Number_Test")
    void percentEquivalentOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate percentage equivalent  of a random generated number test (with random generated number input)
        percentOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //negative number test scenarios

    //Test 046 -> calculate sine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Sine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_Of_Input_Negative_Number_Test")
    void sinOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate sine of a set negative number test (with numpad input)
        sinOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 046a -> calculate sine of a random generated input negative number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Sine of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_Of_Input_Negative_Number_Test")
    void sinOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate sine of a random generated negative number test (with random generated number input)
        sinOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 047 -> calculate hyperbolic sine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Hyperbolic Sine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_H_Of_Input_Negative_Number_Test")
    void sinHOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic sine of a set negative number test (with numpad input)
        sinHOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 047a -> calculate hyperbolic sine of a random generated input negative number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Hyperbolic Sine of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Sine_H_Of_Input_Negative_Number_Test")
    void sinHOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic sine of a random generated negative number test (with random generated negative number input)
        sinHOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 048 -> calculate cosine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Cosine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_Of_Input_Negative_Number_Test")
    void cosOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cosine of a set negative number test (with numpad input)
        cosOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 048a -> calculate cosine e of a random generated input negative number test (with random number generated input)
    @Test
    @DisplayName("Calculate Cosine of Input Negative Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_Of_Input_Negative_Number_Test")
    void cosOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cosine of a random generated negative number test (with random generated negative number input)
        cosOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 049 -> calculate hyperbolic cosine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Hyperbolic Cosine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_H_Of_Input_Negative_Number_Test")
    void cosHOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic cosine of a set negative number test (with numpad input)
        cosHOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 049a -> calculate hyperbolic cosine of a random generated negative input number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Hyperbolic Cosine of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cosine_H_Of_Input_Negative_Number_Test")
    void cosHOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic cosine of a random generated negative number test (with random generated negative number input)
        cosHOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 050 -> calculate tangent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Tangent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_Of_Input_Negative_Number_Test")
    void tanOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a set negative number test (with numpad input)
        tanOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 050a -> calculate tangent of a random generated negative input number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Tangent of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_Of_Input_Negative_Number_Test")
    void tanOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a random generated negative number test (with random generated negative number input)
        tanOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 051 -> calculate hyperbolic tangent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Hyperbolic Tangent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_H_Of_Input_Negative_Number_Test")
    void tanHOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic tangent of a set negative number test (with numpad input)
        tanHOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 051a -> calculate hyperbolic tangent of a random generated input negative number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Hyperbolic Tangent of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Tangent_H_Of_Input_Negative_Number_Test")
    void tanHOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate hyperbolic tangent of a random generated negative number test (with random generated negative number input)
        tanHOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 052 -> calculate cotangent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Cotangent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cotangent_Of_Input_Negative_Number_Test")
    void cotOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cotangent of a set negative number test (with numpad input)
        cotOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 052a -> calculate cotangent of a random generated input negative number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Cotangent of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Cotangent_Of_Input_Negative_Number_Test")
    void cotOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate cotangent of a random generated negative number test (with random generated negative number input)
        cotOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 053 -> calculate secant of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Secant of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Secant_Of_Input_Negative_Number_Test")
    void secOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate secant of a set negative number test (with numpad input)
        secOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 053a -> calculate secant of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Secant of Input Negative Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Secant_Of_Input_Negative_Number_Test")
    void secOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate secant of a random generated negative number test (with random generated negative number input)
        secOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 054 -> calculate co secant of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Co secant of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Co_secant_Of_Input_Negative_Number_Test")
    void coSecOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate co secant of a set negative number test (with numpad input)
        coSecOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 054a -> calculate co secant of a random generated input negative number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Co secant of Input Negative Number Test (Random number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Co_secant_Of_Input_Negative_Number_Test")
    void coSecOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate co secant of a random generated negative number test (with random generated negative number input)
        coSecOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 055 -> calculate combination (nCr) of a set negative numbers test (with numpad input) (invalid scenario)
    @Test
    @DisplayName("Calculate Combination (nCr) of Input Negative Numbers Test (with NumPad input) - Invalid Scenario")
    @Tag("Invalid_Trigonometric_Functions_Test")
    @Tag("Combination_NcR_Of_Input_Negative_Numbers_Test")
    void nCrOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate combination (nCr) of a set negative number test (with numpad input)
        nCrOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 055a -> calculate combination (nCr) of a random generated input negative numbers test (with random numbers generated input) (invalid scenario) -> IllegalArgumentException isn't thrown here
    @Test
    @DisplayName("Calculate Combination (nCr) of Input Negative Numbers Test (Random negative numbers input) - Invalid Scenario")
    @Tag("Invalid_Trigonometric_Functions_Test")
    @Tag("Combination_NcR_Of_Input_Negative_Numbers_Test")
    void nCrOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate combination (nCr) of a random generated negative numbers test (with random generated numbers input)
        nCrOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 056 -> calculate permutations (nPr) of a set negative numbers test (with numpad input) (invalid operation) -> the scenario acts as expected = IllegalArgumentException is thrown
    @Test
    @DisplayName("Calculate Permutations (nPr) of Input Negative Numbers Test (with NumPad input) - Invalid Scenario")
    @Tag("Invalid_Trigonometric_Functions_Test")
    @Tag("Permutations_NpR_Of_Input_Negative_Numbers_Test")
    void nPrOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate permutations (nPr) of a set negative number test (with numpad input)
        nPrOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 056a -> calculate permutations (nPr) of a random generated input negative numbers test (with random negative numbers generated input) (invalid operation)  -> IllegalArgumentException isn't thrown here
    @Test
    @DisplayName("Calculate Permutations (nPr) of Input Negative Numbers Test (Random number input) - Invalid Scenario")
    @Tag("Invalid_Trigonometric_Functions_Test")
    @Tag("Permutations_NpR_Of_Input_Negative_Numbers_Test")
    void nPrOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate permutations (nPr) of a random generated negative numbers test (with random generated negative number input)
        nPrOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 057 -> calculate percentage equivalent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Percentage Equivalent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Percentage_Of_Input_Negative_Number_Test")
    void percentEquivalentOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate percentage equivalent of a set negative number test (with numpad input)
        percentOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 057a -> calculate percentage equivalent of a random generated negative input number test (with random negative generated number input)
    @Test
    @DisplayName("Calculate Percentage Equivalent of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Trigonometric_Functions_Test")
    @Tag("Percentage_Of_Input_Negative_Number_Test")
    void percentEquivalentOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate percentage equivalent of a random generated negative number test (with random generated negative number input)
        percentOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }
}
