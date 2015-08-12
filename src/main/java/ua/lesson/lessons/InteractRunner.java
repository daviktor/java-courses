package ua.lesson.lessons;
/**
 * класс для взаимодействия с пользователем
 * @author Viktor Danilovskiy, E-mail: daviktor@list.ru
 * @version # 1 от  29.07.2015
 */
import java.util.Scanner;

public class InteractRunner {

    /**
     * в поля firstArgs и secondArgs вводятся аргуметы вичислений
     */
    private double firstArgs;
    private double secondArgs;
    /**
     * в поле newOperation заносится арифметическая операция
     */
    private String newOperation;
    /**
     * поле exit определяет выход из программы (true - выход)
     */
    private boolean exit = false;

    public Scanner reader = new Scanner(System.in);
    private Calculator calc = new Calculator();

    /**
     *  логика последовательности вычислений
     */
    public void go () {

        while (!this.exit) {

            if (calc.getResult() == 0){

                enterFirstArgs();
                enterOperation();
                enterSecondArgs();

            } else {

                this.firstArgs = calc.getResult();
                enterOperation();
                enterSecondArgs();
            }

            doOperation(this.newOperation);
            printResult();
            cleanResult();
            if (calc.getResult() == 0) {
                enterExit();
            }
        }
    }

    /**
     *  метод для организации выплнения арифметической операции в зависимости от входного параметра
     *  @param newOperation строка содержащая одну из арифметических операций [+],[-],[*],[/],[^]
     */
    public void doOperation (String newOperation){

        if ("+".equals(this.newOperation)) {
            calc.sum(firstArgs,secondArgs);

        } else if ("-".equals(this.newOperation)) {
            calc.subtraction(firstArgs,secondArgs);

        } else if ("*".equals(this.newOperation)) {
            calc.product(firstArgs,secondArgs);

        } else if ("/".equals(this.newOperation)) {
            calc.division(firstArgs,secondArgs);

        } else if ("^".equals(this.newOperation)) {
            calc.involution(firstArgs,secondArgs);
        }
    }

    /**
     *  метод для очищения результата (поле result класса Calculate обнуляется)
     */
    public void cleanResult() {

        System.out.println("Zero results : yes/no ");
        String exit = reader.next();
        while (true) {
            if ("yes".equals(exit)) {
                calc.setResult(0.0);
                break;
            } else if ("no".equals(exit)) {
                break;
            } else {
                System.out.println("Zero results : enter yes or no!");
                exit = reader.next();
            }
        }
    }

    /**
     *  метод для организации ввода первого аргумента
     */
    public void enterFirstArgs (){

        System.out.println("Enter first args : ");
        while (true) {
            try {
                this.firstArgs = Double.valueOf(reader.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter the numbers!");
            }
        }
    }

    /**
     *  метод для организации ввода второго аргумента
     */
    public void enterSecondArgs (){

        System.out.println("Enter second args : ");
        while (true) {
            try {
                this.secondArgs = Double.valueOf(reader.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter the numbers!");
            }
        }
    }

    /**
     *  метод для организации выхода их программы
     */
    public void enterExit(){
        System.out.println("Exit : yes/no ");
        String exit = reader.next();
        while (true) {
            if ("yes".equals(exit)) {
                this.exit = true;
                break;
            } else if ("no".equals(exit)) {
                break;
            } else {
                System.out.println("Exit : enter yes or no!");
                exit = reader.next();
            }
        }
    }

    /**
     *  метод для организации ввода арифметической операции
     *  присваивает переменной newOperation одну из арифметических операций [+],[-],[*],[/],[^]
     */
    public void enterOperation (){

        this.newOperation = null;

        while (this.newOperation == null) {

            System.out.println("Enter one of these operations : [+],[-],[*],[/],[^]");
            String newOperation = reader.next();
            String[] operation = {"+", "-", "*", "/", "^"};
            for (int i = 0; i < operation.length; i++) {
                if (operation[i].equals(newOperation)) {
                    this.newOperation = newOperation;
                }
            }
        }
    }

    /**
     *  метод выводит на печать результат арифметической операции (поле result класса Calculate)
     */
    public void printResult (){

        System.out.printf("Result : %.2f\n", calc.getResult());
    }
}
