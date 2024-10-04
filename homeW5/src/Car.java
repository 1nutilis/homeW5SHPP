public class Car implements IVehicle{
    private String brand;
    private String model;
    private String fuelType;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void drive() {
        System.out.println(brand + " " + model + " едет.");
    }

    @Override
    public void refuel() {
        System.out.println(brand + " " + model + " заправляется " + fuelType + ".");
    }
}
