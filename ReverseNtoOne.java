package numbers;

import java.util.Scanner;

public class ReverseNtoOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for reverse print");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.print(i);
		}
	}

}
