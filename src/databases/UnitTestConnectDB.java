package databases;

public class UnitTestConnectDB {

    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.readDataBase("test_students","stName");

    }
}
