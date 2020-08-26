public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1000000, 1, 9.99);
        System.out.printf("Ежемесячный платеж %.0f \n", payment);
        double payment1 = service.calculate(1000000, 2, 9.99);
        System.out.printf("Ежемесячный платеж %.0f \n", payment1);
        double payment2 = service.calculate(1000000, 3, 9.99);
        System.out.printf("Ежемесячный платеж %.0f \n", payment2);
    }
}
