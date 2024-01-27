import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* Task List:
* 1. When exchange rate is 2:1 exchange rate between CHF and USD, 5 USD + 10 CHF = 10 USD.
* 2. ~~ 5 USD * 2 = 10 USD ~~
* 3. ~~ Declare 'amount' to private. ~~
* 4. ~~ Any side effect on the Dollar class? ~~
* 5. Should 'amount' be an integer?
* 6. ~~ equals()* ~~
* 7. hashCode()*
* 8. check null via equals()*
* 9. check any type via equals()*
* 10. ~~ 5 CHF * 2 = 10 CHF ~~
* 11. Redundant Design betwen USD Dollar and CHF Franc
* 12. ~~ Shared equal() method ~~
* 13. Shared times() method
*
* NOTE:
* a. ~~ DONE_ITEM ~~
* b. ** ON_GOING_ITEM **
* c. * note: using for design pattern we used on dollor object: value object
* */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
