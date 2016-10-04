package week1.hw1;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		for(int i=2;i<=n/2;i++)
		{
			temp=n%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("it is prime" + n);
			
		}
		else
			System.out.println("it is not prime" + n);

	}

}
