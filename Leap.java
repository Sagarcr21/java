class Leap{
public static void main(String[] rs){
int year=2020;
if((year%400==0)||year%4==0&&year%100!=0){
System.out.println("leap year");
}else{
System.out.println("not a leap year");
}
}
}