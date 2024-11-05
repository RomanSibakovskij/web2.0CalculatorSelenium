package com.calculator.scientific.web;

import org.junit.jupiter.api.*;

public class CalculatorPageSupplementaryFunctionsTest extends TestMethods{

    //Test 058 -> calculate variable equation of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Variable Equation of Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Variable_Equation_Of_Input_Number_Test")
    void varEquationOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate variable equation of a set number test (with numpad input)
        varEquationOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 058a -> calculate variable equation of a random generated input number test (with random generated number input)
    @Test
    @DisplayName("Calculate Variable Equation of Input Number Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Variable_Equation_Of_Input_Number_Test")
    void varEquationOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate variable equation of a random generated number test (with random generated number input)
        varEquationOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 059 -> calculate Euler's number of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Euler's Number of Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Euler_Number_Of_Input_Number_Test")
    void eulerNumberOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate Euler's number of a set number test (with numpad input)
        eulerNumberOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 059a -> calculate Euler's number of a random generated input number test (with random generated number input)
    @Test
    @DisplayName("Calculate Variable Equation of Input Number Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Euler_Number_Of_Input_Number_Test")
    void eulerNumberOfNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate Euler's number of a random generated number test (with random generated number input)
        eulerNumberOfInputNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 059b -> calculate input number multiplied by imaginary unit test (with numpad input)
    @Test
    @DisplayName("Calculate Input Number Multiply By Imaginary Unit Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Input_Number_Multiply_By_Imaginary_Unit_Test")
    void numberMultiplyByImaginaryUnitWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate set number by imaginary unit multiplication test (with numpad input)
        inputNumberMultiplyByImaginaryUnitCalculationNumPadInputTest(calculatorPage);
    }

    //Test 059c -> calculate random generated input number multiplied by imaginary unit test (with random generated number input)
    @Test
    @DisplayName("Calculate Input Number Multiply By Imaginary Unit Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Input_Number_Multiply_By_Imaginary_Unit_Test")
    void numberMultiplyByImaginaryUnitWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate random generated number by imaginary unit multiplication test (with random generated number input)
        inputNumberMultiplyByImaginaryUnitCalculationRandomNumberTest(calculatorPage);
    }

    //Test 060 -> calculate pi constant multiplication by a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Pi Constant Multiplication By A Set Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Pi_Const_Multiply_By_Input_Number_Test")
    void piConstMultiplicationByNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate pi constant multiplication by a set number test (with numpad input)
        piConstMultipliedByInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 060a -> calculate random generated input number division by pi constant test (with random generated number input)
    @Test
    @DisplayName("Calculate Set Input Number Division By Pi Constant Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Input_Number_Division_By_PI_Test")
    void numberWithRandomNumberDivisionByPiConstantTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate random generated input number division by pi constant test (with random generated number input)
        randomInputNumberDivisionByPIConstantTest(calculatorPage);
    }

    //Test 060b -> calculate Faraday constant multiplication by a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Faraday Constant Multiplication By A Set Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Faraday_Const_Multiply_By_Input_Number_Test")
    void faradayConstMultiplicationByNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate faraday constant multiplication by a set number test (with numpad input)
        faradayConstMultipliedByInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 060c -> calculate random generated input number division by Faraday constant test (with random generated number input)
    @Test
    @DisplayName("Calculate Set Input Number Division By Faraday Constant Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Input_Number_Division_By_Faraday_Constant_Test")
    void randomNumberDivisionByFaradayConstantTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate random generated input number division by faraday constant test (with random generated number input)
        randomInputNumberDivisionByFaradayConstantTest(calculatorPage);
    }

    //Test 061 -> calculate scientific notation of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Scientific Notation Of A Set Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Scientific_Notation_Of_Input_Number_Test")
    void scientificNotationOfNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate scientific notation of a set number test (with numpad input)
        scientificNotationOfInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 061a -> calculate scientific notation of a set input number test (with random generated number input)
    @Test
    @DisplayName("Calculate Scientific Notation Of A Set Input Number Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Scientific_Notation_Of_Input_Number_Division_Test")
    void scientificNotationOfRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate scientific notation of a random generated input number test (with random generated number input)
        scientificNotationOfInputNumberRandomNumberTest(calculatorPage);
    }

    //negative number test scenarios

    //Test 062 -> calculate variable equation of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Variable Equation of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Variable_Equation_Of_Input_Negative_Number_Test")
    void varEquationOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate variable equation of a set negative number test (with numpad input)
        varEquationOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 062a -> calculate variable equation of a random generated input number test (with random generated number input)
    @Test
    @DisplayName("Calculate Variable Equation of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Variable_Equation_Of_Input_Negative_Number_Test")
    void varEquationOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate variable equation of a random generated negative number test (with random generated negative number input)
        varEquationOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 063 -> calculate Euler's number of a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Euler's Number of Input Negative Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Euler_Number_Of_Input_Negative_Number_Test")
    void eulerNumberOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate Euler's number of a set negative number test (with numpad input)
        eulerNumberOfInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 063a -> calculate Euler's number of a random generated input negative number test (with random generated number input)
    @Test
    @DisplayName("Calculate Variable Equation of Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Euler_Number_Of_Input_Negative_Number_Test")
    void eulerNumberOfNegativeNumberWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate Euler's number of a random generated negative number test (with random generated negative number input)
        eulerNumberOfInputNegativeNumberCalculationRandomNumberTest(calculatorPage);
    }

    //Test 063b -> calculate set negative number division by imaginary unit test (with numpad input)
    @Test
    @DisplayName("Calculate Input Negative Number Division By Imaginary Unit Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Input_Negative_Number_Division_By_Imaginary_Unit_Test")
    void negativeNumberDivideByImaginaryUnitWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate set negative number division by imaginary unit test (with numpad input)
        inputNegativeNumberDivideByImaginaryUnitCalculationNumPadInputTest(calculatorPage);
    }

    //Test 063c -> calculate random generated input negative number multiplication by imaginary unit test (with random generated number input)
    @Test
    @DisplayName("Calculate Input Negative Number Multiplication By Imaginary Unit Test (Random negative number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Input_Negative_Number_Multiplication_By_Imaginary_Unit_Test")
    void negativeNumberMultiplicationByImaginaryUnitWithRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate random generated negative number multiplication by imaginary unit test (with random generated negative number input)
        inputNegativeNumberMultiplyByImaginaryUnitCalculationRandomNumberTest(calculatorPage);
    }

    //Test 064 -> calculate pi constant multiplication by a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Pi Constant Multiplication By A Set Negative Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Pi_Const_Multiply_By_Input_Negative_Number_Test")
    void piConstMultiplicationByNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate pi constant multiplication by a set number test (with numpad input)
        piConstMultipliedByNegativeInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 064a -> calculate random generated negative input number division by pi constant test (with random generated negative number input)
    @Test
    @DisplayName("Calculate Set Negative Input Number Division By Pi Constant Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Negative_Input_Number_Division_By_PI_Test")
    void numberWithRandomNegativeNumberDivisionByPiConstantTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate random generated negative input number division by pi constant test (with random generated negative number input)
        randomNegativeInputNumberDivisionByPIConstantTest(calculatorPage);
    }

    //Test 064b -> calculate faraday constant multiplication by a set negative number test (with numpad input)
    @Test
    @DisplayName("Calculate Faraday Constant Multiplication By A Set Negative Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Faraday_Const_Multiply_By_Negative_Input_Number_Test")
    void faradayConstMultiplicationByNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate Faraday constant multiplication by a set negative number test (with numpad input)
        faradayConstMultipliedByInputNegativeNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 064c -> calculate random generated negative input number division by Faraday constant test (with random generated negative number input)
    @Test
    @DisplayName("Calculate Set Negative Input Number Division By Faraday Constant Test (Random number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Negative_Input_Number_Division_By_Faraday_Constant_Test")
    void randomNegativeNumberDivisionByFaradayConstantTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate random generated negative input number division by Faraday constant test (with random generated negative number input)
        randomNegativeInputNumberDivisionByFaradayConstantTest(calculatorPage);
    }

    //Test 065 -> calculate scientific notation of a set number test (with numpad input)
    @Test
    @DisplayName("Calculate Scientific Notation Of A Set Input Number Test (with NumPad input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Scientific_Notation_Of_Negative_Input_Number_Test")
    void scientificNotationOfNegativeNumberWithNumPadInputTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate scientific notation of a set negative number test (with numpad input)
        scientificNotationOfNegativeInputNumberCalculationNumPadInputTest(calculatorPage);
    }

    //Test 065a -> calculate scientific notation of a set negative input number est (with random generated negative number input)
    @Test
    @DisplayName("Calculate Scientific Notation Of A Set Input Negative Number Test (Random negative number input)")
    @Tag("Valid_Supplementary_Functions_Test")
    @Tag("Scientific_Notation_Of_Negative_Input_Number_Test")
    void scientificNotationOfNegativeRandomNumberTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //calculate scientific notation of a random generated negative input number test (with random generated negative number input)
        scientificNotationOfNegativeInputNumberRandomNumberTest(calculatorPage);
    }
}
