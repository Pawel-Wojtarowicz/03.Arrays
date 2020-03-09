import java.util.Arrays;

public class IntegerArray {

    private int[] integerArray = {1,2,3,4,5};

    public int[] reverse() {
        for (int i = 0; i < integerArray.length / 2 ; i++) {
            int temp = integerArray[i];
            integerArray[i] = integerArray[integerArray.length -i -1];
            integerArray[integerArray.length - i -1] = temp;
        }
        return integerArray;
    }

    void printArray() {
        for (int value : integerArray) {
            System.out.println(value);
        }
    }


    //https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
    //Arrays Exercises
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray();
        integerArray.printArray();
        System.out.println(Arrays.toString(integerArray.reverse()));

    }
}
