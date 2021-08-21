package Scoreboard;

public class Bowler {
	String name;
	int overs,maiden,runs,wickets;
	float economy;
	
	public Bowler()
	{
		name="";
		overs=0;
		maiden=0;
		runs=0;
		wickets=0;
		economy=0;
	}

	public Bowler(String name,int overs,int maiden,int runs,int wickets,float economy)
	{
		this.name=name;
		this.overs=overs;
		this.maiden=maiden;
		this.runs=runs;
		this.wickets=wickets;
		this.economy=economy;
	}
	public void seteconomy()
	{
		economy=runs/overs;
		
	}
	StringBuilder bowler = new StringBuilder();
	public void display()
	{
		System.out.println(name+"\t\t\t"+overs+"\t"+maiden+"\t"+runs+"\t"+wickets+"\t"+economy+"\t"+"\n");
	}
	public StringBuilder display_ui()
	{
		bowler.append(name+"\t\t\t"+overs+"\t"+maiden+"\t"+runs+"\t"+wickets+"\t"+economy+"\t"+"\n");
		return bowler;
	}
}
