package strategy;

import strategy.sorting.MergeSort;
import strategy.sorting.QuickSort;
import strategy.sorting.SortingStrategy;

import java.util.Iterator;

public class App
{
    public static void main( String[] args ) {
        SortingStrategy strategy = new MergeSort();
        final var arrayToSort = new int[]{ 4, 3, 5, 2, 1, 3, 2, 3 };

        final var context = new Context();
        context.setStrategy(strategy);
        var iterable = context.sortList(arrayToSort);

        strategy = new QuickSort();
        context.setStrategy(strategy);
        iterable = context.sortList(arrayToSort);

        Iterator<Integer> iterator = iterable.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
