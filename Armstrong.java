package com.taskloops;

public class Armstrong {

	public void getCount(int num) {
		int result=0;
		int count=0;
		int temp=num;
		int num1=num;
		while(num>0) {
			count=count+1;
			num=num/10;
		}
		while(num1!=0) {
			
			int a=1;
			int rem=num1%10;
			for(int i=1;i<=count;i++) {
				a=a*rem;
			}
			result+=a;
			num1=num1/10;
		}	
		if(result==temp) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}
	public static void main(String []args) {
		Armstrong obj = new Armstrong();
		obj.getCount(15);
	}
	
}
