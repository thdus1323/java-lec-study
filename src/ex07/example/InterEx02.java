package ex07.example;

//라이브러리 판매
interface EventListener{
    void action();
}
//라이브러리 판매자가 생성
class MyApp{
    public void click(EventListener l){
        l.action();
    }
}

//개발자인 내가 구현

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다");
        }); //그럼 구현체를 만들지 않아도 됨.

    }
}
