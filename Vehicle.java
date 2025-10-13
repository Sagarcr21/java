class Vehicle {
    String type;
    String model;
    int price;

    Vehicle(String type, String model, int price) {
        this.type = type;
        this.model = model;
        this.price = price;
    }

    void vehicleType() {
        System.out.println("Vehicle Type: " + type);
        model();
    }

    void model() {
        System.out.println("Model: " + model);
        cost();
    }

    void cost() {
        System.out.println(model + " costs ₹" + price);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car", "Toyota Innova", 2500000);
        v.vehicleType();
    }
}
