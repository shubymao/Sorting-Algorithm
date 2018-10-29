package Sorting;
import java.lang.Comparable;
import java.util.ArrayList;
public class BubbleSort<E> {

    public Comparable[] sort(Comparable[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length -1; j++) {
                if (input[j].compareTo(input[j+1])>0){
                Comparable temp = input[j];
                input[j]=input[j+1];
                input[j+1]=temp;
                }
            }
        }
        return input;
    }

}
