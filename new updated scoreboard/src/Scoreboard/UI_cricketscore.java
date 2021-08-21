package Scoreboard;
import java.awt.Color;

import javax.swing.*;
import Scoreboard.*;
public class UI_cricketscore
{
	JFrame f;
	static JTextArea ta;
	UI_cricketscore(String op)
	{
		f = new JFrame("CRICBUZZ");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		ta = new JTextArea(110,110);
		ta.setText(op);
		p1.add(ta);
		p1.setBackground(Color.GREEN);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.GREEN);
		JTabbedPane tp = new JTabbedPane();
		tp.add("ScoreBoard",p1);
		tp.add("Info", p2);
		tp.add("Live", p3);
		tp.add("Highlights", p4);  
		f.add(tp);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		try
		{
			new Q3().board();
			Q3.output_console();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String op = Q3.ui_output().toString();
		new UI_cricketscore(op);
	}
}