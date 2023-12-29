package ex03.Exercise;

public class P3Game2 {
    public static void main(String[] args) {
        int i = 1;
//나머지 3,6,9 하면 됨
        while (true) {

            if(i == 3){
                System.out.println("짝");
                i++;
                continue;
            }
            if(i == 13){
                System.out.println("짝");
                i++;
                continue;
            }
            if(i == 23){
                System.out.println("짝");
                i++;
                continue;
            }
            if(i == 33){
                System.out.println("짝");
                i++;
                continue;
            }
            if(i == 43){
                System.out.println("짝");
                i++;
                continue;
            }

            if(i == 6){
                System.out.println("짝");
                i++;
                continue;
            }

            if(i == 16){
                System.out.println("짝");
                i++;
                continue;
            }

            if(i == 26){
                System.out.println("짝");
                i++;
                continue;
            }
            if(i == 51)
                break;

            System.out.println(i);
            i ++;

        }
    }

}
