class Circle extends Shape {
    public void radius() {
        System.out.println("Circle has radius 5cm");
    }
    public void area() {
        System.out.println("Area of Circle = πr²");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.area();
        if (s instanceof Circle) {
            Circle c = (Circle) s;
            c.radius();
            c.area();
        }
    }
}