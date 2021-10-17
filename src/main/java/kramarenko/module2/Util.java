package kramarenko.module2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
            public static long countOfProductSoldByCategory(String productCategory) {
            long count = 0L;
            for (Invoice invoice : ShopService.getInvoices()) {
                List<Product> product = invoice.getProduct();
                for (Product x : product) {
                    if (x.getProductType().equals(productCategory)) {
                        count++;
                    }
                }
            }
            return count;
        }

        public static Integer minimumCheckAmount() {
            Integer acc = Integer.MAX_VALUE;
            for (Invoice invoice : ShopService.getInvoices()) {
                List<Product> x = invoice.getProduct();
                Integer sum = x.stream().mapToInt(Product::getPrice).sum();
                acc = Integer.min(acc, sum);
            }
            return acc;
        }

        public static List<Customer> customerInfoFromCheckAmount(int sum) {
            List<Customer> list = new ArrayList<>();
            for (Invoice x : ShopService.getInvoices()) {
                if (x.getProduct().stream().mapToInt(Product::getPrice).sum() == sum) {
                    Customer customer = x.getCustomer();
                    list.add(customer);
                }
            }
            return list;
        }

        public static Integer totalAmountSold() {
            int sum = 0;
            for (Invoice x : ShopService.getInvoices()) {
                for (Product product : x.getProduct()) {
                    int price = product.getPrice();
                    sum += price;
                }
            }
            return sum;
        }

        public static long retailCheckCount() {
            long count = 0L;
            for (Invoice x : ShopService.getInvoices()) {
                if (x.getType().contains("retail")) {
                    count++;
                }
            }
            return count;
        }

        public static List<Invoice> lowAgeCheckInfo() {
            List<Invoice> list = new ArrayList<>();
            for (Invoice x : ShopService.getInvoices()) {
                if (x.getCustomer().getAge() < 18) {
                    x.setType("low_age");
                    list.add(x);
                }
            }
            return list;
        }

        public static List<Invoice> sorting() {
            List<Invoice> list = new ArrayList<>();
            for (Invoice invoice : ShopService.getInvoices()) {
                list.add(invoice);
            }
            list.sort(Comparator.comparing((Invoice x) -> x.getCustomer().getAge())
                    .thenComparing(x -> x.getProduct().size())
                    .thenComparing(x -> x.getProduct().stream()
                            .map(Product::getPrice)
                            .mapToInt(z -> z)
                            .sum()));
            return list;
        }

        public static List<Invoice> onlyOneCategoryChecks() {
            Object[] productTypes = ShopService.getInvoices().stream()
                    .flatMap(x -> x.getProduct().stream())
                    .map(Product::getProductType)
                    .distinct()
                    .toArray();
            List<Invoice> list = new ArrayList<>();
            for (Object type : productTypes) {
                list.addAll(ShopService.getInvoices().stream()
                        .filter(x -> x.getProduct().stream()
                                .map(Product::getProductType)
                                .allMatch(y -> y.equals(type)))
                        .collect(Collectors.toList()));
            }
            return list;
        }
    }

