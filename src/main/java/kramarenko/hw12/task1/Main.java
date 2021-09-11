package kramarenko.hw12.task1;

public class Main {
    public static void main (String[] args){
        Exception exception = new Exception("String");
        try {
            throw exception;
        } catch (Exception e) {
            System.out.println(exception);
        } finally {
            System.out.println("Finally");
        }
    }
}
