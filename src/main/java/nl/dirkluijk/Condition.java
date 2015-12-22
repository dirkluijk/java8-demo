package nl.dirkluijk;

/**
 * @author Dirk Luijk <dirk@luijk.nl>
 */
public interface Condition<T> {
    boolean matches(T object);
}
