public class Main {
    public static void main(String[] args) {
        int[] sales = {1, 3, 6, 10, 12, 1, 13};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}