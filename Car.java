public class Car  {

        private String code;
        private Route route;
        private int capacity;

    public Car( String code, Route route, int capacity) {
        this.code = code;
        this.route = route;
        this.capacity = capacity;
    }

    public String getCode() {
            return this.code;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public boolean decreaseCapacity() {
            this.capacity--;
            return true;
        }

}
