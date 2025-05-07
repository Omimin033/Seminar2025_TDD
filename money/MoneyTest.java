package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {    //MoneyTestクラスを作成
    @Test   //テストメソッドを作成
    public void testMultiplication() {  //testMultiplicationメソッドを作成
        Dollar five = new Dollar(5);    //Dollarクラスのインスタンスを作成
        Dollar product = five.times(2); //timesメソッドを呼び出す
        assertEquals(10, product.amount);   //assertEqualsメソッドで期待値と実際の値を比較
        product = five.times(3);    //timesメソッドを呼び出す
        assertEquals(15, product.amount);  //assertEqualsメソッドで期待値と実際の値を比較
    }
}