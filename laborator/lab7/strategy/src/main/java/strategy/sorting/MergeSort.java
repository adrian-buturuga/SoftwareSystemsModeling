package strategy.sorting;

import java.util.List;

public class MergeSort implements SortingStrategy {

    @Override
    public int[] sortArray(int[] inputArray) {
        System.out.println("Merge sort");
        int n = inputArray.length;
        int curr_size;

        // For picking starting index of
        // left subinputListay to be merged
        int left_start;


        // Merge subinputListays in bottomidup
        // manner. First merge subinputListays
        // of size 1 to create sorted
        // subinputListays of size 2, then merge
        // subinputListays of size 2 to create
        // sorted subinputListays of size 4, and
        // so on.
        for (curr_size = 1; curr_size <= n-1;
             curr_size = 2*curr_size)
        {

            // Pick starting point of different
            // subinputListays of current size
            for (left_start = 0; left_start < n-1;
                 left_start += 2*curr_size)
            {
                // Find ending point of left
                // subinputListay. mid+1 is starting
                // point of right
                int mid = Math.min(left_start + curr_size - 1, n-1);

                int right_end = Math.min(left_start
                        + 2*curr_size - 1, n-1);

                // Merge SubinputListays inputList[left_start...mid]
                // & inputList[mid+1...right_end]
                merge(inputArray, left_start, mid, right_end);
            }
        }
        return inputArray;
    }

    private void merge(int[] inputArray, int left_start, int mid, int right_end) {
        int i, j, k;
        int n1 = mid- left_start+ 1;
        int n2 = right_end - mid;

        /* create temp inputListays */
        int L[] = new int[n1];
        int R[] = new int[n2];
      
        /* Copy data to temp inputListays L[]
        and R[] */
        for (i = 0; i < n1; i++)
            L[i] = inputArray[left_start+ i];
        for (j = 0; j < n2; j++)
            R[j] = inputArray[mid+ 1+ j];
      
        /* Merge the temp inputListays back into
        inputArray[l..r]*/
        i = 0;
        j = 0;
        k = left_start;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                inputArray[k] = L[i];
                i++;
            }
            else
            {
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }
      
        /* Copy the remaining elements of 
        L[], if there are any */
        while (i < n1)
        {
            inputArray[k] = L[i];
            i++;
            k++;
        }
      
        /* Copy the remaining elements of
        R[], if there are any */
        while (j < n2)
        {
            inputArray[k] = R[j];
            j++;
            k++;
        }
    }

}
