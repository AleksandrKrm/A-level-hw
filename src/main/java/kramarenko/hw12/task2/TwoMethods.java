package kramarenko.hw12.task2;
import java.util.Scanner;
public class TwoMethods {
    public static void main(String[] args){
        TwoMethods object = new TwoMethods();
    try(Scanner scan = new Scanner(System.in)){
        object.f(scan.nextLine());
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    public void f (String smth) throws Exception {
        try{
            System.out.println( f (smth));
        } catch (StringIndexOutOfBoundsException e){
            throw new Exception();
        }
    }
    public char g (String text) {
        if (text.length()<1)
            throw new IndexOutOfBoundsException();
        return toString().charAt(0);
    }
}
