public class CarFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
