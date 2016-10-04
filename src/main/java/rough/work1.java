package rough;

import java.util.Scanner;

public class work1 
	{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int temp;
			boolean isPrime=true;
			System.out.println("Enter a number for check:");
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			for(int i=2;i<=num/2;i++)
			{
		           temp=num%i;
			   if(temp==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
			//If isPrime is true then the number is prime else not
			if(isPrime)
			   System.out.println(num + " is Prime Number");
			else
				 System.out.println(num + " is not Prime Number");
		   }
		}


