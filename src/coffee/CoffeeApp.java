package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Barista bari = new Barista();
        Customer customer = new Customer();

        customer.order("아메리카노");

    }
}
