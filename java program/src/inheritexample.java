public class inheritexample extends Calc {
    public static void main(String[] args){
        Calc calc = new Calc();
        System.out.println(calc.add(4,2));
        System.out.println(calc.sub(4,2));
        System.out.println(calc.mul(4,2));
        System.out.println(calc.div(4,2));

    }

}

class Calc{
    int add(int i, int j) {
        return i + j;
    }
    int sub(int i, int j) {
        return i - j;
    }
    int mul(int i, int j) {
        return i * j;
    }
    int div(int i, int j) {
        return i / j;
    }
}