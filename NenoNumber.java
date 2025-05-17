package com.taskloops;

public class NenoNumber {

	public void getNumber(int num) {
		int temp=num;
		int rem=0;
		int sum=0;
		int i=num*num;
		while(i!=0) {
			
			rem=i%10;
			sum+=rem;
			i=i/10;
		}	
		if(sum==temp) {
			System.out.println("Neno");
		}
		else {
			System.out.println("not neno");
		}
	}
	
	public static void main(String []args) {
		NenoNumber obj = new NenoNumber();
		obj.getNumber(18);
		
	}
	
	
	
}
