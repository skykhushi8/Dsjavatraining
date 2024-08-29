public class constructor {
    public static void main(String[] args){
        //call constructor object
        MyClass myclass = new MyClass(5,8);
    }
}

class MyClass {
    int c,d;

    //parameter constructor
    public MyClass(int a, int b) {
        this.c = a;
        this.d = b;

        System.out.println(c+d);
    }

}
