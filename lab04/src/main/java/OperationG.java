import java.util.List;

/**
 * Created by mdoyle on 4/12/16.
 */
// Complexity: O(1)
public class OperationG implements Operation {

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
        boolean isEven = (n % 2) == 0;
	execline++;
        if (isEven) {
            value += n * 2;
	    execline++;
        }
        return execline;
    }

    @Override
    public BigO getBigO() {
        return BigO.O_1;
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
