package money;

abstract class Money {
    protected int amount;   //サブクラスでアクセスできるようにprotected修飾子を付ける
    abstract Money times(int multiplier);    //抽象メソッドを作成
    abstract String currency();    //抽象メソッド「通貨」を作成
    public boolean equals(Object object) {   //equalsメソッドをオーバーライド
        Money money = (Money) object;        //Object型をDollar型にキャスト
        return amount == money.amount        //amountフィールドを比較
            && getClass().equals(money.getClass()); //クラスを比較
    }
    static Money dollar (int amount) {  //staticメソッドを作成
        return new Dollar(amount);          //新しいDollarオブジェクトを返す
    }
    static Money franc (int amount) {  //staticメソッドを作成
        return new Franc(amount);           //新しいFrancオブジェクトを返す
    }
}
