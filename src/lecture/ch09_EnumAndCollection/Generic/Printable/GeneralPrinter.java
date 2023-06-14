package lecture.ch09_EnumAndCollection.Generic.Printable;

public class GeneralPrinter<T extends Printable> { //<T>만 하면, 아무거나 다 들어올 수 있어서 위험
    private T shape;

    public void set(T shape) {
        this.shape = shape;
    }
    public void print() {
        shape.print();
    }
}
