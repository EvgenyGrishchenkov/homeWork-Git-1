public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = sales[0];
        for (int i = 0;i<sales.length;i++) {
            if (sales[i] >= 0 && sales[i] < min) {
                min = sales[i];
            }
        }
        return min;
    }
    public int croppedMiddle() {
        int salesAmount = 0;
        //int min = -1;
        for (int sale : sales) {
            salesAmount += sale;
        }
        int croppedMiddle = (salesAmount - max() - min())/(sales.length - 2);
        return croppedMiddle;
    }
}
