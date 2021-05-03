package constructor;

public class person {

    private String name;
    private int age;


    public person() {
    }

    public String getName() {
        return name;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat() {
        System.out.println("chifan");
    }

    public void study() {
        System.out.println("xuexi");
    }

    public void show() {
        System.out.println("name :" + name);
    }

}
