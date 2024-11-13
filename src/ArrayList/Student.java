package ArrayList;

public class Student {
    String name;
    String id;
    String location;

    public Student(String name, String id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Location: " + location;
}
}

