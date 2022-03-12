package com.company;

import com.company.Inreface.Bookkeep;
import com.company.Inreface.Dir;
import com.company.Inreface.Work;
import com.company.figure.Circle;
import com.company.figure.Rectangle;
import com.company.figure.Triangle;

public class Main {

    public static void main(String[] args) {
	Dir director = new Dir();
    Work worker = new Work();
    Bookkeep bookkeeper = new Bookkeep();
    director.printPost();
    worker.printPost();
    bookkeeper.printPost();

        Triangle triangle = new Triangle(); // объект треуг.
        System.out.println("S треугольника = " + triangle.calculationS(2, 3)); // высчитана его S

        Rectangle rectangle = new Rectangle(); // объект прямоуг.
        System.out.println("S прямоугольника = " + rectangle.calculationS(3, 5)); // высчитана его S

        Circle circle = new Circle(); // объект круг
        System.out.println("S круга = " + circle.calculationS(4)); // высчитана его S

        System.out.println("P тругольника = "+ triangle.calculationP(2, 3, 5)); // высчитан его P
        System.out.println("P прямоугольника = " + rectangle.calculationP(3, 5)); // высчитан его P
        System.out.println("P круга = " + circle.calculationP(4)); // высчитан его P

        Circle [] circleMas = new Circle[5]; // массив из пяти фигур кругов
        circleMas[0] = new Circle();
        circleMas[1] = new Circle();
        circleMas[2] = new Circle();
        circleMas[3] = new Circle();
        circleMas[4] = new Circle();
        double sumP = 0; // сумма P
        for (int i = 0; i < circleMas.length; i++) { // проход по массиву и расчет периметра всех кругов
            double resP = circleMas[i].calculationP(5);
            sumP += resP; // расчет суммы P всех кругов
        }
            System.out.println(sumP); // вывод суммы P всех кругов из массива circleMas
    }
}
