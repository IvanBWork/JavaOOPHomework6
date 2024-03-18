package SOLID.task4_LSP;

/**
 * Класс прямоугольника со свойствами в виде длины и ширины сторон.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * Конструктор класса Rectangle.
     * @param width - ширина прямоугольника.
     * @param height - высота прямоугольника.
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Метод устанавливает новое значение ширины прямоугольника.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Метод устанавливает новое значение высоты прямоугольника.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Метод расчета площади прямоугольника.
     * @return площадь прямоугольника.
     */
    public int area() {
        return this.width * this.height;
    }
}

