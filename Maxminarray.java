public class Maxminarray {
    public static void main(String args[]){
        int[] ar=new int[]{1,2,0,3,40,5,6};
        int max=-1;
        int min =9999;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
        
    }
}
