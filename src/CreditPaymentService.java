public class CreditPaymentService {

    public int service(int credit, int period, double procent){

        double monthProcent = procent / 12;
        double pow = Math.pow((1 + monthProcent), period);

        int result = (int) (credit * monthProcent * pow / (pow - 1));

        return result;
    }
}
