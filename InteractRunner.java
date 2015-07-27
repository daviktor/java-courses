import java.util.Scanner;

public class InteractRunner {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String operation = null;

            while (!exit.equals("yes")) {

                if (calc.getResult() == 0){

                    System.out.println("Enter first args : ");
                    calc.setFirstArgs(Double.valueOf(reader.next()));
                    System.out.println("Enter second args : ");
                    calc.setSecondArgs(Double.valueOf(reader.next()));
                    System.out.println("Enter an arithmetic operation : [+],[-],[*],[/],[^]");

                    while (!calc.getStatus()) {
                        calc.setNewOperation(reader.next());
                    }

                } else {

                    calc.setFirstArgs(calc.getResult());
                    System.out.println("Enter an arithmetic operation : [+],[-],[*],[/],[^]");
                    while (!calc.getStatus()) {
                        calc.setNewOperation(reader.next());
                    }
                    System.out.println("Enter second args : ");
                    String second = reader.next();
                    calc.setSecondArgs(Double.valueOf(second));
                }

                calc.doOperation();

                if (calc.getResult() != 0) {
                    exit = "no";
                } else {
                    System.out.println("Exit : yes/no ");
                    exit = reader.next();
                }
            }
        } finally {
            reader.close();
        }
    }
}
