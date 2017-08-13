package vertexOOP.lesson1.classwork.bd;

/*
* Database of employer
* */

public class Database {

    private String mas[] = {"Alex Smith", "Peter James", "Tom Smith", "Alex Tit", "Alex Tot", "Tim Kuk"};
    private int masAge[] = {25, 37, 28, 40, 28, 18};

    public int[] getMasAge() {
        return masAge;
    }

    public String[] getMas() {
        return mas;
    }
}
