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
    public void testFrancMultiplication() {              //testFrancMultiplicationメソッドを作成
        Money five = Money.franc(5);         //Francクラスのインスタンスを作成
        assertEquals(Money.franc(10), five.times(2));  //timesメソッドを呼び出す
        assertEquals(Money.franc(15), five.times(3));  //timesメソッドを呼び出す
    }
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());  //assertEqualsメソッドで期待値と実際の値を比較
        assertEquals("CHF", Money.franc(1).currency());   //assertEqualsメソッドで期待値と実際の値を比較
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