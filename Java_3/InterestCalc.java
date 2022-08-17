public class InterestCalc {

    public int data (int sum, int time, double rate) {
        double monthly = time*12.0;
        double monthly_rate = (rate/100.0)/12;
        double rate_mont_pow = Math.pow(1.0+monthly_rate,monthly);
        double w = monthly_rate*rate_mont_pow;
        double r = rate_mont_pow-1.0;
        double annuity_ratio = w/r;
        double monthly_payment = sum * annuity_ratio;
        return (int) monthly_payment;

    }
}
