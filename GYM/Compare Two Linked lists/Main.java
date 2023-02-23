import java.util.*;
public class Main {

static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public static  class LinkedLists
{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}    
    public static void main(String args[]) {
        //Write code here
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        LinkedLists l1=new LinkedLists();
        LinkedLists l2=new LinkedLists();
        for(int i=0;i<m;i++)
        l1.add(sc.nextInt());
        for(int i=0;i<n;i++)
        l2.add(sc.nextInt());
        sc.close();
        compareTwoLinkedList(l1.head,l2.head,m,n);
    }
    static void compareTwoLinkedList(Node h1,Node h2,int m,int n)
    {
        if(m!=n)
        {
        System.out.println("0");
        return;
        }
        while(h1!=null&&h2!=null){
        if(h1.data==h2.data)
        {
            h1=h1.next;
            h2=h2.next;
        }
        else
        {
            System.out.println("0");
            return; 
        }
        }
        System.out.println("1");
        
    }
}