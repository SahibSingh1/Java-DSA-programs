import java.util.*;
import java.io.*;
public class mergeSort {
    public static void conquer(int[]ar,int si,int mid,int ei){
        int[] merged=new int[ei-si+1];
        int i1=si;
        int i2=mid+1;
        int x=0;
        while(i1<=mid&&i2<=ei){
            if(ar[i1]<=ar[i2]) {
                merged[x++]=ar[i1++];
            }
            else {
                merged[x++]=ar[i2++];
            }
        }
        while(i1<=mid){
            merged[x++]=ar[i1++];
        }
        while(i2<=ei){
            merged[x++]=ar[i2++];
        }
        for(int i=0, j=si;i<merged.length;i++,j++){
            ar[j]=merged[i];
        }
    }

    public static void divide( int[] ar,int si,int ei){
        if(si>=ei) return;

        int mid=si+(ei-si)/2;      //   (si+ei)/2

        divide(ar,si,mid);
        divide(ar,mid+1,ei);
        conquer(ar,si,mid,ei);
        

    }

    public static void main(String args[]){
        int[] ar =new int[]{1,25,55,0,5,1,23,76,9,3,2,1,4,1,66,0,3,};
        int n=ar.length-1;
        divide(ar,0,n);
        System.out.println(Arrays.toString(ar));
    }
}
