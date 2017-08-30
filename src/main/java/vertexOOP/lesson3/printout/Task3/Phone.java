package vertexOOP.lesson3.printout.Task3;

/**
 * @author Viktor Bilko on 30.08.2017.
 */
public class Phone {

    private static Phone[] phones = new Phone[10];
    private String myNumber;
    private String marka;
    private static int countPhones = 0;

    public Phone(String myNumber, String marka) {
        this.myNumber = myNumber;
        this.marka = marka;
    }

    public static void setPhones(Phone phones) {
        Phone.phones[countPhones++] = phones;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public String getMarka() {
        return marka;
    }

    public static Phone getRandomPhone(){
        return phones[(int) (0 + Math.random()*(phones.length))];
    }

    public static boolean isNumberExist(String number){
        for (Phone phone : phones) {
            if (phone.myNumber.equals(number)){
                return true;
            }
        }

        return false;
    }

    public void call(String number){
        if (isNumberExist(number)){
            System.out.println("Phone " + this.getMyNumber() + ", marka " + this.getMarka()
                        + " call Phone " + number + " marka " + getMarka(number));
        } else {
            System.out.println("Phone number " + number + " is not exist");
        }

    }

    public String getMarka(String number){
        for (Phone phone : phones) {
            if (phone.myNumber.equals(number))
                return phone.marka;
        }

        return null;
    }
}
