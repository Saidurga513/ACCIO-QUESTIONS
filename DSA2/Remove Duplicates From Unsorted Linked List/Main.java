import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
        Solution A = new Solution();
        llist.head = A.removeDuplicate(llist.head);
        llist.printList();
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    
}

class Solution
{
    
    public static Node removeDuplicate(Node head)
    {
        // Your code here
        //Node dummy=null;
        Node temp=head,dummy=null,r=null;
        HashMap<Integer,Integer> map=new HashMap<>();
        if(head==null||head.next==null)return head;
        while(temp!=null)
        {
            if(!map.containsKey(temp.data))
            {
                map.put(temp.data, 1);
                Node newNode=new Node(temp.data);
                if(dummy==null)
                {
                    dummy=newNode;
                    r=newNode;
                }
                else
                {
                    dummy.next=newNode;
                    dummy=newNode;
                }
            }
            temp=temp.next;
        }
		return r;
	}
}