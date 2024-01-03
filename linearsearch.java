public class linearsearch {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7};

        int index= Linearsearch(array,3);

        if (index!=-1){
            System.out.println("Number is at :"+index);
        }
        else{
            System.out.println("Element Not found");
        }



    }

    private static int Linearsearch(int[] array,int element){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                return i;
            }
            
        }
        return -1;
    }
}
