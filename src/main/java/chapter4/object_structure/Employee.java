package chapter4.object_structure;

public class Employee {
    {
        id = 100;
    }
    private static int nextId;
    private int id = assign();
    //可以是static，也可以不是static修饰
    private static int assign(){
        return nextId++;
    }

    public Employee() {
        System.out.println("无参构造器");
    }

    public Employee(int id) {
        this();
        System.out.println("有参构造器");
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public  int getId() {
        return id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("执行析构");
    }
}
