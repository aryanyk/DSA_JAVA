public class bubble_sort {
    // bubble sort = pairs of adjacent elements are compared, and the elements
	//		            swapped if they are not in order.
	
	//				 Quadratic time O(n^2)
	//				 small data set = okay-ish
	//				 large data set = BAD (plz don't)
        public static void main(String[] args) {
            int[] arr={1,4,3,9,6,8,5,7};
            Bubblesort(arr);

            for (int i:arr){
                System.out.println(i);
            }
        }

        public static void Bubblesort(int[] arr){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j]>arr[j+1]){
                        int temp =arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    
                }
                
            }

        }

}
