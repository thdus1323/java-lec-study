package ex06.example7;

public class BurgerSet {
    //has관계, has Burger, Coke
    //결합
    //필요한 것들을 상태로 가지면 됨.(잘 만들어진 매소드를 상속이 아니게 받아쓰고 싶어)
    private Burger burger;
    private Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice(){
        int total = burger.getPrice() + coke.getPrice();
        return total;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
