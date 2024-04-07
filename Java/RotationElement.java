/*6. Java program for rotation of elements of array- left and right. An array is
said to be right rotated if all the selected elements were moved towards
right by one position.*/

package Java;
import java.util.Scanner;
import java.util.Arrays;
public class RotationElement {
	
	public static void leftRotate(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}

	public static void rightRotate(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Original array: " + Arrays.toString(arr));

		leftRotate(arr);
		System.out.println("Array after left rotation: " + Arrays.toString(arr));

		rightRotate(arr);
		System.out.println("Array after right rotation: " + Arrays.toString(arr));
	}
}