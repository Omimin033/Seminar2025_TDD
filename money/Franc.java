package money;  //moneyパッケージを作成

class Franc extends Money {  //Francクラスを作成
    Franc(int amount) {         //コンストラクタを作成
        this.amount = amount;   //引数のamountをフィールドに代入
        currency = "CHF";   //currencyフィールドを初期化
    }
    Money times(int multiplier) {  //timesメソッドを作成
        return new Franc(amount * multiplier);  //新しいFrancオブジェクトを返す
    }
}

// 9章途中までのコード
// class Franc extends Money {  //Francクラスを作成
//     private String currency;  //currencyフィールドを作成
//     Franc(int amount) {         //コンストラクタを作成
//         this.amount = amount;   //引数のamountをフィールドに代入
//         currency = "CHF";   //currencyフィールドを初期化
//     }
//     String currency() {  //currencyメソッドをオーバーライド
//         return currency();    //通貨を返す
//     }
//     Money times(int multiplier) {  //timesメソッドを作成
//         return new Franc(amount * multiplier);  //新しいFrancオブジェクトを返す
//     }
// }

// 第５章までのコード
// class Franc {
//     private int amount;         //amountフィールドを作成
//     Franc(int amount) {         //コンストラクタを作成
//         this.amount = amount;   //引数のamountをフィールドに代入
//     }
//     Franc times(int multiplier) {  //timesメソッドを作成
//         return new Franc(amount * multiplier);  //新しいFrancオブジェクトを返す
//     }
//     public boolean equals(Object object) {     //equalsメソッドをオーバーライド
//         Franc franc = (Franc) object;          //Object型をFranc型にキャスト
//         return amount == franc.amount;         //amountフィールドを比較
//     }
// }
