public class MotorcycleFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Motorcycle();
    }
}
