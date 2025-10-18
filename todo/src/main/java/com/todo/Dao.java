package com.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    public static void initialDb (){

    
    try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/todo", "climaxdev", "cali2468cali")){
        if(conn != null){
            System.out.println("connected to the data base");
        } else {
            System.out.println("failed to make connection");
        }
    } catch (SQLException e){
        System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e){
        e.printStackTrace();
    }
    }
}
