import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class quiz {
	public static void main(String []args)
	{
		Scanner k=new Scanner(System.in);
		
		String username;
		String entry;
		
		int age;
		int answer[]=new int[5];
		int Store[]= {1,4,3,3,2};
		int count=0;
		
		char ans;		
		
		System.out.println("                                                                    "+"QUIZZ(Current Affairs)");
		System.out.println("                                                                    "+"----------------------");
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");	
		
		System.out.println("=>PARTICIPANT DETAIL :-");
		System.out.println(" ");	
		
		System.out.print("* Enter your good name : ");
		username=k.nextLine();
		System.out.println(" ");
		
		System.out.print("* Enter your age : ");
		age=k.nextInt();
		System.out.println(" ");
		
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("==>INSTRUCTIONS");
		System.out.println(">Ther are 5 quetion in quizz.");
		System.out.println(">Each quetion is of 1 mark.");
		System.out.println(">You have to write option number of the answer.");
		System.out.println(">if u write Answer number out the option then u will get 0/1.");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.print("Are you ready for quizz?(y/n) : ");
		ans=k.next().charAt(0);
		
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		if(ans=='y')
		{
		System.out.println("1) What is the name of the scheme launched by central government, that allow beneficiaries to\r\n" + 
				"buy subsidized foodgrains from any ration shop in the country ?\r\n" + 
				"1) One Nation One Ration Card\r\n" + 
				"2) One Ration One Nation\r\n" + 
				"3) One Ration Card through Nation\r\n" + 
				"4) One Nation and One Ration\r\n" + 
				"5) None of these"
				);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ans:");
		answer[0]=k.nextInt();
		System.out.println(" ");
		if(answer[0]>4)
		{
			System.out.println("invalid input");
		}
		
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("2) Who will head the committee formed by Telecom Minister Ravi Shankar Prasad to look into the\r\n" + 
				"revival plans for Telecom sector which is under financial stress ?\r\n" + 
				"1) Rajiv Gupta\r\n" + 
				"2) Kamendra Kumar\r\n" + 
				"3) Seshagiri Rao\r\n" + 
				"4) Aruna Sundararajan\r\n" + 
				"5) None of these"
				);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ans:");
		answer[1]=k.nextInt();
		System.out.println(" ");
		if(answer[1]>4)
		{
			System.out.println("invalid input");
		}
		
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("3) Where was the G20 (Group of 20) Summit 2019 held ?\r\n" + 
				"1) Riyadh, Saudi Arabia\r\n" + 
				"2) Buenos Aires, Argentina\r\n" + 
				"3) Osaka, Japan\r\n" + 
				"4) Beijing, China\r\n" + 
				"5) None of these"
				);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ans:");
		answer[2]=k.nextInt();
		System.out.println(" ");
		if(answer[2]>4)
		{
			System.out.println("invalid input");
		}
		
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("4) Which two countries set an ambitious $50 billion target for bilateral trade by 2025 during G20\r\n" + 
				"meet?\r\n" +
				"1) India and China\r\n" + 
				"2) India and Japan\r\n" + 
				"3) India and Indonesia\r\n" + 
				"4) India and Russia\r\n" + 
				"5) None of these"
				);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ans:");
		answer[3]=k.nextInt();
		System.out.println(" ");
		if(answer[3]>4)
		{
			System.out.println("invalid input");
		}
		
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("5) At which position India was placed in terms of money parked by its citizens with Swiss banks\r\n" + 
				"by the end of 2018 ?\r\n" + 
				"1) 73rd\r\n" + 
				"2) 74th\r\n" + 
				"3) 75th\r\n" + 
				"4) 76th\r\n" + 
				"5) None of these\r\n"
				);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ans:");
		answer[4]=k.nextInt();
		System.out.println(" ");
		if(answer[4]>4)
		{
			System.out.println("invalid input");
		}
		
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		for(int i=0;i<5;i++)
		{	
			if(answer[i]==Store[i])
			{
				count++;
			}
		}
		
		System.out.println("thankyou for your participation");
		System.out.println(" ");
	
		System.out.println(username+" your Score is "+count+"/5.");
		
		System.out.println(" ");
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
		
		entry="insert into USER_DETAIL values('"+username+"','"+age+"','"+count+"')";
		
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/QUIZZ","root","");
			Statement stmt =conn.createStatement();
			String query=entry;
			stmt.execute(query);
					
		}
		catch(Exception e)
		
		{
			e.printStackTrace();
			
		}
		
		
		}
		else if(ans=='n')
		{
			System.out.println("Your Score Is 0/5, To Restart The Quizz Press NumEnter");
			System.out.println(" ");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
			
			
		}
		else
		{
			System.out.println("only use y or n!,Press NumEnter To Try Again");
			System.out.println(" ");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
			
			
		}
	}
}




