package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        HashMap<String, String> employees = new HashMap<String, String>();
        employees.put("001", "Krimo"); // referred to as an "entry set"
        employees.put("002", "mezmez");
        employees.put("003", "lamara");
        employees.put("004", "hamadi");


        // Map<String, employees<Object>> list = new HashMap<Object, Object>();

//
//        connectToSqlDB.insertDataFromMapToSqlTable(employees, "map_data", "Key`", "Values");//        connectToSqlDB.readDataBase( "Key`", "Values");


        Map<String, List<String>> list = new HashMap<String, List<String>>();
        list.put("phone", Arrays.asList("Iphone", "Galaxy", "Condor"));
        list.put("tv", Arrays.asList("LG", "Samsung","apple","philips"));
        list.put("bike", Arrays.asList("Harley", "Honda", "BMW","kawazaki"));


        System.out.println("\nThe Map items by using For Each:");
        int i = 0;
        for (String key : list.keySet()) {
            System.out.print(key);

            for (List val : list.values())
                System.out.print(val);
            System.out.println();
        }


        Iterator it = employees.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            System.out.println(pair.getKey() + " Employee: " + pair.getValue());
        }

        System.out.println("\nThe Map items by using For Each:");
        for (String key : employees.keySet()) {
            System.out.println("keys: " + key);
        }
        for (String val : employees.values())
            System.out.println("values: " + val);
        System.out.println();
    }

    }


