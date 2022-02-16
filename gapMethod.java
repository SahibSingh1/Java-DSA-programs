import java.util.*;
public class gapMethod {
    public static void main(String args[]){
        int[] ar1=new int[]{1, 3, 5, 7};
        int[] ar2=new int[]{0, 2, 6, 8, 9};
        int n=ar1.length;
        int m=ar2.length;
        int gap = (m+n)/2+(m+n)%2;
        int i=0;
        int temp;
        while(true){
            if(i+gap<n){
                if(ar1[i]>ar1[i+gap]){
                    temp=ar1[i];
                    ar1[i]=ar1[i+gap];
                    ar1[i+gap]=temp;
                }
            }
            else{
                if(i<n){
                    if(ar1[i]>ar2[i+gap-n]){
                        temp=ar1[i];
                        ar1[i]=ar2[i+gap-n];
                        ar2[i+gap-n]=temp;
                    }
                }
                else{
                    if(ar2[i-n]>ar2[i+gap-n]){
                        temp=ar2[i-n];
                        ar2[i-n]=ar2[i+gap-n];
                        ar2[i+gap-n]=temp;
                    }
                }
            }
            i++;
            if(i+gap-n>=m){
                if(gap==1) break;
                gap=gap/2+gap%2;
                i=0;
            }
        }
        for( i=0;i<n;i++)System.out.println(ar1[i]);
        for( i=0;i<n;i++)System.out.println(ar2[i]);

    }
}
