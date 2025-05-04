

public class Main {
    public static void main(String[] args) {
        Box<Double> stringBox = new Box<>();
        stringBox.setValue(99.0);
        System.out.println(stringBox.getValue());

//        using Box class with different datatypes "String, Integer"
        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        System.out.println(intBox.getValue());
    }
}