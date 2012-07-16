package dee.com.example.osgi.calservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dee.com.example.osgi.Calculator;



public class CalculatorImpl implements Calculator{
	
	
	
	String s;
	String s1;
	int a;
	int b;
	
	public void add() {
		System.out.println("This is inside of the next package using osgi framework impl for addtion");
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first value");
    	s=br.readLine();
    	a=Integer.parseInt(s);
    	System.out.println("Enter the second value");
    	s1=br.readLine();
    	b=Integer.parseInt(s1);
    	int c =a + b;
    	System.out.println("The output of the two number is ==> "+ c);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		 
		
	}

	public void sub() {
		System.out.println("This is inside of the next package using osgi framework impl for subtraction");
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first value");
    	s=br.readLine();
    	a=Integer.parseInt(s);
    	System.out.println("Enter the second value");
    	s1=br.readLine();
    	b=Integer.parseInt(s1);
    	int c =a - b;
    	System.out.println("The output of the two number is ==> "+ c);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		public void mul() {
			System.out.println("This is inside of the next package using osgi framework impl for multiplication");
			try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the first value");
	    	s=br.readLine();
	    	a=Integer.parseInt(s);
	    	System.out.println("Enter the second value");
	    	s1=br.readLine();
	    	b=Integer.parseInt(s1);
	    	int c =a * b;
	    	System.out.println("The output of the two number is ==> "+ c);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			 
			
		}

		public void div() {
			System.out.println("This is inside of the next package using osgi framework impl for division");
			try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the first value");
	    	s=br.readLine();
	    	a=Integer.parseInt(s);
	    	System.out.println("Enter the second value");
	    	s1=br.readLine();
	    	b=Integer.parseInt(s1);
	    	int c =a / b;
	    	System.out.println("The output of the two number is ==> "+ c);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			 
			
		}

		


}
