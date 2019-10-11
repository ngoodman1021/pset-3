/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
        
        // comment out or uncomment as needed
        
        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
	   System.out.print("Enter an interger: ");
	   int positiveORnegative = in.nextInt();
	  
	   if(positiveORnegative > 0){
		   System.out.println("Positive.");
	   } else if (positiveORnegative < 0){
		   System.out.println("Negative.");
	   } else {
		   System.out.println("Zero.");
	   }
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {
	   System.out.print("Enter an interger: ");
	   int oddOReven = in.nextInt();
	  
	   if((oddOReven % 2) == 0){
		   System.out.println("Even.");
	   }else{
		   System.out.println("Odd.");
	   }
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter three integers. How are the integers ordered?
     */
    
    public void ordered() {
		System.out.println("\nEnter three intergers.\n");
		
		System.out.print("Enter an interger: ");
		int order1 = in.nextInt();
		System.out.print("Enter an interger: ");
		int order2 = in.nextInt();
		System.out.print("Enter an interger: ");
		int order3 = in.nextInt();
		
		System.out.println("");
		
		if(order1 < order2 && order2 < order3){
			System.out.println("Strictly Increasing.");
		}else if(order1 <= order2 && order2 <= order3){
			System.out.println("Increasing.");
		}else if(order1 > order2 && order2 > order3){
			System.out.println("Strictly Decreasing.");
		}else if(order1 >= order2 && order2 >= order3){
			System.out.println("Decreasing.");
		}else{
			System.out.println("Unordered.");
		}
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */
    
    public void gpa() {
		double a = 4.00;
		double b = 3.00;
		double c = 2.00;
		double d = 1.00;
		double f = 0.00;
		double plus = 0.33;
		double minus = 0.33;
		
		System.out.print("\nEnter a letter grade: ");
		String letterGradeBefore = in.nextLine();
		
		String letterGrade = letterGradeBefore.toUpperCase();
		System.out.println("");
		
		
		if (letterGrade.equals("A+") || letterGrade.equals("A")){
			System.out.printf("Your GPA is %.2f\n", a);
		} else if (letterGrade.equals("A-")){
			System.out.printf("Your GPA is %.2f\n", a - minus);
		}else if (letterGrade.equals("B+")){
			System.out.printf("Your GPA is %.2f\n", b + plus);
		}else if (letterGrade.equals("B")){
			System.out.printf("Your GPA is %.2f\n", b);
		}else if (letterGrade.equals("B-")){
			System.out.printf("Your GPA is %.2f\n", b - minus);
		}else if (letterGrade.equals("C+")){
			System.out.printf("Your GPA is %.2f\n", c + plus);
		}else if (letterGrade.equals("C")){
			System.out.printf("Your GPA is %.2f\n", c);
		}else if (letterGrade.equals("C-")){
			System.out.printf("Your GPA is %.2f\n", c - minus);
		}else if (letterGrade.equals("D+")){
			System.out.printf("Your GPA is %.2f\n", d + plus);
		}else if (letterGrade.equals("D")){
			System.out.printf("Your GPA is %.2f\n", d);
		}else if (letterGrade.equals("D-")){
			System.out.printf("Your GPA is %.2f\n", d - minus);
		}else if (letterGrade.equals("F")){
			System.out.printf("Your GPA is %.2f\n", f);
		}else{
			System.out.println("That's not a valid letter grade.");
		}
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {

    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a playing card. What card was entered?
     */
    
    public void cards() {

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {

    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */
    
    public void state() {

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {

    }
}