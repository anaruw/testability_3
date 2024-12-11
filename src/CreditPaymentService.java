public class CreditPaymentService {

    public int service(int credit, int period, double procent){

        int result;

        if (period == 1){

            period = 12;

        } else if (period == 2) {

            period = 24;

        } else if (period == 3) {

            period = 36;
        }

        double monthProcent = procent / 12;
        double pow = Math.pow((1 + monthProcent), period);

        result = (int) (credit * monthProcent * pow / (pow - 1));

        return result;
    }
}
