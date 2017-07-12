package io.xfdingustc.sukada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.xfdingustc.sukada.algorithm.sort.BubbleSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] array = new int[] {3, 4, 23, 34 ,34, 234, 11, 0, 234, 12, 0, 44, 23};
        BubbleSort.sort(array);

        for (int i = 0; i < array.length; i++) {
            Log.d("sort", "array[" + i + "]" + array[i]);
        }
    }
}
