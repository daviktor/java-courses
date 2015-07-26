/**
 * Created by Витек on 25.07.2015.
 */
public class Calculator {

    private int result;             // результат вычисления

    public void add (int ... params) {

        for (Integer param : params) {
            this.result += param;
        }
    }

    public int getResult () {

        return this.result;
    }

    public void cleanResult() {

        this.result = 0;
    }
}