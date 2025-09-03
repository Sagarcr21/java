class Bus1{
public static void busStop(){
System.out.println("waiting for bus");
}
public static void enterBus(){
System.out.println("bus came and entering the bus");
}
public static void issueTicket(){
System.out.println("conductor asking ticket");
}
public static void giveMoney(){
System.out.println("amount paying");
}
public static void reachDestination(){
System.out.println("leave the bus");
}
public static void main(String[] args){
busStop();
enterBus();
issueTicket();
giveMoney();
reachDestination();
}
}
