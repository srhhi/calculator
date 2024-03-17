import java.io.*;
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Geometric extends JFrame implements ActionListener
{
    JFrame frame;
    JLabel label,lbl2D,lbl3D,time;
    JButton btn2D,btn3D;
    ImageIcon header,img2D,img3D;
    JMenu menu, info;
    
    Geometric()
    {
         //menu bar
         createMenuDriven();
		   createInfoDriven();
		
		   JMenuBar menuBar = new JMenuBar();

		   menuBar.add(menu);
		   menuBar.add(info);
         
         menu.setFont(new Font("Consolas",Font.PLAIN,15));
         info.setFont(new Font("Consolas",Font.PLAIN,15));
	
		   menu.setToolTipText("Menu option");
		   info.setToolTipText("Info option");
         
        //create button
        btn2D=new JButton("2D Shape");
        btn2D.setFont(new Font("Consolas",Font.BOLD,40));
        btn2D.setFocusable(false);
        btn2D.addActionListener(this);
        btn2D.setToolTipText("go to 2D shape page");
        
        btn3D=new JButton("3D Shape");
        btn3D.setFont(new Font("Consolas",Font.BOLD,40));
        btn3D.setFocusable(false);
        btn3D.addActionListener(this);
        btn3D.setToolTipText("go to 3D shape page");
        
        //image 2D
        img2D=new ImageIcon("image2D.png");
        lbl2D=new JLabel(" ",img2D, JLabel.CENTER);
        lbl2D.setIcon(img2D);
        
        //image 3D
        img3D=new ImageIcon("image3D.png");
        lbl3D=new JLabel(" ",img3D, JLabel.CENTER);
        lbl3D.setIcon(img3D);
        
        label=new JLabel();//create label
        header=new ImageIcon("header.png");

        label.setIcon(header);

        Date today = new Date();
   	  SimpleDateFormat sdf = new SimpleDateFormat("hh:MM a, EEEE, dd/MM/yy");
        time = new JLabel(sdf.format(today), SwingConstants.CENTER);
        time.setFont(new Font("TimesRoman",Font.BOLD,25));
        time.setForeground(Color.WHITE);
        
        //panel setting
        JPanel pnlCenter = new JPanel(new BorderLayout());
        pnlCenter.setBackground(new Color(51,153,255));//background color
        
        JPanel pnlCenterBottom = new JPanel(new GridLayout(1, 2));
        pnlCenterBottom.setBackground(new Color(51,153,255));//background color
        
        JPanel pnlSouth = new JPanel(new GridLayout(1, 2));
        
        pnlCenter.add(time, BorderLayout.NORTH);
        pnlCenter.add(pnlCenterBottom, BorderLayout.CENTER);
        
        pnlCenterBottom.add(lbl2D);pnlCenterBottom.add(lbl3D);
        
        pnlSouth.add(btn2D);pnlSouth.add(btn3D);
        
        //frame settings
        frame = new JFrame("Shape Calculator");//frame title
       frame.setLayout(new BorderLayout());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application
       frame.setResizable(false);//prevent frame from resize
       frame.setSize(960,960);//set frame dimension (x,y)
       frame.setVisible(true);//frame visible
       frame.getContentPane().setBackground(new Color(51,153,255));//background color
        
        //add elements
        frame.add(label, BorderLayout.NORTH);//add label
        frame.add(pnlCenter, BorderLayout.CENTER);
        frame.add(pnlSouth, BorderLayout.SOUTH);
        frame.setJMenuBar(menuBar); 
              
        //change logo
        ImageIcon logo=new ImageIcon("logo.png");//create imageicon
        frame.setIconImage(logo.getImage());//change frame icon       
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn2D)
        {
            frame.dispose();
            shape2DGUI frm2D=new shape2DGUI();
        }
        else if(ae.getSource()==btn3D)
        {
            frame.dispose();
            shape3DGUI frm3D=new shape3DGUI();
        }
        else if(ae.getActionCommand().equals("Exit"))
  	     {
  	    	  System.exit(0);
  	     }
		
		  else if(ae.getActionCommand().equals("Geometric Information"))
  	     {
  	    	 GeometricInfo information=new GeometricInfo();
  	    	 information.setVisible(true);
  	     }
    }
    public void createMenuDriven()
	{
		JMenuItem item;
		
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_M);
		
		item = new JMenuItem("Exit");
      item.setFont(new Font("Consolas",Font.PLAIN,15));
		item.setMnemonic(KeyEvent.VK_E);
		item.addActionListener(this);
		menu.add(item);			
	}
	
	public void createInfoDriven()
	{
		JMenuItem item;
		
		info = new JMenu("Info");
		info.setMnemonic(KeyEvent.VK_I);
		
		item = new JMenuItem("Geometric Information");
      item.setFont(new Font("Consolas",Font.PLAIN,15));
		item.setMnemonic(KeyEvent.VK_F1);
		item.addActionListener(this);
		info.add(item);			
	}
   public static void main(String[] args)
   {
      try 
        {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) 
        {
            // handle exception
        }
       catch (ClassNotFoundException e) 
       {
            // handle exception
       }
       catch (InstantiationException e) 
       {
            // handle exception
       }
       catch (IllegalAccessException e) 
       {
            // handle exception
       }
       new Geometric();
   }    
}