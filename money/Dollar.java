package money;  //moneyパッケージを作成

class Dollar extends Money {  //Dollarクラスを作成
    Dollar(int amount) {        //コンストラクタを作成
        this.amount = amount;   //引数のamountをフィールドに代入
    }
    Dollar times(int multiplier) {  //timesメソッドを作成
        return new Dollar(amount * multiplier);  //新しいDollarオブジェクトを返す
    }
    public boolean equals(Object object) {   //equalsメソッドをオーバーライド
        Money money = (Money) object;        //Object型をDollar型にキャスト
        return amount == money.amount;       //amountフィールドを比較
    }
}




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