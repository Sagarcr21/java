class Instagram{
public static void openApp(){
System.out.println("opening the app");
seeMessage();
}
public static void seeMessage(){
System.out.println("seeing the message");
typingMessage();
}
public static void typingMessage(){
System.out.println("typing the message");
checkStatus();
}
public static void checkStatus(){
System.out.println("checking the status");
closeApp();
}
public static void closeApp(){
System.out.println("sapp closing");
}
public static void main(String[] args){
openApp();
}
}
