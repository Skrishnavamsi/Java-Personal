public class FibonacciSeries {
    public static void main(String[] args) {
        int N = 10;
        printFibonacciSeries(N);
    }

    public static void printFibonacciSeries(int N) {
        int first = 0, second = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
