public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int index= binary(arr,4);
        System.out.println("VALUE IS AT INDEX:"+index);

    }

    public static int binary(int[]arr,int element){
        int low=0;
        int high=arr.length-1;
        while(low<=high) //Necessary condition
    {
         int mid=low+(high+low/2);// for finding perfect middle element when larger value

        if(arr[mid]==element){
            return mid;
        }
        else if (mid<element) {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
 
    }
    return -1;
    }
}
