// Check if each internal node of BST has only one child
import java.util.   ;
class Main {

	boolean hasOnlyOneChild(int pre[], int size) {
		int nextDiff, lastDiff;

		for (int i = 0; i < size - 1; i++) {
			nextDiff = pre[i] - pre[i + 1];
			lastDiff = pre[i] - pre[size - 1];
			if (nextDiff * lastDiff < 0) {
				return false;
			};
		}
		return true;
	}

	public static void main(String[] args) {
		Main tree = new Main();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] p = new int[size];
        for(int i = 0; i < size; ++i)
            p[i] = (sc.nextInt());
		if (tree.hasOnlyOneChild(p, size) == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

// This code has been contributed by Mayank Jaiswal
