package g_project;

import java.util.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class project{


// method for adding student
public static void addStudent() throws IOException{

Scanner scnr = new Scanner(System.in);      //for user input
// FileInputStream fileStream = new FileInputStream("studentRecords.txt"); //for reading from file
// Scanner inFS = new Scanner (fileStream);        //for reading from file
FileOutputStream fileStream2 = null;        //for writing to file
PrintWriter outFS = null;     //for writing to file
String userName;
for(int i=0; i<1; i++){
System.out.println("Enter your name");    
userName = scnr.nextLine();
fileStream2 = new FileOutputStream("studentRecords.txt", true);
outFS = new PrintWriter (fileStream2);     //for writing to file
outFS.println(userName);
outFS.close();
scnr.close();
}
}

public static void viewStudent() throws IOException{

FileInputStream fileStream = null;
fileStream = new FileInputStream("studentRecords.txt"); //for reading from file
Scanner inFS = null;
inFS = new Scanner (fileStream);    
inFS.close();
}



    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int [] studentID = {220, 221, 222, 223, 224};
        //int [] [] 
String[] names = {" name 1", " name 2", " name 3", "name4", "name 5"};//{ad,am,ac}
    String[] major ={"Computer Science","Nursing" ,"Math","Sociology","Child care"};   

            System.out.println("Welcome to University!");
    int userChoice = 0; 
     while(userChoice != 5){
            System.out.println("1. Option 1\n2. Option2 \n3. Option 3\n4. Option 4\nPlease enter the menu item number you would like to navigate to\n");

    userChoice = scnr.nextInt(); 

    switch (userChoice){
        case 1:
            System.out.println("Option 1\n");
            break;  
        case 2:
            System.out.println("Option 2\n");
            
            break;
        case 3:
            System.out.println("Option 3\n");
            
            break;
        case 4:
            System.out.println("Option 4\n");

            break;
        default:
            System.out.println("Invalid Choice");
            break;
        
     }  
    }
    }
}