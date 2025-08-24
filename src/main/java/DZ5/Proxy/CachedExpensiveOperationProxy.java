package DZ5.Proxy;

import java.util.HashMap;

public class CachedExpensiveOperationProxy implements ExpensiveOperation {

    private HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    @Override
    public int calculate(int number) {
        if (cache.containsKey(number)) {
            return cache.get(number);
        } else {
            int result = new RealExpensiveOperation().calculate(number);
            cache.put(number, result);
            return result;
        }
    }

}
