package work;

public class Gnome {
    public static void main(String[] args) {
        int[] a = {45, 50, 10, 32, 16, 2, 5};
        int i = 0;
        while (i < a.length) {
            if (i == 0 || a[i - 1] <= a[i])
                i++;
            else {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
                i--;
            }
        }
        for (int number : a) {
            System.out.println(number);
        }
    }
}
