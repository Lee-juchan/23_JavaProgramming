package lecture.ch09_EnumAndCollection.Collection;

public class Member {
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // id, name의 string format 반환
    public String toString() {
        return String.format("id : %d, name : %s", getId(), getName());
    }
}
