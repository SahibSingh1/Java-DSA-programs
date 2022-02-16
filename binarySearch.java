public class binarySearch {
    public static int search(int[]ar,int key){
        
         int low=0;
         int high=ar.length-1;
         int mid;
        while(low<=high){
            mid=high-(high-low)/2;
            if(key==ar[mid]){
                return mid;
            }
            else if(key>ar[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return-1;
        
    }

    public static void main(String args[]){
         int[] ar=new int[]{1,4,6,8,13,15,20,24,35,47,77,89};
         System.out.println(search(ar, 2));
         
    }
}
