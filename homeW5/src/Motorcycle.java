public class Motorcycle implements IVehicle{
    private String type;
    private int engineCapacity;


    public void setType(String type) {
        this.type = type;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void drive() {
        System.out.println(type + " мотоцикл с двигателем " + engineCapacity + " куб.см едет.");
    }

    @Override
    public void refuel() {
        System.out.println(type + " мотоцикл заправляется.");
    }
}
