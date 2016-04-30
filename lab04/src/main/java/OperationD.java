import java.util.List;

/**
 * Created by mdoyle on 4/12/16.
 */
// Complexity: O(log n)
public class OperationD implements Operation {

    long value = 0;
    long execline = 0;

    /**
     * Executes the operation
     * Expected Runtime:
     * @param n
     * @return
     */
    @Override
    public long execute(int n) {
        value = calc(0, n);
	execline++;
        return execline;
    }

    private long calc (int left, int right) {
        if (left != right && left < right) {
	    execline++;
            return calc(left, right / 2);
        } else {
	    execline++;
            return left;
        }
    }

    @Override
    public BigO getBigO() {
        return BigO.O_LOG_N;
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
