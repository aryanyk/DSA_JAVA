public class darray {
    public static void main(String[] args) {
    DynamicArray darr =new DynamicArray();

    darr.add("A");
    darr.add("B");
    darr.add("C");

    System.out.println(darr);
    System.out.println("EMPTY:" + darr.isEmpty());
    darr.delete("B");
    System.out.println(darr);
    System.out.println(darr.search("C"));
    
		System.out.println("size: " + darr.size);
		System.out.println("capacity: " + darr.capacity);
		
        
    }

    


}