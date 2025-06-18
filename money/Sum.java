package money;

class Sum implements Expression {  //Sumクラスを作成し、Expressionインターフェースを実装
    Money augend;  //加算される金額
    Money addend;  //加算する金額
    Sum(Money augend, Money addend) {  //コンストラクタを作成
        this.augend = augend;  //引数のaugendをフィールドに代入
        this.addend = addend;  //引数のaddendをフィールドに代入
    }
    public Money reduce(Bank bank, String to) { // reduceメソッドを実装
        int amount = augend.reduce(bank, to).amount
        + addend.reduce(bank, to).amount;   //augendとaddendをto通貨に変換して合計金額を計算
        return new Money(amount, to);   //新しいMoneyオブジェクトを返す
    }
}
