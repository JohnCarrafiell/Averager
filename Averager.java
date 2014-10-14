/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author <John Carrafiell>
* @version <October 14, 2014>
*
*/

import java.util.Scanner;

public class Averager {
	
	public static void main(String[] args) {
		
      Scanner scnr = new Scanner(System.in);
      int totalGrade = 0;
      int totalEnter = 0;
      System.out.println("enter grade or write -1 to exit");
      int addGrade = scnr.nextInt();
      while (addGrade != -1){
      totalGrade = totalGrade + addGrade;
      totalEnter = totalEnter + 1;
      System.out.println("Enter another number or write -1 to exit");
      addGrade = scnr.nextInt();
      }
     
      System.out.println("Average grade: "+totalGrade/totalEnter);
      }
      }


