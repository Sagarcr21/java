class MergeConcat {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 34;

        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String merged = "";

        // join first number
        for (int i = 0; i < s1.length(); i++) {
            merged += s1.charAt(i);
        }

        // join second number
        for (int i = 0; i < s2.length(); i++) {
            merged += s2.charAt(i);
        }

        int mergedNum = Integer.parseInt(merged);

        System.out.println("Merged as String: " + merged);
        System.out.println("Merged as Number: " + mergedNum);
    }
}
