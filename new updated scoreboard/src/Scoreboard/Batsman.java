package Scoreboard;

public class Batsman
{
	String name;
	int runs,balls, fours, sixes;
	float strike_rate;
	public Batsman()
	{
		name="";
		runs=0;
		balls=0;
		fours=0;
		sixes=0;
		strike_rate=0;
	}
	
	public Batsman(String name,int runs,int balls,int fours,int sixes,float strike_rate)
	{
		this.name=name;
		this.runs=runs;
		this.balls=balls;
		this.fours=fours;
		this.sixes=sixes;
		this.strike_rate=strike_rate;
	}
	
	public void setstrike_rate()
	{
		strike_rate=((float)runs/balls)*100;
		
	}
	StringBuilder batsman = new StringBuilder();
	public void display()
	{
		System.out.println(name+"\t\t\t"+runs+"\t"+balls+"\t"+fours+"\t"+sixes+"\t"+strike_rate+"\n");
	}
	public StringBuilder display_ui()
	{
		batsman.append(name+"\t\t\t"+runs+"\t"+balls+"\t"+fours+"\t"+sixes+"\t"+strike_rate+"\n");
		return batsman;
	}
}
