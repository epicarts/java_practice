package os.peterson;

import java.util.concurrent.atomic.AtomicBoolean;

public class Peterson2 {
    static int count = 0;

    static int turn = 0;

    static AtomicBoolean[] flag;

    public static void main(String[] args) throws InterruptedException {
        flag = new AtomicBoolean[2];
        for (int i = 0; i < flag.length; i++){
            flag[i] = new AtomicBoolean();
        }

        Thread t1 = new Thread(new Peterson2.Producer());
        Thread t2 = new Thread(new Peterson2.Consumer());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Peterson1.count);

    }
    static class Producer implements Runnable {
        // main에서 바로생성을하기 떄문에 static
        @Override
        public void run() {
            for (int k = 0; k < 100000; k++)
            {
                flag[0].set(true);
                turn = 1;
                while (flag[1].get() && turn == 1)
                    ;

                // critical section
                count++;
                // exit // critical section
                flag[0].set(false);


                // remainder section
            }
        }
    }

    private static class Consumer implements Runnable {
        @Override
        public void run() {
            for (int k = 0; k < 100000; k++)
            {
                flag[1].set(true); // 절대로 컨텍스트 스위치가 걸리지 않음. 인터럽트를 무시.
                turn = 0;
                while (flag[0].get() && turn == 0)
                    ;

                // critical section
                count--;
                // exit // critical section
                flag[1].set(false);


                // remainder section
            }
        }
    }
}
