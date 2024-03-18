package SOLID.task3_ISP;

/**
 * Класс Circle.
 * Реализует интерфейс для расчета площади.
 */
public class Circle implements Area {
    private double radius;

    /**
     * Конструктор класса Circle.
     * @param radius - радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод вычисления площади круга по формуле.
     * @return площадь круга.
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}