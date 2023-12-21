package ex05;

import ex05.Pizza001;

class Pizza001{
    int radius;

    Pizza001(int r){
        radius = r;
    }

    Pizza001 whosLargest(Pizza001 p1, Pizza001 p2){
        if(p1.radius > p2.radius)
            return p1;
        else
            return p2;
    }
}
public class PizzaTest{
    public static void main(String[] args) {
        Pizza001 obj1 = new Pizza001(14);
        Pizza001 obj2 = new Pizza001(18);

        Pizza001 largest = obj1.whosLargest(obj1,obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼. ");

    }

}
