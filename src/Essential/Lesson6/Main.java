package Essential.Lesson6;

public class Main {
    public static void main(String[] args) {
        task2();
        System.out.println();
        task4();
    }

    protected static void task2() {
        for (Animals animal: Animals.values()) {
            System.out.println(animal);
        }
    }

    protected static void task4() {
        for (Vehicles vehicle: Vehicles.values()) {
            System.out.println(vehicle);
        }
    }
}
