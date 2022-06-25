package Essential.Lesson6;

public enum Animals {
    CAT(10),
    RABBIT(1),
    DOG(5);
    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal name is " + super.toString() + "."
                + " Animal age is " + this.age + ".";
    }
}
