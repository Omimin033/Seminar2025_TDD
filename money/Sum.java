package money;

class Sum implements Expression {  //Sumクラスを作成し、Expressionインターフェースを実装
    Expression augend;  //加算される金額
    Expression addend;  //加算する金額
    Sum(Expression augend, Expression addend) {  //コンストラクタを作成
        this.augend = augend;  //引数のaugendをフィールドに代入
        this.addend = addend;  //引数のaddendをフィールドに代入
    }
    public Expression plus(Expression addend) {  //plusメソッドを実装
        return null;  //Sumクラスではplusメソッドを実装しないのでnullを返す
    }
    public Money reduce(Bank bank, String to) { // reduceメソッドを実装
        int amount = augend.reduce(bank, to).amount
        + addend.reduce(bank, to).amount;   //augendとaddendをto通貨に変換して合計金額を計算
        return new Money(amount, to);   //新しいMoneyオブジェクトを返す
    }
}
