package online17a07a2019;

import java.util.Scanner;

public class SubsetProblemRecursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int soa = scn.nextInt();
		int[] array = new int[soa];
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		int c = tar(array, target, "", 0, 0);

		System.out.println();
		System.out.println(c);
	}

	public static int tar(int[] array, int target, String ans, int a, int vidx) {
		int c = 0;

		if (vidx == array.length) {

			if (a == target) {

				System.out.print(ans + " ");

				return 1;
			}

			return 0;
		}

		c += tar(array, target, ans + array[vidx] + " ", a + array[vidx], vidx + 1);
		c += tar(array, target, ans, a, vidx + 1);
		return c;
	}
}
