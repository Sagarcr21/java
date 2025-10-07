class Mobile {
    byte id;
    short ram;
    int price;
    long imei;
    char series;
    float gst;
    double weight;
    boolean available;
    String name;

    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.id = 2;
        System.out.println("The mobile id is: " + obj.id);

        Mobile obj1 = new Mobile();
        obj1.ram = 8;
        System.out.println("The mobile RAM is: " + obj1.ram + " GB");

        Mobile obj2 = new Mobile();
        obj2.price = 25000;
        System.out.println("The mobile price is: " + obj2.price);

        Mobile obj3 = new Mobile();
        obj3.imei = 123456789012345L;
        System.out.println("The mobile IMEI is: " + obj3.imei);

        Mobile obj4 = new Mobile();
        obj4.series = 'S';
        System.out.println("The mobile series is: " + obj4.series);

        Mobile obj5 = new Mobile();
        obj5.gst = 12.5f;
        System.out.println("The mobile GST is: " + obj5.gst);

        Mobile obj6 = new Mobile();
        obj6.weight = 180.25;
        System.out.println("The mobile weight is: " + obj6.weight + " g");

        Mobile obj7 = new Mobile();
        obj7.available = true;
        System.out.println("The mobile availability is: " + obj7.available);

        Mobile obj8 = new Mobile();
        obj8.name = "Samsung Galaxy S21";
        System.out.println("The mobile name is: " + obj8.name);
    }
}
