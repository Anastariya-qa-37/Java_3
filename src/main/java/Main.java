public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.data(1000000,3,9.99);
        System.out.println(payment);
    }
}

