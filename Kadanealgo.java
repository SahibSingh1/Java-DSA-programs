public class Kadanealgo {
    public static void main(String args[]){
        int[] ar=new int[]{-4 ,-1,-2,-3,-4};
        int sum=0;
        int m=ar[0];
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            if(sum>m){
                m=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(m);
    }
}
