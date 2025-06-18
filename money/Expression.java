package money;

interface Expression {
    Money reduce(Bank bank,  String to);  // Expressionインターフェースにreduceメソッドを追加
}