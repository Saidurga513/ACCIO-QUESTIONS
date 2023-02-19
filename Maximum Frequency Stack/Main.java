import java.util.*;

class FreqStack {
Map<Integer,Integer> freqmap;
    Map<Integer,Stack<Integer>> freqstack;
    int maxfreq;
	public FreqStack() {
        freqmap=new HashMap<>();
        freqstack=new HashMap<>();
        maxfreq=0;
    }

    public void push(int x) {
		int freq=freqmap.getOrDefault(x,0 )+1;
        freqmap.put(x, freq);
        if(freq>maxfreq) maxfreq=freq;
            freqstack.computeIfAbsent(freq, f->new Stack<>()).push(x);
    }

    public int pop() {
		Stack<Integer> s=freqstack.get(maxfreq);
        int top=s.pop();
        if(s.isEmpty())
        maxfreq--;
        freqmap.put(top, freqmap.get(top)-1);
        return top;
    }
}

public class Main {
    public static void main(String[] args) {
        FreqStack fs = new FreqStack();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equals("push")) {
                int val = sc.nextInt();
                fs.push(val);
            } else if (str.equals("pop")) {
                System.out.println(fs.pop());
            }
        }
        sc.close();
    }
}