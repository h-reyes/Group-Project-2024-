package g_project;
import java.io.*;
import java.util.*;
// import java.io.IOException;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.PrintWriter;

public class project{
    
    // public static void studentProgramforfile (){

    //     File file = new File(info.txt);
    //     Filewriter fw = new Filewriter (file);
    //     Printwriter pw = new Printwriter (fw);

    //     pw.println(name 1, cosc 112, math 122 );
    //     pw.println(name 2, english 101, math 114);
    //     pw.println(name 3, psychology , sociology );
    //     pw.println(name 4, nurs 102, math 225 );
    //     pw.println(name 5, Reed, elective );

    //     pw.close ();
    // }
// method for adding student
public static void addStudent() throws IOException{

Scanner scnr = new Scanner(System.in);      //for user input
Scanner scnrD = new Scanner(System.in);      //for user input

Random rand = new Random();
// FileInputStream fileStream = new FileInputStream("studentRecords.txt"); //for reading from file
// Scanner inFS = new Scanner (fileStream);        //for reading from file
FileOutputStream fileStream2 = null;        //for writing to file
PrintWriter outFS = null;     //for writing to file
String userName;
double usergPA;
int studentID = 220;
for(int i=0; i<1; i++){
System.out.println("Enter your name");    
userName = scnr.nextLine();    
System.out.println("Enter your GPA");
usergPA = scnrD.nextDouble();
fileStream2 = new FileOutputStream("studentRecords.txt", true);
outFS = new PrintWriter (fileStream2);     //for writing to file
outFS.println(userName);
outFS.printf("%d%d\n", studentID, rand.nextInt(rand.nextInt(999))+100 );
outFS.println(usergPA);
// major intended
outFS.close();
// scnr.close();
}
}
//view students methods
public static void viewStudent() throws IOException{
String userName, tempName;
Scanner scnrString = new Scanner(System.in);
Scanner scnrChar = new Scanner(System.in); 
FileInputStream fileStream = null;
Scanner inFS = null;

System.out.println("Enter name of student you would like to view");
userName = scnrString.nextLine();


fileStream = new FileInputStream("studentRecords.txt"); //for reading from file
inFS = new Scanner (fileStream);    

while(inFS.hasNextLine()){
    tempName = inFS.nextLine();
    
    if(userName.equals(tempName)){
        System.out.println("Student Found");
        System.out.println(tempName);
        System.out.println("Student ID: " + inFS.nextInt());
        inFS.nextLine();
        System.out.println("GPA: " + inFS.nextLine());
        
    }
    // // else if(inFS.hasNextLine()) {
    // //     System.out.println("\nStudent not Found\na. Return to main menu");
    // //     System.out.println("Please enter your selection");
    // //     char userChoice = scnrChar.nextLine().charAt(0);
    // //    if((userChoice == 'a') || (userChoice == 'A')){
    // //             System.out.println("You have returned to the main menu");
    // //             inFS.close();
    // //             break;
    // //         }
    // //         else{
    // //             inFS.close();
    // //             break;
    // //         }
            
        }
        inFS.close();

    // switch()

    }


//adding courses and categorize
public static void addingCourse() throws IOException {
Random rand = new Random ();
Scanner scnr = new Scanner(System.in);
Scanner scnrInt = new Scanner(System.in);
// Scanner scnrDouble = new Scanner(System.in);
FileOutputStream fileStream3 = null;        //for writing to file
PrintWriter outFS = null;     //for writing to file
String courseName; 
int intendedMajor;

    String[] major ={"Computer Science","Nursing" ,"Math","Sociology","Child care"};   
    
    for(int i=0; i<1; i++){
    System.out.println("Enter the name of course");    
    courseName = scnr.nextLine();
    
    for(int j= 0; j < major.length; j++){
        System.out.printf("\n%d. %s", j+1 ,major[j]);
    }
    System.out.println("\nSelect intended major for this course.");
intendedMajor = scnrInt.nextInt() - 1;

    fileStream3 = new FileOutputStream("courseRecords.txt", true);
    outFS = new PrintWriter (fileStream3);     //for writing to file
    outFS.println(courseName);
    outFS.println(rand.nextInt(89999)+10000);
    outFS.println(major[intendedMajor]);
    outFS.close();
    // scnr.close();
    // scnrInt.close();
}
}
//main method
    public static void main(String[] args) throws IOException{
        Scanner scnr = new Scanner (System.in);
        int [] studentID = {220, 221, 222, 223, 224};
        //int [] [] 
      String[] names = {" name 1", " name 2", " name 3", "name4", "name 5"};//{ad,am,ac}
    //    Student[] s = new Student[3];// Array of objects.
    //    [0] = new Student("Peter",3 );
	//    [1] = new Student("John", 4);
	//    [2] = new Student("Lisa", 5);
    //    [3]=new Student("Bella", 6);
		for (int i = 0; i < 3; ++i) {
            
			// System.out.println(s[i].toString()); 
            System.out.println("Welcome to University!");
    int userChoice = 0; 
     while(userChoice != 4){
            System.out.println("1. Create Student Profile \n2. Create Course\n3. View Student\nPlease enter the menu item number you would like to navigate to\n");

    userChoice = scnr.nextInt(); 

    switch (userChoice){
        case 1:
            System.out.println("1. Create Student Profile\n");
            addStudent();
                break;
        case 2:
            System.out.println("2. Add Courses\n");
            addingCourse();
            break;
        case 3:
            System.out.println("3. View Student\n");
            viewStudent();
            break;
        default:
            System.out.println("Invalid Choice");
            break;
        }  
    }
    // scnr.close();
    }
}
}