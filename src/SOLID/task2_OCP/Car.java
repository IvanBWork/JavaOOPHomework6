package SOLID.task2_OCP;

/**
 * Класс автомобиля.
 * Представляет класс машины, который является подклассом класса Vehicle.
 */
public class Car extends Vehicle {

    /**
     * Конструктор класса Car.
     * @param maxSpeed - максимальная скорость.
     * @param type - тип транспорта.
     * @param speedIndex - коэффициент скорости.
     */
    public Car(int maxSpeed, String type, double speedIndex) {
        super(maxSpeed, type, speedIndex);
    }
}
