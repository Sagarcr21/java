class Fruit1 {
    static int total;

    public static void main(String[] args) {
        System.out.println("The price of the fruit is:");
        System.out.println(price("apple"));   

        price("banana", 12);  
        price(total);         
    }

    
    public static int price(String fruitName) {
        if (fruitName.equals("apple")) {
            return 50;
        }
        if (fruitName.equals("banana")) {
            return 10;
        }
        if (fruitName.equals("mango")) {
            return 40;
        }
        return 0;
    }

    
    public static void price(String fruit, int qnty) {
        int p = price(fruit);  
        total = p * qnty;       
        System.out.println("The name of the fruit: " + fruit);
        System.out.println("The quantity of fruits: " + qnty);
    }

  
    public static void price(int total) {
        System.out.println("The total fruit price: " + total);
    }
}
