package utils;

public class DBUtils {


    public static DBUtils dbUtilsSingleton = new DBUtils();

    private DBUtils() {
        System.out.println("DBUtilSingleton Instance Created" + this.hashCode());
    }

    public static DBUtils getInstance() {
        if (dbUtilsSingleton == null) {
            dbUtilsSingleton = new DBUtils();
        }

        return dbUtilsSingleton;
    }

    public void runQuery(String query) {
        // run query
        System.out.println("Query executed" + query);
    }

    public static void method1() {
        // method1
        System.out.println("Method1 executed");
    }
}
