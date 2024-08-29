import java.util.Scanner;

public class constdemo {
    public static void main(String[] args){
        //call constructor object
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        String lname = scanner.nextLine();
        Myclass myclass = new Myclass(fname, lname);

        System.out.println("c= "+Myclass.fname);
        System.out.println("d= "+Myclass.lname);
    }
}

class Myclass{
    static String fname;
    static String lname;

    //parameter constructor
    public Myclass(String a, String b) {
        this.fname = a;
        this.lname = b;

        System.out.println(a+b);
    }

}

