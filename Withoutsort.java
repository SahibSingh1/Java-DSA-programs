public class Withoutsort{
    public static void main(String args[]){
        int[] ar= new int[]{0,2,1,2,0};
        int h=ar.length-1;
        int l=0;
        int m=0;
        int temp;
        /* the elements before "l" will be zero and after "h" will be 2 */
        while(m<=h){
            if(ar[m]==0){
                temp=ar[m];
                ar[m]=ar[l];
                ar[l]=temp;
                l++;
                m++;
            }
            else if(ar[m]==1) m++;
            else{
                temp=ar[m];
                ar[m]=ar[h];
                ar[h]=temp;
                h--;
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
