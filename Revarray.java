public class Revarray{
    public static void main(String args[]){
        int[] ar=new int[]{1,2,3,4,5};
        int start=0;
        int end=ar.length-1;
        int temp;
        while(start<end){
            temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}