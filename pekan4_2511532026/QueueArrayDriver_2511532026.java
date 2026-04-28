package pekan4_2511532026;

public class QueueArrayDriver_2511532026 {
    public static void main(String[] args) {
        QueueArray_2511532026 queue = new QueueArray_2511532026(1000);

        queue.enqueue_2026(10);
        queue.enqueue_2026(20);
        queue.enqueue_2026(30);
        queue.enqueue_2026(40);
        System.out.println("Item di depan " + queue.front_2026());
        System.out.println("Item paling belakang " + queue.rear_2026());
        System.out.println("tampilan queue");
        queue.display_2026();
        System.out.println();
        System.out.println(queue.dequeue_2026() + " dihapus dari queue");
        System.out.println("item di depan: " + queue.front_2026());
        System.out.println("item dibelakang: " + queue.rear_2026());
        System.out.println("tampilan queue setelah satu data dihapus");
        queue.display_2026();
    }
}