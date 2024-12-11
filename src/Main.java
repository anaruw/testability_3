public class Main {
    public static void main(String[] args) {

        CreditPaymentService monthPayment = new CreditPaymentService();

        for (  int period = 1; period < 4; period ++) {

            int credit = 1_000_000;
            double procent = 0.0999;

            System.out.println();
            System.out.println("Для кредита на срок " + period + " год(а)");
            System.out.println("Ежемесячный платеж составляет: " + monthPayment.service(credit, period, procent));
        }
    }
}