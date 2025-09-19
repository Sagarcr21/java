class Truck{
public static void main(String [] args){
	String driver[]={"kdg","siu","jh"};
start((byte)12,(short)355,2344,2442251239l,'A',6543.58f,2345.856453d,true,
driver);
}
public static void start(byte id,short no,int price,
long phnNumber,char series,float gst,double sgst,boolean is,String driver[]){
System.out.println("the id of the truck :"+id+
"\nthe number of the driver:"+no+
"\n price of yhe truck :"+price+
"\n the driver phn number:"+phnNumber+
"\n the series of the truck :"+series+
"\n the truck gst :"+gst+
"\n the truck sgst :"+sgst+
"\n the truck is avilable :"+is);

for(int i=0;i<driver.length;i++){
System.out.println("the driver name:"+driver[i]);
}	
 

}
}

