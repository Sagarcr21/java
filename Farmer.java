class Farmer extends Crop {
    void harvest() {
        System.out.println("Farmer is harvesting wheat");
    }


    public static void main(String[] args) {
        Farmer obj = new Farmer();
        obj.area();
        obj.cropType();
        obj.harvest();
		Crop obj1=new Farmer();
		obj1.harvest();
        Farm m=new Crop();
		m.cropType();
		
    }
}