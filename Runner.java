public class Runner {
    public static void main(String[] args) {

        // Ice Cream Sales Data: {Temperature (°C), Ice Cream Sales ($)}
        double[][] data = {
            {14.2, 215},
            {16.4, 325},
            {11.9, 185},
            {15.2, 332},
            {18.5, 406},
            {22.1, 522},
            {19.4, 412},
            {25.1, 614},
            {23.4, 544},
            {18.1, 421},
            {22.6, 445},
            {17.2, 408}
        };

        // Calculate slope (m) and y-intercept (b)
        double m = LinearRegression.calcM(data);
        double b = LinearRegression.calcB(data);

        // Display the equation of the best-fit line
        System.out.printf("The equation of the best-fit line is: y = %.2fx + %.2f\n", m, b);
    }
}
