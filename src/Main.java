public class Main {
    public static void main(String[] args) {

        CreditPaymentService monthPayment = new CreditPaymentService();

        int period = 21; // указывать в месяцах
        int credit = 1_000_000;
        double procent = 0.0999;

        //--------------------------------------------------------------------------- пример расчета
        for (  int i = 1; i < 4; i ++) {

            int periodExample = 12 * i;

            System.out.println();
            System.out.println("Для кредита на срок " + periodExample + " месяцев(а)");
            System.out.println("Ежемесячный платеж составляет: " + monthPayment.service(credit, periodExample, procent));
        }
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\

        //-------------------------------------------------------------------------- 4ый блок вывода
        System.out.println();
        System.out.println("Для кредита на срок " + period + " месяцев(а)");
        System.out.println("Ежемесячный платеж составляет: " + monthPayment.service(credit, period, procent));
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\\
    }
}