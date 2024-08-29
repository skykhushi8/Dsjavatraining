public class avgarray {
    public static void main(String[] args){
        int[] array = {1, 7, 9, 11, 12};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = (sum/ array.length);
        System.out.println(avg);
    }
}
