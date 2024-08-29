


public class polymorphism {
    public static void main(String[] args){
        //method calling for int addition
        //memory taken = 8 int + 16 double
        System.out.println("M1" +add(5,4) + "M2" +add(7.5, 9.2));

    }

    private static double add(double v, double v1) {
        return v+v1;
    }

    private static int add(int i, int j){
        return i+j;
    }
}
