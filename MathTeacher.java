class MathTeacher extends Teacher {
    public void assignment() {
        System.out.println("MathTeacher gives math assignments");
    }
    public void subject() {
        System.out.println("MathTeacher teaches Mathematics");
    }

    public static void main(String[] args) {
        Teacher t = new MathTeacher();
        t.teach();
        t.subject();
        if (t instanceof MathTeacher) {
            MathTeacher m = (MathTeacher) t;
            m.assignment();
            m.subject();
        }
    }
}