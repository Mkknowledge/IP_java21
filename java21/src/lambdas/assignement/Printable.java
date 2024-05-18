package lambdas.assignement;

@FunctionalInterface
public interface Printable<T> {
    public void print(T t);
}
