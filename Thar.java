class Thar{
static byte id;
static short no;
static int price;
static long number;
static char series;
static float gst;
static double sgst;
static boolean available;
static String name;
public static byte carId(){
id=45;
return id;
}
public static short carNo(){
no=454;
return no;
}
public static int carPrice(){
price=5643;
return price;
}
public static long number(){
number=43637583l;
return number;
}
public static char series(){
series=78;
return series;
}
public static float gst(){
gst=375.784f;
return gst;
}
public static double sgst(){
sgst=6734.564d;
return sgst;
}
public static boolean available(){
available=false;
return available;
}
public static String name(){
name="Thar";
return name;
}
public static void main(String [] args){
byte ids=carId();
System.out.println(ids);
short nos=carNo();
System.out.println(nos);
int prices=carPrice();
System.out.println(prices);
long numbers=number();
System.out.println(numbers);
char seriess=series();
System.out.println(seriess);
float var=gst();
System.out.println(var);
double vats=sgst();
System.out.println(vats);
boolean isAvailable=available();
System.out.println(isAvailable);
String names=name();
System.out.println(names);
}
}