public class Car {
    private final String model;
    private int miles;

    Car(String model, int miles) {
        this.model = model;
        this.miles = miles;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
