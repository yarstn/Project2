public class SubscriberPassenger extends Passenger{
    public SubscriberPassenger(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car, Route route) throws Exception {
        if (car.getCapacity() == 0) {
            throw new Exception("Cannot reserve car, maximum capacity reached.");
        }
        setReservedCar(car);
        setReservedRoute(route);
        setTripCost(route.getPrice()*0.5);
    }
}
