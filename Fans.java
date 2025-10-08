   class Fans{
   public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.id = 300;
        f1.speed = 5;
        f1.brand = "Usha";
        f1.isAutomatic = true;

        System.out.println("Fan ID: " + f1.id);
        System.out.println("Fan Speed: " + f1.speed);
        System.out.println("Fan Brand: " + f1.brand);
        System.out.println("Fan Automatic: " + f1.isAutomatic);

        Fan f2 = new Fan(true);
        Fan f3 = new Fan(4, "Havells");
		 
        TV t1 = new TV();
        t1.size = 55;
        t1.price = 45000;
        t1.brand = "Samsung";
        t1.isSmart = true;

        System.out.println("TV Size: " + t1.size);
        System.out.println("TV Price: " + t1.price);
        System.out.println("TV Brand: " + t1.brand);
        System.out.println("Smart TV: " + t1.isSmart);

        TV t2 = new TV(true);
        TV t3 = new TV(55000, "LG");
    
    }
   }