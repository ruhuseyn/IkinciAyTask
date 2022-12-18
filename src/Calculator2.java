import java.util.Scanner;

public class Calculator2 {
    public int Hesapla() {
        Scanner sc = new Scanner(System.in);
        int emeliyyat = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (emeliyyat) {
            case 1:
                emeliyyat = a + b;
            case 2:
                emeliyyat = a - b;
            case 3:
                emeliyyat = a * b;
            case 4:
                emeliyyat = a / b;
        }


        return emeliyyat;
    }
}

