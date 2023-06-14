package lecture.ch09_EnumAndCollection.Generic.Box;

// 제네릭 클래스
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return this.t;
    }
}

// 제네릭 인터페이스
interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class Test {
    // 제네릭 메소드
    public static <T> void printArray(T[] array) { // 클래스와 메소드의 타입(T)은 별개
        for(T elem : array) {
            System.out.println(elem);
        }
    }
}