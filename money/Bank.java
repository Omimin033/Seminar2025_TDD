package money;

class Bank {
    Money reduce(Expression source, String to) {
        if (source instanceof Money)  //sourceがMoney型かどうかをチェック
            return (Money) source;  //Money型の場合はそのまま返す
        Sum sum = (Sum) source;
        return sum.reduce(to);  //Sumオブジェクトをto通貨に変換して返す
    }
}
