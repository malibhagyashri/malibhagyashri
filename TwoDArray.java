package com.tka.basic;
import java.util.Scanner;
public class TwoDArray {

	int arr[][]=new int[3][4];
	static Scanner sc=new Scanner(System.in);
	
	void setData()
	{    for(int i=0;i<3;i++)
		{
		for(int j=0;j<4;j++)
		{
			System.out.println("Enter elements");
			arr[i][j]=sc.nextInt();
		}
			
		}
	}
	void getData()
	{
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<4;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDArray obj=new TwoDArray();
		obj.setData();
		obj.getData();

	}

}
