package triple_INHRC_java;

class B { // SUPERCLASS B
    int x = 2; // DATA MEMBER SUPERCLASS x = 2

    void triple() {
        x = x * 3; // method - multiply the value of x by 3
    }

    int returnIt() {
        return x; // method - return the value of DATA MEMBER x
    }
}

class C extends B { // SUBCLASS C
    void triple() {
        x = x + 3; // method - increase the value of x by 3
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B(); // Create object b - SUPERCLASS B
        System.out.println("b.x: " + b.returnIt()); // prints 2

        C c = new C(); // Create object c - SUBCLASS C
        System.out.println("c.x: " + c.returnIt()); // prints c.x 2

        b.triple(); // change the value of b.x *=3
        c.triple(); // change the value of c.x +=3

        System.out.println("b.x after b.triple(): " + b.returnIt()); // prints b.x =2*3 = 6
        System.out.println("c.x after c.triple(): " + c.returnIt()); // prints c.x =2+3 = 5
    }
}
