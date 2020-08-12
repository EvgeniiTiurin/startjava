public class Unicode {
    public static void main (String[] args) {
        int i = 33;

        while (i <= 126) {
            char uni = (char)(i);
            System.out.println(uni);
            i++;
        }
    }
}
