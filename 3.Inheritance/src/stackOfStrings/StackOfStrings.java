package stackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    private List<String> data;
    private int index;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
        this.index++;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("The Stack is empty.");
        }
        return this.data.get(this.data.size()-1);
    }

    public String pop() {
        if (!isEmpty()) {
            return this.data.remove(this.data.size()-1);
        }
        throw new IllegalArgumentException("The Stack is empty.");
    }


    public boolean isEmpty() {
        return data.isEmpty();
    }
}
