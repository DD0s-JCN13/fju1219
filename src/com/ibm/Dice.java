package com.ibm;
import java.util.Random;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random dice = new Random();
		for(int i=1;i<=10;i++){
			int R1=dice.nextInt(6)+1;
			int R2=dice.nextInt(6)+1;
			int R3=dice.nextInt(6)+1;
			int R4=dice.nextInt(6)+1;
			System.out.print(R1+" "+R2+" "+R3+" "+R4);
			if (R1!=R2 && R2!=R3 && R3!=R4 && R1!=R3 && R1!=R4 && R2!=R4){
				System.out.println("*");
			}
			else{
				System.out.println("");
			}
		}	
	}
}
