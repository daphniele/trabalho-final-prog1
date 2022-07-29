package mercadola.Model;

import java.io.File;
import java.sql.Connection;

public class DBController {

public static class DBController(String dbName, Connection dbConn){
    private String dbName;
    Connection dbConn;
    this.dbName = dbName;
    this.dbConn = dbConn;
}
public void conectar() throws Exception {
    File f = new File(this.dbName);
    if (!f.exists()){
        throw new Exception("Arquivo de banco de dados não existe!");
    }
}
}
