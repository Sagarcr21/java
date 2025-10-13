class Teacher {
    String name;
    String subject;
    int experience;

    Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    void teacherName() {
        System.out.println("Teacher Name: " + name);
        teach();
    }

    void teach() {
        System.out.println(name + " teaches " + subject);
        exp();
    }

    void exp() {
        System.out.println(name + " has " + experience + " years of experience.");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Anjali", "Mathematics", 8);
        t.teacherName();
    }
}
