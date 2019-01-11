package com.algorithm.guide;

import org.junit.Test;




import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SelectionSortTest {
    SelectionSort selectionSort = new SelectionSort();

    @Test
    public void sort() {
        assertThat( selectionSort.selectionSort(new int[]{5,3,6,2,10}), is(new int[] {2,3,5,6,10}));
    }
}