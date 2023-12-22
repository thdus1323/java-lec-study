package ex06;
class Date{
    private int year, month, date;

    public Date(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date[" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                ']';
    }
}

class Employee02{
    private String name;
    private Date birthDate;
    public Employee02(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee01 [" +
                "name = '" + name + '\'' +
                ", birthDate = " + birthDate +
                ']';
    }
}
public class EmployeeTest01 {
    public static void main(String[] args) {
        Date birth = new Date(1990,1,1);
        Employee02 employee02 = new Employee02("홍길동", birth);
        System.out.println(employee02);
    }
}
