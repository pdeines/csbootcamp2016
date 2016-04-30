import java.util.List;

/**
 * Created by mdoyle on 4/11/16.
 */
// Complexity: O(n)
public class OperationC implements Operation {

    long value = 0;
    long execline = 0;

    @Override
    public long execute(int n) {
        for ( int i = 0; i < n; i++) {
	    execline++;
            value += i / n;
	    execline++;
        }
        return execline;
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
