class Cockroach extends Insects {
   
    public void fly() {
        System.out.println("the cockroach flies");
    }
    public void sound() {
        System.out.println("the cockroach sounds");
    }

    public static void main(String[] args) {
        Insects i = new Insects();
        i.bytes();
        i.sleep();
        i.fly();
        i.sound();

        System.out.println("---------------------------");

        Cockroach c = new Cockroach();  
        c.fly();    
        c.sound();  

        System.out.println("---------------------------");

        Insects obj = new Cockroach(); 
        obj.fly();    
        obj.sound(); 
    }
}