class College{
	byte id;
	String branch;
	String name;
	int fees;
	College(byte id,String branch,String name,int fees){
		this.id=id;
		this.branch=branch;
		this.name=name;
		this.fees=fees;
	}
	public void name(){
		System.out.println("the student name is "+name);
		branch();
		
	}
	public void branch(){
		System.out.println(name+" is an student of" +branch);
		fees();
	}
	public void fees(){
		System.out.println(name+"is paying fees to college is"+fees);
	}
	
public static void main(String[] args){
	College nut=new College((byte)12,"computer science and Engineering","sagar",25000);
	System.out.println(nut.id);
	System.out.println(nut.branch);
	System.out.println(nut.name);
	System.out.println(nut.fees);
	nut.name();

}
}