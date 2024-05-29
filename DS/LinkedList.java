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
    }
}
