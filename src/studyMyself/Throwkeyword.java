package studyMyself;

public class Throwkeyword {
    public static void main(String[] args) {
        String a = null;
        String b = "";

        try {
            try {
                int c = a.length() + b.length();
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                System.out.println("throw point exeption");

            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
