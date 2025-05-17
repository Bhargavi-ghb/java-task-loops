package com.taskloops;

public class Factorial {
	/**public static void main(String args[]) {
		int num=0;
		int sum=1;
			if(num<=0) {
				System.out.println("enter valid number");
			}
			else {
				for(int i=1;i<=num;i++) {
					sum=sum*i;
				}
				System.out.println(sum);
			}
			
	}*/
	
	public int getfactorial(int num) {
		int sum=1;
		if(num<=0) {
			return -1;
		}
		if(num>0) {
			for(int i=1;i<=num;i++) {
				sum=sum*i;
			}
		}return sum;
	}
	
	public static void main(String []args) {
		Factorial obj = new Factorial();
		System.out.println(obj.getfactorial(23));
	}
	
}
