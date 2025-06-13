import java.sql.*;
class JdbcProgram
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement st=null;
		int result=0;
		try
	{	
		Class.forName("com.mysql.cj.jdbc.Driver");

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harshitha","root","");
		String Query="INSERT INTO harshitha (Name,id) values ('harshi',34)";
		st= con.createStatement();
		result	=st.executeUpdate(Query);
		if(result>0)
		{
			System.out.println("values inserted");
		}
		else
		{

			System.out.println("failed");
		}
		con.close();
	}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
			
		
	}
	

}