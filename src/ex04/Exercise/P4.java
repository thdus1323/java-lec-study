package ex04.Exercise;

class NumberBox {
    public int ivalue;
    public float fvalue;
}

public class P4 {
    public static void main(String[] args) {
        NumberBox nb = new NumberBox();
        nb.ivalue = 10;
        nb.fvalue = 1.2345f;

        System.out.println(nb.ivalue);
        System.out.println(nb.fvalue);
    }
}