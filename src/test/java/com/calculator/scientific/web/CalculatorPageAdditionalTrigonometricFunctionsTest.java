package com.calculator.scientific.web;

import org.junit.jupiter.api.*;

public class CalculatorPageAdditionalTrigonometricFunctionsTest extends TestMethods{

    //Test 066 -> calculate arc sine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Sine of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_Of_Input_Number_Test")
    void asinOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc sine of a set number test (with numpad input)
        asinOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 066a -> calculate arc sine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Sine of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_Of_Input_Number_Test")
    void asinOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc sine of a random generated number test (with random generated number input)
        asinOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 067 -> calculate arc hyperbolic sine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Sine of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_H_Of_Input_Number_Test")
    void arcSinHOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic sine of a set number test (with numpad input)
        asinHOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 067a -> calculate arc hyperbolic sine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Sine of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_H_Of_Input_Number_Test")
    void arcSinHOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic sine of a random generated number test (with random generated number input)
        asinHOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 068 -> calculate arc cosine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Cosine of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_Of_Input_Number_Test")
    void acosOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cosine of a set number test (with numpad input)
        acosOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 068a -> calculate arc cosine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Cosine of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_Of_Input_Number_Test")
    void acosOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cosine of a random generated number test (with random generated number input)
        acosOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 069 -> calculate arc hyperbolic cosine of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Cosine of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_H_Of_Input_Number_Test")
    void arcCosHOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic cosine of a set number test (with numpad input)
        acosHOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 069a -> calculate arc hyperbolic cosine of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Cosine of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_H_Of_Input_Number_Test")
    void arcCosHOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic cosine of a random generated number test (with random generated number input)
        acosHOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 070 -> calculate arc tangent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Tangent of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_Of_Input_Number_Test")
    void atanOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a set number test (with numpad input)
        atanOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 070a -> calculate arc tangent of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Tangent of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_Of_Input_Number_Test")
    void atanOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a random generated number test (with random generated number input)
        atanOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 071 -> calculate arc hyperbolic tangent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Tangent of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_H_Of_Input_Number_Test")
    void atanHOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic tangent of a set number test (with numpad input)
        atanHOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 071a -> calculate arc hyperbolic tangent of a random generated input number test (with random number generated input) (0)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Tangent of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_H_Of_Input_Number_Test")
    void atanHOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic tangent of a random generated number test (with random generated number input)
        atanHOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 072 -> calculate arc cotangent of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Cotangent of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cotangent_Of_Input_Number_Test")
    void aCotOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cotangent of a set number test (with numpad input)
        aCotOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 072a -> calculate arc cotangent of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Cotangent of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cotangent_Of_Input_Number_Test")
    void aCotOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cotangent of a random generated number test (with random generated number input)
        aCotOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 073 -> calculate arc secant of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Secant of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Secant_Of_Input_Number_Test")
    void aSecOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc secant of a set number test (with numpad input)
        aSecOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 073a -> calculate arc secant of a random generated input number test
    @Test
    @DisplayName("Calculate Arc Secant of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Secant_Of_Input_Number_Test")
    void aSecOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc secant of a random generated number test (with random generated number input)
        aSecOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 074 -> calculate arc co secant of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Co secant of Input Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Co_secant_Of_Input_Number_Test")
    void acoSecOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc co secant of a set number test (with numpad input)
        acoSecOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 074a -> calculate arc co secant of a random generated input number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Co secant of Input Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Co_secant_Of_Input_Number_Test")
    void acoSecOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc co secant of a random generated number test (with random generated number input)
        acoSecOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //negative number test scenarios

    //Test 075 -> calculate arc sine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Sine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_Of_Input_Negative_Number_Test")
    void asinOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc sine of a set negative number test (with numpad input)
        asinOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 075a -> calculate arc sine of a random generated input negative number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Arc Sine of Input Negative Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_Of_Input_Negative_Number_Test")
    void asinOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc sine of a random generated negative number test (with random generated number input)
        asinOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 076 -> calculate arc hyperbolic sine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Sine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_H_Of_Input_Negative_Number_Test")
    void arcSinHOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic sine of a set negative number test (with numpad input)
        asinHOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 076a -> calculate arc hyperbolic sine of a random generated negative input number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Sine of Input Negative Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Sine_H_Of_Input_Negative_Number_Test")
    void arcSinHOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic sine of a random generated negative number test (with random generated negative number input)
        asinHOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 077 -> calculate arc cosine of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Cosine of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_Of_Input_Negative_Number_Test")
    void acosOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cosine of a set negative number test (with numpad input)
        acosOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 077a -> calculate arc cosine of a random generated input negative number test (with random number generated input)
    @Test
    @DisplayName("Calculate Arc Cosine of Input Negative Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_Of_Input_Negative_Number_Test")
    void acosOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cosine of a random generated negative number test (with random generated negative number input)
        acosOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 078 -> calculate arc hyperbolic cosine of a set negative number test (with numpad input) (invalid test scenario)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Cosine of Input Negative Number Test (with NumPad input)")
    @Tag("Invalid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_H_Of_Input_Negative_Number_Test")
    void arcCosHOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic cosine of a set negative number test (with numpad input)
        acosHOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 078a -> calculate arc hyperbolic cosine of a random generated negative input number test (with random negative number generated input) (invalid test scenario)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Cosine of Input Negative Number Test (Random negative number input)")
    @Tag("Invalid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cosine_H_Of_Input_Negative_Number_Test")
    void arcCosHOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic cosine of a random generated negative number test (with random generated negative number input)
        acosHOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 079 -> calculate arc tangent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Tangent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_Of_Input_Negative_Number_Test")
    void atanOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a set negative number test (with numpad input)
        atanOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 079a -> calculate arc tangent of a random generated negative input number test (with random negative generated number)
    @Test
    @DisplayName("Calculate Arc Tangent of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_Of_Input_Negative_Number_Test")
    void atanOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate tangent of a random generated negative number test (with random generated negative number)
        atanOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 080 -> calculate arc hyperbolic tangent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Tangent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_H_Of_Input_Negative_Number_Test")
    void atanHOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic tangent of a set negative number test (with numpad input)
        atanHOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 080a -> calculate arc hyperbolic tangent of a random generated negative input number test (with random negative number generated input)
    @Test
    @DisplayName("Calculate Arc Hyperbolic Tangent of Input Negative Number Test (Random number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Tangent_H_Of_Input_Negative_Number_Test")
    void atanHOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc hyperbolic tangent of a random generated negative number test (with random generated negative number)
        atanHOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 081 -> calculate arc cotangent of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Cotangent of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cotangent_Of_Input_Negative_Number_Test")
    void aCotOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cotangent of a set negative number test (with numpad input)
        aCotOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 081a -> calculate arc cotangent of a random generated negative input number test (with random generated negative number)
    @Test
    @DisplayName("Calculate Arc Cotangent of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Cotangent_Of_Input_Negative_Number_Test")
    void aCotOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc cotangent of a random generated negative number test (with random generated negative number)
        aCotOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 082 -> calculate arc secant of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Secant of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Secant_Of_Input_Negative_Number_Test")
    void aSecOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc secant of a set negative number test (with numpad input)
        aSecOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 082a -> calculate arc secant of a random generated negative input number test (with random negative number generated)
    @Test
    @DisplayName("Calculate Arc Secant of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Secant_Of_Input_Negative_Number_Test")
    void aSecOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc secant of a random generated negative number test (with random negative generated number)
        aSecOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 083 -> calculate arc co secant of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Arc Co secant of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Co_secant_Of_Input_Negative_Number_Test")
    void acoSecOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc co secant of a set negative number test (with numpad input)
        acoSecOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 083a -> calculate arc co secant of a random generated negative input number test (with random generated negative number)
    @Test
    @DisplayName("Calculate Arc Co secant of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Additional_Trigonometric_Functions_Test")
    @Tag("Arc_Co_secant_Of_Input_Negative_Number_Test")
    void acoSecOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate arc co secant of a random generated negative number test (with random generated negative number input)
        acoSecOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }
}
