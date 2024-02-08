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
* 11. ~~ Redundant Design betwen USD Dollar and CHF Franc ~~
* 12. ~~ Shared equal() method ~~
* 13. ~~ Shared times() method ~~
* 14. ~~ Compare CHF object Franc and USD object Dollar ~~
* 15. ~~ Should we use Currency term? ~~
* 16. Should we delete testFrancMultiplication?
*
* NOTE:
* a. ~~ DONE_ITEM ~~
* b. ** ON_GOING_ITEM **
* c. * note: using for design pattern we used on dollor object: value object
* */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
