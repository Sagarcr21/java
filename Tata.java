class Tata{
byte id;
int price;
char series;
boolean isAvailable;
String name;
Tata(){
System.out.println("no arguments are === ");
}
Tata(boolean isAvailable ){
System.out.println("---------\n");
System.out.println("one  arguments are === ");
System.out.println("the tata  is available :"+isAvailable);
}
Tata(int price,String name ){
System.out.println("---------\n");
System.out.println("two arguments are === ");
System.out.println("the tata price is :"+price);
System.out.println("the tata price is :"+name);
}

public static void main(String [] args){
Tata obj= new Tata();
obj.id=5;
obj.price=889;
obj.series=78;
obj.isAvailable=true;
obj.name="toyota";
System.out.println("the tata id is :"+obj.id);
System.out.println("the tata price is :"+obj.price);
System.out.println("the tata  is available :"+obj.isAvailable);
System.out.println("the tata series is :"+obj.series);
System.out.println("the tata name is :"+obj.name);
Tata obj1=new Tata(true);
Tata obj2=new Tata(123,"high raider");
obj2.price=889;
obj2.series=78;
obj2.isAvailable=true;
System.out.println("the tata price is :"+obj2.price);
System.out.println("the tata  is available :"+obj2.isAvailable);
System.out.println("the tata series is :"+obj2.series);

}
}