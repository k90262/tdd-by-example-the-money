import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
* Task List:
* 1. When exchange rate is 2:1 exchange rate between CHF and USD, 5 USD + 10 CHF = 10 USD.
* 2. ~~5 USD * 2 = 10 USD~~ (DONE)
* 3. Declare 'amount' to private.
* 4. Any side effect on the Dollar class?
* 5. Should 'amount' be an integer?
* */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
