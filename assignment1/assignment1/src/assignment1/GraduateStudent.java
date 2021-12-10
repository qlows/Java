package assignment1;
/*@author Umit Kilinc 101232721*/


public class GraduateStudent extends Student{
    private String subject;
    private int yearOfEntry;
    private String thesisTopic;


public GraduateStudent(int StudentID, String stdFirstName, String stdLastName, 
double[] stdMarks, Address stdAddress, String subject, int yearOfEntry, 
String thesisTopic){
    super(StudentID, stdFirstName, stdLastName, stdMarks, stdAddress);
    this.subject = subject;
    this.yearOfEntry = yearOfEntry;
    this.thesisTopic = thesisTopic;
}

/*to calculate graduates*/
public boolean Graduate(){
    return super.stdAverage() > 70;
}

/*return all values in string*/
    @Override
    public String toString() {
        return "GraduateStudent{" + "subject=" + subject + ", yearOfEntry=" + yearOfEntry + ", thesisTopic=" + thesisTopic + '}';
    }
}