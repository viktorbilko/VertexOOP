package vertexOOP.lesson1.printout;

/*
* 3 methods that turn a string
* */

public class Task5 {

    public static void main(String[] args) {

        String str = "Go to home!";
        System.out.println("Method turnLine: " + turnLine(str));

        System.out.println("Method turnLine2: " + turnLine2(str));

        System.out.println("Method turnLine3: " + turnLine3(str));


    }

    private static String turnLine3(String str) {
        return new String(new StringBuffer(str).reverse());
    }

    private static String turnLine2(String str) {

        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        return new String(stringBuilder);
    }

    private static String turnLine(String s) {

        char [] tmp = s.toCharArray();
        char [] tmp2 = new char [tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            tmp2[i] = tmp [tmp.length-1-i];
        }

        return new String(tmp2);
    }
}
