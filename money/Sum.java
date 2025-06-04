package money;

class Sum implements Expression {  //Sumクラスを作成し、Expressionインターフェースを実装
    Money augend;  //加算される金額
    Money addend;  //加算する金額
    Sum(Money augend, Money addend) {  //コンストラクタを作成
        this.augend = augend;  //引数のaugendをフィールドに代入
        this.addend = addend;  //引数のaddendをフィールドに代入
    }
    Money reduce(String to) {  //reduceメソッドを作成
        int amount = augend.amount + addend.amount;  //加算された金額を計算
        return new Money(amount, to);  //新しいMoneyオブジェクトを返す
    }
}
