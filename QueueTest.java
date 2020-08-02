import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        for (int i = 1; i <3; i++){
            queue.add("데이터-" + i);
        }
        System.out.println("가장앞에 있는 요소");
        System.out.println(queue.peek());
        System.out.println("순차적으로 요소 꺼내기");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
