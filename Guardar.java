import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Guardar extends Batalla{
	private final String USER = "DAW1_49759646C";
	private final String PWD = "A49759646C";
	private final String URL = "jdbc:oracle:thin:@oracle.ilerna.com:1521:xe";

	public Guardar() {
		Connection con = makeConnection();

					//selectWithStatement(con);
				
					createStatement(con);
				
		
	}

	public Connection makeConnection() {

		System.out.println("Connecting database...");

		Connection con = null;
		// intentamos la conexion a la base de datos
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("Database connected!");

		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database! ", e);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// devolvemos el valor de la conexion
		return con;
	}

	public void createStatement(Connection con) {
		for(int i = 0; i< equipos.size();i++) {
		String sql = "INSERT INTO EQUIPOS2" +  " VALUES (" +"EQUIPO('" + equipos.get(i).Nombre + "','" + equipos.get(i).hp + "', " + equipos.get(i).misil +",'"+ equipos.get(i).tipo + "', " + equipos.get(i).misila+ ", " + equipos.get(i).misild+ ", '" + equipos.get(i).foto +"'))";

		Statement st = null;

		try {
			st = con.createStatement();

			st.execute(sql);

			st.close();

		} catch (SQLException e) {
			System.out.println("The INSERT had problems!! " + e);

		}
		}
	}

	public void selectWithStatement(Connection con) {

		String sql = "SELECT p.* FROM EQUIPOS2 p";

		Statement st = null;

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Struct EQUIPOS = (Struct) rs.getObject("EQUIPOS");			
			}

			st.close();

		} catch (SQLException e) {
			System.out.println("The SELECT had problems!! " + e);

		}
	}

}
