package SOLID.task2_OCP;

/**
 * Класс автобуса.
 * Представляет класс автобуса, который является подклассом класса Vehicle.
 */
public class Bus extends Vehicle {

    /**
     * Конструктор класса Bus.
     * @param maxSpeed - максимальная скорость.
     * @param type - тип транспорта.
     * @param speedIndex - коэффициент скорости.
     */
    public Bus(int maxSpeed, String type, double speedIndex) {
        super(maxSpeed, type, speedIndex);
    }
}
