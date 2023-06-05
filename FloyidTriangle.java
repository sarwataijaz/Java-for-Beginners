public class FloyidTriangle {
    public static void main (String[] args) {

        int n = 5;
        int count = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        //0-1 traingle
        int counter;

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                counter = 1;
            } else {
                counter = 0;
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(counter+" ");

                counter = (counter == 0) ? 1 : 0;
            }
            System.out.println();
        }
    }
}
