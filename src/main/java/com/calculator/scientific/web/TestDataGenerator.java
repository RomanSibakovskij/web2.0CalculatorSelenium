package com.calculator.scientific.web;

import org.openqa.selenium.*;
import java.security.SecureRandom;
import java.util.Random;

public class TestDataGenerator extends BasePage{

    private static final int MIN = 1;
    private static final int MAX = 2500;

    private static final int DIVISION_MIN = 1;
    private static final int DIVISION_MAX = 200;

    private static final int MIN_NEGATIVE = -1000;
    private static final int MAX_NEGATIVE = -2;

    private static final int DIVISION_NEGATIVE_MIN = -300;
    private static final int DIVISION_NEGATIVE_MAX = -1;

    private static final int POWER_MIN = 1;
    private static final int POWER_MAX = 10;

    //for aCot
    private static final int INPUT_ACOT_MAX = 60;
    private static final int INPUT_ACOT_MIN = 2;

    private static final int NCR_MAX = 50;
    private static final int NCR_MIN = 1;


    // Generator instance
    private Random random;

    // Input numbers
    private int num1;
    private int num2;

    //input numbers (for atanh / asin / acos)
    private double funcNum1;

    //negative input numbers
    private int negativeNum1;
    private int negativeNum2;

    public TestDataGenerator(WebDriver driver) {super(driver);this.random = new SecureRandom();}

    // Generate random numbers
    public int generateRandomNumber1() {num1 = random.nextInt((MAX - MIN) + 1) + MIN; return num1;}
    public int generateRandomNumber2() {num2 = random.nextInt((MAX - MIN) + 1) + MIN; return num2;}

    // Generate random numbers (for nCr calculation)
    public int generateRandomNcRNumber1() {num1 = random.nextInt((NCR_MAX - NCR_MIN) + 1) + NCR_MIN; return num1;}
    public int generateRandomNcRNumber2() {num2 = random.nextInt((NCR_MAX - NCR_MIN) + 1) + NCR_MIN; return num2;}

    // Generate random numbers (for division test)
    public int generateRandomDivisionNumber1() {num1 = random.nextInt((DIVISION_MAX - DIVISION_MIN) + 1) + DIVISION_MIN; return num1;}
    public int generateRandomDivisionNumber2() {num2 = random.nextInt((DIVISION_MAX - DIVISION_MIN) + 1) + DIVISION_MIN; return num2;}

    // Method to generate the first random negative number
    public int generateRandomNegativeNumber1() {
        negativeNum1 = MIN_NEGATIVE + random.nextInt((MAX_NEGATIVE - MIN_NEGATIVE) + 1);
        return negativeNum1;
    }

    // Method to generate the second random negative number
    public int generateRandomNegativeNumber2() {
        negativeNum2 = MIN_NEGATIVE + random.nextInt((MAX_NEGATIVE - MIN_NEGATIVE) + 1);
        return negativeNum2;
    }

    // Generate random negative numbers (for division test)
    public int generateRandomDivisionNegativeNumber1() {num1 = random.nextInt((DIVISION_NEGATIVE_MAX - DIVISION_NEGATIVE_MIN) + 1) + DIVISION_NEGATIVE_MIN; return num1;}
    public int generateRandomDivisionNegativeNumber2() {int range = DIVISION_NEGATIVE_MAX - DIVISION_NEGATIVE_MIN + 1; int num2 = random.nextInt(range) + DIVISION_NEGATIVE_MIN; return num2;}

    // Generate random number (for power raise of 10)
    public int generateRandomPowerNumber(){num1 = random.nextInt((POWER_MAX - POWER_MIN) + 1) + POWER_MIN; return num1;}

    // Generate random number (for atanh calculations)
    public double generateRandomATanHInputNumber(){funcNum1 = 0.01 + (0.99 - 0.01) * random.nextDouble(); return funcNum1;}

    public double generateRandomATanHNegativeInputNumber() {
        double num1 = -0.01 * Math.random(); // Generates a value between -0.01 and -1
        return num1;
    }

    // Generate random number (for aCot calculations)
    public int generateRandomACotInputNumber(){num1 = random.nextInt((INPUT_ACOT_MAX - INPUT_ACOT_MIN) + 1) + INPUT_ACOT_MIN; return num1;}
}
