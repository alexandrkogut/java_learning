package Essential.Lesson6;

public enum Vehicles {
    AUDI(30, "Black"),
    FORD(15, "Gray"),
    PORSCHE(50, "Blue");
    private final int price;
    private final String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    private String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getColor() + " - " + this.price + "$";
    }
}
