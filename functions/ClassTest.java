package functions;

public class ClassTest {
    public static boolean compareResults(int a, int b) {
        return a == b;
    }

    public static boolean compareResults(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int j = 0; j < a.length; j++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}