package Scoreboard;
import java.util.Scanner;
public class Q3
{
	static String t1choose;
	static String Team1;
	static String Team2;
	static String toss;
	static String t2choose;
	static int Overs;
	static String calls;
	static String call;
	static int total_score1,wickets1=0,total_score2,wickets2=0,i,extras1,extras2,sum=0,b1,b2;
	static String name;
	static int runsbat,runsball,balls, fours, sixes,overs, wickets, maiden,n1,n2;
	static float strike_rate,economy;
	static Batsman[] t1=new Batsman[11];
	static Bowler[] t2=new Bowler[11];
	static Batsman[] t3=new Batsman[11];
	static Bowler[] t4=new Bowler[11];
	public void board() throws Exception
	{
		Scanner sc= new Scanner(System.in);	 
		System.out.println("\t\t=================================================");
		System.out.println("\t\t|                                               |");
		System.out.println("\t\t|        --------------------------------       |");
		System.out.println("\t\t|                 CRICKET SCORER                |");
		System.out.println("\t\t|        --------------------------------       |");
		System.out.println("\t\t|                                               |");
		System.out.println("\t\t=================================================\n");
		System.out.println("Enter Team1 name:");
		Team1 = sc.nextLine();
		System.out.println("Enter Team2 name:");
		Team2 = sc.nextLine();
		System.out.println("Overs per innings:");
		Overs=sc.nextInt();
		//Toss
		if (Math.random() < 0.5)
		{
			toss="Heads";
		}else
		{
			toss="Tails";
		}

		System.out.println("\nTOSS TIME\n");
		System.out.println("Who is calling? "+Team1+" or "+Team2+" :");
		sc.nextLine();
		call=sc.nextLine();
		if (call.equals(Team1))
		{
			System.out.println(Team1+" Calls...\n");
			calls=sc.nextLine();
			if(calls.equalsIgnoreCase(toss))
			{
				System.out.println(Team1+" has won the toss and choose to...(Bat/Field)");
				t1choose=sc.nextLine();
				if (t1choose.equalsIgnoreCase("Bat"))
				{
					t2choose="Field";

				}
				else
				{
					t2choose="Bat";
				}
			}
			else
			{
				System.out.println(Team2+" has won the toss and choose to...(Bat/Field)");
				t2choose=sc.nextLine();
				if (t2choose.equalsIgnoreCase("Bat"))
				{
					t1choose="Field";

				}
				else
				{
					t1choose="Bat";
				}

			}

		}
		else
		{
			System.out.println(Team2+" Calls...\n");
			calls=sc.nextLine();
			if(calls.equalsIgnoreCase(toss))
			{
				System.out.println(Team2+" has won the toss and choose to...(Bat/Field)");
				t2choose=sc.nextLine();
				if (t2choose.equalsIgnoreCase("Bat"))
				{
					t1choose="Field";

				}
				else
				{
					t1choose="Bat";
				}
			}
			else
			{
				System.out.println(Team1+" has won the toss and choose to...(Bat/Field)");
				t1choose=sc.nextLine();
				if (t1choose.equalsIgnoreCase("Bat"))
				{
					t2choose="Field";

				}
				else
				{
					t2choose="Bat";
				}
			}
		}
		if(t1choose.equalsIgnoreCase("Bat"))
		{
			//Ist innings

			sum=0;
			System.out.println("Enter total first innings score:");
			total_score1=sc.nextInt();
			System.out.println("Enter number of batters batted:\n");
			b1=sc.nextInt();
			System.out.println("Enter Ist innings scores in this format:\n");
			System.out.println("name\t\t runs\t balls \t 4s \t 6s \n");
			for(i=0;i<b1;i++)
			{
				name=sc.next();
				runsbat=sc.nextInt();
				balls=sc.nextInt();
				fours=sc.nextInt();
				sixes=sc.nextInt();
				strike_rate=((float)runsbat/balls)*100;
				t1[i]=new Batsman(name,runsbat,balls,fours,sixes,strike_rate);
				sum=sum+runsbat;
				//sc.nextLine();
			}
			extras1=total_score1-sum;
			System.out.println("Enter no.of bowlers used:\n");
			n1=sc.nextInt();
			System.out.println("Enter bowling performance of other team in this format:\n");
			System.out.println("name\t\t overs\t maiden \t runs \t wickets\n");

			for(i=0;i<n1;i++)
			{
				name=sc.next();
				overs=sc.nextInt();
				maiden=sc.nextInt();
				runsball=sc.nextInt();
				wickets=sc.nextInt();
				economy=((float)runsball/overs);
				t2[i]= new Bowler(name,overs,maiden,runsball,wickets,economy);
				wickets1=wickets1+wickets;
			}

			//IInd innings

			sum=0;
			System.out.println("Enter total Second innings score:");
			total_score2=sc.nextInt();
			System.out.println("Enter number of batters batted:\n");
			b2=sc.nextInt();
			System.out.println("Enter IInd innings scores in this format:\n");
			System.out.println("name\t\t runs\t balls \t 4s \t 6s \n");

			for(i=0;i<b2;i++)
			{
				name=sc.next();
				runsbat=sc.nextInt();
				balls=sc.nextInt();
				fours=sc.nextInt();
				sixes=sc.nextInt();
				strike_rate=((float)runsbat/balls)*100;
				t3[i]=new Batsman(name,runsbat,balls,fours,sixes,strike_rate);
				sum=sum+runsbat;
				//sc.nextLine();
			}
			extras2=total_score2-sum;
			System.out.println("Enter no.of bowlers used:\n");
			n2=sc.nextInt();
			System.out.println("Enter bowling performance of other team in this format:\n");
			System.out.println("name\t\t overs\t maiden \t runs \t wickets\n");
			for(i=0;i<n2;i++)
			{
				name=sc.next();
				overs=sc.nextInt();
				maiden=sc.nextInt();
				runsball=sc.nextInt();
				wickets=sc.nextInt();
				economy=((float)runsball/overs);
				t4[i]= new Bowler(name,overs,maiden,runsball,wickets,economy);
				wickets2+=wickets;
			}
		}		
		else
		{
			//Ist innings

			sum=0;
			System.out.println("Enter total first innings score:");
			total_score2=sc.nextInt();
			System.out.println("Enter number of batters batted:\n");
			b1=sc.nextInt();
			System.out.println("Enter Ist innings scores in this format:\n");
			System.out.println("name\t\t runs\t balls \t 4s \t 6s \n");
			for(i=0;i<b1;i++)
			{
				name=sc.next();
				runsbat=sc.nextInt();
				balls=sc.nextInt();
				fours=sc.nextInt();
				sixes=sc.nextInt();
				strike_rate=((float)runsbat/balls)*100;
				t1[i]=new Batsman(name,runsbat,balls,fours,sixes,strike_rate);
				sum=sum+runsbat;
				//sc.nextLine();
			}
			extras1=total_score2-sum;
			System.out.println("Enter no.of bowlers used:\n");
			n1=sc.nextInt();
			System.out.println("Enter bowling performance of other team in this format:\n");
			System.out.println("name\t\t overs\t maiden \t runs \t wickets\n");

			for(i=0;i<n1;i++)
			{
				name=sc.next();
				overs=sc.nextInt();
				maiden=sc.nextInt();
				runsball=sc.nextInt();
				wickets=sc.nextInt();
				economy=((float)runsball/overs);
				t2[i]= new Bowler(name,overs,maiden,runsball,wickets,economy);
				wickets1+=wickets;
			}

			//IInd innings

			sum=0;
			System.out.println("Enter total Second innings score:");
			total_score1=sc.nextInt();
			System.out.println("Enter number of batters batted:\n");
			b2=sc.nextInt();
			System.out.println("Enter IInd innings scores in this format:\n");
			System.out.println("name\t\t runs\t balls \t 4s \t 6s \n");

			for(i=0;i<b2;i++)
			{
				name=sc.next();
				runsbat=sc.nextInt();
				balls=sc.nextInt();
				fours=sc.nextInt();
				sixes=sc.nextInt();
				strike_rate=((float)runsbat/balls)*100;
				t3[i]=new Batsman(name,runsbat,balls,fours,sixes,strike_rate);
				sum=sum+runsbat;
				//sc.nextLine();
			}
			extras2=total_score1-sum;

			System.out.println("Enter no.of bowlers used:\n");
			n2=sc.nextInt();
			System.out.println("Enter bowling performance of other team in this format:\n");
			System.out.println("name\t\t overs\t maiden \t runs \t wickets\n");

			for(i=0;i<n2;i++)
			{
				name=sc.next();
				overs=sc.nextInt();
				maiden=sc.nextInt();
				runsball=sc.nextInt();
				wickets=sc.nextInt();
				economy=((float)runsball/overs);
				t4[i]= new Bowler(name,overs,maiden,runsball,wickets,economy);
				wickets2+=wickets;
			}
		}
		
	}
	public static  void output_console()
	{
		//SCOREBOARD
		if(t1choose.equalsIgnoreCase("Bat"))
		{
			System.out.println("\t\t=================================================");
			System.out.println("\t\t|                                               |");
			System.out.println("\t\t|        --------------------------------       |");
			System.out.println("\t\t|                 SCOREBOARD                    |");
			System.out.println("\t\t|        --------------------------------       |");
			System.out.println("\t\t|                                               |");
			System.out.println("\t\t=================================================\n\n\n");
			System.out.println(Team1+"\t\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")");
			System.out.println("Batsman\t\t\truns\tballs\t4s\t6s\tSR");
			for(i=0;i<b1;i++)
			{
				t1[i].display();
			}
			System.out.println("Extras\t\t\t\t"+extras1);
			System.out.println("Total\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")\n");
			System.out.println("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy");
			for (i=0;i<n1;i++)
			{
				t2[i].display();
			}


			System.out.println("\n"+Team2+"\t\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n");
			System.out.println("Batsman\t\t\truns\tballs\t4s\t6s\tSR");
			for(i=0;i<b2;i++)
			{
				t3[i].display();
			}
			System.out.println("Extras\t\t\t\t"+extras2);
			System.out.println("Total\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n");
			System.out.println("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy");
			for (i=0;i<n2;i++)
			{
				t4[i].display();
			}
		}
		else
		{
			System.out.println(Team2+"\t\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n");
			System.out.println("Batsman\t\t\truns\tballs\t4s\t6s\tSR");
			for(i=0;i<b1;i++)
			{
				t1[i].display();
			}
			System.out.println("Extras\t\t\t\t"+extras2);
			System.out.println("Total\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n");
			System.out.println("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy");
			for (i=0;i<n1;i++)
			{
				t2[i].display();
			}
			System.out.println("\n"+Team1+"\t\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")\n");
			System.out.println("Batsman\t\t\truns\tballs\t4s\t6s\tSR");
			for(i=0;i<b2;i++)
			{
				t3[i].display();
			}
			System.out.println("Extras\t\t\t\t"+extras1);
			System.out.println("Total\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")\n");
			System.out.println("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy");
			for (i=0;i<n2;i++)
			{
				t4[i].display();
			}
		}
		//result
		if(total_score1>total_score2)
		{
			System.out.println("\n"+Team1+" won the match");
		}
		else
		{
			System.out.println("\n"+Team2+" won the match");
		}
	}
	public static StringBuilder ui_output()
	{
		//SCOREBOARD
		StringBuilder sb = new StringBuilder();
		if(t1choose.equalsIgnoreCase("Bat"))
		{
			sb.append("\t\t=================================================\n");
			sb.append("\t\t|                                               |\n");
			sb.append("\t\t|        --------------------------------       |\n");
			sb.append("\t\t|                 SCOREBOARD                    |\n");
			sb.append("\t\t|        --------------------------------       |\n");
			sb.append("\t\t|                                               |\n");
			sb.append("\t\t=================================================\n\n\n\n");
			sb.append(Team1+"\t\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")"+"\n");
			sb.append("Batsman\t\t\truns\tballs\t4s\t6s\tSR\n"+"\n");
			for(i=0;i<b1;i++)
			{
				StringBuilder batsman = t1[i].display_ui();
				sb.append(batsman);
			}
			sb.append("Extras\t\t\t\t"+extras1+"\n");
			sb.append("Total\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")\n"+"\n");
			sb.append("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy"+"\n");
			for (i=0;i<n1;i++)
			{
				StringBuilder bowler = t2[i].display_ui();
				sb.append(bowler);
			}


			sb.append("\n"+Team2+"\t\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n"+"\n");
			sb.append("Batsman\t\t\truns\tballs\t4s\t6s\tSR"+"\n");
			for(i=0;i<b2;i++)
			{
				StringBuilder batsman = t3[i].display_ui();
				sb.append(batsman);
			}
			sb.append("Extras\t\t\t\t"+extras2+"\n");
			sb.append("Total\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n"+"\n");
			sb.append("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy"+"\n");
			for (i=0;i<n2;i++)
			{
				StringBuilder bowler = t4[i].display_ui();
				sb.append(bowler);
			}
		}
		else
		{
			sb.append(Team2+"\t\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n"+"\n");
			sb.append("Batsman\t\t\truns\tballs\t4s\t6s\tSR"+"\n");
			for(i=0;i<b1;i++)
			{
				StringBuilder batsman = t1[i].display_ui();
				sb.append(batsman);
			}
			sb.append("Extras\t\t\t\t"+extras2+"\n");
			sb.append("Total\t\t\t\t"+total_score2+"-"+wickets1+"("+Overs+")\n"+"\n");
			sb.append("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy"+"\n");
			for (i=0;i<n1;i++)
			{
				StringBuilder bowler = t2[i].display_ui();
				sb.append(bowler);
			}
			sb.append("\n"+Team1+"\t\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")\n"+"\n");
			sb.append("Batsman\t\t\truns\tballs\t4s\t6s\tSR"+"\n");
			for(i=0;i<b2;i++)
			{
				StringBuilder batsman = t3[i].display_ui();
				sb.append(batsman);
			}
			sb.append("Extras\t\t\t\t"+extras1+"\n");
			sb.append("Total\t\t\t\t"+total_score1+"-"+wickets2+"("+Overs+")\n"+"\n");
			sb.append("Bowler\t\t\tovers\tmaiden\truns\twickets\tEconomy"+"\n");
			for (i=0;i<n2;i++)
			{
				StringBuilder bowler = t4[i].display_ui();
				sb.append(bowler);
			}
		}
		//result
		if(total_score1>total_score2)
		{
			sb.append("\n"+Team1+" won the match"+"\n");
		}
		else
		{
			sb.append("\n"+Team2+" won the match"+"\n");
		}
		return sb;
	}
}
