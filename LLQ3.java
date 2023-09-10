public class LLQ3 {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data= data;
            next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }

    public void print(int key1, int key2){
        if(head== null){
            System.out.println("ll is Empty");
            return;
        }
        Node temp= head;
        while(temp!= null){

            if(temp.data==key1){
                temp.data=key2;
            }
            else if(temp.data==key2){
                temp.data=key1;
            }
            
            System.out.print(temp.data+"->");
            temp = temp.next;

            
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LLQ3 ll= new LLQ3();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        int key1=3;
        int key2=3;
        ll.print(key1,key2);

    }
    
}
