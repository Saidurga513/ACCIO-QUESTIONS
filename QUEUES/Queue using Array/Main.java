import java.util.*;


class Queue {
    //Write your code here
    int[] a;
    int front=-1;
    int rear=-1;
    public Queue() {
        //Write your code here
        a=new int[1000];
		
    }

    public void push(int newElement) {
        //Write your code here
        if(front==-1 && rear==-1)
        {
            front=rear=0;
            a[rear]=newElement;
            return;
        }
        if((rear+1)%1000==front)
        {
            return;
        }
        rear++;
        rear%=1000;
        a[rear]=newElement;
    }
    public int pop() {
        //Write your code here
        if(front==-1&&rear==-1) return 0;
        if(front==rear)
        {
            int temp=a[front];
            front=rear=-1;
            return temp;
        }
        int temp=a[front];
        front++;
        front%=1000;
        return temp;
    }
    public int front() {
        //Write your code here
        return a[front];
    }
    public int size() {
        //Write your code here
        if(rear == -1 && front ==-1) return 0;

	
        if(rear>= front) return rear - front + 1;
        else return 1000 - front + rear;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.size());
        }
    }
}