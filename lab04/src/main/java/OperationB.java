import java.util.List;

/**
 * Created by mdoyle on 4/11/16.
 */
// Complexity: O(n^3)
public class OperationB implements Operation {

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
        for ( int i = 0; i < n; i++ ) {
	    execline++;
            for ( int j = 0; j < n; j++ ) {
		execline++;
                for (int k = 0; k < n; k++ ) {
		    execline++;
                    value += i + j - k;
		    execline++;
                }
            }
        }
        return execline;
    }

    @Override
    public BigO getBigO() {
        return BigO.O_N_CUBED;
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
