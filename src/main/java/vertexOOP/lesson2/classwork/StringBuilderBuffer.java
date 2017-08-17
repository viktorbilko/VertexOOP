package vertexOOP.lesson2.classwork;

public class StringBuilderBuffer {

    public static void main(String[] args) {

        String first = "Glory";
        String second = "is";
        String third = "Ukraine";

        final StringBuilder builder = new StringBuilder();
        builder.append(first)
                .append(" ")
                .append(second)
                .append(" ")
                .append(third);

        System.out.println(builder);
    }
}
