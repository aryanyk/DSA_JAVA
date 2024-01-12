 class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

     @Override
    public String toString() {
        return Integer.toString(data);
    }
}


public class linked_list {
// coverting array into lined list
    private static Node Convertarr2ll(int [] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    private static int lengthofll(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
        temp=temp.next;
        cnt=cnt+1;
        }
        return cnt;
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Add a newline after printing the linked list
    }

    static int ChkifPresetn(Node head,int val){
    Node temp=head;
    while(temp!=null){
        if(temp.data==val){
            return 1;
        }
        else{
        temp=temp.next;
        }

        }
        return 0;
        }

    private static Node removehead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;

    }

    private static Node removeTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;

    }

    private static Node removek(Node head,int k){
        if(head==null) return null;
        if(k==1){
            Node temp=head;
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        int cnt=0;
        while(temp !=null){
            cnt +=1;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }


    private static Node removel(Node head,int el){
        if(head==null) return null;
        if(head.data==el){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev =null;
        while(temp !=null){
            if(temp.data == el){
                prev.next=prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    // INSERTION AT DIFFERENT POSITION

    private static Node inserthead(Node head,int val){
        return new Node(val,head);
    }

    private static Node atlast(Node head ,int val){
        if(head==null) return new Node(val);
        Node temp=head;
        while( temp.next!= null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;

        return head;

    }


    private static Node insertk(Node head,int val,int pos){
        if(head==null){
            if (pos==1){
                return new Node(val);
            }
            else{
                return head;
            }
        }
        if(pos==1){
            return new Node(val,head);

        }
        Node temp=head;
        int cnt=0;
        while(temp !=null){
            cnt=cnt+1;
            if(cnt==(pos-1)) //because to add a element to specific position counter must be behing it
            {
                Node newNode=new Node(val,temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
            
        }
        return head;
    }



        private static Node insertbeforeval(Node head,int val,int el){
            if(head==null){
                return null;
            }
            if(head.data==val){
                return new Node(el,head);
    
            }
            Node temp=head;
            
            while(temp.next !=null){
               
                if(temp.next.data== val) //if data given matches just add it
                {
                    Node newNode=new Node(el,temp.next);
                    temp.next=newNode;
                    break;
                }
                temp=temp.next;
                
            }
            return head;

    }
    public static void main(String[] args) {
        int[] ar = {12, 3, 4, 5};
        Node head = Convertarr2ll(ar);  // Using index 1 instead of 2
        // Never fuck around original head pointer
        // Node temp=head;
        // while(temp!=null){

        // System.out.println(temp.data+ " " );
        // temp=temp.next;
        // }

        // System.out.println("Length :"+lengthofll(head));
        // System.out.println(ChkifPresetn(head,6));
        // head=removehead(head);
        // System.out.println(head.data);
        // head=removeTail(head);
        // System.out.println(head.data);
        // Node hea=removek(head,2);
        // printLinkedList(hea);

        // Node d=removel(head, 3);
        // printLinkedList(d);

        // head=inserthead(head,100);
        // printLinkedList(head);
        
        // head=atlast(head, 200);
        // printLinkedList(head);

        // head=insertk(head,100,2);
        // printLinkedList(head);

        head=insertbeforeval(head, 12, 50);
        printLinkedList(head);
    }
}
