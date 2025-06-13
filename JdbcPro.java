import java .sql.*;
class JdbcPro
{
public static void main(String[] args)
{
	Connection con=null;
	Statement st=null;
	int result=0;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3308/harshitha","root","");
		
		String Que="INSERT INTO `data`(`Name`, `Sec`, `Age`) VALUES ('[harshi]','[A]',59)";
		st=con.createStatement();
		result=st.executeUpdate(Que);
		if(result==1)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.out.println(" not Inserted");
		}
		con.close();
	}
	catch (SQLException e) 
	{
            e.printStackTrace();
        }
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}