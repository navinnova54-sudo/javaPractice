package Day11;

interface PaymentMode {
    void pay();
}

class UPIPayment implements PaymentMode {

    public void pay() {
        System.out.println("UPI Payment");
    }
}

class CardPayment implements PaymentMode {

    public void pay() {
        System.out.println("Card Payment");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        PaymentMode p = new UPIPayment();
        p.pay();

        p = new CardPayment();
        p.pay();
    }
}
