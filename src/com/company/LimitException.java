package com.company;
    public class LimitException extends Exception{
        double remainingAmount;
        public LimitException(String message,double remainingAmount){
            super(message);
            this.remainingAmount = remainingAmount;
        }
        private double getRemainingAmount() {
            return remainingAmount;

        }
}
