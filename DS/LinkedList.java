package DS;

public class LinkedList {
    static class Node{
        Integer data =null;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static void insert(Node head,int data){

        if(head.data==null) {
            head.data=data;
            return;
        }
        Node temp = new Node(data);
        while(head.next!=null){
            head=head.next;
        }
        head.next=temp;
    }

    static void insertAtHead(Node head, int data){
        if(head.data==null) {
            head.data=data;
            return;
        }
        int firstData = head.data;
        head.data = data;
        Node temp = new Node(firstData);
        temp.next = head.next;
        head.next = temp;
    }

    static void delete(Node head, int data){
        Node current=head;
        if(head.data==data){
            head.data=head.next.data;
            head.next=head.next.next;
            return;
        }

        while(current.next != null && current.next.data!=data ){
            current=current.next;
        }
        if(current.next != null && current.next.data ==data){
            current.next=current.next.next;
        }
    }

    static void reverse(Node head){
        Node prev=null;
        Node current=head;

        if(current.next == null ){
            return;
        }
        while(current.next != null){
            int data = current.data;
            Node temp = new Node(data);
            temp.next = prev;
            prev = temp;
            current=current.next;
        }
        int data = current.data;
        Node temp = new Node(data);
        temp.next = prev;
        prev = temp;
        head.data = prev.data;
        head.next = prev.next;

    }


    static void display(Node head){
        while(head.next!=null){
            System.out.print(head.data+" -> ");
            head= head.next;
        }
        System.out.print(head.data);
        System.out.println();
    }
    public static void main(String[] args){
        Node head = new Node();
        insert(head,5);
        insert(head, 4);
        insert(head, 7);
        insert(head, 9);
        insertAtHead(head,13);
        insertAtHead(head,11);
        display(head);
        delete(head,4);
        display(head);
        delete(head,11);
        display(head);
        delete(head,9);
        display(head);
        reverse(head);
        display(head);
    }
}
