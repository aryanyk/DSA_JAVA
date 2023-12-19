import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        /*  Linked List acts as a Stack
        linkedList.push("A");
        linkedList.push("b");
        linkedList.push("c");
        linkedList.push("d");
        linkedList.push("e");
        linkedList.push("f");
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);

        */
        /*  Linekd list also acts as a queue */
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);
        linkedList.add(4,"G"); // Helps to add element at specific index
        System.out.println(linkedList);
        linkedList.remove("G"); // helps to remove an  element
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("F")); // helps to print index of specific element
        System.out.println(linkedList.peekFirst()); // helps to get head element
        System.out.println(linkedList.peekLast());// helps to get tail element
        linkedList.addFirst("0");// helps to add element at first
        linkedList.addLast("9");// helps to add element at tail
        String first=linkedList.removeFirst();
        String last=linkedList.removeLast();
        System.out.println(last+first);

        System.out.println(linkedList);
        
    }
}
