package DZ5.Proxy;

public class RealExpensiveOperation implements ExpensiveOperation {

    @Override
    public int calculate(int number) {
        System.out.println("Производятся вычесления");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

}
