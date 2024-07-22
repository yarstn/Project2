public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private Route reservedRoute;
    private double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void reserveCar(Car car, Route route) throws Exception;

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Reserved Car: " + this.reservedCar.getCode());
        System.out.println("Trip Cost: " + this.tripCost);
    }

    public void setReservedCar(Car car) {
        this.reservedCar = car;
    }

    public void setReservedRoute(Route route) {
        this.reservedRoute = route;
    }

    public void setTripCost(double cost) {
        this.tripCost = cost;
    }
}