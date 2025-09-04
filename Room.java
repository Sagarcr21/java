class Room{
public static void enterHotel(){
System.out.println("entering the hotel ");
ticketBooking();
}
public static void ticketBooking(){
System.out.println("first ticket booking");
Registrator.askingTopay();
enterRoom();
}
public static void enterRoom(){
System.out.println("enter the room");
orderFood();
}
public static void orderFood(){
System.out.println("eating the food");
checkOut();
}
public static void checkOut(){
System.out.println("checkout the hotel");
}
public static void main(String[] args){
enterHotel();
}
}
