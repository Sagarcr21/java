class TextBook {
    byte id;
    short pages;
    int price;
    long isbn;
    char grade;
    float tax;
    double rating;
    boolean available;
    String title;

    public static void main(String[] args) {
        TextBook obj = new TextBook();
        obj.id = 3;
        System.out.println("The book id is: " + obj.id);

        TextBook obj1 = new TextBook();
        obj1.pages = 320;
        System.out.println("The book pages are: " + obj1.pages);

        TextBook obj2 = new TextBook();
        obj2.price = 499;
        System.out.println("The book price is: " + obj2.price);

        TextBook obj3 = Textnew Book();
        obj3.isbn = 9781234567890L;
        System.out.println("The book ISBN is: " + obj3.isbn);

        TextBook obj4 = new TextBook();
        obj4.grade = 'A';
        System.out.println("The book grade is: " + obj4.grade);

        TextBook obj5 = new TextBook();
        obj5.tax = 5.0f;
        System.out.println("The book tax is: " + obj5.tax);

        TextBook obj6 = new TextBook();
        obj6.rating = 4.8;
        System.out.println("The book rating is: " + obj6.rating);

        TextBook obj7 = new TextBook();
        obj7.available = true;
        System.out.println("The book availability is: " + obj7.available);

        TextBook obj8 = new TextBook();
        obj8.title = "Java Programming";
        System.out.println("The book title is: " + obj8.title);
    }
}
