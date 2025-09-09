class Bus2{
public static void busStop(){
System.out.println("waiting for bus");
enterBus();
}
public static void enterBus(){
System.out.println("bus came and entering the bus");
Buss.conductorTicket();
issueTicket();
}
public static void issueTicket(){
System.out.println("conductor asking ticket");
giveMoney();
}
public static void giveMoney(){
System.out.println("amount paying");
reachDestination();

}
public static void reachDestination(){
System.out.println("leave the bus");
}
public static void main(String[] args){
busStop();
}
}
