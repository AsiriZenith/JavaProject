public class MainApp {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        Student student = new Student(1,"Asiri");
        student.input();
        System.out.print(student.getAverage());
    }
}
