package ex04;

public class TelevisionEx01 {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        TelevisionEx01 myTv = new TelevisionEx01();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        TelevisionEx01 yourTv = new TelevisionEx01();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("나의 텔레비전의 채널은 " +
                myTv.channel + "이고 불륨은 " + myTv.volume + "입니다.");
        System.out.println("너의 텔레비전의 채널은 " +
                yourTv.channel + "이고 볼륨은" + yourTv.volume +"입니다.");
    }
}
