class DoWhile{
    public static void main(String[] args) {
        
        int numbers[] = {10, 20, 30, 40, 50};

        int i = 0;

      
        do {
            System.out.println("the numbers are :"+numbers[i]);
           i=i--;
        } while (i < numbers.length);
    }
}
