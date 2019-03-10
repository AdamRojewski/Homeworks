package JVMProject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*public class AnotherJVMtask {

    public static void main(String[] args) {

        TestCalculator("dodaj");
    }


    private static void TestCalculator(String[] args) {
        String type = args[0];
        AnotherJVMtask m = new AnotherJVMtask();
        int b = Integer.valueOf(args[2]);
        int a = Integer.valueOf(args[1]);
        m.doIt(type, a, b);

    }

    public int dodaj(int a, int b) {
        return a + b;
    }

    public int odejmij(int a, int b) {
        return a - b;
    }

    public int mnoz(int a, int b) {
        return a * b;
    }

    public int dziel(int a, int b) {
        return a / b;
    }

    public void doIt(String type, int a, int b) {
        try {
            Class c = this.getClass();
            Method action = c.getMethod(type, int.class, int.class);
            Object result = action.invoke(this, a, b);
            System.out.println("Wynik to " + result);
        } catch (NoSuchMethodException | IllegalAccessError | InvocationTargetException e) {
            System.out.println("Brak obslugiwanej metody");
        }
    }
}
*/