/*1. Find the Fibonacci Series up to Nth Term in Java Language
a. Method 1: Using Iteration (Using Three variables)
b. Method 2: Using Recursion
c. Method 3: Using Formula a[i]=a[i-1]+a[i-2]*/

package Java;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		// 1st Method
		Scanner sc = new Scanner(System.in);
		int first = 0, second = 1, third = 1;
		int n;
		System.out.println("Enter nth term: ");
		n = sc.nextInt();
		System.out.print(first + " " + second);
		for (int i = 2; i < n; i++) {
			third = first + second;
			System.out.print(" " + third);
			first = second;
			second = third;
		}

	}

}
