class LEDLight extends Light {
    void efficiency() {
        System.out.println("LED light is energy efficient");
    }

    public static void main(String[] args) {
        LEDLight obj = new LEDLight();
        obj.plugIn();
        obj.type();
        obj.efficiency();
		Light c=new LEDLight();
		c.efficiency();
		Appliance n = new Light();
		n.type();
    }
}