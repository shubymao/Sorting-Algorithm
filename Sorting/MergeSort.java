package Sorting;
import java.util.Arrays;
public class MergeSort<E> {
    public static Comparable[] sort(Comparable[] input){
        if(input.length==1)return input;
        else{
            int mid = (input.length)/2;
            Comparable[]input1= Arrays.copyOfRange(input,0,mid);
            Comparable[]input2= Arrays.copyOfRange(input,mid,input.length);
            input1=sort(input1);
            input2=sort(input2);
            return merge(input1,input2);
        }
    }
    private static Comparable[] merge(Comparable[] input1,Comparable[]input2)
    {Comparable[] result = new Comparable[input1.length+input2.length];
    int i=0,j=0, r=0;
    int len1=input1.length, len2=input2.length;
    while(i<len1&&j<len2){
        if(input1[i].compareTo(input2[j])<0){
            result[r]=input1[i];
            i++;
            r++;
        }
        else {
            result[r] = input2[j];
            j++;
            r++;
        }
    }
    while(i<len1){
        result[r]=input1[i];
        i++;
        r++;
    }
    while(j<len2){
            result[r]=input2[j];
            j++;
            r++;
    }
    return result;
    }
}
