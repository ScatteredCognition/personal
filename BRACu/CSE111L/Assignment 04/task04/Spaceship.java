public class Spaceship {
    String name = null;
    int capacity = 0;
    Cargo[] cargoList = new Cargo[100];
    int cargoCount = 0;
    int totalWeight = 0;

    public Spaceship(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void loadCargo(Cargo cargo) {
        if (this.cargoCount < cargoList.length) {
            if (cargo.getWeight() + totalWeight <= capacity) {
                cargoList[cargoCount] = cargo;
                cargoCount++;
                totalWeight += cargo.getWeight();
            } else {
                System.out.println("Warning: Unable to load " + cargo.getName() + " inside " + this.name +". Exceeds capacity by " + (cargo.getWeight() + totalWeight - capacity) + ".");
            }
        } else {
            System.out.println("Cargo list is full. Cannot load more cargo.");
        }
    }

    public void displayDetails() {

        System.out.println("Spaceship Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Cargo Weight: " + totalWeight);
        System.out.print("Cargo: ");
        for(int i = 0; i < cargoList.length; i++) {
            if(cargoList[i] != null) {
                System.out.print(cargoList[i].getName() + " ");
            }
        }
        System.out.println();
    }
}
