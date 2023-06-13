import java.util.Scanner;

class Evolution {
    public int w;
    public int x;
    public int y;
    public int z;
    int sol1;
    int sol2;
    int sol3;
    int sol4;

    Evolution(int w, int x, int y, int z) {
        w = this.w;
        x = this.x;
        y = this.y;
        z = this.z;
    }

    static int solution1(int w, int x, int y, int z) {

        return (w + x) - y * z;
    }

    static int solution2(int w, int x, int y, int z) {

        return w + x - (y * z);
    }

    static int solution3(int w, int x, int y, int z) {

        return w + (x - y) * z;
    }

    static int solution4(int w, int x, int y, int z) {

        return ((w + x) - y )* z;
    }
}

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Evolution e = new Evolution(w, x, y, z);
        System.out.println(e.solution1(w, x, y, z)+" "+e.solution2(w, x, y, z)+" "+ e.solution3(w, x, y, z)+" "+e.solution4(w, x, y, z));

    }
}
