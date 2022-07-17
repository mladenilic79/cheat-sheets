
/*
A left rotation operation on an array shifts each of the array's elements unit 
to the left. For example, if left rotations are performed on array, then the 
array would become.

Given an array of integers and a number, perform left rotations on the array. 
Return the updated array to be printed as a single line of space-separated 
integers.

Function Description
Complete the function rotLeft in the editor below. It should return the 
resulting array of integers.

rotLeft has the following parameter(s):
An array of integers.
An integer, the number of rotations.

Input Format
The first line contains two space-separated integers and, the size of and the 
number of left rotations you must perform. The second line contains 
space-separated integers.

Output Format
Print a single line of space-separated integers denoting the final state of the 
array after performing left rotations.

Sample Input
5 4
1 2 3 4 5

Sample Output
5 1 2 3 4
 */

package aa_exercises;

public class ArrayLoop_leftRotationOfArray {

	static int[] rotLeft(int[] a, int d) {

		for (int i = 0; i < d; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		return a;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int num = arr.length;
		int lr = 2;

		rotLeft(arr, lr);

	}

}
