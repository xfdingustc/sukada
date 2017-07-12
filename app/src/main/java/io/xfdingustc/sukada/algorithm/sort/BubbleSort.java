package io.xfdingustc.sukada.algorithm.sort;

import java.util.ArrayList;

/**
 * Created by whaley on 2017/7/12.
 */

public abstract class BubbleSort {
    public static void sort(int[] list) {
        int i, j;
        for (i = list.length - 1; i > 0; i--) {
            for (j = 0 ; j < i; j++) {
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1]  = tmp;
                }
            }
        }

    }
}
