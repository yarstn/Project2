public class NonSubscriberPassenger extends Passenger{
    private boolean Discount;

    public NonSubscriberPassenger(String name, String id, boolean Discount) {
        super(name, id);
        this.Discount = Discount;
    }

    @Override
    public void reserveCar(Car car, Route route) throws Exception {
        if (car.getCapacity() == 0) {
            throw new Exception("Cannot reserve car, maximum capacity reached.");
        }
        setReservedCar(car);
        setReservedRoute(route);
        if (this.Discount) {
            setTripCost(route.getPrice() * 0.9);
        } else {
            setTripCost(route.getPrice());
        }
    }
}


