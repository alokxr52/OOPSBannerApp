/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by using String.join() instead of
 * string concatenation to construct each line of the banner.
 *
 * @author Alok
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "  *****  ", "  *****  ", " ****** ", "  *****  "));

        System.out.println(String.join(" ",
                " *     * ", " *     * ", " *     * ", " *     * "));

        System.out.println(String.join(" ",
                " *     * ", " *     * ", " *     * ", " *       "));

        System.out.println(String.join(" ",
                " *     * ", " *     * ", " ******  ", "  *****  "));

        System.out.println(String.join(" ",
                " *     * ", " *     * ", " *       ", "       * "));

        System.out.println(String.join(" ",
                " *     * ", " *     * ", " *       ", " *     * "));

        System.out.println(String.join(" ",
                "  *****  ", "  *****  ", " *       ", "  *****  "));
    }
}

