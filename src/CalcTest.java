class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 5;
        double b = 10;
        double c = 15;

        System.out.println("A: " + a + ", B: " + b + ", C: " + c);

        System.out.println("A+B = " + calc.add(a, b));
        System.out.println("A+B+C = " + calc.add(a, b, c));

        System.out.println("A-B = " + calc.sub(a, b));
        System.out.println("A-B-C = " + calc.sub(a, b, c));

    }


}
