class Student {
    byte id;
    short age;
    int marks;
    long regNo;
    char grade;
    float percentage;
    double attendance;
    boolean pass;
    String name;

    public static void main(String[] args) {
        Student obj = new Student();
        obj.id = 10;
        System.out.println("The student id is: " + obj.id);

        Student obj1 = new Student();
        obj1.age = 20;
        System.out.println("The student age is: " + obj1.age);

        Student obj2 = new Student();
        obj2.marks = 480;
        System.out.println("The student marks are: " + obj2.marks);

        Student obj3 = new Student();
        obj3.regNo = 2024101001L;
        System.out.println("The student register number is: " + obj3.regNo);

        Student obj4 = new Student();
        obj4.grade = 'A';
        System.out.println("The student grade is: " + obj4.grade);

        Student obj5 = new Student();
        obj5.percentage = 96.0f;
        System.out.println("The student percentage is: " + obj5.percentage);

        Student obj6 = new Student();
        obj6.attendance = 88.5;
        System.out.println("The student attendance is: " + obj6.attendance + "%");

        Student obj7 = new Student();
        obj7.pass = true;
        System.out.println("The student pass status is: " + obj7.pass);

        Student obj8 = new Student();
        obj8.name = "Rahul Mehta";
        System.out.println("The student name is: " + obj8.name);
    }
}
