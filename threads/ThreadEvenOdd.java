package threads;

//Write a Java program to create two threads, one printing even numbers and the other printing odd numbers from 1 to 60.
public class ThreadEvenOdd {
    public static void main(String[] args) {
        ThreadEvenOddEven even = new ThreadEvenOddEven();
        ThreadEvenOddOdd odd = new ThreadEvenOddOdd();
        even.start();
        odd.start();
    }
}
class ThreadEvenOddEven extends Thread{
    public void run(){
        for(int i=0;i<=60;i+=2){
            System.out.println(i);
        }
    }
}
class ThreadEvenOddOdd extends Thread{
    public void run(){
        for(int i=1;i<=60;i+=2){
            System.out.println(i);
        }
    }
}
