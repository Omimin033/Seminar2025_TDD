package money;

class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);  //Sumオブジェクトをto通貨に変換して返す
    }
}
