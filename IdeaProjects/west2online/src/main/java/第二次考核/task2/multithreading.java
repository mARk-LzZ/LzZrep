package 第二次考核.task2;



import java.util.Scanner;
import java.util.concurrent.*;


public class multithreading {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long begin=0 ;
        long end=100000000 ;
        //创建10个线程
        thread callable1 = new thread(begin,end);
        thread callable2 = new thread((end-begin) , end*2);
        thread callable3 = new thread((end-begin)*2 , end*3);
        thread callable4 = new thread((end-begin)*3 , end*4);
        thread callable5 = new thread((end-begin)*4 , end*5);
        thread callable6 = new thread((end-begin)*5 , end*6);
        thread callable7 = new thread((end-begin)*6 , end*7);
        thread callable8 = new thread((end-begin)*7 , end*8);
        thread callable9 = new thread((end-begin)*8 , end*9);
        thread callable10 = new thread((end-begin)*9 , end*10);

        //接收10个线程传回来的futrue对象
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Long> future1 = executorService.submit(callable1);
        Future<Long> future2 = executorService.submit(callable2);
        Future<Long> future3 = executorService.submit(callable3);
        Future<Long> future4 = executorService.submit(callable4);
        Future<Long> future5 = executorService.submit(callable5);
        Future<Long> future6 = executorService.submit(callable6);
        Future<Long> future7 = executorService.submit(callable7);
        Future<Long> future8 = executorService.submit(callable8);
        Future<Long> future9 = executorService.submit(callable9);
        Future<Long> future10 = executorService.submit(callable10);

        //获取futrue的结果
        long result1 = future1.get();
        long result2 = future2.get();
        long result3 = future3.get();
        long result4 = future4.get();
        long result5 = future5.get();
        long result6 = future6.get();
        long result7 = future7.get();
        long result8 = future8.get();
        long result9 = future9.get();
        long result10 = future10.get();

        long result = result1 + result2 +result3+result4+result5+result6+result7+result8+result9+result10;
        System.out.println("result =" + result);

    }

    }

    class thread implements Callable<Long> {
        long begin ;
        long end ;
        long ans=0;
        static Scanner scanner=new Scanner(System.in);
        static int x=scanner.nextInt();

        public thread(long begin, long end) {
            this.begin=begin;
            this.end=end;
        }

        @Override
        public synchronized Long call() {
            System.out.println("begin " + begin + " end " + end);
            for (long i=begin; i < end; i++) {
                if (contain(i, x)) ans+=i;
            }
            System.out.println("callable" + (end/100000000) + "'s result= " + ans);

            return ans;
        }
        private static boolean contain ( long num, int x){
            return String.valueOf(num).contains(String.valueOf(x));
        }
    }






