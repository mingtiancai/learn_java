package chapter5;

import java.util.*;

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

public class chapter5 {
    public static void main(String[] args) {
        System.out.println("ss");
        // use_equal();
        // use_enum();
        use_reflection();
    }

    public static void use_equal() {
        var xx = new ArrayList<Integer>();
        xx.add(2);
        System.out.println(xx);
        Integer a = 12;
        Integer b = 12;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void use_enum() {
        var in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE ))");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
    }

    public static void use_reflection() {
        Employee e = new Employee("ss", 100, 1990, 1, 1);
        System.out.println(e.getClass());
    }

}
