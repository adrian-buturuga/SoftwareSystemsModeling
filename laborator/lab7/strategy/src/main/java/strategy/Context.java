package strategy;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import strategy.sorting.SortingStrategy;

public class Context {

    SortingStrategy strategy;

    public SortingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> sortList(int[] array) {
        return Arrays.stream(strategy.sortArray(array))
                .boxed()
                .collect(Collectors.toList());
    }
}
