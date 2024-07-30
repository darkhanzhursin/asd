package counter;

public class Printer {

    static void print(int count) {
        if ((isEven(count) && count < 10) || (count == 12 || count == 13)) {
            System.out.println("Red");
        }

        if (isEven(count) && count >= 10 && count != 12 && count != 13) {
            System.out.println("Green");
        }

        if ((!isEven(count) && count < 15) || (count == 17 || count == 19)) {
            System.out.println("Blue");
        }

        if (!isEven(count) && count >= 15 && count != 17 && count != 19) {
            System.out.println("Orange");
        }
    }

    private static boolean isEven(int count) {
        return count % 2 == 0;
    }
}
