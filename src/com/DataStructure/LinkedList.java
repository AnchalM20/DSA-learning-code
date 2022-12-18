package com.DataStructure;


public class LinkedList
{
    Node head;
    int size;

    LinkedList()
    {
        size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            size++;
            this.data = val;
            this.next = null;
        }
        Node(int val, Node forward)
        {
            this.data = val;
            this.next = forward;
        }

    }
    public void insertAtFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    private void insetAtLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null)
              temp=temp.next;

            temp.next=newNode;
            newNode.next=null;
        }
    }

    public Node getNodeAtIndex(int index){
       Node temp = head;
       while(index!=0){
           temp=temp.next;
           index--;
       }
       return temp;

    }
//insert a node between two node
    public void insertAtAnyPos(int index,int val){
        Node newNode = new Node(val);
        Node pre = getNodeAtIndex(index-1);
        Node forward = pre.next;
        pre.next=newNode;
        newNode.next=forward;

    }
//Delete first node
    public void deleteAtFirst(){
        if(head==null)
        {
            System.out.println("List is empty!!");
            return;
        }
        size--;
       head=head.next;
    }

    public void deleteAtLast()
    {
        if(head==null)
        {
            System.out.println("List is empty!!");
            return;
        }
        size--;
        //if there is only one node in list
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    void getSize()
    {
        System.out.println(size);;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty!!");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("NULL\n");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printList();
        ll.insertAtFirst(12);
        ll.insertAtFirst(23);
        ll.insertAtFirst(45);
        ll.printList();
        ll.insetAtLast(18);
        ll.printList();
        ll.insertAtAnyPos(2,66);  //insert given value at given index
        ll.printList();
        ll.deleteAtFirst();
        ll.printList();
        ll.deleteAtLast();
        ll.printList();
        ll.getSize();
        ll.insertAtFirst(11);
        ll.getSize();
    }
}
