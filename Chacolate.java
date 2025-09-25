class Chacolate{
	static int total;
public static void main(String[] atgs){
System.out.println("the price of the chacolate is ");	
System.out.println(name("crisspello"));
name("dairymilk",25);
name(total);
}
public static int name(String chacolateName){
if(chacolateName=="crisspello"){
return 20;
}
if(chacolateName=="5star"){
return 23;
}
if(chacolateName=="dairymilk"){
return 25;
}
return 0;
}
public static void name(String chacolate,int qnty){
	int price =name(chacolate);
 total=price*qnty;	
System.out.println("the name of the chacolate:"+chacolate+ "\n"+  "the quantity of chacolate :"+qnty);


}
public static void name(int total){
System.out.println("the total chacolate price :"+total);
}
}