package lambdas.assignement;

@FunctionalInterface
public interface Retrievable<T> {
    public T retrieve();
}
