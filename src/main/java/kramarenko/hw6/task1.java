package kramarenko.hw6;

public class task1 {

    public static void main(String[] args){
        task1 phone1 = new task1("3805983726125", "Iphone", 6.4);
        task1 phone2 = new task1("380863528753", "Samsung");
        task1 phone3 = new task1();

        phone2.weight = 5.8;
        phone3.number = "380938752436";
        phone3.model = "Lenovo";
        phone3.weight = 5.2;

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.print(System.lineSeparator());

        System.out.println("Phone1 number: " + phone1.getNumber());
        System.out.println("Phone2 number: " + phone2.getNumber());
        System.out.println("Phone3 number: " + phone3.getNumber());
        System.out.print(System.lineSeparator());

        phone1.receiveCall("James");
        phone1.receiveCall("John");
    }
}

