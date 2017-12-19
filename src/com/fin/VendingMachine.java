package com.fin;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean power = true;
		int a =15;
		int b =20;
		int c =30;
		int cash =0;
		Scanner sc =new Scanner(System.in);
		while(power){
			System.out.println("販賣機餘額:"+cash+"元");
			System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
			String line = sc.next();
			switch(line){
				case "1":
					cash = cash+1;
					break;
				case "5":
					cash = cash+5;
					break;
				case "10":
					cash = cash+10;
					break;
				case "0":
					power = false;
					break;
				case "a":
					if(cash>=a){
						cash = cash - a;
						System.out.println("DON!");
					}
					else{
						System.out.println("BEEP!");
					}
				case "b":
					if(cash>=b){
						cash = cash - b;
						System.out.println("DON!");
					}
					else{
						System.out.println("BEEP!");
					}
				case "c":
					if(cash>=c){
						cash = cash - c;
						System.out.println("DON!");
					}
					else{
						System.out.println("BEEP!");
					}
			}
		}
	}
}
