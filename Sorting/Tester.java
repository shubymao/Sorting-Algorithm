package Sorting;
import java.util.Random;
public class Tester {
    public static void main(String args[]){
        System.out.println("Test Started");
        Comparable[] a = new Integer[50];
        for(int i=0;i<50;i++){
        a[i]=(int)(Math.random()*100);
        }
        MergeSort<Integer> sorter= new MergeSort();
        a=sorter.sort(a);
        for(Comparable term: a){
            System.out.println((Integer) term);
        }
    }
}
