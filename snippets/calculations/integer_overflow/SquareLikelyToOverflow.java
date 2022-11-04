import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

class Square  {
    public static void main(final String[] argv) throws NoSuchAlgorithmException {
        while (true) {
            int num = SecureRandom.getInstanceStrong().nextInt();

            final int sqrd = num * num;
            final long sqrd2 = (long)num * num;

            System.out.print((sqrd < 0 || sqrd != sqrd2) ? "!!!FAILED!!!    " : "pass    ");
            System.out.print("The result of ");
            System.out.print(Integer.toString(num));
            System.out.print(" squared is ");
            System.out.println(Integer.toString(sqrd));
        }
    }
}
