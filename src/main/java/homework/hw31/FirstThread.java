package homework.hw31;

public class FirstThread extends Thread{
    @Override
    public void run() {

        for(int i=50; i>0; i--) {
            System.out.println("hello from thread " + i+ " " + getName() );
        }
    }
}
