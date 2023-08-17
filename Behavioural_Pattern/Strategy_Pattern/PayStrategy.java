package Strategy_Pattern;
/**
 * PayStrategy
 * 
 * Common interface of payment methods
 */
public interface PayStrategy {
    boolean pay(int payAmount);
    void collectPaymentDetails();
}