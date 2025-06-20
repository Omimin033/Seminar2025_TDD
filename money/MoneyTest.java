package money;

import org.junit.jupiter.api.Test;                  //JUnit5のテストライブラリをインポート
import static org.junit.jupiter.api.Assertions.*;   //JUnit5のアサーションライブラリをインポート

public class MoneyTest {    //MoneyTestクラスを作成
    @Test                                           //テストメソッドを作成
    public void testMultiplication() {              //testMultiplicationメソッドを作成
        Money five = Money.dollar(5);         //Dollarクラスのインスタンスを作成
        // Dollar同士を比較していることをわかりやすくするために、assertEqualsの引数を変更
        assertEquals(Money.dollar(10), five.times(2));  //timesメソッドを呼び出す
        assertEquals(Money.dollar(15), five.times(3));  //timesメソッドを呼び出す
    }
    @Test
    public void testEquality() {    //testEqualityメソッドを作成
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));  //assertTrueメソッドで期待値と実際の値を比較
        assertFalse(Money.dollar(5).equals(Money.dollar(6))); //assertFalseメソッドで期待値と実際の値を比較
        assertFalse(Money.franc(5).equals(Money.dollar(5)));   //assertFalseメソッドで期待値と実際の値を比較
    }
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());  //assertEqualsメソッドで期待値と実際の値を比較
        assertEquals("CHF", Money.franc(1).currency());   //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);  //Dollarクラスのインスタンスを作成
        Expression sum = five.plus(five);  //plusメソッドを呼び出す
        Bank bank = new Bank();  //Bankクラスのインスタンスを作成
        Money reduced = bank.reduce(sum, "USD");  //銀行のreduceメソッドを呼び出す
        assertEquals(Money.dollar(10), reduced);  //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);  //Dollarクラスのインスタンスを作成
        Expression result = five.plus(five);  //plusメソッドを呼び出す
        Sum sum = (Sum) result;  //Expression型をSum型にキャスト
        assertEquals(five, sum.augend);  //assertEqualsメソッドで期待値と実際の値を比較
        assertEquals(five, sum.addend);   //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));  //Sumクラスのインスタンスを作成
        Bank bank = new Bank();  //Bankクラスのインスタンスを作成
        Money result = bank.reduce(sum, "USD");  //銀行のreduceメソッドを呼び出す
        assertEquals(Money.dollar(7), result);  //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();  //Bankクラスのインスタンスを作成
        Money result = bank.reduce(Money.dollar(1), "USD");  //銀行のreduceメソッドを呼び出す
        assertEquals(Money.dollar(1), result);  //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();  //Bankクラスのインスタンスを作成
        bank.addRate("CHF", "USD", 2);  //為替レートを追加
        Money result = bank.reduce(Money.franc(2), "USD");  //銀行のreduceメソッドを呼び出す
        assertEquals(Money.dollar(1), result);  //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD")); //assertEqualsメソッドで期待値と実際の値を比較
    }
    @Test
    public void testMixedAddition() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }
}


// 6章までのコード
// public class MoneyTest {    //MoneyTestクラスを作成
//     @Test                                           //テストメソッドを作成
//     public void testMultiplication() {              //testMultiplicationメソッドを作成
//         Dollar five = new Dollar(5);         //Dollarクラスのインスタンスを作成
//         // Dollar同士を比較していることをわかりやすくするために、assertEqualsの引数を変更
//         assertEquals(new Dollar(10), five.times(2));  //timesメソッドを呼び出す
//         assertEquals(new Dollar(15), five.times(3));  //timesメソッドを呼び出す
//         }
//     @Test
//     public void testEquality() {    //testEqualityメソッドを作成
//         assertTrue(new Dollar(5).equals(new Dollar(5)));  //assertTrueメソッドで期待値と実際の値を比較
//         assertFalse(new Dollar(5).equals(new Dollar(6))); //assertFalseメソッドで期待値と実際の値を比較
//         assertTrue(new Franc(5).equals(new Franc(5)));    //assertTrueメソッドで期待値と実際の値を比較
//         assertFalse(new Franc(5).equals(new Franc(6)));   //assertFalseメソッドで期待値と実際の値を比較
//         assertFalse(new Franc(5).equals(new Dollar(5)));   //assertFalseメソッドで期待値と実際の値を比較
//     }
//     @Test
//     public void testFrancMultiplication() {              //testFrancMultiplicationメソッドを作成
//         Franc five = new Franc(5);         //Francクラスのインスタンスを作成
//         assertEquals(new Franc(10), five.times(2));  //timesメソッドを呼び出す
//         assertEquals(new Franc(15), five.times(3));  //timesメソッドを呼び出す
//     }
// }



//　3章までのコード
// public class MoneyTest {                            //MoneyTestクラスを作成
//     @Test                                           //テストメソッドを作成
//     public void testMultiplication() {              //testMultiplicationメソッドを作成
//         Dollar five = new Dollar(5);         //Dollarクラスのインスタンスを作成
//         Dollar product = five.times(2);  //timesメソッドを呼び出す
//         assertEquals(10, product.amount);           //assertEqualsメソッドで期待値と実際の値を比較
//         product = five.times(3);         //timesメソッドを呼び出す
//         assertEquals(15, product.amount);           //assertEqualsメソッドで期待値と実際の値を比較
//     }
//     @Test
//     public void testEquality() {                          //testEqualityメソッドを作成
//         assertTrue(new Dollar(5).equals(new Dollar(5)));  //assertTrueメソッドで期待値と実際の値を比較
//         assertFalse(new Dollar(5).equals(new Dollar(6))); //assertFalseメソッドで期待値と実際の値を比較
//     }
// }