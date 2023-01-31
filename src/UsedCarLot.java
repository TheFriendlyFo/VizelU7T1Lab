import java.util.ArrayList;

public class UsedCarLot {
    private final ArrayList<Car> inventory;

    UsedCarLot() {
        inventory = new ArrayList<>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car newCar) {
        inventory.add(newCar);
    }

    public boolean swap(int i1, int i2) {
        if ((i1 < 0 || inventory.size() <= i1) || (i2 < 0 || inventory.size() <= i2)) {
            return false;
        }

        Car temp = inventory.set(i2, inventory.get(i1));
        inventory.set(i1, temp);
        return true;
    }
}
