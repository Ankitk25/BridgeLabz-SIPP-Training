
import java.io.Serializable;

class StudentData implements Serializable {
    String name;
    int id;
    StudentData(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class BackupSerialization {
    public static void main(String[] args) {
        StudentData s = new StudentData("Ravi", 101);
        System.out.println("Object ready for backup: " + s.name);
    }
}
