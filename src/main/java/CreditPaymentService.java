public class CreditPaymentService {
    public static void main(String[] args) {
        Calculate service = new Calculate();
        int payment = service.data(1000000,3,9.99);
        System.out.println(payment);
    }
}

