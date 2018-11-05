import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calc = new Calculator();
    
    @Test
    public void testEmptyStack() {
        assertEquals("[].", calc.toString());
    }
    
    @Test
    public void testLoadConstant() {
        calc.loadConstant(3);
        assertEquals("[3].", calc.toString());
    }
    
    @Test
    public void testLoadConstants() {
        calc.loadConstant(3);
        calc.loadConstant(7);
        calc.loadConstant(2);
        assertEquals("[3 7 2].", calc.toString());
    }
    
    @Test
    public void testAdd() {
        calc.loadConstant(5);
        calc.loadConstant(4);
        calc.add();
        assertEquals("[9].", calc.toString());
        calc.loadConstant(3);
        calc.add();
        assertEquals("[12].", calc.toString());
    }
    
    @Test
    public void testSubtract() {
        calc.loadConstant(5);
        calc.loadConstant(4);
        calc.subtract();
        assertEquals("[1].", calc.toString());
        calc.loadConstant(3);
        calc.subtract();
        assertEquals("[-2].", calc.toString());
    }
    
    @Test
    public void testMultiply() {
        calc.loadConstant(5);
        calc.loadConstant(4);
        calc.multiply();
        assertEquals("[20].", calc.toString());
        calc.loadConstant(3);
        calc.multiply();
        assertEquals("[60].", calc.toString());
    }
    
    @Test
    public void testDivide() {
        calc.loadConstant(15);
        calc.loadConstant(2);
        calc.divide();
        assertEquals("[7].", calc.toString());
        calc.loadConstant(7);
        calc.divide();
        assertEquals("[1].", calc.toString());
    }
    
    @Test
    public void testTotal() {
        calc.loadConstant(1);
        calc.loadConstant(2);
        calc.loadConstant(3);
        calc.loadConstant(4);
        calc.loadConstant(5);
        calc.loadConstant(6);
        calc.total();
        assertEquals("[21].", calc.toString());
    }
}
