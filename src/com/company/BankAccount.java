package com.company;
public class BankAccount {
        public double amount;

        public double getAmount() {
            return amount;
        }

        public double deposit(double sum) {
            System.out.println(amount += sum);
            return amount;
        }
        public void withDraw(int sum) throws LimitException {
            if (sum > amount) {
                throw new LimitException("На балансе недостаточно средтсв", sum);
            }
            amount -= sum;
            System.out.println("Снято " + sum + "сом");
        }

}
