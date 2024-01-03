import java.util.LinkedList;
import java.util.ArrayList;
public class timecomparison {
    public static void main(String[] args) {
        LinkedList<Integer> LinkedList=new LinkedList<Integer>();
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            LinkedList.add(i);
            ArrayList.add(i);
        }

        long start =System.nanoTime();
        // LinkedList.get(99);
        LinkedList.remove(0);
        long end=System.nanoTime();

        long elapsed =end-start;

        System.out.println("TIME LINKED LIST:"+elapsed);

        // ArrayList
        start =System.nanoTime();
        // ArrayList.get(99);
        ArrayList.remove(0);
        end=System.nanoTime();

        elapsed =end-start;

        System.out.println("TIME ARRAYLIST LIST:"+elapsed);
    }
    
}
