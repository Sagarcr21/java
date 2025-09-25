class Bottle{
public static void main(String[] atgs){
System.out.println(name("signature"));
int  total=name("signature",2);
System.out.println(total);
name(total);
}
public static int name(String bottleName){
if(bottleName=="signature"){
return 20;
}
if(bottleName=="kenley"){
return 23;
}
if(bottleName=="bislery"){
return 25;
}
return 0;
}
public static int name(String bottle,int noOfbottles){
if(bottle=="signature"){
return 20*noOfbottles;
}
if(bottle=="kenley"){
return 23*noOfbottles;
}
if(bottle=="bislery"){
return 25*noOfbottles;
}
return 0;
}
public static void name(int bottlePrice){
System.out.println("the total bottlePrice is "+bottlePrice);
}
}