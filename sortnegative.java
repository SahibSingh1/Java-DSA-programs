public class sortnegative {
    public static void main( String args[]){
        int[] ar=new int[]{-12,-34,4,8,3,-65,78,-3,5,2};
        int h=ar.length-1;
        int m=0;
        int temp;

        /* the elements after h will be +ve */

        while(m<=h){
            if(ar[m]>=0){
                temp=ar[m];
                ar[m]=ar[h];
                ar[h]=temp;
                h--;
            }
            else m++;
        }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
