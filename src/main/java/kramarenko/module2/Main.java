package kramarenko.module2;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = ShopService.readCsvFile("file.csv");
        System.out.println(" Price ~= ");
        int totalAmountLimit = new Scanner(System.in).nextInt();
        for (int i = 0; i < 36; i++) {
            ShopService.setRandomInvoice(list, totalAmountLimit);
        }
        System.out.println("Quantity of sold products: Telephone = "
                + Util.countOfProductSoldByCategory("Telephone") +
                ", Television = " + Util.countOfProductSoldByCategory("Television"));
        System.out.println("The sum of the smallest check = " + Util.minimumCheckAmount() +
                ", Client = " + Util.customerInfoFromCheckAmount(Util.minimumCheckAmount()));
        System.out.println("The sum of the all purchases = " + Util.totalAmountSold());
        System.out.println("Quantity of checks with the category retail = " + Util.retailCheckCount());
        System.out.println("Checks which contain only one type of product: " + Util.onlyOneCategoryChecks());
        System.out.println("First three checks of the buyers : " +
                ShopService.getInvoices().stream().limit(3).collect(Collectors.toList()));
        System.out.println("Checks of the people who are under 18 years old " + Util.lowAgeCheckInfo());
        System.out.println("Sorting: " + Util.sorting());
    }
}
