public class LinearRegression {

    // Method to find slope
    public static double calcM(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            double x = data[i][0];
            double y = data[i][1];
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    // Method to find b
    public static double calcB(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0;

        for (int i = 0; i < n; i++) {
            sumX += data[i][0];
            sumY += data[i][1];
        }

        double m = calcM(data);
        return (sumY - m * sumX) / n;
    }
}
