import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class webpage {
    static Connection connecttojdbc = null;
    private static final int MISSING = 9999;
    public static void main(String[] args) throws Exception {
        Table1();
        }

public static void Table1(){
        try{
                Statement statement = null;
            String thisLine = null;

           Class.forName("com.mysql.jdbc.Driver");
            Connection connecttojdbc=DriverManager.getConnection("jdbc:mysql://localhost","root","safestsystemever");
            statement = connecttojdbc.createStatement();
            FileReader in = new FileReader("/vagrant/Desktop/unzip/u_ex141028.log");
            BufferedReader br = new BufferedReader(in);
                int maxValue = Integer.MIN_VALUE;
            while ((thisLine = br.readLine()) != null) {
                String year = thisLine.substring(0,4);
                String date = thisLine.substring(5,10);
                String year = thisLine.substring(15, 19);
                String dates = thisLine.substring(19,23);
                String times = thisLine.substring(23,27);
                String lat = thisLine.substring(29,34);
                String lng = thisLine.substring(35,41);
                String ele = thisLine.substring(47,51);

                if (year.equals("1990"))
                {
                        int airTemperature;
                        int dewTemperature;
                        int atmpresure;
                    if (thisLine.charAt(87) == '+') { // parseInt doesn't like leading plus signs
                        airTemperature = Integer.parseInt(thisLine.substring(88, 92));
                        dewTemperature = Integer.parseInt(thisLine.substring(94,98));
                        atmpresure = Integer.parseInt(thisLine.substring(98,103));
                    } else {
                        airTemperature = Integer.parseInt(thisLine.substring(87, 92));
                        dewTemperature = Integer.parseInt(thisLine.substring(93,98));
                        atmpresure = Integer.parseInt(thisLine.substring(97,102));
                    }
                    String quality = thisLine.substring(92, 93);
                    if (airTemperature != MISSING && quality.matches("[01459]")) {
/*                        System.out.println("usaf " + usaf +" wban " + wban +" air temp " + airTemperature + " Date " + dates + " time " + times +" Latitutde "+ lat + " Longitutde " + lng + " elevation " + ele + " dew point " + dewTemperature + " atmpres " + atmpresure);
                        maxValue = Math.max(maxValue, airTemperature);*/
                        // INSERT TO DATABASE
                        String sqlupdate, sqlupdate2, sqlupdate3 = null;
                        sqlupdate = "Insert into MaxTemp.table1 " + "Values('" + year + "','" + airTemperature + "','" + usaf + "','" + wban + "','" + dates + "','" + times + "','" + lat + "','" + lng + "','" + ele + "','" + dewTemperature + "','" +atmpresure + "')";
                        statement.executeUpdate(sqlupdate);
                    }
                }
            }
            String sqlprofview = " SELECT MaxTemp.table1.year, MAX(MaxTemp.table1.temperature) as MaxTemperature FROM MaxTemp.table1 GROUP BY MaxTemp.table1.year";
                    ResultSet rsltset = statement.executeQuery(sqlprofview);
            int ash = 0;
                       if(rsltset.next()) {
                           ash = rsltset.getInt("MaxTemperature");
                           System.out.println("1990 : " + ash);
                       }
        }catch(Exception e){
                e.printStackTrace();
   }}}
