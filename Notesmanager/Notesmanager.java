 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Notesmanager 
{
	public static void main( String []args)
	{	
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("                   							    "+"NOTES");
		System.out.println("                   						          "+"|-------|");
		
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("  ");
		
		System.out.print("                    CREATE  NEW  (PRESS 1)                                    |             "+"                              SAVED NOTES(PRESS 2)");
		System.out.println(" ");
		
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("  ");
		
		System.out.println("  ");
		System.out.print("==>");
		int a=k.nextInt();
		
		System.out.println(" ");
     	System.out.println("------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------");
		
     	System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		if(a==1)
		{
			System.out.print("TITLE : ");
			String title=k.next();
			System.out.println(" ");
			System.out.println(" ");
		
			System.out.print("DATE(dd/mm/yy) : ");
			String date=k.next();
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.print("DISCRIPTION : ");
			String des=k.next();
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println(" ");
			System.out.println("------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			String l="insert into MEMO values('"+title+"','"+date+"','"+des+"')";
			try
			{ 
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/NOTES","root","");
				Statement stmt =conn.createStatement();
				String query=l;
				stmt.execute(query);
				System.out.println("Press Num-Enter To Save The Notes And Clear The Screen.");
				System.out.println(" ");
				System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
			}
			catch(Exception e)	
			{
				e.printStackTrace();
			}	
		}
		else if(a==2)
		{	
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/NOTES","root","");
				String query="Select *From MEMO";
				Statement stmt=conn.createStatement();
				ResultSet pointer=stmt.executeQuery(query);
				while(pointer.next()) {
					System.out.println("TITLE : "+pointer.getString(1)+"                                      DATE : "+pointer.getString(2)+"                                         DISCRIPTION : "+pointer.getString(3));
					System.out.println(" ");
					System.out.println(" ");
				}
				System.out.println(" ");
				System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
			System.out.println("Press Num-Enter came back on home screen.");
			System.out.println(" ");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
			
			
			
		}
		else 
		{
			System.out.println("Invalid Entry Please  Press NumEnter To Try Again.");
			System.out.println(" ");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
			
		}
	}

}
