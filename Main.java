public class Main {
    public static void main(String[] args) {
        // Create routes and Car object
        Route route1 = new Route("Ulaya", "Alanarjs", 50.0);
        Route route2 = new Route("Almalaz", "Alrawabi", 75.0);
        Route route3 = new Route("Almalqa", "Almalaz", 35.0);
        Car car1 = new Car("RGD 5262", route1, 5);
        Car car2 = new Car("RMC 1132", route2, 2);
        Car car3 = new Car("RMC 1132", route3, 0);


        // Create Subscriber and non-Subscriber
        Passenger[] passengers = {
                new SubscriberPassenger("Yara Mohammed", "10014585"),
                new NonSubscriberPassenger("Najd Nasser", "55874320", true)
        };
        //  display  information

        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof SubscriberPassenger) {
                    passenger.reserveCar(car1, route1);
                } else{
                    passenger.reserveCar(car2, route2);
                }
                System.out.println("*********:)*****):*****<3********");
                passenger.displayInfo();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
//        System.out.println(car1.decreaseCapacity());
//        System.out.println(car1.getCapacity());
    }
}