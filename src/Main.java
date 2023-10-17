import java.util.*;
//import:to import predefined functions n methods from directory
//java:package  .util:sub package under java  .*:to import everything present
class Main //class name always named after file name
{ //class starts
     public static void m1(){   //definition
        System.out.println("hi im in m1");
    }
    public static void main(String[] args)
            //public:makes the main function accessible for anyone
            //static: declares that the function is not objectified
            //void:no return value is expected
            //main():declaration of main function
            //String[]:declaration of string array
            //String[] args:main function takes input of string arguments
    { //main function starts
    System.out.println("hello world");//print statement
        //println:add new line after printing
        m1();//declaration
        int num1,num2;
        int sum;//or sum=0 //---> declaration of int data types
        Scanner a=new Scanner(System.in); //declaration of user input using scanner class
        //a:is an object created to take input from system
        num1=a.nextInt();
        num2=a.nextInt();
        sum=num1+num2;
        System.out.println("Sum="+sum);
    } //main function closes
} //class ends
