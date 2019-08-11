package academy.learnprogramming;

public class LoanClassic {

	public static void main(String[] args) {
		// http://www.temabiz.com/finterminy/dp-formula-raschet-differencirovannogo-kredita.html
		double amountLoan = 50_000; //Сумма кредита
		double annualInterestRate = 22; //Годовая процентная ставка 22%
		short loanTerms = 12; //Срок кредитования 12 месяцев
		double totalAmountRepayInterest = 0;


		double amountRepayLoanBody = amountLoan / loanTerms; //Сумма, которая идёт на погашение тела кредита
		System.out.println("Сумма, которая идёт на погашение тела кредита = " + amountRepayLoanBody);
		System.out.println("\n");

		short term = 0;
		double loanBalance = 50_000; //Остаток задолженности по кредиту
		double amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 1;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 2;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 3;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 4;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 5;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 6;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 7;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 8;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 9;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 10;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);

		term = 11;
		loanBalance = 50_000 - amountRepayLoanBody * term; //Остаток задолженности по кредиту
		amountRepayInterest = loanBalance * annualInterestRate / 12 / 100; //Сумма, которая идёт на погашение процентов по кредиту в данный расчётный период;
		totalAmountRepayInterest = totalAmountRepayInterest + amountRepayInterest;
		System.out.println(term + " расчётный период. " + "Сумма, которая идёт на погашение процентов по кредиту = " + amountRepayInterest);


		System.out.println("Сумма переплаты за 12 месяцев = " + totalAmountRepayInterest);
	}
}
