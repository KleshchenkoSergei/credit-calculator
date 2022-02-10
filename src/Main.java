public class Main {
    public static void main(String[] args) {

        double persantageRate = 9.99;  // процентная ставка

        // тест-кейс 1
        int credit = 1_000_000;  // сумма кредита
        int loanPeriod = 1;  // срок кредита в годах
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate(credit, loanPeriod, persantageRate);
        System.out.println("Для срока кредита " + loanPeriod + " год");
        System.out.format("ежемесячный платеж составляет " + "%.0f", monthlyPayment);
        System.out.println(" рублей");
        System.out.println("при сумме кредита " + credit + " рублей и процентной ставке " + persantageRate + " %");
        System.out.println(" ");

        // тест-кейс 2
        int credit2 = 1_000_000;  // сумма кредита
        int loanPeriod2 = 2;  // срок кредита в годах
        CreditPaymentService service2 = new CreditPaymentService();
        double monthlyPayment2 = service.calculate(credit2, loanPeriod2, persantageRate);
        System.out.println("Для срока кредита " + loanPeriod2 + " года");
        System.out.format("ежемесячный платеж составляет " + "%.0f", monthlyPayment2);
        System.out.println(" рублей");
        System.out.println("при сумме кредита " + credit + " рублей и процентной ставке " + persantageRate + " %");
        System.out.println(" ");

        // тест-кейс 3
        int credit3 = 1_000_000;  // сумма кредита
        int loanPeriod3 = 3;  // срок кредита в годах
        CreditPaymentService service3 = new CreditPaymentService();
        double monthlyPayment3 = service.calculate(credit3, loanPeriod3, persantageRate);
        System.out.println("Для срока кредита " + loanPeriod3 + " года");
        System.out.format("ежемесячный платеж составляет " + "%.0f", monthlyPayment3);
        System.out.println(" рублей");
        System.out.println("при сумме кредита " + credit + " рублей и процентной ставке " + persantageRate + " %");
        System.out.println(" ");


    }
}
