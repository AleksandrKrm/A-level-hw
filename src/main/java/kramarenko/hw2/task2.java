package kramarenko.hw2;
import java.util.Scanner;
public class task2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] sideOne = scanner.nextLine().split(" ");
            String[] sideTwo = scanner.nextLine().split(" ");
            String[] sideThree = scanner.nextLine().split(" ");

            int aX = Integer.parseInt(sideOne[0]);
            int aY = Integer.parseInt(sideOne[1]);

            int bX = Integer.parseInt(sideTwo[0]);
            int bY = Integer.parseInt(sideTwo[1]);

            int cX = Integer.parseInt(sideThree[0]);
            int cY = Integer.parseInt(sideThree[1]);

            //CHECK IF CORRECT // System.out.printf("%d %d %d %d %d %d",aX,aY,bX,bY,cX,cY);

            //USING THE FORULA: |((aX*(bY-cY) +bX*(cY-aY)+cX*(aY-bY)))/2|

            int areaTriangle = ((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))) / 2;
            System.out.println("The area of the triangle is: " + Math.abs(areaTriangle));
        }
    }

