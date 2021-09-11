package kramarenko.hw12.task3;

public class ThreeExceptions {
    public static void main(String[] args){
        String[] text = {"Something", "Just", "For", "Example"};
        ThreeExceptions object = new ThreeExceptions();
        try{
            System.out.println(object.exceptions (1, text));
        } catch (One | Two | Three e) {
            e.printStackTrace();
        }
        public char exceptions(int n, String[] arrays) {
            if (n == 0)
                throw new Three();
            if (n >= arrays.length - 1)
                throw new One();
            if (n >= arrays[n + 1].length() - 1)
                throw new Two();
            int zero = n + 1 / n;
            return arrays[n + 1].charAt(n + 1);
        }
    }

    class One extends ArrayIndexOutOfBoundsException {

    }

    class Two extends StringIndexOutOfBoundsException {

    }

    class Three extends ArithmeticException {

    }

}
