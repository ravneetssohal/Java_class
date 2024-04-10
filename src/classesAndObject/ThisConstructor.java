package classesAndObject;

public class ThisConstructor {
    int id;
    String name;
    public ThisConstructor(){
        System.out.println("This is the default constructor.");
    }
    public ThisConstructor(int id){
        this();
        System.out.println("This is the id parameter constructor.");
        this.id = id;
        System.out.println(id);
    }
    public ThisConstructor(int id, String name){
        this(101);
        System.out.println("This is the id, name parameter constructor.");
        System.out.println(id + " " + name);
        this.id = id;
        this.name = name;
        System.out.println(id);
        System.out.println(name);
    }
    //constructor chaining
    public static void main(String[] args) {
        ThisConstructor thisConstructor = new ThisConstructor(100, "Ravneet");
    }
}
