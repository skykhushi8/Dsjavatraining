public class exceptionhandling {
    public static void main(String[] arg){
        // how to control null error
        String fname = null;
        try{
            System.out.println(fname.length());
        }catch (Exception exception){
            System.out.println(exception);
        }

        // input type or format error
        String name = "Muskan Chaudhary";

        try {
            int z = Integer.parseInt(name);
            System.out.println(z);
        }catch (Exception exception){
            System.out.println(exception);
        }

        //array index out of bound exception
        int array[] = {1, 2, 3, 4};
        try {
            System.out.println(array[6]);
        }catch (Exception exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("This is finally code");
        }

    }
}
