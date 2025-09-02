class Static6{
static byte hotelNumber=34;
static short addressNumber=45;
static int price=15364;
static long contact=4647427467l;
static char series='D';
static float gst=354.8932f;
static double sgst=4234.23682d;
static boolean isAvailable=false;
public static void main(String[] args){
	hotelNumber=45;
    addressNumber=23;
  price=54254;
  contact=7854754542l;
  series='z';
  gst=1234.3456f;
 sgst=12345.234556788d;
 isAvailable=true;
System.out.println("the hotel number is: "+hotelNumber);
System.out.println("the address of hotel is: "+addressNumber);
System.out.println("the hotel price is: "+price);
System.out.println("the contactis: "+contact);
System.out.println("the hotel series is: "+series);
System.out.println("the hotel gst is: "+gst);
System.out.println("the hotel sgst is: "+sgst);
System.out.println("the hotel isAvailable: "+isAvailable);
System.out.println(Staticc1.hotelNumber);
System.out.println(Staticc1.addressNumber);
}
}