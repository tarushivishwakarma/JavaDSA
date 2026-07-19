class Node{
    int data;
    Node next;
    Node (int u){
        this.data=u;
        this.next=null;
    }
}
public class LinkedListCreation {
    static void display(Node head){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
    }
    static int sumAll(Node head){
        Node t=head;
        int sum=0;
        while(t!=null){
            sum+=t.data;
            t=t.next;
        }
        return sum;
    }
    static void insert(Node head,int x){
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=new Node(x);
    }
    static void mid(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    static int kfromend(Node head){
        int k=5;
        Node fast=head;
        Node slow=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
    static void deletekfromend(Node head,int k){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        insert(head,20);
        insert(head,30);
        insert(head,40);
        insert(head,50);
        insert(head,60);
        display(head);
        deletekfromend(head,4);
        display(head);
    }
}
