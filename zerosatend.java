import java.util.Scanner;
 class zerosatend {
	public static void main(String[] args)
	{
		int[] A = { 3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
		int n = A.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] != 1) {
				swap(A, j, i); 
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " "); 
		}
	}
	public static void swap(int[] A, int a, int b)
	{
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
}


