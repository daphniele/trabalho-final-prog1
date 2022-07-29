package mercadola.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mercadola.Model.DBController;

public class FuncionarioRepository{
    public class funcionarioRepository{
        public ResultSet readEmployee() throws Exception {
        String sel = "SELECT funcionarios"
        ResultSet rset = null;
            try{
                Statement stmt = this.dbConn.createStatment();
        }catch (SQLException e){
            throw new Exception("Erro ao encontrar funcionário");
        }
        return rset;
    }    
}
}