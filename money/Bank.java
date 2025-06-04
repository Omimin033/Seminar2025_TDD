package money;

class Bank {
    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;  //Sumオブジェクトの金額を合計
        return new Money(amount, to);  //新しいMoneyオブジェクトを返す
    }
}
