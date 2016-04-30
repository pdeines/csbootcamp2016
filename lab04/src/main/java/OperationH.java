import java.util.List;

/**
 * Created by mdoyle on 4/12/16.
 */
// Complexity: O(50n) --- which is O(n)
public class OperationH implements Operation {

    long value = 0;
    long execline = -0;
    /**
     * Executes the operation
     * Expected Runtime:
     * @param n
     * @return
     */
    @Override
    public long execute(int n) {
        for ( int i = 0; i < 10; i++ ) {
	    execline++;
            for ( int j = 0; j < n; j++ ) {
		execline++;
                for (int k = 0; k < 5; k++ ) {
		    execline++;
                    value += n;
                }
            }
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
