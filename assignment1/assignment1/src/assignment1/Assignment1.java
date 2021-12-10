/*Umit Kilinc 101232721*/
package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {
    
    
    public static void main(String[] args) {
    ArrayList<Student>students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    int Option = 0;
    while(Option != 5){
        Menu();
        System.out.print("Please select one.");
        Option = scanner.nextInt();
        scanner.nextLine();
       
        /*switch for menu option*/
       switch(Option){
       case 1: addUnderGraduateStudent(students, scanner); break;
       case 2: addGraduateStudent(students, scanner); break;
       case 3: viewAllStudents(students); break;
       case 4: viewEligibleStudents(students); break;
       case 5: System.out.println("Exit"); break;
       default: System.out.println("Invalid entry. Please choose another."); break;
        }
        
    }scanner.close();
    }
    

/*menu list*/
private static void Menu(){
System.out.println("1) ADD UNDERGRADUATE STUDENTS");
System.out.println("2) ADD GRADUATE STUDENTS");
System.out.println("3) VIEW ALL STUDENTS");
System.out.println("4) VIEW ELIGIBLE STUDENTS FOR GRADUATION");
System.out.println("5) EXIT");
}

/*student address part*/
private static Address studAddress(Scanner sc){
    System.out.print("STREET: ");
    String streetInfo = sc.nextLine();
    System.out.print("CITY: ");
    String city = sc.nextLine();
    System.out.print("PROVINCE: ");
    String province = sc.nextLine();
    System.out.print("POSTAL CODE: ");
    String postalCode = sc.nextLine();
    System.out.print("COUNTRY: ");
    String country = sc.nextLine();
    
    return new Address(streetInfo, city, province, postalCode, country);
}

/*student information part*/
private static Student studentI(Scanner sc){
    System.out.print("ENTER STUDENT ID: ");
    int studentID = sc.nextInt();
    sc.nextLine();
    System.out.print("ENTER STUDENT FIRST NAME: ");
    String studentFN = sc.nextLine();
    System.out.print("ENTER STUDENT LAST NAME: ");
    String studentLN = sc.nextLine();
    System.out.print("HOW MANY MARKS DO YOU WANT TO ENTER? ");
    int studentMarks = sc.nextInt();
    sc.nextLine();

    /*option to enter number of marks for student*/
    double[] Marks = new double[studentMarks];
    for(int i = 0; i < studentMarks; i++){
        System.out.println("ENTER MARK " + (i + 1));
        Marks[i] = sc.nextInt();
    }
    sc.nextLine();
        Address address = studAddress(sc);
    return new Student(studentID, studentFN, studentLN, Marks, address);
}

/*option to add undergraduate student*/
private static void addUnderGraduateStudent(ArrayList<Student> studentList, Scanner sc){
    Student student = studentI(sc);
    System.out.print("SUBJECT: ");
    String temp = sc.nextLine();
    System.out.print("YEAR OF ENTRY: ");
    int entryYear = sc.nextInt();
    sc.nextLine();
    
    /*to add undergraduate to the list*/
    UndergraduateStudent addUnderGraduateStudent = new UndergraduateStudent(student.getStudentID(),
    student.setstdFirstName(), student.setstdLastName(), student.getStdMarks(),
    student.getAddress(), temp, entryYear);
    
    studentList.add(addUnderGraduateStudent);
}

/*option to add graduate student*/
private static void addGraduateStudent(ArrayList<Student> studentList, Scanner sc){
    Student student = studentI(sc);
    System.out.print("SUBJECT: ");
    String temp = sc.nextLine();
    System.out.print("YEAR OF ENTRY: ");
        int entryYear = sc.nextInt();
    sc.nextLine();
    System.out.print("THESIS TOPIC: ");
    String thesisTopic = sc.nextLine();

    /*to add graduate student to the list*/
    GraduateStudent gradStu = new GraduateStudent(student.getStudentID(),
    student.setstdFirstName(), student.setstdLastName(), student.getStdMarks(),
    student.getAddress(), temp, entryYear, thesisTopic);
    
    studentList.add(gradStu);
}
/*option to view all the registered students*/
    private static void viewAllStudents(ArrayList<Student> students){
            for(int i = 0; i < students.size(); i++){
                System.out.println(students.get(i).toString());
            }
        }
        
    /*option to find students who are eligible to graduate*/
        private static void viewEligibleStudents(ArrayList<Student> students){
            int underG = 0;
            int grad = 0;
            System.out.println("___ELIGIBLE UNDERGRADUATE STUDENTS___");
            
            for(int i = 0; i < students.size(); i++){
                if(students.get(i) instanceof UndergraduateStudent){
                    UndergraduateStudent undergradStu = (UndergraduateStudent) students.get(i);
                    if(undergradStu.Graduate()){
                        System.out.println(undergradStu.toString());
                        underG++;
                    }
                }
            }
            if(underG == 0){
                System.out.println("NO ELIGIBLE UNDERGRADUATE.");
            }
            System.out.println("___ELIGIBLE GRADUATE STUDENTS___");
            for(int i = 0; i < students.size(); i++){
                if(students.get(i) instanceof GraduateStudent){
                    GraduateStudent gradStu = (GraduateStudent) students.get(i);
                    if(gradStu.Graduate()){
                        System.out.println(gradStu.toString());
                        grad++;
                    }
                }
            }
            if(grad == 0){
                System.out.println("NO ELIGIBLE GRADUATE");
            }
        }
}