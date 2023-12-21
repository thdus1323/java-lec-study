package ex05;

public class PizzaTest002 {
    public static void main(String[] args) {
        Pizza002 p1 = new Pizza002("Super Supreme");
        Pizza002 p2 = new Pizza002("Cheese");
        Pizza002 p3 = new Pizza002("Pepperoni");
        int n = Pizza002.count;
        System.out.println("지금까지 판매된 피자 개수 = " + n);

    }
}
