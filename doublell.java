class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back=back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back=null;
    }

}

public class doublell {

private static void printLinkedList(Node head) {
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
    System.out.println(); // Add a newline after printing the linked list
}

private static Node Convertarr2dll(int[] ar) {
    Node head = new Node(ar[0]);
    Node prev = head;
    for (int i = 1; i < ar.length; i++) {
        Node temp = new Node(ar[i], null, prev);
        prev.next = temp;
        prev = temp;
    }
    return head;
}

private static Node delhead(Node head) { // deletion at head;
    if (head == null || head.next == null) {
        return null;
    }
    Node temp = head.next;
    temp.back = null;
    head.next = null;
    head = temp;
    return head;
}

private static Node deltail(Node head) { // deletion at head;
    if (head == null || head.next == null) {
        return null;
    }
    Node temp = head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node prev=temp.back;
    temp.back = null;
    prev.next = null;
    return head;
}

private static Node delk(Node head,int k) { // deletion of k the element;
    if (head == null || head.next == null) {
        return null;
    }
    if(k==1){
        return delhead(head);
    }
    int cnt=0;
    Node temp = head;
    while(temp!=null){
        cnt +=1;
        if(temp.next==null){
            return deltail(head);
        }
        
        if(cnt==k){
            break;
        }
        temp=temp.next;
    }
    Node prev=temp.back;
    Node front=temp.next;
    temp.next=null;
    temp.back=null;
    front.back =prev ;
    prev.next = front;
    return head;
}

private static Node inserthead(Node head,int val){  //Insertion at head; Or Insertion before head
    if(head==null){
        return new Node(val);
    }
    Node temp=head.next;
    Node newNode =new Node(val,head,null);
    temp.back=newNode;
    return newNode;

}

private static Node inserttail(Node head, int val) {
    if (head == null) {
        return new Node(val);
    }

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    Node newNode = new Node(val, null, temp); // New node with next as null and back as the current tail

    temp.next = newNode; // Update the next pointer of the current tail
    return head;
}

private static Node insertk(Node head,int val, int pos){
    if(head==null){
        return null;
    }
    if(pos==1){
        return inserthead(head, val);
    }
    Node temp=head;
    int cnt=1;
    while(temp!=null){
        cnt+=1;
        if(temp.next==null){
            return inserttail(head,val);
        }

        if(pos==cnt){
            break;
        }
        temp=temp.next;
    }
    Node prev=temp;
    Node front=temp.next;
    Node newNode=new Node(val,front,prev);
    prev.next=newNode;
    front.back=newNode;
    return head;
}

private static Node swap(Node head){
    Node temp=null;
    Node current=head;
    while (current!=null) {
        temp=current.back;
        current.back=current.next;
        current.next=temp;
        current =current.back; // it just acts as temp=temp.next; to move forward
        
    }
    if(temp!=null){
        head=temp.back;
    }
    return head;
}

    public static void main(String[] args) {
        int[] ar = {12, 3, 4, 5};
         Node head = Convertarr2dll(ar);
        // printLinkedList(head);
        // Node dNode = delhead(head);
        // Node dtail = deltail(head);
        // Node dk = delk(head,4);
        // Node headins = inserthead(head,6);
        // Node tailins = inserttail(head,9);
        // Node ink = insertk(head,16,3);
        Node rev = swap(head);
        printLinkedList(rev);
    }

    
}

