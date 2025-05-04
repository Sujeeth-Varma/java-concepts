
// Bounded type parameters -> T can be only of Number (Integer, Double)
public class Box<T extends Number> {
//    T can be of any datatype
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
