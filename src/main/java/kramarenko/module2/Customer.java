package kramarenko.module2;

public class PersonService {
    public Customer generateCustomer() {
        return new Customer(Util.randomInt(10000),
                Util.randomString(20) + "@gmail.com",
                Util.randomInt(100));
    }
}