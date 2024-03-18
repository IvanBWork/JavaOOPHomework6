package SOLID.task2_OCP;

/**
 * Класс калькулятора максимальной скорости транспортного средства.
 */
public class SpeedCalculation {
    /**
     * Метод расчета допустимой скорости.
     * @param vehicle - транспортное средство.
     * @return рассчитанная допустимая скорость.
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}

