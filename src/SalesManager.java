public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (int i = 0;i<sales.length;i++) {
            if (sales[i] >= 0 && sales[i] < min) {
                min = sales[i];
            }
        }
        return min;
    }
    public long croppedMiddle() {
        long salesAmount = 0;
        for (long sale : sales) {
            salesAmount += sale;
        }
        long croppedMiddle = (salesAmount - max() - min())/(sales.length - 2);
        return croppedMiddle;
    }
}
