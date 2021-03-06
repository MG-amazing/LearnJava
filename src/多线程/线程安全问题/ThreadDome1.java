package 多线程.线程安全问题;

public class ThreadDome1 {
    public static void main(String[] args) {
        //同步代码块
        //作用:把出现线程安全问题的核心代码上锁
        //原理:每一次只能有一个线程进入,执行完毕后自动锁,其他线程才可以进入

        //定义线程类创建账户对象
        Account acc=new Account("ICNC-111",100000);
        //创建两个线程对象代表小明和小红同时进入线程
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();


        //定义线程类创建账户对象
        Account acc1=new Account("ICNC-112",100000);
        //创建两个线程对象代表小明和小红同时进入线程
        new DrawThread(acc1,"小黑").start();
        new DrawThread(acc1,"小白").start();
    }
}
