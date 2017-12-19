package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){
				if(i>=4&&i<=8){
					if(j!=9){
						System.out.print("...    ");
					}
					else{
						System.out.println("...");
					}
				}
				else{
					if((i*j)<10){
						if(j!=9){
							System.out.print(j+"*"+i+"="+" "+(i*j)+" ");
						}
						else{
							System.out.println(j+"*"+i+"="+" "+(i*j)+" ");
						}
					}
					else{
						if(j!=9){
							System.out.print(j+"*"+i+"="+(i*j)+" ");
						}
						else{
							System.out.println(j+"*"+i+"="+(i*j)+" ");
						}
					}
				}
			}
		}
	}

}
