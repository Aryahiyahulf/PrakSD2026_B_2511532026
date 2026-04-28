package pekan4_2511532026;

public class QueueArray_2511532026 {
	int front_2026,rear_2026,size_2026;
	int capacity_2026;
	int array_2026[];
	
	public QueueArray_2511532026(int capacity) {
		this.capacity_2026 = capacity;
		front_2026=this.size_2026 =0;
		rear_2026=capacity - 1;
		array_2026=new int [this.capacity_2026];
	}
	
	boolean isFull_2026 (QueueArray_2511532026 queue) {
		return (queue.size_2026 == queue.capacity_2026);
		
	}
	
	boolean isEmpty_2026 (QueueArray_2511532026 queue) {
		return (queue.size_2026 == 0);
	}
	void enqueue_2026(int item) {
	    if (isFull_2026(this))
	        return;

	    this.rear_2026 = (this.rear_2026 + 1) % this.capacity_2026;
	    this.array_2026[this.rear_2026] = item;
	    this.size_2026 = this.size_2026 + 1;

	    System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_2026() {
	    if (isEmpty_2026(this))
	        return Integer.MIN_VALUE;

	    int item = this.array_2026[this.front_2026];
	    this.front_2026 = (this.front_2026 + 1) % this.capacity_2026;
	    this.size_2026 = this.size_2026 - 1;

	    return item;
	}

	int front_2026() {
	    if (isEmpty_2026(this))
	        return Integer.MIN_VALUE;

	    return this.array_2026[this.front_2026];
	}

	int rear_2026() {
	    if (isEmpty_2026(this))
	        return Integer.MIN_VALUE;

	    return this.array_2026[this.rear_2026];
	}

	// mencetak elemen antrian
	void display_2026() {
	    int i;

	    if (front_2026 == rear_2026) {
	        System.out.printf("\nAntrian Kosong\n");
	        return;
	    }

	    // kunjungi dari belakang dan cetak
	    for (i = front_2026; i < rear_2026; i++) {
	        System.out.printf(" %d <-- ", array_2026[i]);
	    }

	    return;
	}
}  
