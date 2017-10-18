import javax.swing.*;
import java.awt.*;

class Point 
{
	int x, y;
}
class DrawPanel extends JPanel {
    public DrawPanel() 
    {
    	setBorder(BorderFactory.createLineBorder(Color.black));
    }
	public void paintComponent(Graphics g) {
		
		Color fg = Color.black;
		Color fg3D = Color.lightGray;
		
		JLabel labels ;
		
		int[] dplX = {40,90,40,90};
		int[] dplY = {40+110,90+110,90+110,40+110};
		
		int[] dpgX = {720+40,720+90,720+40,720+90};
		int[] dpgY = {40+110,90+110,90+110,40+110};
		
		int[] fpgX = {830+40,830+90,830+40,830+90};
		int[] fpgY = {40,90,90,40};
		
		
		///////////////////////////////////////////////
		g.drawLine(40, 40, 90, 90);
		labels = new JLabel("drawLine()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(40, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.drawPolyline(dplX, dplY, dplX.length);
		labels = new JLabel("drawPolyLine()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(25, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.drawRect(160, 40, 50, 50);
		labels = new JLabel("drawRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(155, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.fillRect(160, 150, 50, 50);
		labels = new JLabel("fillRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(160, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.clearRect(280, 40, 50, 50);
		labels = new JLabel("clearRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(275, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.setColor(fg3D);
        g.draw3DRect(280, 150, 50, 50, true);
        g.setColor(fg);
		labels = new JLabel("draw3DRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(265, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.setColor(fg3D);
        g.fill3DRect(400, 40, 50, 50, true);
        g.setColor(fg);
		labels = new JLabel("fill3DRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(400, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
        g.drawRoundRect(400, 150, 50, 50, 10, 10);
		labels = new JLabel("drawRoundRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(380, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
        g.fillRoundRect(520, 40, 50, 50, 10, 10);
		labels = new JLabel("fillRoundRect()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(500, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.drawOval(520, 150, 50, 50);
		labels = new JLabel("drawOval()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(515, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.fillOval(640, 40, 50, 50);
		labels = new JLabel("fillOval()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(640, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.drawArc(640, 150, 50, 50, 90, 120);
		labels = new JLabel("drawArc()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(640, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.fillArc(760, 40, 50, 50, 90, 120);
		labels = new JLabel("fillArc()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(760, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.drawPolygon(dpgX, dpgY, dpgX.length);
		labels = new JLabel("drawPolygon()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(740, 190);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
		g.fillPolygon(fpgX, fpgY, dpgX.length);
		labels = new JLabel("fillPolygon()");
		labels.setForeground(Color.BLACK);
		labels.setLocation(860, 70);
		labels.setSize(100, 100);
		add(labels);
		///////////////////////////////////////////////
	}
}
public class Assignment_11th extends JFrame 
{
	public Assignment_11th()
	{		
		setSize(1000,340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Assignment_11th");		
		add(new DrawPanel());		
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		// TODO 자동 생성된 메소드 스텁
		Assignment_11th s = new Assignment_11th();
	}

}