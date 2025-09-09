class Number {
    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50, 60, 70 };

       
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                System.out.println("Skipping 30 using continue...");
                continue; 
            }
            if (numbers[i] == 50) {
                System.out.println("Found 50, breaking the loop...");
                break; 
            }
            System.out.println("Number: " + numbers[i]);
        }


        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 60) {
                System.out.println("Skipping 60 using continue...");
                continue; // skip 60
            }
            if (numbers[i] == 20) {
                System.out.println("Found 20, breaking the loop...");
                break; 
            }
            System.out.println("Number: " + numbers[i]);
        }
	}
}