package money;

import java.util.Map;   //Mapをインポート
import java.util.HashMap;   //HashMapをインポート

class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();  //為替レートを格納するMapを作成
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);  //Sumオブジェクトをto通貨に変換して返す
    }
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);    //為替レートをMapに追加
    }
    int rate(String from, String to) {
    if (from.equals(to)) return 1;   //同じ通貨の場合は1を返す
        return rates.get(new Pair(from, to));   //為替レートを取得
    }
}
