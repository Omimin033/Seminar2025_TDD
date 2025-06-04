package money;

class Bank {
    Money reduce(Expression source, String to) {
        if (source instanceof Money)  //sourceがMoney型かどうかをチェック
            return ((Money) source).reduce(to);  //Money型ならreduceメソッドを呼び出す
        Sum sum = (Sum) source;
        return sum.reduce(to);  //Sumオブジェクトをto通貨に変換して返す
    }
}
