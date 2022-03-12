package com.company.figure;

public class Triangle implements Figure{

    @Override
    public double calculationS() {
        return 0;
    }

        public double calculationS(double b, double h) { // вычисление S треугольника с вводом длины одной стороны и высоты
            double s = (b * h) / 2;
            return s;
        }

    @Override
    public double calculationP() {
        return 0;
    }
    public double calculationP(double a, double b, double c) { // вычисление P треугольника с вводом длины одной стороны и высоты
        double summ = a + b + c;
        return summ;
}
    }
