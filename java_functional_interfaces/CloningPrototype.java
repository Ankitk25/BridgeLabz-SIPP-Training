
class Prototype implements Cloneable {
    int value;
    Prototype(int value) {
        this.value = value;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype(10);
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Original value: " + p1.value);
        System.out.println("Cloned value: " + p2.value);
    }
}
