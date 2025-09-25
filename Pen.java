class Pen {
    static int total;

    public static void main(String[] args) {
        System.out.println("The price of the pen is:");
        System.out.println(cost("cello"));   

        cost("parker", 5);  
        cost(total);         
    }

    
    public static int cost(String penName) {
        if (penName==("cello")) {
            return 15;
        }
        if (penName==("parker")) {
            return 120;
        }
        if (penName==("reynolds")) {
            return 10;
        }
        return 0;
    }


    public static void cost(String pen, int qnty) {
        int p = cost(pen);   
        total = p * qnty;
        System.out.println("The name of the pen: " + pen);
        System.out.println("The quantity of pens: " + qnty);
    }


    public static void cost(int total) {
        System.out.println("The total pen price: " + total);
    }
}
