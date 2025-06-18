package money;

class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);  //Sumオブジェクトをto通貨に変換して返す
    }
    void addRate(String from, String to, int rate) {
        // 為替レートを追加するメソッド（実装は省略）
    }
}
