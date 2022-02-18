import java.util.*;
import java.io.*;
public class countInversion {
    

    public static int conquer(int[]ar,int si,int mid,int ei){
        int[] merged=new int[ei-si+1];
        int i1=si;
        int i2=mid+1;
        int x=0;
        int count=0;
        
        while(i1<=mid&&i2<=ei){
            if(ar[i1]<=ar[i2]) {
                merged[x++]=ar[i1++];
            }
            else {
                merged[x++]=ar[i2++];
                count+=mid-i1+1;
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
        return count;
    }

    public static int divide( int[] ar,int si,int ei){
        int count=0;
        if(si<ei) {
            int mid=si+(ei-si)/2;      //   (si+ei)/2

            count+=divide(ar,si,mid);
            count+=divide(ar,mid+1,ei);
            count+=conquer(ar,si,mid,ei);
        }
        return count;

        

    }

    public static void main(String args[]){
        int[] ar =new int[]{2, 4, 1, 3, 5};
        int n=ar.length-1;
        System.out.println(divide(ar,0,n));
        System.out.println(Arrays.toString(ar));
        
    }
}


