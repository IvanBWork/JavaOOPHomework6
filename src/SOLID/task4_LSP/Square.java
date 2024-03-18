package SOLID.task4_LSP;

/**
 * Класс квадрата с переопределенным конструктором.
 * Наследуется от класса Rectangle.
 * Поскольку стороны квадраты равны, можно на вход передавать только 1 параметр ширины или длины.
 */
public class Square extends Rectangle {

    /**
     * Конструктор класса Square. Создает квадрат с одинаковой шириной и высотой.
     * @param width - сторона квадрата.
     */
    public Square(int width) {
        super(width, width);
    }
}
