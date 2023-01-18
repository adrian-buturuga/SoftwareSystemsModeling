package strategy.sorting;


public class QuickSort implements SortingStrategy {

    @Override
    public int[] sortArray(final int[] inputArray) {
        System.out.println("Quick sort");
        int l = 0;
        int h = inputArray.length-1;
        int[] stack = new int[h - l + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = sort(inputArray, l, h);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
        return inputArray;
    }

    private int sort(int[] inputArray, int minPos, int maxPos) {
        int pivot = inputArray[maxPos];
        int i = (minPos - 1);
        for (int j = minPos; j <= maxPos - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (inputArray[j] <= pivot) {
                i++;

                // swap inputArray[i] and inputArray[j]
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }

        // swap inputArray[i+1] and inputArray[maxPos] (or pivot)
        int temp = inputArray[i + 1];
        inputArray[i + 1] = inputArray[maxPos];
        inputArray[maxPos] = temp;

        return i + 1;
    }
}
