public abstract class Person {
private String name;
private final Size size;
public int id;
public static int uniqueID = 0;
public Person(String name, Size size){
    this.name = name;
    this.size = size;
    uniqueID++;
    id = uniqueID;
}

    public Size getSize() {
        return size;
    }

    public abstract void printInfo();
}
