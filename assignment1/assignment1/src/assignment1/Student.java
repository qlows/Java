package assignment1;
/*Umit Kilinc 101232721*/
public class Student{

private int StudentID;
private String stdFirstName, stdLastName;
private double[] stdMarks;
private Address stdAddress;

public Student (int StudentID, String stdFirstName, String stdLastName, double[] stdMarks, Address stdAddress) {
    this.StudentID = StudentID;
    this.stdFirstName= stdFirstName;
    this.stdLastName = stdLastName;
    this.stdMarks = stdMarks;
    this.stdAddress = stdAddress;
}

/*getters and setters*/
public Address getAddress(){
    return stdAddress;
}
public void setAddress(Address stdAddress){
    this.stdAddress = stdAddress;
}

public int getStudentID(){
    return StudentID;
}
public void setStudentID(int StudentID){
    this.StudentID = StudentID;
}

public String setstdFirstName(){
    return stdFirstName;
}
public void setstdFirstName(String stdFirstName){
    this.stdFirstName = stdFirstName;
}

public String setstdLastName(){
    return stdLastName;
}
public void setstdLastName(String stdLastName){
    this.stdLastName = stdLastName;
}

    public double[] getStdMarks() {
        return stdMarks;
    }

    public void setStdMarks(double[] stdMarks) {
        this.stdMarks = stdMarks;
    }

    /*get student average*/
public double stdAverage(){
    double sum = 0;
    for(int i = 0; i <stdMarks.length; i++){
        sum += stdMarks[i];
    }
    return sum / stdMarks.length;

}

/*return all values in string*/
@Override
        public String toString() {
        String result = "studentID=" + StudentID + ", stdFirstName=" + stdFirstName + ", stdLastName=" + stdLastName + ",stdMarks={";
        for (int x = 0; x < stdMarks.length; x++) {
            result += stdMarks[x] + ",";
        }
        result += "},Address=" + stdAddress.toString();
        return result;
    }
}