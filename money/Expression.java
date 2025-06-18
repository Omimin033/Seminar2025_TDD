package money;

interface Expression {
    Expression times(int multiplier);  // Expressionインターフェースにtimesメソッドを追加
    Expression plus(Expression addend);  // Expressionインターフェースにplusメソッドを追加
    Money reduce(Bank bank,  String to);  // Expressionインターフェースにreduceメソッドを追加
}