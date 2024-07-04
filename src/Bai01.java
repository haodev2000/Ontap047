import java.util.Scanner;
import java.util.function.Function;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập: ");
        String str = sc.nextLine();

        Function<String, Boolean> function = new Function<>() {
            @Override
            public Boolean apply(String s) {

                String reverA = reverString(str);

                for (int i = 0; i < str.length(); i++){
                    if (str.charAt(i) != reverA.charAt(i)){
                        return false;
                    }
                }
                return true;
            }
        };

        System.out.println(function.apply(str));


    }

    public static String reverString(String a){
        if(a.isEmpty()){
            return a;
        }
        return reverString(a.substring(1)) + a.charAt(0);
    }
}
