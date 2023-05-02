import by.itacademy.shikinnikita.Calc;

public class Main {
    public static void main(String[] args) {

        int expected = 7;
        int actual = Calc.sum(4, 3);

        if (actual != expected) {
            System.out.println("Error: expected " + expected + ", actual " + actual);
        }
    }
}
