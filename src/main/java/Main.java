import connection.DatabaseManager;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Device RoentgenMach = FactoryGenerator.getFactory(FactoryType.XRAYFACTORY).getGadget(DeviceType.ROENTGENMACH);
        System.out.println(RoentgenMach.getDetails());
    }
    }

        /*
        DatabaseManager jdbc = DatabaseManager.getInstance();


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Hasta adını girin ");
           String isim = br.readLine();

        System.out.println("Hastalığının adını girin ");
        String hastaligi = br.readLine();

        System.out.println("Hasta yaşını girin ");
        var yas = br.read();


        try {
             int i=jdbc.insert(isim,hastaligi,yas);
                if (i>0) {
                    System.out.println("Data eklendi"); } else {
                    System.out.println("Data eklenemedi");
                }
           }
           catch (Exception e) {
               System.out.println(e);
           }

    }
}
*/