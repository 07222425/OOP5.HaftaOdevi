import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    public Object pop() {
        Object o = super.get(super.size() - 1);
        super.remove(super.size() - 1);
        return o;
    }

    public void push(Object o) {
        super.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}