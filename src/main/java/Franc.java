public class Franc extends Money {
    private String currency;

    public Franc (int amount, String currency){
        super(amount, currency);
    }

    public Money times(int multiply){
        return Money.franc(amount * multiply);
    }
}