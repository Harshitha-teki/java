import java.sql.*;
class DBConnection
{
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	int res = 0;
	DBConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");		//1. Load the Driver
		//2. Establishing the Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud_db", "root", "");
	}
	int insertToDB(String query) throws SQLException
	{
		st = con.createStatement();
		res = st.executeUpdate(query);
		return res;
	}
	ResultSet getFromDB(String query) throws SQLException
	{
		st = con.createStatement();
		rs = st.executeQuery(query);
		return rs;
	}
}
class InsertData
{
	public static void main(String[] args) throws Exception
	{
		DBConnection dbc = new DBConnection();

		//3. Executing the statements

		String query = "insert into stud_info (name, id, branch) values ('Jasritha', '45',AIML)";

		int res = dbc.insertToDB(query);

		if(res == 1)
			System.out.println("Insertion success!!!");
		else
			System.out.println("Insertion failed!!!");
	}
}