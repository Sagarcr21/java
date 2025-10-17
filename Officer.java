class Officer extends PoliceDepartment {

    
    public void work() {
        System.out.println("the officer patrols and maintains law and order personally");
    }
    public void sound() {
        System.out.println("the officer blows the whistle");
    }

    public static void main(String[] args) {
        PoliceDepartment pd = new PoliceDepartment();
        pd.recruit();
        pd.train();
        pd.work();
        pd.sound();

        System.out.println("---------------------------");

        Officer o = new Officer();
        o.work();
        o.sound();

        System.out.println("---------------------------");

        PoliceDepartment obj = new Officer();
        obj.work();
        obj.sound();
    }
}