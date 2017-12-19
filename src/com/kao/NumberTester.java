package com.kao;

public class NumberTester {
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%5==0){
				System.out.println((3*i) +" ");
			}
			else{
				System.out.print((3*i) +" ");
			}
			if ((3*i)>=99){
				break;
			}
		}
	}
}
