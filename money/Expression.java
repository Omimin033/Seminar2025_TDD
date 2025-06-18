package money;

interface Expression {
    Expression plus(Expression addend);  // Expressionインターフェースにplusメソッドを追加
    Money reduce(Bank bank,  String to);  // Expressionインターフェースにreduceメソッドを追加
}