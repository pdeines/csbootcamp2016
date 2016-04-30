import java.util.List;

/**
 * Created by mdoyle on 4/11/16.
 */
// complexity: O((2n)^2 --- which is O(n^2)
public class OperationA implements Operation {

    long value = 0;
    long execline = 0;
    /**
     * Executes operation a:
     * Expected Runtime:
     * @param n
     * @return
     */
    @Override
    public long execute(int n) {
        value = calc(n);
	execline++;
        return execline;
    }

    public int calc(int n) {
        if (n <= 1)
	{
		execline++;
		return n;
	}

	execline++;
        return calc(n - 2) + calc(n - 1);
    }

    @Override
    public BigO getBigO() {
        return BigO.O_N_SQUARED;
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
