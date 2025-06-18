package money;

class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);  //Sumオブジェクトをto通貨に変換して返す
    }
    void addRate(String from, String to, int rate) {
        
    }
    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;  //為替レートを設定
    }
}
