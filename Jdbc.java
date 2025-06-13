import java.sql.*;
class Jdbc
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Data","root","");
			
			String Que= "DELETE FROM data(Name,Id,Branch) values('data',59,'AIML')";
			Statement st= con.createStatement();
			int Res= st.executeUpdate(Que);
			if(Res>0)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("Inserted");
			}con.close();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	

}