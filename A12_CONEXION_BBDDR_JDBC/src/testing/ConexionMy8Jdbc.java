package testing;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMy8Jdbc {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysl://localhost:3306/mysql_hr?serverTimezone=UTC";
		String usu = "root";
		String pwd = "root";
		
		Connection conn = DriverManager.getConnection(url,usu,pwd);
		
		//El java busca en este metodo el lanzar al que ha llamado. Y este se va a la cabezera del metodo

	}

}
