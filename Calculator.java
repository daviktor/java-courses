
import java.util.Scanner;

public class Calculator {

    private double firstArgs;
    private double secondArgs;
    private double result;
    private String newOperation;
    private String [] operation = {"+","-","*","/","^"};
    private boolean status = false;

    public double getFirstArgs() {
        return firstArgs;
    }

    public void setFirstArgs(double firstArgs) {
        this.firstArgs = firstArgs;
    }

    public double getSecondArgs() {
        return secondArgs;
    }

    public void setSecondArgs(double secondArgs) {
        this.secondArgs = secondArgs;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getNewOperation() {
        return newOperation;
    }

    public void setNewOperation(String newOperation) {

        for (int i = 0; i < operation.length; i++){
            if (newOperation.equals(operation[i])){
                this.newOperation = newOperation;
                this.status = true;
            }
        }
        if (!this.status) {
            System.out.println("Enter one of these operations : [+],[-],[*],[/],[^]");
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public Calculator() {
    }

    public void sum(double a, double b) {

        result = a + b;
        printResult(result);
    }

    public void subtraction(double a, double b) {

        result = a - b;
        printResult(result);
    }

    public void division(double a, double b) {

        if (b != 0) {
            result = a / b;
            printResult(result);
        } else {
            System.out.printf("You can not divide by zero!\n");
        }
    }

    public void product(double a, double b) {

        result = a * b;
        printResult(result);
    }

    public void involution(double a, double b) {

        result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        printResult(result);
    }

    public void doOperation (){

        if ("+".equals(newOperation)) {
            sum(firstArgs, secondArgs);
            cleanResult();
        }
        if ("-".equals(newOperation)) {
            subtraction(firstArgs, secondArgs);
            cleanResult();

        } else if ("*".equals(newOperation)) {
            product(firstArgs, secondArgs);
            cleanResult();

        } else if ("/".equals(newOperation)) {
            division(firstArgs, secondArgs);
            cleanResult();

        } else if ("^".equals(newOperation)) {
            involution(firstArgs, secondArgs);
            cleanResult();
        }
        this.status = false;
    }

    public void printResult (double result){

        System.out.printf("Result : %.2f\n", this.getResult());
    }

    public void cleanResult() {

        System.out.println("Zero results : yes/no ");
        Scanner reader = new Scanner(System.in);
        if ("yes".equals(reader.next())) this.result = 0;
    }
}
