/*
    @brief : 인터페이스 활용
    @details : 개별 동물의 소리를 인터페이스로 구현
*/

package lecture.ch08.Animal.InterfaceAnimal;

public interface InterfaceAnimal {
    String CATEGORY = "Animal"; // final static 프로퍼티
    void sound();       // public abstract 메소드
}
