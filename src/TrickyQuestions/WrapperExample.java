package TrickyQuestions;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper
        Integer intObj = 100;
        Double doubleObj = 55.5;

        // Unboxing: Wrapper to Primitive
        int intValue = intObj;
        double doubleValue = doubleObj;

        // Using wrapper classes in collections
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(intObj); // Autoboxing
        intList.add(200);    // Autoboxing

        System.out.println("Integer Object: " + intObj);
        System.out.println("Primitive int: " + intValue);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Primitive double: " + doubleValue);
        System.out.println("Integer List: " + intList);
    }
}
