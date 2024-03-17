import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color.*;
import javax.swing.border.*;

public class GeometricInfo extends JFrame implements ActionListener
{
	private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6,lbl7;
	private JButton ok;
	private Container c;
	private JPanel panelNorth, panelCenter, panelSouth;
	
	
	public GeometricInfo()
	{
		setTitle("Info");
		setSize(300,300);
		setLocation(250,150);
		
		c=getContentPane();
		c.setLayout(new BorderLayout());
		
		panelNorth=new JPanel();
		panelNorth.setLayout(new GridLayout(1,1));
		panelNorth.setBackground(new Color(0,0,153));
		
		panelCenter=new JPanel();
		panelCenter.setLayout(new GridLayout(6,1));
		panelCenter.setBackground(new Color(0,0,153));
		
		panelSouth=new JPanel();
		panelSouth.setLayout(new FlowLayout());
		panelSouth.setBackground(new Color(0,0,153));
		
		lbl1=new JLabel("GEOMETRIC SHAPE CALCULATOR",SwingConstants.CENTER);
		lbl2=new JLabel("***2D Shapes***",SwingConstants.CENTER);
		lbl3=new JLabel("Square,Rectangle,Triangle,Circle,",SwingConstants.CENTER);
		lbl4=new JLabel("Trapezium,Parallelogram,Ellipse",SwingConstants.CENTER);
		lbl5=new JLabel("***3D Shapes***",SwingConstants.CENTER);
		lbl6=new JLabel("Cube,Cuboid,Cone,Sphere,Cylinder,",SwingConstants.CENTER);
      lbl7=new JLabel("Square Pyramid,Pentagonal Prism",SwingConstants.CENTER);
		
		lbl1.setForeground(new Color(255,255,153));
      
      lbl2.setForeground(new Color(255,255, 0));
      lbl3.setForeground(new Color(255,255,204));
      lbl4.setForeground(new Color(255,255,204));
      lbl5.setForeground(new Color(255,255, 0));
      lbl6.setForeground(new Color(255,255, 204));
      lbl7.setForeground(new Color(255,255,204));
      
      lbl1.setFont(new Font("Consolas",Font.BOLD,13));
      
      lbl2.setFont(new Font("Consolas",Font.BOLD,13));
      lbl3.setFont(new Font("Consolas",Font.PLAIN,13));
      lbl4.setFont(new Font("Consolas",Font.PLAIN,13));
      lbl5.setFont(new Font("Consolas",Font.BOLD,13));
      lbl6.setFont(new Font("Consolas",Font.PLAIN,13));
      lbl7.setFont(new Font("Consolas",Font.PLAIN,13));
		
		ok=new JButton("OK");
		ok.addActionListener(this); 
		
		panelNorth.add(lbl1);
		
		panelCenter.add(lbl2);
		panelCenter.add(lbl3);
		panelCenter.add(lbl4);
		panelCenter.add(lbl5);
		panelCenter.add(lbl6);
      panelCenter.add(lbl7);
		
		panelSouth.add(ok);
		
		c.add(panelNorth, BorderLayout.NORTH);
		c.add(panelCenter, BorderLayout.CENTER);
		c.add(panelSouth, BorderLayout.SOUTH);	
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ok)
			setVisible(false);		
	}
	
	public static void main(String args[])
	{
		GeometricInfo information=new GeometricInfo();
		information.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}