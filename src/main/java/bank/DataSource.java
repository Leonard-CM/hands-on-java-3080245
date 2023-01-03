package bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {

  public static Connection connect(){
    String db_file = "Jdbc:sqlite:resources/bank.db";
    Connection connection = null ;

    try{
      connection = DriverManager.getConnection(db_file);
      System.out.println("We are connected to the database");
    } catch(Exception e){
      e.printStackTrace();
    
    }
    return connection;
    
  }
public static void main (String [] args){
  connect();
}
  
}
