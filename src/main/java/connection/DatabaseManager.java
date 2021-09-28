package connection;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class DatabaseManager {


    private static DatabaseManager jdbc;

    //JDBCSingleton prevents the instantiation from any other class.
    private DatabaseManager() {  }

    //Now we are providing gloabal point of access.

    public static DatabaseManager getInstance() {
        if (jdbc==null)
        {
            jdbc=new
                    DatabaseManager();
        }
        return jdbc;
    }



    /*  Benim instance alma şekli singleton
    private static final DatabaseManager INSTANCE = new DatabaseManager();

    private DatabaseManager() {

    }

    public static DatabaseManager getInstance() {
        return INSTANCE;
    }
*/

        private static Connection getConnection ()throws ClassNotFoundException, SQLException
        {

            String url = "jdbc:postgresql://localhost/patientdb";
            Properties props = new Properties();
            props.setProperty("user","postgres");
            props.setProperty("password","1");

            Connection conn = DriverManager.getConnection(url, props);

            /*
            String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
            Connection conn = DriverManager.getConnection(url);
            */



            return conn;

        }


        public int insert (String isim, String hastaligi, int yas) throws SQLException, IOException {
            Connection c = null;

            PreparedStatement ps = null;

            int recordCounter = 0;



            try {

                c = this.getConnection();
                    ps = c.prepareStatement("insert into hastabilgileri(isim,hastaligi,yas)values(?,?,?)");
                ps.setString(1, isim);
                ps.setString(2, hastaligi);
                ps.setInt(3,yas);
                recordCounter = ps.executeUpdate();


            } catch (Exception e) {

                e.printStackTrace();

            } finally {

                if (ps != null) {
                    ps.close();
                }
                if (c != null) {
                    c.close();
                }

            }

            return recordCounter;
        }


}






    /*
    public void querySingletonSample() {
        Patient patient = new Patient();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hasta adını girin ");
        String adi;
        adi = sc.nextLine();
        patient.setName(adi);

        System.out.println("Hasta yaşını girin ");
        int yas;
        yas = sc.nextInt();
        sc.nextLine();
        patient.setAge(yas);

        System.out.println("Hastanın muzdarip olduğu hastalığın adını girin ");
        String hastalik;
        hastalik = sc.nextLine();
        patient.setDisease(hastalik);

        System.out.println("Hasta adı: " + adi + "  Hastanın yaşı: " + yas + "  Hastanın rahatsızlığı: " + hastalik + "  ");
            */