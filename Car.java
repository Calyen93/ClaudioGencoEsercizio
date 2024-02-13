public class Car {

    private int engineSize;

    private String plate;

    private String brand;

    private String model;

    public Car(int engineSize, String plate, String brand, String model) {
        this.engineSize = engineSize;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {

        return model;
    }
}
