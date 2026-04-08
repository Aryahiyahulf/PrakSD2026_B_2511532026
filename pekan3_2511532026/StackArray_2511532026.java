package pekan3_2511532026;

public class StackArray_2511532026 {
	static final int MAX = 1000;
	int top;
	int a[] = new int [MAX];
	boolean isEmpty() {
		return (top<0);
		
	}
	StackArray_2511532026() {
	top = -1;
}
	boolean push_2511532026 (int x) {
		if (top >= (MAX -1)) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x +" dimasukan dalam stack");
			return true;
		}
	}
	int pop_2511532026() {
		if (top<0) {
			System.out.println("sistem underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511532026() {
		if (top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		
		}
	}
	void print_2511532026() {
		
		for (int i = top;i>-1;i--) {
		System.out.println(" "+a[i]);
		}
	}
}