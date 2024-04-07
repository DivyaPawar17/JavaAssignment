/*2. Program to check Harshad number or not using Java*/

package Java;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		int num;
		int sum=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		while(temp>0)
		{
		sum+=temp%10;
		temp=temp/10;

		}
		if(num%sum==0)
		{
		System.out.println("Harsad number");
		}
		else
		{
		System.out.println("not Harshad number");
		}

	}

}
