package coffee;

import java.util.List;

public class Menu {
    private List<String> item;

    //아메, 카푸,마끼, 에스프레소~메뉴판은 new 안의 매뉴를 객체로 만들필요x
    // 아메+가격(아메-1000원)~오브젝트(커스텀 자료형 데이터를 저장하기 위한)
    public Menu(List<String> item) {
        this.item = item;
    }

}
