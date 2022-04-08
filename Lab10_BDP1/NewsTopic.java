package lab10;

/**
 *
 * @author Asus
 */

public enum NewsTopic {
    ECONOMIC("ECONOMIC"),
    POLITICAL("POLITICAL"),
    TECHNOLOGY("TECHNOLOGY");

    public final String value;

    NewsTopic(String value) {
        this.value = value;
    }
}
