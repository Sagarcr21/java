class Bookstall{

public static void main(String[] args) {
        System.out.println(Book.name("Math"));          
        int total = Book.name("Science", 4);           
        System.out.println(total);
        Book.name(total);                               
    }
}