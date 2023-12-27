package ex06.example7;
//composition 결합코드
public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거",1000); //버거
        Burger b2 = new ShrimpBurger("새우버거", 2000,"새우");
        //버거, 쉬림프버거 메모리에 뜸(다형성이 됨)
        Coke c1 = new Coke("콜라",1000);
        System.out.println();
        //heap에 set1가 버거랑 코크를 가지고 있음
        BurgerSet set1 = new BurgerSet(
                new Burger("기본버거",1000),
                new Coke("콜라",1000)
        );

        System.out.println("총 가격은: " + set1.getTotalPrice());

//        System.out.println(set1.getBurger().getPrice());
//        System.out.println(set1.getCoke().getPrice());
    }
}
