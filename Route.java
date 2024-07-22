public class Route {

        private String pickup;
        private String destination;
        private double price;

    public Route( String pickup, String destination, double price) {
        this.pickup = pickup;
        this.destination = destination;
        this.price = price;
    }

    public double getPrice() {
            return this.price;
        }


}
