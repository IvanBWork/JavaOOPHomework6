package SOLID.task2_OCP;

/**
 * Класс абстрактного транспортного средства. Добавлен ограничивающий коэф. скорости в виде свойства.
 */
public abstract class Vehicle {
    private int maxSpeed;
    private String type;
    private double speedIndex; // ограничивающий коэффициент скорости

    /**
     * Конструктор класса Vehicle.
     * @param maxSpeed - максимальная скорость.
     * @param type - тип транспорта.
     * @param speedIndex - коэффициент скорости.
     */
    public Vehicle(int maxSpeed, String type, double speedIndex) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.speedIndex = speedIndex;
    }

    /**
     * Метод возвращает максимальную скорость транспортного средства.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Метод возвращает коэффициент скорости транспортного средства.
     */
    public double getSpeedIndex() {
        return this.speedIndex;
    }

    /**
     * Метод возвращает тип транспортного средства.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Метод расчета допустимой скорости с учетом ограничивающего коэффициента скорости.
     * @return разрешимая скорость.
     */
    public double calculateAllowedSpeed() {
        return this.maxSpeed * this.speedIndex;
    }
}
