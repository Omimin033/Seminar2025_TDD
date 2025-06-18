package money;

class Money implements Expression {  //Moneyクラスを作成し、Expressionインターフェースを実装
    protected int amount;   //サブクラスでアクセスできるようにprotected修飾子を付ける
    protected String currency;  //currencyフィールドを作成
    Money(int amount, String currency) {  //コンストラクタを作成
        this.amount = amount;   //引数のamountをフィールドに代入
        this.currency = currency;   //currencyフィールドを初期化
    }
    Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);  //新しいMoneyオブジェクトを返す
    }
    Expression plus(Expression addend) {  //plusメソッドを作成
        return new Sum(this, addend);  //新しいSumオブジェクトを返す
    }
    public Money reduce(Bank bank, String to) {  //reduceメソッドを作成
        int rate = bank.rate(currency, to);  //為替レートを取得
        return new Money(amount / rate, to);  //新しいMoneyオブジェクトを返す
    }
    String currency() {  //currencyメソッドをオーバーライド
        return currency;    //通貨を返す
    }
    public boolean equals(Object object) {   //equalsメソッドをオーバーライド
        Money money = (Money) object;        //Object型をDollar型にキャスト
        return amount == money.amount        //amountフィールドを比較
            && currency().equals(money.currency()); //クラスを比較
    }
    static Money dollar (int amount) {  //staticメソッドを作成
        return new Money(amount, "USD");          //新しいDollarオブジェクトを返す
    }
    static Money franc (int amount) {  //staticメソッドを作成
        return new Money(amount, "CHF");       //新しいFrancオブジェクトを返す //Factory Methodから文字列CHFを渡す
    }
}

// 9章途中までのコード
// abstract class Money {
//     protected int amount;   //サブクラスでアクセスできるようにprotected修飾子を付ける
//     abstract Money times(int multiplier);    //抽象メソッドを作成
//     abstract String currency();    //抽象メソッド「通貨」を作成
//     public boolean equals(Object object) {   //equalsメソッドをオーバーライド
//         Money money = (Money) object;        //Object型をDollar型にキャスト
//         return amount == money.amount        //amountフィールドを比較
//             && getClass().equals(money.getClass()); //クラスを比較
//     }
//     static Money dollar (int amount) {  //staticメソッドを作成
//         return new Dollar(amount);          //新しいDollarオブジェクトを返す
//     }
//     static Money franc (int amount) {  //staticメソッドを作成
//         return new Franc(amount);           //新しいFrancオブジェクトを返す
//     }
// }
