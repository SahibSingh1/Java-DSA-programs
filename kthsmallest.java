public class kthsmallest {
    public static void main(String args[]){
        int[] arr= new int[]{7,10,4,3,20,15};
        int r=arr.length;
        int temp;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<r-1-i;j++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i=0;i<r;i++){
            System.out.println(arr[i]);
        }
    }
}
