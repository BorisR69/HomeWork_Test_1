import org.junit.jupiter.api.*;

class CalculatorTest {

    @Test
    public void plus() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 2;
        int result = calc.plus.apply(x, y);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void minus() {
        Calculator calc = new Calculator();
        int x = 8;
        int y = 4;
        int result = calc.minus.apply(x, y);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void devide() {
        Calculator calc = new Calculator();
        int x = 2;
        int y = 2;
        int result = calc.devide.apply(x, y);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void devideZero() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 0;
        int result = calc.devide.apply(x, y);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiply() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 8;
        int result = calc.multiply.apply(x, y);

        Assertions.assertEquals(32, result);
    }
}