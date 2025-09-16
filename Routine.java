class Routine{
public static void wakeUp(){
System.out.println("wakeUp at time is = 7:00am");
ready();
}
public static void ready(){
System.out.println("ready at time is = 8:00am");
breakfast();
}
public static void breakfast(){
System.out.println("breakfast at time is =9:00am");
wentTocourse();
}
public static void wentTocourse(){
System.out.println("wentTocourse at time is =2:30pm");
dinner();
}
public static void dinner(){
System.out.println("dinner at time is=8:00pm");
}
public static void main(String [] args){
wakeUp();
}
}


