package objectOriented1;

public class passObject {
    public void printAreas(circle c, int time) {
        System.out.println("Radius" + "\t" + "Area");
        for (int i = 1; i <= time; i++) {
            c.radius = i;
//            c.findArea();
            System.out.println(i + "\t" + c.findArea());
        }
    }

    public static void main(String[] args) {
        circle c = new circle();
        new passObject().printAreas(c,5);
        System.out.println(++c.radius);
    }
}
