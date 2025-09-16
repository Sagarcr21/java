class Benz{
static byte speed =50;
static short model=31875;
static int price=1200;
static long engineNumber=4567867678l;
static char series=65;
public static void main(){
speed =95;
model=1747;
price=7542;
engineNumber=347347463l;
series=78;
System.out.println(speed);
System.out.println(model);
System.out.println(price);
System.out.println(engineNumber);
System.out.println(series);

}
public static void read(){
	String bookName="Bhagvathgeeta";
	System.out.println("the book name is :"+bookName);
}
public static void sing(){
	String songName="idre nemdi yak erbeku";
	System.out.println("the song name is :"+songName);
}
public static void main(String[] args){
	System.out.println(speed);
	System.out.println(model);
	System.out.println(price);
	System.out.println(engineNumber);
	System.out.println(series);
	main();
	read();
	sing();
	
	
	
}
}