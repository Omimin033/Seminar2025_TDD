package money;

class Money {
    protected int amount;   //サブクラスでアクセスできるようにprotected修飾子を付ける
    public boolean equals(Object object) {   //equalsメソッドをオーバーライド
        Money money = (Money) object;        //Object型をDollar型にキャスト
        return amount == money.amount        //amountフィールドを比較
            && getClass().equals(money.getClass()); //クラスを比較
    }
    static Dollar dollat (int amount) {  //staticメソッドを作成
        return new Dollar(amount);          //新しいDollarオブジェクトを返す
    }
}
