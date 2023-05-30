/*
    @brief : 추상클래스 연습
    @details : 동물이 내는 소리를 각각 구현
*/

package lecture.ch08.Animal.AbstractAnimal;

public abstract class AbstractAnimal {
    protected String category ="";

    // constructor
    public AbstractAnimal() {
        this("Animal");
    }
    public AbstractAnimal(String category) {
        this.category = category;
    }

    // abstract method
    public abstract void sound();
    
    // method
    public void showCategory() {
        System.out.println(this.category + " category");
    }
}
