package lambdas.assignement;

@FunctionalInterface
public interface Functionable<T,R> {
    public R applyThis(T t);
}
