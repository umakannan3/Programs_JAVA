// class Methods {
//     int a;
//     String name;

//     public void display(String str, int rank) {
//         System.out.println("Hi" + " " + str + " " + "your position is : " + rank);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Methods m = new Methods();
//         int c = m.a = 10;
//         String nam = m.name = "Uma";
//         m.display(nam, c);

//     }
// }

class Main {
    int a;
    String name;

    public void display() {
        System.out.println("Hi" + " " + name + " " + "your position is : " + a);
    }
}

class Methods {
    public static void main(String[] args) {
        Main m = new Main();
        m.a = 10;
        m.name = "Uma";
        m.display();
        Main m1 = new Main();
        m1.a = 100;
        m1.name = "Ara";
        m1.display();

    }
}
