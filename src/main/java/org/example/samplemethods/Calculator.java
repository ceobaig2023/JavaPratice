package org.example.samplemethods;

public class Calculator {

    private int num1;
    private int num2;

    private int sum;

    protected int sum(int num1, int num2){
        return num1+num2;
    }

    private int sub(int num1, int num2){
        return num1-num2;
    }
    private int mul(int num1, int num2){
        return num1*num2;
    }
    private int div(int num1, int num2){
        return num1/num2;
    }
    private int mod(int num1, int num2){
        return num1%num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}

class MainCalculator{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNum1(10);
        calc.setNum2(5);
        calc.setSum(calc.sum(calc.getNum1(), calc.getNum2()));
        System.out.println(calc.getSum());
    }

}