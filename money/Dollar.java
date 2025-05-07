package money;                      //moneyパッケージを作成

class Dollar {                      //Dollarクラスを作成
    int amount;                     //amountフィールドを作成
    Dollar(int amount) {            //コンストラクタを作成
        this.amount = amount;       //引数のamountをフィールドに代入
    }
    Dollar times(int multiplier) {  //timesメソッドを作成
        return new Dollar(amount * multiplier);  //新しいDollarオブジェクトを返す
    }
}