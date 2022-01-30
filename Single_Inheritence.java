class Box {
    double width, height, depth;

    Box() {
        System.out.println("Deafult Constructor");
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    void volume() {
        System.out.println("Volume = " + (width * height * depth));
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        // width = w;
        // height = h;
        // depth = d;
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight ob) {
        // width = ob.width;
        // height = ob.height;
        // depth = ob.depth;
        super(ob);
        weight = ob.weight;
    }
}

public class Single_Inheritence {
    public static void main(String[] args) {
        BoxWeight ob = new BoxWeight(10, 20, 30, 40);
        BoxWeight ob2 = new BoxWeight(ob);
        ob2.volume();
    }
}
