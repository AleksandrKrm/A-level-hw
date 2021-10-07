package kramarenko.module2;
import kramarenko.module2.*;
public class PersonService {
    public <Customer> Customer generateCustomer() {
        final Customer customer = new Customer(Util.randomInt(10000),
                Util.randomString(20) + "@gmail.com",
                Util.randomInt(100));
        return customer;
    }
}