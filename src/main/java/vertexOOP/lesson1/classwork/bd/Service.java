package vertexOOP.lesson1.classwork.bd;

public class Service {

    private Database database = new Database();

    //search in array for age
    public  String getFirstForAge(int age){
        int arr[] = database.getMasAge();

        for (int i = 0; i < arr.length; i++) {
            if (age == arr[i])
                return database.getMas()[i];
        }
        return "Not employer";
    }

    public String[] getAll(){
        return database.getMas();
    }

    public String getFirst(){
        return database.getMas()[0];
    }

    public String getLast(){
        int len = database.getMas().length;
        return database.getMas()[len-1];
    }

    public String[] getByName (String name){
        String [] mas = database.getMas();

        int count = 0;

        for (String s : mas) {
            if (s.startsWith(name))
                count++;
        }

        if (count == 0)
            return new String[]{"Not Name"};

        String [] arr = new String[count];
        for (int i = 0, j = 0; i < mas.length; i++) {
            if (mas[i].startsWith(name)) {
                arr[j] = mas[i];
                j++;
            }
        }
        return arr;
    }

    public String[] getBySurName (String surname){
        String [] mas = database.getMas();

        int count = 0;

        for (String s : mas) {
            if (s.endsWith(surname))
                count++;
        }

        if (count == 0)
            return new String[]{"Not Surname"};

        String [] arr = new String[count];
        for (int i = 0, j = 0; i < mas.length; i++) {
            if (mas[i].endsWith(surname)) {
                arr[j] = mas[i];
                j++;
            }
        }
        return arr;
    }
}
