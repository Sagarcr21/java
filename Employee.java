class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void empName() {
        System.out.println("Employee Name: " + name);
        dept();
    }

    void dept() {
        System.out.println(name + " works in " + department + " department.");
        sal();
    }

    void sal() {
        System.out.println(name + "'s salary is " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(10, "Rahul", "IT", 55000);
        e.empName();
    }
}
