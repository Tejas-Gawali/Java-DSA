// Java program to find the K-th largest sum
// of subarray

import java.util.*;

public class GFG {

	// Function to calculate Kth largest element
	// in contiguous subarray sum
	static int kthLargestSum(int arr[], int N, int K)
	{
		ArrayList<Integer> result = new ArrayList<>();

		// Generate all subarrays
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = i; j < N; j++) {
				sum += arr[j];
				result.add(sum);
			}
		}

		// Sort in decreasing order
		Collections.sort(result,
						Collections.reverseOrder());

		// return the Kth largest sum
		return result.get(K - 1);
	}

	// Driver's code
	public static void main(String[] args)
	{
		int a[] = { 20, -5, -1 };
		int N = a.length;
		int K = 3;

		// Function call
		System.out.println(kthLargestSum(a, N, K));
	}
}

// This code is contributed by Karandeep1234
