class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static float divide(int a, int b) {
        return a / b;
    }

    static int substrat(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int x = 12;
        int y = 5;

        System.out.println("Add: " + x + " + " + y + " = " + add(x, y));

        System.out.println("Divide: " + x + " / " + y + " = " + divide(x, y));

        System.out.println("Substrat: " + x + " - " + y + " = " + substrat(x, y));
    }

}