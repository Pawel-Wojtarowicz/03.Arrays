public class StringArray {

    private static String[] stringArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

    void getStringArray() {
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
    void getFirstFiveElements() {
        for (int i = 0; i < 5; i++) {
            System.out.println(stringArray[i]);
        }
    }


    //https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
    //Arrays Exercises
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        System.out.println("Pierwsza metoda: ");
        stringArray.getStringArray();
        System.out.println("Druga metoda: ");
        stringArray.getFirstFiveElements();
    }
}
