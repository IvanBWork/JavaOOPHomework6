package SOLID.task3_ISP;

/**
 * Класс Cube.
 * Реализует интерфейсы для расчета площади и объема.
 */
public class Cube implements Area, Volume {
    private int edge;

    /**
     * Конструктор класса Cube.
     * @param edge - ребро куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Метод вычисляет площадь объекта.
     * @return площадь обьекта.
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Метод вычисляет обьем объекта.
     * @return обьект обьекта.
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
