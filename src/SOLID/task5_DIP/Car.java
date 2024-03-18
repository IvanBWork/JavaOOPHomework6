package SOLID.task5_DIP;

/**
 * Класс, представляющий автомобиль.
 */
public class Car {
    private PetrolEngine engine;

    /**
     * Конструктор класса Car.
     * @param engine объект с бензиновым двигателем.
     */
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    /**
     * Метод для запуска двигателя автомобиля.
     */
    public void start() {
        this.engine.start();
    }
}

