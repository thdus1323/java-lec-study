package ex04;

//계산기 클래스 = 설계도
public class Calculator {
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int minus(int n1, int n2){
        return n1-n2; // 항상 큰 수에서 작은 수는 어떻게? int라서 괜춘?
    }

    public int divide(int n1, int n2){
        return n1/n2;
    }

    public int multi(int n1, int n2){
        return n1*n2;
    }
}
