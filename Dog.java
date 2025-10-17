class Dog extends Animal{
	public void run(){
		System.out.println("the dog runs fastly");
	}
    public void sound(){
        System.out.println("the dog sounds");
	}
	public static void main(String [] aergs){
		Animal.eats();
		Animal.sleep();
		Animal obj=new Animal();
		obj.run();
		obj.sound();
		Dog obj1=new Dog();
		obj1.run();
		obj1.sound();
		Animal obj2=new Dog();
		obj2.eats();
		obj2.sleep();
		obj2.run();
		obj2.sound();
		
	}
}