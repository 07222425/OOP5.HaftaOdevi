import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("String Object");
        list.add(new Circle());

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

class Loan {
    @Override
    public String toString() {
        return "Loan Object";
    }
}

class Circle {
    @Override
    public String toString() {
        return "Circle Object";
    }
}