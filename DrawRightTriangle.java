//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           DrawRightTriangle
// Files:           (a list of all source files used by that program)
// Course:          CS 200 Spring 18-19
//
// Author:          Isaac Weber
// Email:           iweber2@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.  If you received no outside help from either type of 
// source, then please explicitly indicate NONE.
//
// Persons:         (identify each person and describe their help in detail)
// Online Sources:  (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
import java.util.Scanner;

public class DrawRightTriangle {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char triangleChar = '-';
      int triangleHeight = 0;
      
      System.out.print("Enter a character: ");
      triangleChar = scnr.next().charAt(0); 
      System.out.print("Enter triangle height (1-10): "); 
      do {  
          triangleHeight = scnr.nextInt();
          if (triangleHeight > 10 || triangleHeight < 1) {
              System.out.print("Please enter height between 1 and 10.");
              scnr.nextLine();
          }
          
      } while(triangleHeight > 10 || triangleHeight < 1);
      System.out.println();
      //System.out.print("");
      
      char c = triangleChar;
      int h = triangleHeight;
      int i;
      int t;
      for (i = 1; i <= h; ++i) {
          for(t = 1; t <= i; ++t) {
              System.out.print("" + c + " ");
          }
          System.out.println();
      }
      //replace the following with loops to draw the triangle...
      //System.out.println("*" + " ");
      //System.out.println("*" + " " + "*" + " ");
      //System.out.println("*" + " " + "*" + " " + "*" + " ");
      
      scnr.close();
      return;
      
   }
}