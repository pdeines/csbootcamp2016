/**
 * Created by mdoyle on 4/12/16.
 */
public enum BigO {

    O_UNKNOWN("O(UNKNOWN"),
    O_1("O(1)"),
    O_N ("O(n)"),
    O_N_SQUARED("O(n^2"),
    O_N_CUBED("O(n^3"),
    O_LOG_N("O(log(n))"),
    O_2_TO_N("O(2^n");

    private final String str;

    private BigO(String s) {
        str = s;
    }

    public String toString() {
        return this.str;
    }
}
