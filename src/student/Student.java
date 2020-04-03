package student;

public class Student implements Comparable {
    private int rollNo;
    private int firstName;
    private int lastName;
    private int marks;

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getFirstName(){
        return firstName;
    }

    public void setFirstName(int firstName){
        this.firstName = firstName;
    }

    public int getLastName(){
        return lastName;
    }

    public void setLastName(int lastName){
        this.lastName = lastName;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compareTo(Object o){
        return 0;
    }


}
