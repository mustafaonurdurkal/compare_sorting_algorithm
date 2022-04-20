package sorting_homework;


import sorting_homework.HeapSort;

public class Introsort {

	public static void sort(int[] array) {
		sort(array, 0, array.length);
	}

	/**
	 * Sorts a particular range {@code array[fromIndex], array[fromIndex + 1], 
	 * ..., array[toIndex - 2], array[toIndex - 1]}.
	 * 
	 * @param array     the array containing the target range.
	 * @param fromIndex the starting, inclusive index of the target range.
	 * @param toIndex   the ending, exclusive index of the target range.
	 */
	public static void sort(int[] array, int fromIndex, int toIndex) {
		int rangeLength = toIndex - fromIndex;

		if (rangeLength < 2) {
			return;
		}

		int depth = (int)(5 * Math.log(rangeLength) / Math.log(2.0)) / 3;
		introsort(array, fromIndex, toIndex, depth);
	}

	// The actual implementation.
	private static void introsort(int[] array, int fromIndex, int toIndex, int depth) {
		
		int rangeLength = toIndex - fromIndex;

		if (rangeLength < 2) {
			return;
		}

		if (depth == 0) {
			HeapSort.heapify(array, fromIndex, toIndex);
			return;
		}

		// Not deep enough, use quicksort. CLRS Chapter 7.1
		int q = partition(array, fromIndex, toIndex);
		introsort(array, fromIndex, q, depth - 1);
		introsort(array, q + 1, toIndex, depth - 1);
	}

	// CLRS Chapter 7.1
	private static int partition(int[] array, int fromIndex, int toIndex) {
		int pivot = array[toIndex - 1];
		int i = fromIndex - 1;

		for (int j = fromIndex; j < toIndex - 1; ++j) {
			if (array[j] <= pivot) {
				int tmp = array[++i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}

		int tmp = array[++i];
		array[i] = array[toIndex - 1];
		array[toIndex - 1] = tmp;
		return i;
	}
}

