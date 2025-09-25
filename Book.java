class Book {
    
   
    public static int name(String bookName) {
        if (bookName.equals("Math")) {
            return 200;
        }
        if (bookName.equals("Science")) {
            return 250;
        }
        if (bookName.equals("English")) {
            return 150;
        }
        return 0;
    }

    
    public static int name(String book, int qty) {
        if (book.equals("Math")) {
            return 200 * qty;
        }
        if (book.equals("Science")) {
            return 250 * qty;
        }
        if (book.equals("English")) {
            return 150 * qty;
        }
        return 0;
    }
	public static void name(int totalPrice) {
        System.out.println("The total book price is " + totalPrice);
    }

    
    
}
