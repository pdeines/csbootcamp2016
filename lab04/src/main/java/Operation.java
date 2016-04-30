import java.util.List;

/**
 * Created by mdoyle on 4/11/16.
 */
public interface Operation {

    /**
     * Each operation must implement the execute function, which performs some action on the input
     * @param n
     * @return
     */
    public long execute(int n);

    /**
     * Returns the expected BigO notation for a call to execute with a given input size.
     * @return
     */
    public BigO getBigO();

    /**
     * Returns the value calculated by this operation
     * @return
     */
    public long getValue();

}
