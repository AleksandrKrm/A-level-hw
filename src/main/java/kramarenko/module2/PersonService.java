package kramarenko.module2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PersonService  {
    public static Customer setRandom() {
        String[] gmail = ("Thank you " +
                "Good luck ").split(" ");
        return new Customer(ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE),
                gmail[ThreadLocalRandom.current().nextInt(gmail.length)] + "@gmail.com",
                ThreadLocalRandom.current().nextInt(7, 50));
    }


    void personServiceMethod() {
Random random = new Random();
int randomCustomer = random.nextInt(25);
System.out.println(randomCustomer );

        }
    }



