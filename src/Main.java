import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listInteger = new ArrayList<Integer>();

        try {
            for (int i = 0; i < 10; i++) {
                String stroka = reader.readLine();
                int number = Integer.parseInt(stroka);
                listInteger.add(number);
            }
        } catch (Exception e) {
            for (int i = 0; i < listInteger.size(); i++) {
                System.out.println(listInteger.get(i));
            }
        }

    }
}

