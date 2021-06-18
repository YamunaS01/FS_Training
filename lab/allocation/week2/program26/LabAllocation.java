package lab.allocation.week2.program26;

import java.util.Scanner;

public class LabAllocation {

	public static void main(String[] args) {
		
		int lab1;
		
		int lab2;
		
		int lab3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the seat capacity for Lab 1 :"); 
		
		lab1 = sc.nextInt();
		
		System.out.println("Enter the seat capacity for Lab 2 :"); 
		
		lab2 = sc.nextInt();
		
		System.out.println("Enter the seat capacity for Lab 3 :"); 
		
		lab3 = sc.nextInt();
		
        if(lab1>lab2)
        {
        	if(lab2>lab3)
        	{
        		System.out.println("Lab 3 has minimal seating capacity : " + lab3);
        	}else
        		
        	{
        		System.out.println("Lab 2 has minimal seating capacity : " + lab2);
        	}
        	
        }else
        {
        	if(lab1>lab3)
        	{
        		System.out.println("Lab 3 has minimal seating capacity : " + lab3);
        	}else
        	{
        		System.out.println("Lab 1 has minimal seating capacity : " + lab1);
        	}
	}

}
}
