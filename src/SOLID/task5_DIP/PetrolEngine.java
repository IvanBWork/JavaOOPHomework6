package SOLID.task5_DIP;

/**
 * Класс, представляющий бензиновый двигатель.
 */
public class PetrolEngine implements Engine {

    /**
     * Метод запуска бензинового двигателя.
     */
    @Override
    public void start() {
        System.out.println("Petro engine starts");
    }
}
