package ua.lesson.lessons;
/**
 * класс выполняет арифметические операции [+],[-],[*],[/],[^]
 * @author Viktor Danilovskiy, E-mail: daviktor@list.ru
 * @version # 1 от  29.07.2015
 */
public class Calculator {
    /**
     * поле result заносится результат вычислений
     */
    private double result;
    /**
     * геттеры и сеттеры для поля result класса Calculate
     */
    public double getResult() {

        return result;
    }

    public void setResult(double result) {

        this.result = result;
    }
    /**
     *  конструктор
     */
    public Calculator() {

        super();
    }

    /**
     *  метод выполняет операцию сложения первого числа со вторым
     *  @param firstArgs - первый аргумент, число с плавающей запятой
     *  @param secondArgs - второй аргумент, число с плавающей запятой
     */
    public void sum(double firstArgs, double secondArgs) {

        this.result = firstArgs + secondArgs;
    }

    /**
     *  метод выполняет операцию вычитания второго числа из первого
     *  @param firstArgs - первый аргумент, число с плавающей запятой
     *  @param secondArgs - второй аргумент, число с плавающей запятой
     */
    public void subtraction(double firstArgs, double secondArgs) {

        this.result = firstArgs - secondArgs;
    }

    /**
     *  метод выполняет операцию деления первого числа на второе
     *  @param firstArgs - первый аргумент, число с плавающей запятой
     *  @param secondArgs - второй аргумент, число с плавающей запятой
     */
    public void division(double firstArgs, double secondArgs) {

        if (secondArgs != 0) {
            this.result = firstArgs / secondArgs;
        } else {
            System.out.println("You can not divide by zero!");
        }
    }

    /**
     *  метод выполняет операцию умножения первого числа на второе
     *  @param firstArgs - первый аргумент, число с плавающей запятой
     *  @param secondArgs - второй аргумент, число с плавающей запятой
     */
    public void product(double firstArgs, double secondArgs) {

        this.result = firstArgs * secondArgs;
    }

    /**
     *  метод выполняет операцию возведения первого числа в степень второго
     *  @param firstArgs - первый аргумент, число с плавающей запятой
     *  @param secondArgs - второй аргумент, число с плавающей запятой
     */
    public void involution(double firstArgs, double secondArgs) {

        this.result = firstArgs;
        for (int i = 1; i < secondArgs; i++) {
            result *= firstArgs;
        }
    }
}
