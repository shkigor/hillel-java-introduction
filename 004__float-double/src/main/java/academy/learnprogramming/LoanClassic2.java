package academy.learnprogramming;

public class LoanClassic2 {
    public static void main(String[] args) {
        double credit = 50000;
        double period = 12;
        double percentage = 0.22;
        double sum = 0;

        double creditBody = (credit / period);
        System.out.println("Сумма, которая идёт на погашение тела кредита =" + creditBody);

        double percentagePart = (credit * percentage) / period;
        sum += percentagePart;
        System.out.println("1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        double creditRemaining = credit - creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("2 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("3 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("4 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("5 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("6 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("7 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("8 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("9 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("10 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("11 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        creditRemaining -= creditBody;
        percentagePart = (creditRemaining * percentage) / period;
        sum += percentagePart;
        System.out.println("12 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentagePart);

        System.out.println("Сумма переплаты за 12 месяцев =" + sum);

    }

}
