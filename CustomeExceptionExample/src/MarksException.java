public class MarksException extends Exception{

    float marks;
    MarksException(float marks){
        this.marks = marks;
    }

    public float getMarks() {
        return marks;
    }
}
