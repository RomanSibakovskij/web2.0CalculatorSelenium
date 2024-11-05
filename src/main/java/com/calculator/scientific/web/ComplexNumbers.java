package com.calculator.scientific.web;

public class ComplexNumbers {
    double real;
    double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {return real + " + " + imaginary + "i";}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumbers that = (ComplexNumbers) obj;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }
}
