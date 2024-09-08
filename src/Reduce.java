public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i > 0) {
            if (i % 2 == 0){
                int hold  = i/2;
                count ++;
                i = hold;
            }
            else {
                int hold = i - 1;
                count ++;
                i = hold;
            }
        }
        System.out.println(count);
    }
}
