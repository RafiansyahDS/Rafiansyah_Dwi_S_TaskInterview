
import java.time.LocalDate;

public class App {
    public static int kalkulasi(int n, int inc){
        int sum = LocalDate.now().getYear();
        for (int i = 0; i < n; i++) {
            sum += inc;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Bussiness Case");
        System.out.println(kalkulasi(10,5));
        System.out.println(kalkulasi(100, 50) + "\n");

        System.out.println("Unit Test");
        System.out.println(kalkulasi(70, 10));
        System.out.println(kalkulasi(1170, 10));
        System.out.println(kalkulasi(55, 75));
    }
}
