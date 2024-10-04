public class Truck implements IVehicle{
    private int loadCapacity;
    private int numberOfAxles;


    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void drive() {
        System.out.println("Грузовик с грузоподъемностью " + loadCapacity + " тонн едет.");
    }

    @Override
    public void refuel() {
        System.out.println("Грузовик с " + numberOfAxles + " осями заправляется.");
    }
}
