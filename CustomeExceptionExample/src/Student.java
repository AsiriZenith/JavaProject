import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private float marks[];
    private int noOfSubjects;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public float inputMarks(int index) throws MarksException{
        float mark = 0;
        if (index < 0) {
            System.out.println("Invalid Index!!");
        }
        else {
            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            float inputValue = sc.nextFloat();

            if (inputValue>0 && inputValue<100) {
                mark = inputValue;
            }
            else {
                throw new MarksException(inputValue);
            }
        }
        return mark;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        noOfSubjects = sc.nextInt();
        marks = new float[noOfSubjects];
        System.out.println("Enter marks for all subjects ");

        try {
            for (int i = 0; i < noOfSubjects; i++) {
                System.out.print("Enter mark for subject " + i + ": ");
                this.marks[i] = inputMarks(i);
                System.out.println();
            }
        }
        catch (MarksException e){
            System.out.print(e);
        }
    }

    public float getAverage(){
        float sumOfAllMarks = 0;
        float average = 0;
        for (int i = 0; i < noOfSubjects; i++) {
            sumOfAllMarks += marks[i];
        }

        try {
            average = sumOfAllMarks / marks.length;
        }
        catch (ArithmeticException e){
            System.out.print(e);
        }
        return average;
    }
}
