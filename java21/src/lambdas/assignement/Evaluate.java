package lambdas.assignement;

@FunctionalInterface
public interface Evaluate<T> {
    public Boolean isNegative(T t);
}
