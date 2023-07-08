package com.rays.ex;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 324;
		int r;
		int sum= 0;
		int n= number;
		while (n>0) {
			r = n % 10;
			sum = (sum * 10) +r ;
			n=n/10;
		}if (sum==number) {
			System.out.println("palindrome number" + sum);
		}else {
			System.out.println("not palindrome number" +sum);
		
			
			
		}
	}

}
