package assignment1;
/*Umit Kilinc 101232721*/
public class UndergraduateStudent extends Student {
    private String subject;
    private int yearOfEntry;

public UndergraduateStudent(int StudentID, String stdFirstName, String stdLastName, double[] stdMarks,
    Address stdAddress, String subject, int yearOfEntry){
        super(StudentID, stdFirstName, stdLastName, stdMarks, stdAddress);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
}

/*to calculate undergraduates*/
public boolean Graduate(){
    return super.stdAverage() > 50;
}

/*return all values in string*/
@Override 
public String toString(){
    return super.toString() + ",subject=" + subject + ",yearOfEntry=" + yearOfEntry + "\n";
}
}