import java.util.List;

/**
 * @Author: Nathan Dobbins
 */
public class CalcHistory {
    private double result;
    private List<Integer> numbers;
    private String operation;

    /**
     * Constructor that sets the results, list of numbers, and operation performed
     * @param result
     * @param numbers
     * @param operation
     */
    public CalcHistory(double result, List<Integer> numbers, String operation){
        this.result = result;
        this.numbers = numbers;
        this.operation = operation;
    }

    /**
     * Gets the result
     * Author: Nathan Dobbins
     * @return
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the result of the calculation
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Gets the list of numbers used in the calculation
     * Author: Nathan Dobbins
     * @return
     */
    public List<Integer> getNumbers() {
        return numbers;
    }

    /**
     * Sets the list of numbers used in the calculation
     * Author: Nathan Dobbins
     * @param numbers
     */
    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    /**
     * Gets the operation type.
     * Author: Nathan Dobbins
     * @return
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the operation type.
     * Author: Nathan Dobbins
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Returns the calculation as a string.
     * Author: Nathan Dobbins
     * @return
     */
    public String toString(){
        String string = "" + numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            string += " " + operation + " " + numbers.get(i);
        }
        string += " = " + result;
        return string;
    }
}
