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
        System.out.println("Add: " + add(12, 5));

        System.out.println("Divide: " + divide(12, 5));

        System.out.println("Add: " + substrat(12, 5));
    }

}