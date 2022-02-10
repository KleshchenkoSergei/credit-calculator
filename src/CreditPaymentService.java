public class CreditPaymentService {
    public double calculate(int credit, int loanPeriod, double persantageRate) {

        // коэффициент аннуитета
        double persantageRatePerMonth = persantageRate / 12 / 100;
        int loanPeriodMonth = loanPeriod * 12;
        // возведение в степень
        double ratePlusOne = 1;
        for (int a = 1; a <= loanPeriodMonth; a++) {
            ratePlusOne = ratePlusOne * (1 + persantageRatePerMonth);
        }
        // коэффициент аннуитета
        double koeffAnnuiteta = (persantageRatePerMonth * ratePlusOne) / (ratePlusOne - 1);
        // ежемесячный платеж
        double monthlyPay = credit * koeffAnnuiteta;
        return monthlyPay;
    }

}
