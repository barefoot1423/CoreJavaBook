package v1.ch3;

public class EnhancedLoop {

    public static void main(String[] args) {

        Integer[] a = new Integer[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        // it returns an error, if one of elements is not initialized

        for (int number : a) {
            System.out.println(number);
        }
    }

}
