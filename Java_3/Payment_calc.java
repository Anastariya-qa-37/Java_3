public class Payment_calc {
    public static void main(String[] args) {
        InterestCalc service = new InterestCalc();
        int payment = service.data(1000000,3,9.99);
        System.out.println(payment);
    }
}
