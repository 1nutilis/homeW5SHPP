import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип транспорта: 1 - Автомобиль, 2 - Мотоцикл, 3 - Грузовик");
        int choice = scanner.nextInt();
        scanner.nextLine();

        VehicleFactory factory = null;
        IVehicle vehicle = null;

        switch (choice) {
            case 1:
                factory = new CarFactory();
                vehicle = factory.createVehicle();
                System.out.println("Введите марку автомобиля:");
                ((Car) vehicle).setBrand(scanner.nextLine());
                System.out.println("Введите модель автомобиля:");
                ((Car) vehicle).setModel(scanner.nextLine());
                System.out.println("Введите тип топлива:");
                ((Car) vehicle).setFuelType(scanner.nextLine());
                break;

            case 2:
                factory = new MotorcycleFactory();
                vehicle = factory.createVehicle();
                System.out.println("Введите тип мотоцикла (спортивный/туристический):");
                ((Motorcycle) vehicle).setType(scanner.nextLine());
                System.out.println("Введите объем двигателя:");
                ((Motorcycle) vehicle).setEngineCapacity(scanner.nextInt());
                break;

            case 3:
                factory = new TruckFactory();
                vehicle = factory.createVehicle();
                System.out.println("Введите грузоподъемность (в тоннах):");
                ((Truck) vehicle).setLoadCapacity(scanner.nextInt());
                System.out.println("Введите количество осей:");
                ((Truck) vehicle).setNumberOfAxles(scanner.nextInt());
                break;

            default:
                System.out.println("Неверный выбор!");
                return;
        }

        vehicle.drive();
        vehicle.refuel();
    }
}