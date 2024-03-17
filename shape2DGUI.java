import java.io.*;
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.text.NumberFormatter;

public class shape2DGUI extends JFrame implements ItemListener,ActionListener
{
    JTextField txtSquareA,txtSquarePerimeter,txtSquareArea,
      txtRectangleA,txtRectangleB,txtRectanglePerimeter,txtRectangleArea,
      txtTriangleA,txtTriangleB,txtTriangleC,txtTriangleH,txtTrianglePerimeter,txtTriangleArea,
      txtCircleR,txtCirclePerimeter,txtCircleArea,
      txtTrapeziumA,txtTrapeziumB,txtTrapeziumC,txtTrapeziumD,txtTrapeziumH,txtTrapeziumPerimeter,txtTrapeziumArea,
      txtParallelogramA,txtParallelogramB,txtParallelogramH,txtParallelogramPerimeter,txtParallelogramArea,
      txtEllipseA,txtEllipseB,txtEllipsePerimeter,txtEllipseArea;
    JLabel label2D,lblSquare,lblRectangle,lblTriangle,lblCircle,lblTrapezium,lblParallelogram,lblEllipse,
      lblSquarePerimeter,lblSquareArea,
      lblRectanglePerimeter,lblRectangleArea,
      lblTrianglePerimeter,lblTriangleArea,
      lblCirclePerimeter,lblCircleArea,
      lblTrapeziumPerimeter,lblTrapeziumArea,
      lblParallelogramPerimeter,lblParallelogramArea,
      lblEllipsePerimeter,lblEllipseArea,
      lblSquareA,
      lblRectangleA,lblRectangleB,
      lblTriangleA,lblTriangleB,lblTriangleC,lblTriangleH,
      lblCircleR,
      lblTrapeziumA,lblTrapeziumB,lblTrapeziumC,lblTrapeziumD,lblTrapeziumH,
      lblParallelogramA,lblParallelogramB,lblParallelogramH,
      lblEllipseA,lblEllipseB;
    ImageIcon header2D,logo,imgSquare,imgRectangle,imgTriangle,imgCircle,imgTrapezium,imgParallelogram,imgEllipse;
    JButton btnBack,btnClear,btnCalc,btnExit;
    JPanel cards;
    final static String panel0="Choose shape here",panel1="Square",panel2="Rectangle",panel3="Triangle",panel4="Circle",
      panel5="Trapezium",panel6="Parallelogram",panel7="Ellipse";
    JRadioButton rbPerimeter,rbArea;
    JComboBox cb;    
    JFrame frame;
    JMenu menu, info;
    
    shape2DGUI()
    {
      /************************************************************/
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
      
       //header imageicon
       label2D=new JLabel();//create label
       header2D=new ImageIcon("header2D.png");
       label2D.setIcon(header2D);
       
       //shape image
       lblSquare=new JLabel();
       imgSquare=new ImageIcon("square.png");
       lblSquare.setIcon(imgSquare);
       
       lblRectangle=new JLabel();
       imgRectangle=new ImageIcon("rectangle.png");
       lblRectangle.setIcon(imgRectangle);
       
       lblTriangle=new JLabel();
       imgTriangle=new ImageIcon("triangle.png");
       lblTriangle.setIcon(imgTriangle);
       
       lblCircle=new JLabel();
       imgCircle=new ImageIcon("circle.png");
       lblCircle.setIcon(imgCircle);
       
       lblTrapezium=new JLabel();
       imgTrapezium=new ImageIcon("trapezium.png");
       lblTrapezium.setIcon(imgTrapezium);
       
       lblParallelogram=new JLabel();
       imgParallelogram=new ImageIcon("parallelogram.png");
       lblParallelogram.setIcon(imgParallelogram);
       
       lblEllipse=new JLabel();
       imgEllipse=new ImageIcon("ellipse.jpg");
       lblEllipse.setIcon(imgEllipse);
       
       /************************************************************/ 
       //create label
       lblSquareA = new JLabel("a             : ", SwingConstants.RIGHT);
       lblSquarePerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblSquareArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblSquareA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblSquarePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblSquareArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblRectangleA = new JLabel("a             : ", SwingConstants.RIGHT);
       lblRectangleB = new JLabel("b             : ", SwingConstants.RIGHT);
       lblRectanglePerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblRectangleArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblRectangleA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblRectangleB.setFont(new Font("Consolas",Font.PLAIN,25));
       lblRectanglePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblRectangleArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblTriangleA = new JLabel("a             : ", SwingConstants.RIGHT);
       lblTriangleB = new JLabel("b             : ", SwingConstants.RIGHT);
       lblTriangleC = new JLabel("c             : ", SwingConstants.RIGHT);
       lblTriangleH = new JLabel("h             : ", SwingConstants.RIGHT);
       lblTrianglePerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblTriangleArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblTriangleA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTriangleB.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTriangleC.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTriangleH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTrianglePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblTriangleArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblCircleR = new JLabel("r             : ", SwingConstants.RIGHT);
       lblCirclePerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblCircleArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblCircleR.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCirclePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblCircleArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblTrapeziumA = new JLabel("a             : ", SwingConstants.RIGHT);
       lblTrapeziumB = new JLabel("b             : ", SwingConstants.RIGHT);
       lblTrapeziumC = new JLabel("c             : ", SwingConstants.RIGHT);
       lblTrapeziumD = new JLabel("d             : ", SwingConstants.RIGHT);
       lblTrapeziumH = new JLabel("h             : ", SwingConstants.RIGHT);
       lblTrapeziumPerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblTrapeziumArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblTrapeziumA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTrapeziumB.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTrapeziumC.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTrapeziumD.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTrapeziumH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblTrapeziumPerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblTrapeziumArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblParallelogramA = new JLabel("a             : ", SwingConstants.RIGHT);
       lblParallelogramB = new JLabel("b             : ", SwingConstants.RIGHT);
       lblParallelogramH = new JLabel("h             : ", SwingConstants.RIGHT);
       lblParallelogramPerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblParallelogramArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblParallelogramA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblParallelogramB.setFont(new Font("Consolas",Font.PLAIN,25));
       lblParallelogramH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblParallelogramPerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblParallelogramArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblEllipseA = new JLabel("a             : ", SwingConstants.RIGHT);
       lblEllipseB = new JLabel("b             : ", SwingConstants.RIGHT);
       lblEllipsePerimeter = new JLabel("Perimeter     : ", SwingConstants.RIGHT);
       lblEllipseArea = new JLabel("Area          : ", SwingConstants.RIGHT);
       
       lblEllipseA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblEllipseB.setFont(new Font("Consolas",Font.PLAIN,25));
       lblEllipsePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       lblEllipseArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       /************************************************************/
       //create button
       btnBack = new JButton("BACK");
       btnBack.setFont(new Font("Consolas",Font.BOLD,25));
       
       btnClear = new JButton("CLEAR");
       btnClear.setFont(new Font("Consolas",Font.BOLD,25));
       
       btnCalc = new JButton("CALCULATE");
       btnCalc.setFont(new Font("Consolas",Font.BOLD,25));
       
       btnExit = new JButton("EXIT");
       btnExit.setFont(new Font("Consolas",Font.BOLD,25));
       
       btnBack.setToolTipText("back to main menu");
       btnClear.setToolTipText("clear all textfields");
       btnCalc.setToolTipText("calculate value entered");
       btnExit.setToolTipText("exit from application");
       
       /************************************************************/
       //create radio button
       rbPerimeter=new JRadioButton("Perimeter");
       rbPerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       rbPerimeter.setForeground(Color.WHITE);
       rbPerimeter.setBackground(new Color(51,153,255));
       rbArea=new JRadioButton("Area");
       rbArea.setFont(new Font("Consolas",Font.BOLD,25));
       rbArea.setForeground(Color.WHITE);
       rbArea.setBackground(new Color(51,153,255));
       
       /************************************************************/
       ButtonGroup bg = new ButtonGroup();
       bg.add(rbPerimeter);
       bg.add(rbArea);
       
       /************************************************************/
       //create textfield
       
    
       txtSquareA = new JTextField("", 25);
       txtSquarePerimeter = new JTextField(10);
       txtSquarePerimeter.setEditable(false);
       txtSquareArea = new JTextField(10);
       txtSquareArea.setEditable(false);
       txtSquareA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtSquareA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtSquareA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtSquareA.setText("");
            }
            }
         });
       
       txtSquareA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtSquarePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtSquareArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtRectangleA = new JTextField("", 25);
       txtRectangleB = new JTextField("", 25);
       txtRectanglePerimeter = new JTextField(10);
       txtRectanglePerimeter.setEditable(false);
       txtRectangleArea = new JTextField(10);
       txtRectangleArea.setEditable(false);
       txtRectangleA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtRectangleA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtRectangleA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtRectangleA.setText("");
            }
            }
         });
         txtRectangleB.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtRectangleB.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtRectangleB.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtRectangleB.setText("");
            }
            }
         });
     
       txtRectangleA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtRectangleB.setFont(new Font("Consolas",Font.PLAIN,25));
       txtRectanglePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtRectangleArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtTriangleA = new JTextField("", 25);
       txtTriangleB = new JTextField("", 25);
       txtTriangleC = new JTextField("", 25);
       txtTriangleH = new JTextField("", 25);
       txtTrianglePerimeter = new JTextField(10);
       txtTrianglePerimeter.setEditable(false);
       txtTriangleArea = new JTextField(10);
       txtTriangleArea.setEditable(false);
       txtTriangleA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTriangleA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTriangleA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTriangleA.setText("");
            }
            }
         });
         txtTriangleB.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTriangleB.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTriangleB.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTriangleB.setText("");
            }
            }
         });
         txtTriangleC.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTriangleC.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTriangleC.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTriangleC.setText("");
            }
            }
         });
         txtTriangleH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTriangleH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTriangleH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTriangleH.setText("");
            }
            }
         });
       
       txtTriangleA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTriangleB.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTriangleC.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTriangleH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTrianglePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtTriangleArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtCircleR = new JTextField("", 25);
       txtCirclePerimeter = new JTextField(10);
       txtCirclePerimeter.setEditable(false);
       txtCircleArea = new JTextField(10);
       txtCircleArea.setEditable(false);
       txtCircleR.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCircleR.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCircleR.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCircleR.setText("");
            }
            }
         });
       
       txtCircleR.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCirclePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtCircleArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtTrapeziumA = new JTextField("", 25);
       txtTrapeziumB = new JTextField("", 25);
       txtTrapeziumC = new JTextField("", 25);
       txtTrapeziumD = new JTextField("", 25);
       txtTrapeziumH = new JTextField("", 25);
       txtTrapeziumPerimeter = new JTextField(10);
       txtTrapeziumPerimeter.setEditable(false);
       txtTrapeziumArea = new JTextField(10);
       txtTrapeziumArea.setEditable(false);
       txtTrapeziumA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTrapeziumA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTrapeziumA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTrapeziumA.setText("");
            }
            }
         });
         txtTrapeziumB.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTrapeziumB.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTrapeziumB.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTrapeziumB.setText("");
            }
            }
         });
         txtTrapeziumC.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTrapeziumC.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTrapeziumC.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTrapeziumC.setText("");
            }
            }
         });
         txtTrapeziumD.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTrapeziumD.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTrapeziumD.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTrapeziumD.setText("");
            }
            }
         });
         txtTrapeziumH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtTrapeziumH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtTrapeziumH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtTrapeziumH.setText("");
            }
            }
         });
       
       txtTrapeziumA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTrapeziumB.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTrapeziumC.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTrapeziumD.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTrapeziumH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtTrapeziumPerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtTrapeziumArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtParallelogramA = new JTextField("", 25);
       txtParallelogramB = new JTextField("", 25);
       txtParallelogramH = new JTextField("", 25);
       txtParallelogramPerimeter = new JTextField(10);
       txtParallelogramPerimeter.setEditable(false);
       txtParallelogramArea = new JTextField(10);
       txtParallelogramArea.setEditable(false);
       txtParallelogramA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtParallelogramA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtParallelogramA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtParallelogramA.setText("");
            }
            }
         });
         txtParallelogramB.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtParallelogramB.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtParallelogramB.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtParallelogramB.setText("");
            }
            }
         });
         txtParallelogramH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtParallelogramH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtParallelogramH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtParallelogramH.setText("");
            }
            }
         });
       
       txtParallelogramA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtParallelogramB.setFont(new Font("Consolas",Font.PLAIN,25));
       txtParallelogramH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtParallelogramPerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtParallelogramArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtEllipseA = new JTextField("", 25);
       txtEllipseB = new JTextField("", 25);
       txtEllipsePerimeter = new JTextField(10);
       txtEllipsePerimeter.setEditable(false);
       txtEllipseArea = new JTextField(10);
       txtEllipseArea.setEditable(false);
       txtEllipseA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtEllipseA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtEllipseA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtEllipseA.setText("");
            }
            }
         });
         txtEllipseB.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtEllipseB.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtEllipseB.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtEllipseB.setText("");
            }
            }
         });
       
       txtEllipseA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtEllipseB.setFont(new Font("Consolas",Font.PLAIN,25));
       txtEllipsePerimeter.setFont(new Font("Consolas",Font.BOLD,25));
       txtEllipseArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       /**************************************************************/
       JPanel pnlbtn = new JPanel(new GridLayout(1, 4));
       JPanel panelComboCard = new JPanel(new BorderLayout());

      /****************************************************************/
       pnlbtn.add(btnBack);
       pnlbtn.add(btnClear);
       pnlbtn.add(btnCalc);
       pnlbtn.add(btnExit);
       
       /**********************************************************************/
       btnBack.addActionListener(this);
       btnCalc.addActionListener(this);
       btnClear.addActionListener(this);
       btnExit.addActionListener(this);
       rbPerimeter.addActionListener(this);
       rbArea.addActionListener(this);
      
       /*******************************************************************/
       JPanel comboBoxPane = new JPanel(new GridLayout(2,1));
       JPanel comboBoxPaneTop = new JPanel();
       comboBoxPaneTop.setBackground(new Color(51,153,255));
       JPanel comboBoxPaneBottom = new JPanel(new FlowLayout(FlowLayout.CENTER));//default center
       comboBoxPaneBottom.setBackground(new Color(51,153,255));//background color

       String comboBoxItems[] = {panel0,panel1,panel2,panel3,panel4,panel5,panel6,panel7};       
       cb = new JComboBox(comboBoxItems);
       cb.setFont(new Font("Consolas",Font.PLAIN,20));
       cb.setEditable(false);
       cb.addItemListener(this);
       cb.setVisible(false);
       comboBoxPane.add(comboBoxPaneTop);
       comboBoxPane.add(comboBoxPaneBottom);
       
       comboBoxPaneTop.add(rbPerimeter);
       comboBoxPaneTop.add(rbArea);
       comboBoxPaneBottom.add(cb);
            
       JPanel card0 = new JPanel();
       card0.setBackground(new Color(51,153,255));
        
        //Create the square "cards"
       JPanel card1 = new JPanel();

       JPanel topSquare = new JPanel();
       JPanel btmSquare = new JPanel(new GridLayout(3, 2, 10, 10));
       btmSquare.setBackground(new Color(51,153,255));
       card1.add(topSquare);
       card1.add(btmSquare);
       
       card1.setBackground(new Color(51,153,255));
     
       topSquare.add(lblSquare);
       btmSquare.add(lblSquareA);
       btmSquare.add(txtSquareA);
       btmSquare.add(lblSquarePerimeter);
       btmSquare.add(txtSquarePerimeter);
       btmSquare.add(lblSquareArea);
       btmSquare.add(txtSquareArea);
       
        //Create the rectangle "cards"
       JPanel card2 = new JPanel();
       
       JPanel topRectangle = new JPanel();
       JPanel btmRectangle = new JPanel(new GridLayout(4, 2, 10, 10));
       btmRectangle.setBackground(new Color(51,153,255));
       card2.add(topRectangle);
       card2.add(btmRectangle);
       card2.setBackground(new Color(51,153,255));
       
       topRectangle.add(lblRectangle);
       btmRectangle.add(lblRectangleA);
       btmRectangle.add(txtRectangleA);
       btmRectangle.add(lblRectangleB);
       btmRectangle.add(txtRectangleB);
       btmRectangle.add(lblRectanglePerimeter);
       btmRectangle.add(txtRectanglePerimeter);
       btmRectangle.add(lblRectangleArea);
       btmRectangle.add(txtRectangleArea);
        
        //Create the triangle "cards"
       JPanel card3 = new JPanel();
       
       JPanel topTriangle = new JPanel();
       JPanel btmTriangle = new JPanel(new GridLayout(6, 2, 10, 10));
       btmTriangle.setBackground(new Color(51,153,255));
       card3.add(topTriangle);
       card3.add(btmTriangle);
       card3.setBackground(new Color(51,153,255));
       
       topTriangle.add(lblTriangle);
       btmTriangle.add(lblTriangleA);
       btmTriangle.add(txtTriangleA);
       btmTriangle.add(lblTriangleB);
       btmTriangle.add(txtTriangleB);
       btmTriangle.add(lblTriangleC);
       btmTriangle.add(txtTriangleC);
       btmTriangle.add(lblTriangleH);
       btmTriangle.add(txtTriangleH);
       btmTriangle.add(lblTrianglePerimeter);
       btmTriangle.add(txtTrianglePerimeter);
       btmTriangle.add(lblTriangleArea);
       btmTriangle.add(txtTriangleArea);
        
        //Create the circle "cards"
       JPanel card4 = new JPanel();
       
       JPanel topCircle = new JPanel();
       JPanel btmCircle = new JPanel(new GridLayout(3, 2, 10, 10));
       btmCircle.setBackground(new Color(51,153,255));
       card4.add(topCircle);
       card4.add(btmCircle); 
       card4.setBackground(new Color(51,153,255));
       
       topCircle.add(lblCircle);
       btmCircle.add(lblCircleR);
       btmCircle.add(txtCircleR);
       btmCircle.add(lblCirclePerimeter);
       btmCircle.add(txtCirclePerimeter);
       btmCircle.add(lblCircleArea);
       btmCircle.add(txtCircleArea);
        
        //Create the trapezium "cards"
       JPanel card5 = new JPanel();
       
       JPanel topTrapezium = new JPanel();
       JPanel btmTrapezium = new JPanel(new GridLayout(7, 2, 10, 10));
       btmTrapezium.setBackground(new Color(51,153,255));
       card5.add(topTrapezium);
       card5.add(btmTrapezium);
       card5.setBackground(new Color(51,153,255));
       
       topTrapezium.add(lblTrapezium);
       btmTrapezium.add(lblTrapeziumH);
       btmTrapezium.add(txtTrapeziumH);
       btmTrapezium.add(lblTrapeziumA);
       btmTrapezium.add(txtTrapeziumA);
       btmTrapezium.add(lblTrapeziumB);
       btmTrapezium.add(txtTrapeziumB);
       btmTrapezium.add(lblTrapeziumC);
       btmTrapezium.add(txtTrapeziumC);
       btmTrapezium.add(lblTrapeziumD);
       btmTrapezium.add(txtTrapeziumD);
       btmTrapezium.add(lblTrapeziumPerimeter);
       btmTrapezium.add(txtTrapeziumPerimeter);
       btmTrapezium.add(lblTrapeziumArea);
       btmTrapezium.add(txtTrapeziumArea);
        
        //Create the parallelogram "cards"
       JPanel card6 = new JPanel();
       
       JPanel topParallelogram = new JPanel();
       JPanel btmParallelogram = new JPanel(new GridLayout(5, 2, 10, 10));
       btmParallelogram.setBackground(new Color(51,153,255));
       card6.add(topParallelogram);
       card6.add(btmParallelogram);
       card6.setBackground(new Color(51,153,255));
       
       topParallelogram.add(lblParallelogram);
       btmParallelogram.add(lblParallelogramA);
       btmParallelogram.add(txtParallelogramA);
       btmParallelogram.add(lblParallelogramB);
       btmParallelogram.add(txtParallelogramB);
       btmParallelogram.add(lblParallelogramH);
       btmParallelogram.add(txtParallelogramH);
       btmParallelogram.add(lblParallelogramPerimeter);
       btmParallelogram.add(txtParallelogramPerimeter);
       btmParallelogram.add(lblParallelogramArea);
       btmParallelogram.add(txtParallelogramArea);
        
        //Create the ellipse "cards"
       JPanel card7 = new JPanel();
       
       JPanel topEllipse = new JPanel();
       JPanel btmEllipse = new JPanel(new GridLayout(4, 2, 10, 10));
       btmEllipse.setBackground(new Color(51,153,255));
       card7.add(topEllipse);
       card7.add(btmEllipse);
       card7.setBackground(new Color(51,153,255));
       
       topEllipse.add(lblEllipse);
       btmEllipse.add(lblEllipseA);
       btmEllipse.add(txtEllipseA);
       btmEllipse.add(lblEllipseB);
       btmEllipse.add(txtEllipseB);
       btmEllipse.add(lblEllipsePerimeter);
       btmEllipse.add(txtEllipsePerimeter);
       btmEllipse.add(lblEllipseArea);
       btmEllipse.add(txtEllipseArea);
        
        //Create the panel that contains the "cards"
       cards = new JPanel(new CardLayout());
       cards.add(card0,panel0);
       cards.add(card1,panel1);
       cards.add(card2,panel2);
       cards.add(card3,panel3);
       cards.add(card4,panel4);
       cards.add(card5,panel5);
       cards.add(card6,panel6);
       cards.add(card7,panel7);
       
       panelComboCard.add(comboBoxPane,BorderLayout.NORTH);
       panelComboCard.add(cards,BorderLayout.CENTER);
         /**********************************/
        
        //frame settings
       frame = new JFrame("2D Shape Calculator");//frame title
       logo=new ImageIcon("logo.png");//create imageicon
       frame.setIconImage(logo.getImage());//change frame icon
       frame.setLayout(new BorderLayout());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application
       frame.setResizable(false);//prevent frame from resize
       frame.setSize(960,960);//set frame dimension (x,y)
       frame.setVisible(true);//frame visible
       frame.getContentPane().setBackground(new Color(51,153,255));//background color
       
        
        //add elements
       frame.add(pnlbtn, BorderLayout.SOUTH);
       frame.add(panelComboCard, BorderLayout.CENTER);
       frame.add(label2D, BorderLayout.NORTH);   
       frame.setJMenuBar(menuBar);    
    }
        
    public void actionPerformed(ActionEvent e)
    {
       double perimeter,area;
       DecimalFormat df = new DecimalFormat("0.0000");
       String shapeName = (String)cb.getSelectedItem();
       String SquareA=txtSquareA.getText(),
         RectangleA=txtRectangleA.getText(),RectangleB=txtRectangleB.getText(),
         TriangleA=txtTriangleA.getText(),TriangleB=txtTriangleB.getText(),TriangleC=txtTriangleC.getText(),TriangleH=txtTriangleH.getText(),
         CircleR=txtCircleR.getText(),
         TrapeziumA=txtTrapeziumA.getText(),TrapeziumB=txtTrapeziumB.getText(),TrapeziumC=txtTrapeziumC.getText(),
         TrapeziumD=txtTrapeziumD.getText(),TrapeziumH=txtTrapeziumH.getText(),
         ParallelogramA=txtParallelogramA.getText(),ParallelogramB=txtParallelogramB.getText(),ParallelogramH=txtParallelogramH.getText(),
         EllipseA=txtEllipseA.getText(),EllipseB=txtEllipseB.getText();

       if(rbPerimeter.isSelected())
       {
          cb.setVisible(true);
          //square
          lblSquarePerimeter.setVisible(true);
          txtSquarePerimeter.setVisible(true);
          lblSquareArea.setVisible(false);
          txtSquareArea.setVisible(false);
          
          //rectangle
          lblRectanglePerimeter.setVisible(true);
          txtRectanglePerimeter.setVisible(true);          
          lblRectangleArea.setVisible(false);
          txtRectangleArea.setVisible(false);
          
          //triangle
          lblTriangleA.setVisible(true);         
          txtTriangleA.setVisible(true);
          lblTriangleC.setVisible(true);         
          txtTriangleC.setVisible(true);
          lblTriangleH.setVisible(false);         
          txtTriangleH.setVisible(false);
          
          lblTrianglePerimeter.setVisible(true);
          txtTrianglePerimeter.setVisible(true);
          lblTriangleArea.setVisible(false);
          txtTriangleArea.setVisible(false);
          
          //circle
          lblCirclePerimeter.setVisible(true);
          txtCirclePerimeter.setVisible(true);
          lblCircleArea.setVisible(false);
          txtCircleArea.setVisible(false);
          
          //trapezium
          lblTrapeziumC.setVisible(true);          
          txtTrapeziumC.setVisible(true);
          lblTrapeziumD.setVisible(true);          
          txtTrapeziumD.setVisible(true);
          lblTrapeziumH.setVisible(false);          
          txtTrapeziumH.setVisible(false);
          
          lblTrapeziumPerimeter.setVisible(true);
          txtTrapeziumPerimeter.setVisible(true);
          lblTrapeziumArea.setVisible(false);
          txtTrapeziumArea.setVisible(false);
          
          //parallelogram         
          lblParallelogramH.setVisible(false);
          txtParallelogramH.setVisible(false);
          lblParallelogramB.setVisible(true);
          txtParallelogramB.setVisible(true);
          
          lblParallelogramPerimeter.setVisible(true);
          txtParallelogramPerimeter.setVisible(true);
          lblParallelogramArea.setVisible(false);
          txtParallelogramArea.setVisible(false);
                    
          //ellipse
          lblEllipsePerimeter.setVisible(true);
          txtEllipsePerimeter.setVisible(true);
          lblEllipseArea.setVisible(false);
          txtEllipseArea.setVisible(false);
       }
       else if(rbArea.isSelected())
       {
          cb.setVisible(true);
          //square
          lblSquarePerimeter.setVisible(false);
          txtSquarePerimeter.setVisible(false);
          lblSquareArea.setVisible(true);
          txtSquareArea.setVisible(true);
          
          //rectangle
          lblRectanglePerimeter.setVisible(false);
          txtRectanglePerimeter.setVisible(false);          
          lblRectangleArea.setVisible(true);
          txtRectangleArea.setVisible(true);
          
          //triangle
          
          lblTriangleA.setVisible(false);
          lblTriangleC.setVisible(false);         
          txtTriangleA.setVisible(false);
          txtTriangleC.setVisible(false);
          lblTriangleH.setVisible(true);
          txtTriangleH.setVisible(true);   
                 
          lblTrianglePerimeter.setVisible(false);
          txtTrianglePerimeter.setVisible(false);
          lblTriangleArea.setVisible(true);
          txtTriangleArea.setVisible(true);
          
          //circle
          lblCirclePerimeter.setVisible(false);
          txtCirclePerimeter.setVisible(false);
          lblCircleArea.setVisible(true);
          txtCircleArea.setVisible(true);
          
          //trapezium
          lblTrapeziumC.setVisible(false);          
          txtTrapeziumC.setVisible(false);
          lblTrapeziumD.setVisible(false);          
          txtTrapeziumD.setVisible(false);
          lblTrapeziumH.setVisible(true);          
          txtTrapeziumH.setVisible(true);
          
          lblTrapeziumPerimeter.setVisible(false);
          txtTrapeziumPerimeter.setVisible(false);
          lblTrapeziumArea.setVisible(true);
          txtTrapeziumArea.setVisible(true);
          
          //parallelogram
          lblParallelogramH.setVisible(true);
          txtParallelogramH.setVisible(true);
          lblParallelogramB.setVisible(false);
          txtParallelogramB.setVisible(false);
                   
          lblParallelogramPerimeter.setVisible(false);
          txtParallelogramPerimeter.setVisible(false);
          lblParallelogramArea.setVisible(true);
          txtParallelogramArea.setVisible(true);
                    
          //ellipse
          lblEllipsePerimeter.setVisible(false);
          txtEllipsePerimeter.setVisible(false);
          lblEllipseArea.setVisible(true);
          txtEllipseArea.setVisible(true);
       }
         
       if(e.getSource() == btnCalc)
       {
         int check = cb.getSelectedIndex();
         if(check == 0)
         {
            JOptionPane.showMessageDialog(null,"Select either perimeter or area","CALCULATE",JOptionPane.INFORMATION_MESSAGE);
            }else
            {
          if(rbPerimeter.isSelected())
          {
             if(shapeName.equals("Square"))
             {
                perimeter=4*Double.parseDouble(SquareA);
                txtSquarePerimeter.setText(String.valueOf(perimeter));   
             }
             else if(shapeName.equals("Rectangle"))
             {
                perimeter=2*(Double.parseDouble(RectangleA)+Double.parseDouble(RectangleB));
                txtRectanglePerimeter.setText(String.valueOf(perimeter));
             }
             else if(shapeName.equals("Triangle"))
             {
                perimeter=Double.parseDouble(TriangleA)+Double.parseDouble(TriangleB)+Double.parseDouble(TriangleC);
                txtTrianglePerimeter.setText(String.valueOf(perimeter));
             }
             else if(shapeName.equals("Circle"))
             {
                perimeter=2*Math.PI*Double.parseDouble(CircleR);
                txtCirclePerimeter.setText(String.valueOf(df.format(perimeter)));
             }
             else if(shapeName.equals("Trapezium"))
             {
                perimeter=Double.parseDouble(TrapeziumA)+Double.parseDouble(TrapeziumB)+Double.parseDouble(TrapeziumC)+Double.parseDouble(TrapeziumD);
                txtTrapeziumPerimeter.setText(String.valueOf(perimeter));
             }
             else if(shapeName.equals("Parallelogram"))
             {
                perimeter=2*(Double.parseDouble(ParallelogramA)+Double.parseDouble(ParallelogramB));
                txtParallelogramPerimeter.setText(String.valueOf(perimeter));
             }
             else if(shapeName.equals("Ellipse"))
             {
                perimeter=2*Math.PI*Math.sqrt((Math.pow(Double.parseDouble(EllipseA),2)+Math.pow(Double.parseDouble(EllipseB),2))/2);
                txtEllipsePerimeter.setText(String.valueOf(df.format(perimeter)));
             }
          }
          else if(rbArea.isSelected())
          {
             if(shapeName.equals("Square"))
             {
                area=Math.pow(Double.parseDouble(SquareA),2);
                txtSquareArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Rectangle"))
             {
                area=Double.parseDouble(RectangleA)*Double.parseDouble(RectangleB);
                txtRectangleArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Triangle"))
             {
                area=0.5*Double.parseDouble(TriangleB)*Double.parseDouble(TriangleH);
                txtTriangleArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Circle"))
             {
                area=Math.PI*Math.pow(Double.parseDouble(CircleR),2);
                txtCircleArea.setText(String.valueOf(df.format(area)));
             }
             else if(shapeName.equals("Trapezium"))
             {
                area=0.5*Double.parseDouble(TrapeziumH)*(Double.parseDouble(TrapeziumA)+Double.parseDouble(TrapeziumB));
                txtTrapeziumArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Parallelogram"))
             {
                area=Double.parseDouble(ParallelogramA)*Double.parseDouble(ParallelogramH);
                txtParallelogramArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Ellipse"))
             {
                area=Math.PI*Double.parseDouble(EllipseA)*Double.parseDouble(EllipseB);
                txtEllipseArea.setText(String.valueOf(df.format(area)));
             }
          }
          }
       }
       else if(e.getSource() == btnClear)
       {
          txtSquareA.setText("");
          txtSquarePerimeter.setText("");
          txtSquareArea.setText("");
          
          txtRectangleA.setText("");
          txtRectangleB.setText("");
          txtRectanglePerimeter.setText("");
          txtRectangleArea.setText("");
          
          txtTriangleA.setText("");
          txtTriangleB.setText("");
          txtTriangleC.setText("");
          txtTriangleH.setText("");
          txtTrianglePerimeter.setText("");
          txtTriangleArea.setText("");
          
          txtCircleR.setText("");
          txtCirclePerimeter.setText("");
          txtCircleArea.setText("");
          
          txtTrapeziumA.setText("");
          txtTrapeziumB.setText("");
          txtTrapeziumC.setText("");
          txtTrapeziumD.setText("");
          txtTrapeziumH.setText("");
          txtTrapeziumPerimeter.setText("");
          txtTrapeziumArea.setText("");
          
          txtParallelogramA.setText("");
          txtParallelogramB.setText("");
          txtParallelogramH.setText("");
          txtParallelogramPerimeter.setText("");
          txtParallelogramArea.setText("");
          
          txtEllipseA.setText("");
          txtEllipseB.setText("");
          txtEllipsePerimeter.setText("");
          txtEllipseArea.setText("");
          
          JOptionPane.showMessageDialog(null,"All text fields cleared!","CLEAR",JOptionPane.INFORMATION_MESSAGE);
       }
       else if(e.getSource() == btnBack)
       {
          frame.dispose();
          Geometric d = new Geometric();         
       }
       else if(e.getSource() == btnExit)
       {
          JOptionPane.showMessageDialog(null,"Thank you!","EXIT",JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);          
       }
       else if(e.getActionCommand().equals("Exit"))
  	     {
  	    	  System.exit(0);
  	     }
		
		  else if(e.getActionCommand().equals("Geometric Information"))
  	     {
  	    	 GeometricInfo information=new GeometricInfo();
  	    	 information.setVisible(true);
  	     }
    }
    public void itemStateChanged(ItemEvent evt) 
    {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
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
        shape2DGUI  dd = new shape2DGUI();        
    }    
}
