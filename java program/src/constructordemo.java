public class constructordemo {
    public static void main(String[] args){
        //call constructor object
        Myclass myclass = new Myclass(5,8);
    }
}

class Myclass{
    int c,d;

    //parameter constructor
    public Myclass(int a, int b) {
        this.c = a;
        this.d = b;

        System.out.println(c+d);
    }

}
