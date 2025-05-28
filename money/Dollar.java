package money;  //moneyパッケージを作成

class Dollar extends Money {  //Dollarクラスを作成
    Dollar(int amount, String currency) {        //コンストラクタを作成
        super(amount, currency);   //親クラスのコンストラクタを呼び出す
    }
}

// ９章までのコード
// class Dollar extends Money {  //Dollarクラスを作成
//     Dollar(int amount, String currency) {        //コンストラクタを作成
//         super(amount, currency);   //親クラスのコンストラクタを呼び出す
//     }
//     Money times(int multiplier) {  //timesメソッドを作成
//         return Money.dollar(amount * multiplier); //新しいDollarオブジェクトを返す
//     }
// }

// ９章途中までのコード
// class Dollar extends Money {  //Dollarクラスを作成
//     private String currency;  //currencyフィールドを作成
//     Dollar(int amount) {        //コンストラクタを作成
//         this.amount = amount;   //引数のamountをフィールドに代入
//         currency = "USD";   //currencyフィールドを初期化
//     }
//     String currency() {  //currencyメソッドをオーバーライド
//         return currency;    //通貨を返す
//     }
//     Money times(int multiplier) {  //timesメソッドを作成
//         return new Dollar(amount * multiplier);  //新しいDollarオブジェクトを返す
//     }
// }



// ５章までのコード
// class Dollar {  //Dollarクラスを作成
//     private int amount;         //amountフィールドを作成
//     Dollar(int amount) {        //コンストラクタを作成
//         this.amount = amount;   //引数のamountをフィールドに代入
//     }
//     Dollar times(int multiplier) {  //timesメソッドを作成
//         return new Dollar(amount * multiplier);  //新しいDollarオブジェクトを返す
//     }
//     public boolean equals(Object object) {      //equalsメソッドをオーバーライド
//         Dollar dollar = (Dollar) object;        //Object型をDollar型にキャスト
//         return amount == dollar.amount;         //amountフィールドを比較
//     }
// }