public class Linkedlist {
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

    public void print(){
        int count=0;
        if(head== null){
            System.out.println("ll is Empty");
            return;
        }
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            count++;

            if(count==2){
                temp= temp.next.next;
                count=0;
            }
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Linkedlist ll= new Linkedlist();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();

    }
    
}
