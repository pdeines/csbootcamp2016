import java.util.List;

/**
 * Created by mdoyle on 4/12/16.
 */
// Complexity: O(n)
public class OperationI implements Operation {

    long value = 0;
    long execline = 0;
    @Override
    public long execute(int n) {
        value = calc(n);
	execline++;
        return execline;
    }

    private long calc(int n) {
        if (n <= 1) {
	    execline++;
            return n;
        } else {
	    execline++;
            return n * calc(n - 1);
        }
    }

    @Override
    public BigO getBigO() {
        return BigO.O_N;
    }

    /**
     * Returns the value calculated by this operation
     * @return
     */
    @Override
    public long getValue() {
        return value;
    }
}
