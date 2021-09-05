package kramarenko.hw4;
import java.util.Scanner;
public class task2 {

        public static boolean isPrime (int N)
        { boolean prime = true;

            for ( int i = 2; i < N; i++ ) {

                if ( N % i == 0 ) {

                    prime = false;
                }
            }
            return prime;
        }

        public static void main (String[] args) {

            int j =0;

            Scanner scan = new Scanner (System.in);

            System.out.println("Enter a number:");

            int N = scan.nextInt();

            int[] list = new int[N];

            if (isPrime(N))

                System.out.print(N+ " is a prime");

            else System.out.print(N+ " is not a prime.");

            for ( int i = 2; i <= N; i++ ) {

                if ( isPrime(i) ) {
                    list[j] = i;

                    j++;
                }
            }

            System.out.println();

            System.out.print("The list of primes: ");
            for (int values: list) {

                if (values != 0)

                    System.out.print(values + " ");
            }
        }
    }
