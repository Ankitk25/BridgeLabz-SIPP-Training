package recipe;

public class RecipeStep<T> {
    private T step;

    public RecipeStep(T step) {
        this.step = step;
    }
    public T getStep() {
        return step;
    }
    @Override
    public String toString() {
        return step.toString();
    }
}
