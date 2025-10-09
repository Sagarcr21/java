class Bookstall{
	public static int orice(){
		int price=566;
		return price;
	}

public static void main(String[] args) {
        System.out.println(Book.name("Math"));          
        int total = Book.name("Science", 4);           
        System.out.println(total);
        Book.name(total);
		int num=orice();
       System.out.println(num);		
    }
}