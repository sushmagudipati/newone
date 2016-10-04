package week1.hw1;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //define limit
        int limit = 200;
       
        System.out.println("Printing Even numbers between 1 and " + limit);
       
        for(int i=100; i <= limit; i++){
               
                // if the number is divisible by 2 then it is even
                if( i % 2 == 0){
                        System.out.print(i + " ");
                }
		        }
	}
		
	}


