package com.company.figure;

public class Rectangle implements Figure {
    @Override
    public double calculationS() {
        return 0;
    }

    public double calculationS(double a, double b) { // вычисление S прямоугольника с вводом длины одной стороны и высоты
        double x = a * b;
        return x;
    }

    @Override
    public double calculationP() {
        return 0;
    }

    public double calculationP(double a, double b) { // вычисление P треугольника с вводом длины одной стороны и высоты
        double p = (a + b) * 2;
        return p;
    }
}