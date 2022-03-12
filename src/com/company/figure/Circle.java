package com.company.figure;

public class Circle implements Figure {
    @Override
    public double calculationS() {
        return 0;
    }

    public double calculationS(double r) { // вычисление S круга с вводом радиусса
        double s = 3.14 * (r * r);
        return s;
    }

    @Override
    public double calculationP() {
        return 0;
    }

    public double calculationP(double r) { // вычисление P круга с вводом радиусса
        double p = 2 * (3.14 * r);
        return p;
    }
}