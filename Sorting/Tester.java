package Sorting;
import java.util.Random;
public class Tester {
    public static void main(String args[]){
        System.out.println("Test Started");
        Comparable[] a = new Integer[50];
        for(int i=0;i<50;i++){
        a[i]=(int)(Math.random()*100);
        }
        BubbleSort<Integer> sorter= new BubbleSort<>();
        a=sorter.sort(a);
        for(Integer term:(Integer[]) a){
            System.out.println(term);
        }
        try  {
            Thread.sleep(5000);
        } catch (Exception e){

        }
    }
}
