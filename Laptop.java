class Laptop{
static int price;
static boolean isAvailable;
public static void main(String [] args){
	dell();
	System.out.println("\n");
	hp();
}
public static void dell(){
char series='A';
price=1234;
isAvailable=true;
String name="Dell";
System.out.println(series);
System.out.println(price);
System.out.println(isAvailable);
System.out.println(name);
}
public static void hp(){
char series='C';
price=12343;
isAvailable=true;
String name="hp";
System.out.println(series);
System.out.println(price);
System.out.println(isAvailable);
System.out.println(name);
}
}