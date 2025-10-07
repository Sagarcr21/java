class Toyota{
byte id;
short no;
int price;
long number;
char series;
float gst;
double sgst;
boolean isAvailable;
String name;
public static void main(String [] args){
	Toyota obj=new Toyota();
	obj.id=3;
	System.out.println("the car id is :"+obj.id);
	Toyota obj1=new Toyota();
	obj1.no=234;
	System.out.println("the car no is :"+obj1.no);
	Toyota obj2=new Toyota();
	obj2.price=7575;
	System.out.println("the car price is :"+obj2.price);
	Toyota obj3=new Toyota();
	obj3.number=7575765l;
	System.out.println("the car number is :"+obj3.number);
	Toyota obj4=new Toyota();
	obj4.series=84;
	System.out.println("the car series is :"+obj4.series);
    Toyota obj5=new Toyota();
	obj5.gst=757.69f;
	System.out.println("the car gst is :"+obj5.gst);
    Toyota obj6=new Toyota();
	obj6.sgst=7235.9632581d;
	System.out.println("the car sgst is :"+obj6.sgst);
    Toyota obj7=new Toyota();
	obj7.isAvailable=true;
	System.out.println("the car available is :"+obj7.isAvailable);
    Toyota obj8=new Toyota();
	obj8.name="Toyota highraider";
	System.out.println("the car name is :"+obj8.name);
}
}