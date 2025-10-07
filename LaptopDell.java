class LaptopDell {
    byte id;
    short modelNo;
    int price;
    long serialNumber;
    char grade;
    float gst;
    double discount;
    boolean isAvailable;
    String brand;

    public static void main(String[] args) {
        LaptopDell obj = new LaptopDell();
        obj.id = 1;
        System.out.println("The laptop id is: " + obj.id);

        LaptopDell obj1 = new LaptopDell();
        obj1.modelNo = 2024;
        System.out.println("The laptop model number is: " + obj1.modelNo);

        LaptopDell obj2 = new LaptopDell();
        obj2.price = 85000;
        System.out.println("The laptop price is: " + obj2.price);

        LaptopDell obj3 = new LaptopDell();
        obj3.serialNumber = 9876543210L;
        System.out.println("The laptop serial number is: " + obj3.serialNumber);

        LaptopDell obj4 = new LaptopDell();
        obj4.grade = 'A';
        System.out.println("The laptop grade is: " + obj4.grade);

        LaptopDell obj5 = new LaptopDell();
        obj5.gst = 18.5f;
        System.out.println("The laptop GST is: " + obj5.gst);

        LaptopDell obj6 = new LaptopDell();
        obj6.discount = 5.25d;
        System.out.println("The laptop discount is: " + obj6.discount);

        LaptopDell obj7 = new LaptopDell();
        obj7.isAvailable = true;
        System.out.println("The laptop availability is: " + obj7.isAvailable);

        LaptopDell obj8 = new LaptopDell();
        obj8.brand = "Dell Inspiron";
        System.out.println("The laptop brand is: " + obj8.brand);
    }
}
