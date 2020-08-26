public class CreditPaymentService {
        public double calculate(long amount, long year, double precent) {
            long mounths = year * 12;
            double annualRate = precent / 12 /100;
            double annuity = (double) (annualRate * Math.pow(1+annualRate, mounths)/(Math.pow(1 + annualRate, mounths) - 1));
            double payment = (double) annuity * amount;
            return payment;
        }
}
