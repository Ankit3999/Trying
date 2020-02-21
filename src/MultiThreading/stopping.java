package MultiThreading;
//1. Name of method in Thread class to pause execution?
class see implements Runnable{
    @Override
    public void run() {
        long start =System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleep time in ms ="+(System.currentTimeMillis()-start));

    }
}
public class stopping {
    public static void main(String[] args) throws InterruptedException{
        see m1=new see();
        Thread t1 =new Thread(m1);
        t1.start();

    }
}
