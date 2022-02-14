import java.util.*;
public class minimisingMaxDifference {
    public static void main (String args []){
        int[] ar=new int[]{3, 9, 12, 16, 20};
        int k=3;

        Arrays.sort(ar);
        int ans=ar[0]-ar[ar.length-1];
        int sm=ar[0]+k;
        int lr=ar[ar.length-1]-k;
        int mn,mx;
        for(int i=0;i<ar.length-1;i++){
            mn=Math.min(sm,ar[i+1]-k);
            mx=Math.max(lr,ar[i]+k);
            if(jupymn<0) continue;
            ans=Math.min(ans,mx-mn);
        }
        System.out.println(ans);
    }
}