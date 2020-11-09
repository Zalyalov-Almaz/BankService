package service;

public class BankService {

    public int cashback(int purchaseSum, int cashbackPercent) {
        int cashback = 0;
        if (cashbackPercent == 1 || cashbackPercent == 5 || cashbackPercent == 30) {
            cashback = purchaseSum * cashbackPercent / 100;
            int limit = 3000;
            if (cashback >= limit) {
                cashback = limit;
            }
        }
        return cashback;
    }

    public int deposit(int contribution){
        final int incomePercent = 3;
        int income = 0;
        if (contribution >= 1000) {
            income = contribution * incomePercent / 100;
        }
        return income;
    }
}
