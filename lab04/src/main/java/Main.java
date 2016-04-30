import java.util.LinkedList;
import java.util.List;

/**
 * Created by mdoyle on 4/11/16.
 */
public class Main {

    public static void main(String[] args) {
        int[] sizes = { 1, 10 };

        List<Operation> operations = new LinkedList<Operation>();
        operations.add(new OperationA());
        operations.add(new OperationB());
        operations.add(new OperationC());
        operations.add(new OperationD());
        operations.add(new OperationE());
        operations.add(new OperationF());
        operations.add(new OperationG());
        operations.add(new OperationH());
        operations.add(new OperationI());


        System.out.print("N\t");
        for (int size : sizes) {
            System.out.print(size + "\t");
        }
        System.out.print("\n");
        for (Operation operation : operations) {
            System.out.println(getExecutionTimes(operation, sizes));
        }


        System.out.print("N\t");
        for (int size : sizes) {
            System.out.print(size + "\t");
        }
        System.out.print("\n");
        for (Operation operation : operations) {
            System.out.println(getExecutionCounts(operation, sizes));
        }

    }

    /**
     * For the operation provided, record the execution time in nano seconds takes to execute
     * for each of the input sizes. Return a String that contains the classes name
     * (operation.getClass().getSimpleName()) and each of the execution times in order, all separated by a single tab.
     * @param operation
     * @param sizes
     * @return "<operationName>\t<executionTime>\t<executionTime>...
     */
    public static String getExecutionTimes(Operation operation, int[] sizes) {
        String result = "";
	result = result + operation.getClass().getSimpleName();
	for(int j=0; j < sizes.length; j++)
	{
		result = result + "\t";
		Long startTime = System.nanoTime();
		operation.execute(sizes[j]);
		Long estimatedTime = System.nanoTime() - startTime;
		result = result + estimatedTime.toString();
	}
        return result;
    }

    /**
     * For the operation provided, record the number of iterations it takes to execute
     * for each of the input sizes. Return a String that contains the classes name
     * (operation.getClass().getSimpleName()) and each of the execution times in order, all separated by a single tab.
     * @param operation
     * @param sizes
     * @return "<operationName>\t<executionCount1>\t<executionCount2>...
     */
    public static String getExecutionCounts(Operation operation, int[] sizes) {
        String result = "";
	result = result + operation.getClass().getSimpleName();
	for(int j=0; j < sizes.length; j++)
	{
		result = result + "\t";
		Long executedlines = operation.execute(sizes[j]);
		result = result + executedlines.toString();
	}
        return result;
    }
}
