class Drinks{
Drinks(){
this(1);
System.out.println("the drinks is ....");
}
Drinks(int quantity){
this(quantity,"tea");
System.out.println("the quantity of the drinks is"+quantity);
}
Drinks(int quantity,String name){
System.out.println("the name of the drinks is" +name);
}
}



