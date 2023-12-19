package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(50,80);
        System.out.println("add: "+result);

        int result2 = cal.minus(80,50);
        System.out.println("minus: "+result2);

        int result3 = cal.divide(80,20);
        System.out.println("divide: "+result3);

        int result4 = cal.multi(10,3);
        System.out.println("multi: "+result4);

    }
}
