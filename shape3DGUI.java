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

public class shape3DGUI extends JFrame implements ItemListener,ActionListener
{
    JTextField txtCubeA,txtCubeVolume,txtCubeSurfaceArea,
      txtCuboidH,txtCuboidL,txtCuboidW,txtCuboidVolume,txtCuboidSurfaceArea,
      txtConeH,txtConeR,txtConeVolume,txtConeSurfaceArea,
      txtSphereR,txtSphereVolume,txtSphereSurfaceArea,
      txtCylinderH,txtCylinderR,txtCylinderVolume,txtCylinderSurfaceArea,
      txtSquarePyramidA,txtSquarePyramidH,txtSquarePyramidVolume,txtSquarePyramidSurfaceArea,
      txtPentagonalPrismB,txtPentagonalPrismH,txtPentagonalPrismVolume,txtPentagonalPrismSurfaceArea;
    JLabel label3D,lblCube,lblCuboid,lblCone,lblSphere,lblCylinder,lblSquarePyramid,lblPentagonalPrism,
      lblCubeVolume,lblCubeSurfaceArea,
      lblCuboidVolume,lblCuboidSurfaceArea,
      lblConeVolume,lblConeSurfaceArea,
      lblSphereVolume,lblSphereSurfaceArea,
      lblCylinderVolume,lblCylinderSurfaceArea,
      lblSquarePyramidVolume,lblSquarePyramidSurfaceArea,
      lblPentagonalPrismVolume,lblPentagonalPrismSurfaceArea,
      lblCubeA,
      lblCuboidH,lblCuboidL,lblCuboidW,
      lblConeH,lblConeR,
      lblSphereR,
      lblCylinderH,lblCylinderR,
      lblSquarePyramidA,lblSquarePyramidH,
      lblPentagonalPrismB,lblPentagonalPrismH;
    ImageIcon header3D,logo,imgCube,imgCuboid,imgCone,imgSphere,imgCylinder,imgSquarePyramid,imgPentagonalPrism;
    JButton btnBack,btnClear,btnCalc,btnExit;
    JPanel cards;
    final static String panel0="Choose shape here",panel1="Cube",panel2="Cuboid",panel3="Cone",panel4="Sphere",
      panel5="Cylinder",panel6="Square Pyramid",panel7="Pentagonal Prism";
    JRadioButton rbSurfaceArea,rbVolume;
    JComboBox cb;    
    JFrame frame;
    JMenu menu, info;
   
    shape3DGUI()
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
       label3D=new JLabel();//create label
       header3D=new ImageIcon("header3D.png");
       label3D.setIcon(header3D);
       
       //shape image
       lblCube=new JLabel();
       imgCube=new ImageIcon("cube.png");
       lblCube.setIcon(imgCube);
       
       lblCuboid=new JLabel();
       imgCuboid=new ImageIcon("cuboid.png");
       lblCuboid.setIcon(imgCuboid);
       
       lblCone=new JLabel();
       imgCone=new ImageIcon("cone.png");
       lblCone.setIcon(imgCone);
       
       lblSphere=new JLabel();
       imgSphere=new ImageIcon("sphere.png");
       lblSphere.setIcon(imgSphere);
       
       lblCylinder=new JLabel();
       imgCylinder=new ImageIcon("cylinder.png");
       lblCylinder.setIcon(imgCylinder);
       
       lblSquarePyramid=new JLabel();
       imgSquarePyramid=new ImageIcon("pyramid.png");
       lblSquarePyramid.setIcon(imgSquarePyramid);
       
       lblPentagonalPrism=new JLabel();
       imgPentagonalPrism=new ImageIcon("prism.png");
       lblPentagonalPrism.setIcon(imgPentagonalPrism);
       
       /************************************************************/ 
       //create label
       lblCubeA = new JLabel("a                :", SwingConstants.RIGHT);
       lblCubeVolume = new JLabel("Volume           :", SwingConstants.RIGHT);
       lblCubeSurfaceArea = new JLabel("Surface area     :", SwingConstants.RIGHT);
       
       lblCubeA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCubeVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblCubeSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblCuboidH = new JLabel("h                : ", SwingConstants.RIGHT);
       lblCuboidL = new JLabel("l                : ", SwingConstants.RIGHT);
       lblCuboidW = new JLabel("b                : ", SwingConstants.RIGHT);
       lblCuboidVolume = new JLabel("Volume           : ", SwingConstants.RIGHT);
       lblCuboidSurfaceArea = new JLabel("Surface area     : ", SwingConstants.RIGHT);
       
       lblCuboidH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCuboidL.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCuboidW.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCuboidVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblCuboidSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblConeH = new JLabel("h                : ", SwingConstants.RIGHT);
       lblConeR = new JLabel("r                : ", SwingConstants.RIGHT);
       lblConeVolume = new JLabel("Volume           : ", SwingConstants.RIGHT);
       lblConeSurfaceArea = new JLabel("Surface area     : ", SwingConstants.RIGHT);
       
       lblConeH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblConeR.setFont(new Font("Consolas",Font.PLAIN,25));
       lblConeVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblConeSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblSphereR = new JLabel("Radius           : ", SwingConstants.RIGHT);
       lblSphereVolume = new JLabel("Volume           : ", SwingConstants.RIGHT);
       lblSphereSurfaceArea = new JLabel("Surface area     : ", SwingConstants.RIGHT);
       
       lblSphereR.setFont(new Font("Consolas",Font.PLAIN,25));
       lblSphereVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblSphereSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblCylinderH = new JLabel("h                : ", SwingConstants.RIGHT);
       lblCylinderR = new JLabel("r                : ", SwingConstants.RIGHT);
       lblCylinderVolume = new JLabel("Volume           : ", SwingConstants.RIGHT);
       lblCylinderSurfaceArea = new JLabel("Surface area     : ", SwingConstants.RIGHT);
       
       lblCylinderH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCylinderR.setFont(new Font("Consolas",Font.PLAIN,25));
       lblCylinderVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblCylinderSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblSquarePyramidA = new JLabel("a                : ", SwingConstants.RIGHT);
       lblSquarePyramidH = new JLabel("h                : ", SwingConstants.RIGHT);
       lblSquarePyramidVolume = new JLabel("Volume           : ", SwingConstants.RIGHT);
       lblSquarePyramidSurfaceArea = new JLabel("Surface area     : ", SwingConstants.RIGHT);
       
       lblSquarePyramidA.setFont(new Font("Consolas",Font.PLAIN,25));
       lblSquarePyramidH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblSquarePyramidVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblSquarePyramidSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       lblPentagonalPrismB = new JLabel("b                : ", SwingConstants.RIGHT);
       lblPentagonalPrismH = new JLabel("h                : ", SwingConstants.RIGHT);
       lblPentagonalPrismVolume = new JLabel("Volume           : ", SwingConstants.RIGHT);
       lblPentagonalPrismSurfaceArea = new JLabel("Surface area     : ", SwingConstants.RIGHT);
       
       lblPentagonalPrismB.setFont(new Font("Consolas",Font.PLAIN,25));
       lblPentagonalPrismH.setFont(new Font("Consolas",Font.PLAIN,25));
       lblPentagonalPrismVolume.setFont(new Font("Consolas",Font.BOLD,25));
       lblPentagonalPrismSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
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
       rbVolume=new JRadioButton("Volume");
       rbVolume.setFont(new Font("Consolas",Font.BOLD,25));
       rbVolume.setForeground(Color.WHITE);
       rbVolume.setBackground(new Color(51,153,255));
       rbSurfaceArea=new JRadioButton("Surface area");
       rbSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       rbSurfaceArea.setForeground(Color.WHITE);
       rbSurfaceArea.setBackground(new Color(51,153,255));
       
       /************************************************************/
       ButtonGroup bg = new ButtonGroup();
       bg.add(rbVolume);
       bg.add(rbSurfaceArea);
       
       /************************************************************/
       //create textfield
       txtCubeA = new JTextField("", 25);
       txtCubeVolume = new JTextField(10);
       txtCubeVolume.setEditable(false);
       txtCubeSurfaceArea = new JTextField(10);
       txtCubeSurfaceArea.setEditable(false);
       txtCubeA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCubeA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCubeA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCubeA.setText("");
            }
            }
         });
       
       txtCubeA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCubeVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtCubeSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtCuboidH = new JTextField("", 25);
       txtCuboidL = new JTextField("", 25);
       txtCuboidW = new JTextField("", 25);
       txtCuboidVolume = new JTextField(10);
       txtCuboidVolume.setEditable(false);
       txtCuboidSurfaceArea = new JTextField(10);
       txtCuboidSurfaceArea.setEditable(false);
       txtCuboidH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCuboidH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCuboidH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCuboidH.setText("");
            }
            }
         });
         txtCuboidL.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCuboidL.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCuboidL.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCuboidL.setText("");
            }
            }
         });
         txtCuboidW.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCuboidW.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCuboidW.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCuboidW.setText("");
            }
            }
         });
       
       txtCuboidH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCuboidL.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCuboidW.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCuboidVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtCuboidSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtConeH = new JTextField("", 25);
       txtConeR = new JTextField("", 25);
       txtConeVolume = new JTextField(10);
       txtConeVolume.setEditable(false);
       txtConeSurfaceArea = new JTextField(10);
       txtConeSurfaceArea.setEditable(false);
       txtConeH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtConeH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtConeH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtConeH.setText("");
            }
            }
         });
         txtConeR.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtConeR.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtConeR.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtConeR.setText("");
            }
            }
         });
       
       txtConeH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtConeR.setFont(new Font("Consolas",Font.PLAIN,25));
       txtConeVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtConeSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtSphereR = new JTextField("", 25);
       txtSphereVolume = new JTextField(10);
       txtSphereVolume.setEditable(false);
       txtSphereSurfaceArea = new JTextField(10);
       txtSphereSurfaceArea.setEditable(false);
       txtConeR.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtSphereR.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtSphereR.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtSphereR.setText("");
            }
            }
         });
       
       txtSphereR.setFont(new Font("Consolas",Font.PLAIN,25));
       txtSphereVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtSphereSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtCylinderH = new JTextField("", 25);
       txtCylinderR = new JTextField("", 25);
       txtCylinderVolume = new JTextField(10);
       txtCylinderVolume.setEditable(false);
       txtCylinderSurfaceArea = new JTextField(10);
       txtCylinderSurfaceArea.setEditable(false);
       txtCylinderH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCylinderH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCylinderH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCylinderH.setText("");
            }
            }
         });
         txtCylinderR.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtCylinderR.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtCylinderR.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtCylinderR.setText("");
            }
            }
         });
       
       txtCylinderH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCylinderR.setFont(new Font("Consolas",Font.PLAIN,25));
       txtCylinderVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtCylinderSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtSquarePyramidA = new JTextField("", 25);
       txtSquarePyramidH = new JTextField("", 25);
       txtSquarePyramidVolume = new JTextField(10);
       txtSquarePyramidVolume.setEditable(false);
       txtSquarePyramidSurfaceArea = new JTextField(10);
       txtSquarePyramidSurfaceArea.setEditable(false);
       txtSquarePyramidA.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtSquarePyramidA.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtSquarePyramidA.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtSquarePyramidA.setText("");
            }
            }
         });
         txtSquarePyramidH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtSquarePyramidH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtSquarePyramidH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtSquarePyramidH.setText("");
            }
            }
         });
       
       txtSquarePyramidA.setFont(new Font("Consolas",Font.PLAIN,25));
       txtSquarePyramidH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtSquarePyramidVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtSquarePyramidSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));
       
       txtPentagonalPrismB = new JTextField("", 25);
       txtPentagonalPrismH = new JTextField("", 25);
       txtPentagonalPrismVolume = new JTextField(10);
       txtPentagonalPrismVolume.setEditable(false);
       txtPentagonalPrismSurfaceArea = new JTextField(10);
       txtPentagonalPrismSurfaceArea.setEditable(false);
       txtPentagonalPrismB.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtPentagonalPrismB.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtPentagonalPrismB.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtPentagonalPrismB.setText("");
            }
            }
         });
         txtPentagonalPrismH.addKeyListener(new KeyAdapter(){
       public void keyPressed(KeyEvent ke) 
       {
            String value = txtPentagonalPrismH.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') 
               txtPentagonalPrismH.setEditable(true);
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter number only");
               txtPentagonalPrismH.setText("");
            }
            }
         });
       
       txtPentagonalPrismB.setFont(new Font("Consolas",Font.PLAIN,25));
       txtPentagonalPrismH.setFont(new Font("Consolas",Font.PLAIN,25));
       txtPentagonalPrismVolume.setFont(new Font("Consolas",Font.BOLD,25));
       txtPentagonalPrismSurfaceArea.setFont(new Font("Consolas",Font.BOLD,25));     
       
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
       rbVolume.addActionListener(this);
       rbSurfaceArea.addActionListener(this);
       
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
       
       comboBoxPaneTop.add(rbVolume);
       comboBoxPaneTop.add(rbSurfaceArea);
       comboBoxPaneBottom.add(cb);
             
       JPanel card0 = new JPanel();
       card0.setBackground(new Color(51,153,255));
        
        //Create the cube "cards"
       JPanel card1 = new JPanel();
       
       JPanel topCube = new JPanel();
       JPanel btmCube = new JPanel(new GridLayout(3, 2, 10, 10));
       btmCube.setBackground(new Color(51,153,255));
       card1.add(topCube);
       card1.add(btmCube);       
       card1.setBackground(new Color(51,153,255));
           
       topCube.add(lblCube);
       btmCube.add(lblCubeA);
       btmCube.add(txtCubeA);
       btmCube.add(lblCubeVolume);
       btmCube.add(txtCubeVolume);
       btmCube.add(lblCubeSurfaceArea);
       btmCube.add(txtCubeSurfaceArea);
       
        //Create the cuboid "cards"
       JPanel card2 = new JPanel();
       
       JPanel topCuboid = new JPanel();
       JPanel btmCuboid = new JPanel(new GridLayout(5, 2, 10, 10));
       btmCuboid.setBackground(new Color(51,153,255));
       card2.add(topCuboid);
       card2.add(btmCuboid);       
       card2.setBackground(new Color(51,153,255));
       
       topCuboid.add(lblCuboid);
       btmCuboid.add(lblCuboidH);
       btmCuboid.add(txtCuboidH);
       btmCuboid.add(lblCuboidL);
       btmCuboid.add(txtCuboidL);
       btmCuboid.add(lblCuboidW);
       btmCuboid.add(txtCuboidW);
       btmCuboid.add(lblCuboidVolume);
       btmCuboid.add(txtCuboidVolume);
       btmCuboid.add(lblCuboidSurfaceArea);
       btmCuboid.add(txtCuboidSurfaceArea);
        
        //Create the cone "cards"
       JPanel card3 = new JPanel();
       
       JPanel topCone = new JPanel();
       JPanel btmCone = new JPanel(new GridLayout(4, 2, 10, 10));
       btmCone.setBackground(new Color(51,153,255));
       card3.add(topCone);
       card3.add(btmCone);      
       card3.setBackground(new Color(51,153,255));
       
       topCone.add(lblCone);
       btmCone.add(lblConeH);
       btmCone.add(txtConeH);
       btmCone.add(lblConeR);
       btmCone.add(txtConeR);
       btmCone.add(lblConeVolume);
       btmCone.add(txtConeVolume);
       btmCone.add(lblConeSurfaceArea);
       btmCone.add(txtConeSurfaceArea);
        
        //Create the sphere "cards"
       JPanel card4 = new JPanel();
       
       JPanel topSphere = new JPanel();
       JPanel btmSphere = new JPanel(new GridLayout(3, 2, 10, 10));
       btmSphere.setBackground(new Color(51,153,255));
       card4.add(topSphere);
       card4.add(btmSphere);      
       card4.setBackground(new Color(51,153,255));
       
       topSphere.add(lblSphere);
       btmSphere.add(lblSphereR);
       btmSphere.add(txtSphereR);
       btmSphere.add(lblSphereVolume);
       btmSphere.add(txtSphereVolume);
       btmSphere.add(lblSphereSurfaceArea);
       btmSphere.add(txtSphereSurfaceArea);
        
        //Create the cylinder "cards"
       JPanel card5 = new JPanel();
       
       JPanel topCylinder = new JPanel();
       JPanel btmCylinder = new JPanel(new GridLayout(4, 2, 10, 10));
       btmCylinder.setBackground(new Color(51,153,255));
       card5.add(topCylinder);
       card5.add(btmCylinder);     
       card5.setBackground(new Color(51,153,255));
       
       topCylinder.add(lblCylinder);
       btmCylinder.add(lblCylinderH);
       btmCylinder.add(txtCylinderH);
       btmCylinder.add(lblCylinderR);
       btmCylinder.add(txtCylinderR);
       btmCylinder.add(lblCylinderVolume);
       btmCylinder.add(txtCylinderVolume);
       btmCylinder.add(lblCylinderSurfaceArea);
       btmCylinder.add(txtCylinderSurfaceArea);
        
        //Create the pyramid "cards"
       JPanel card6 = new JPanel();
       
       JPanel topSquarePyramid = new JPanel();
       JPanel btmSquarePyramid = new JPanel(new GridLayout(4, 2, 10, 10));
       btmSquarePyramid.setBackground(new Color(51,153,255));
       card6.add(topSquarePyramid);
       card6.add(btmSquarePyramid);      
       card6.setBackground(new Color(51,153,255));
       
       topSquarePyramid.add(lblSquarePyramid);
       btmSquarePyramid.add(lblSquarePyramidA);
       btmSquarePyramid.add(txtSquarePyramidA);
       btmSquarePyramid.add(lblSquarePyramidH);
       btmSquarePyramid.add(txtSquarePyramidH);
       btmSquarePyramid.add(lblSquarePyramidVolume);
       btmSquarePyramid.add(txtSquarePyramidVolume);
       btmSquarePyramid.add(lblSquarePyramidSurfaceArea);
       btmSquarePyramid.add(txtSquarePyramidSurfaceArea);
        
        //Create the prism "cards"
       JPanel card7 = new JPanel();
       
       JPanel topPentagonalPrism = new JPanel();
       JPanel btmPentagonalPrism = new JPanel(new GridLayout(4, 2, 10, 10));
       btmPentagonalPrism.setBackground(new Color(51,153,255));
       card7.add(topPentagonalPrism);
       card7.add(btmPentagonalPrism);
       
       card7.setBackground(new Color(51,153,255));
       topPentagonalPrism.add(lblPentagonalPrism);
       btmPentagonalPrism.add(lblPentagonalPrismB);
       btmPentagonalPrism.add(txtPentagonalPrismB);
       btmPentagonalPrism.add(lblPentagonalPrismH);
       btmPentagonalPrism.add(txtPentagonalPrismH);
       btmPentagonalPrism.add(lblPentagonalPrismVolume);
       btmPentagonalPrism.add(txtPentagonalPrismVolume);
       btmPentagonalPrism.add(lblPentagonalPrismSurfaceArea);
       btmPentagonalPrism.add(txtPentagonalPrismSurfaceArea);
        
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
       frame = new JFrame("3D Shape Calculator");//frame title
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
       frame.add(label3D, BorderLayout.NORTH);
       frame.setJMenuBar(menuBar);       
    }
        
    public void actionPerformed(ActionEvent e)
    {
       double volume,area;
       DecimalFormat df = new DecimalFormat("0.0000");
       
       String shapeName = (String)cb.getSelectedItem();
       String CubeA=txtCubeA.getText(),
         CuboidH=txtCuboidH.getText(),CuboidL=txtCuboidL.getText(),CuboidW=txtCuboidW.getText(),
         ConeH=txtConeH.getText(),ConeR=txtConeR.getText(),
         SphereR=txtSphereR.getText(),
         CylinderH=txtCylinderH.getText(),CylinderR=txtCylinderR.getText(),
         SquarePyramidA=txtSquarePyramidA.getText(),SquarePyramidH=txtSquarePyramidH.getText(),
         PentagonalPrismB=txtPentagonalPrismB.getText(),PentagonalPrismH=txtPentagonalPrismH.getText();
         
       if(rbVolume.isSelected())
       {
          cb.setVisible(true);//combobox appear
          
          //cube
          lblCubeVolume.setVisible(true);
          txtCubeVolume.setVisible(true);
          lblCubeSurfaceArea.setVisible(false);
          txtCubeSurfaceArea.setVisible(false);
          
          //cuboid
          lblCuboidVolume.setVisible(true);
          txtCuboidVolume.setVisible(true);          
          lblCuboidSurfaceArea.setVisible(false);
          txtCuboidSurfaceArea.setVisible(false);
          
          //cone
          lblConeVolume.setVisible(true);
          txtConeVolume.setVisible(true);
          lblConeSurfaceArea.setVisible(false);
          txtConeSurfaceArea.setVisible(false);
          
          //sphere
          lblSphereVolume.setVisible(true);
          txtSphereVolume.setVisible(true);
          lblSphereSurfaceArea.setVisible(false);
          txtSphereSurfaceArea.setVisible(false);
          
          //cylinder
          lblCylinderVolume.setVisible(true);
          txtCylinderVolume.setVisible(true);
          lblCylinderSurfaceArea.setVisible(false);
          txtCylinderSurfaceArea.setVisible(false);
          
          //pyramid
          lblSquarePyramidVolume.setVisible(true);
          txtSquarePyramidVolume.setVisible(true);
          lblSquarePyramidSurfaceArea.setVisible(false);
          txtSquarePyramidSurfaceArea.setVisible(false);
                    
          //prism
          lblPentagonalPrismVolume.setVisible(true);
          txtPentagonalPrismVolume.setVisible(true);
          lblPentagonalPrismSurfaceArea.setVisible(false);
          txtPentagonalPrismSurfaceArea.setVisible(false);
       }
       else if(rbSurfaceArea.isSelected())
       {
          cb.setVisible(true);
          
          //cube
          lblCubeVolume.setVisible(false);
          txtCubeVolume.setVisible(false);
          lblCubeSurfaceArea.setVisible(true);
          txtCubeSurfaceArea.setVisible(true);
          
          //cuboid
          lblCuboidVolume.setVisible(false);
          txtCuboidVolume.setVisible(false);          
          lblCuboidSurfaceArea.setVisible(true);
          txtCuboidSurfaceArea.setVisible(true);
          
          //cone
          lblConeVolume.setVisible(false);
          txtConeVolume.setVisible(false);
          lblConeSurfaceArea.setVisible(true);
          txtConeSurfaceArea.setVisible(true);
          
          //sphere
          lblSphereVolume.setVisible(false);
          txtSphereVolume.setVisible(false);
          lblSphereSurfaceArea.setVisible(true);
          txtSphereSurfaceArea.setVisible(true);
          
          //cylinder
          lblCylinderVolume.setVisible(false);
          txtCylinderVolume.setVisible(false);
          lblCylinderSurfaceArea.setVisible(true);
          txtCylinderSurfaceArea.setVisible(true);
          
          //pyramid
          lblSquarePyramidVolume.setVisible(false);
          txtSquarePyramidVolume.setVisible(false);
          lblSquarePyramidSurfaceArea.setVisible(true);
          txtSquarePyramidSurfaceArea.setVisible(true);
                    
          //prism
          lblPentagonalPrismVolume.setVisible(false);
          txtPentagonalPrismVolume.setVisible(false);
          lblPentagonalPrismSurfaceArea.setVisible(true);
          txtPentagonalPrismSurfaceArea.setVisible(true);
       }
         
       if(e.getSource() == btnCalc)
       {
         int check = cb.getSelectedIndex();
         
         if(check == 0)
         {
            JOptionPane.showMessageDialog(null,"Select either volume or surface area","CALCULATE",JOptionPane.INFORMATION_MESSAGE);
         }
         else
         {
          if(rbVolume.isSelected())
          {
             if(shapeName.equals("Cube"))
             {
                volume=Math.pow(Double.parseDouble(CubeA),3);
                txtCubeVolume.setText(String.valueOf(volume));   
             }
             else if(shapeName.equals("Cuboid"))
             {
                volume=Double.parseDouble(CuboidL)*Double.parseDouble(CuboidW)*Double.parseDouble(CuboidH);
                txtCuboidVolume.setText(String.valueOf(volume));
             }
             else if(shapeName.equals("Cone"))
             {
                volume=Math.PI*Math.pow(Double.parseDouble(ConeR),2)*(Double.parseDouble(ConeH)/3);
                txtConeVolume.setText(String.valueOf(df.format(volume)));
             }
             else if(shapeName.equals("Sphere"))
             {
                volume=Math.PI*Math.pow(Double.parseDouble(SphereR),3)*4/3;
                txtSphereVolume.setText(String.valueOf(df.format(volume)));
             }
             else if(shapeName.equals("Cylinder"))
             {
                volume=Math.PI*Math.pow(Double.parseDouble(CylinderR),2)*Double.parseDouble(CylinderH);
                txtCylinderVolume.setText(String.valueOf(df.format(volume)));
             }
             else if(shapeName.equals("Square Pyramid"))
             {
                volume=Math.pow(Double.parseDouble(SquarePyramidA),2)*Double.parseDouble(SquarePyramidH)*1/3;
                txtSquarePyramidVolume.setText(String.valueOf(df.format(volume)));
             }
             else if(shapeName.equals("Pentagonal Prism"))
             {
                volume=Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(Double.parseDouble(PentagonalPrismB),2)*Double.parseDouble(PentagonalPrismH)*1/4;
                txtPentagonalPrismVolume.setText(String.valueOf(df.format(volume)));
             }
          }
          else if(rbSurfaceArea.isSelected())
          {
             if(shapeName.equals("Cube"))
             {
                area=6*Math.pow(Double.parseDouble(CubeA),2);
                txtCubeSurfaceArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Cuboid"))
             {
                area=2*((Double.parseDouble(CuboidL)*Double.parseDouble(CuboidW))+(Double.parseDouble(CuboidW)*
                  Double.parseDouble(CuboidH))+(Double.parseDouble(CuboidL)*Double.parseDouble(CuboidH)));
                txtCuboidSurfaceArea.setText(String.valueOf(area));
             }
             else if(shapeName.equals("Cone"))
             {
                area=Math.PI*Double.parseDouble(ConeR)*(Double.parseDouble(ConeR)+Math.sqrt(Math.pow(Double.parseDouble(ConeH),2)+Math.pow(Double.parseDouble(ConeR),2)));
                txtConeSurfaceArea.setText(String.valueOf(df.format(area)));
             }
             else if(shapeName.equals("Sphere"))
             {
                area=4*Math.PI*Math.pow(Double.parseDouble(SphereR),2);
                txtSphereSurfaceArea.setText(String.valueOf(df.format(area)));
             }
             else if(shapeName.equals("Cylinder"))
             {
                area=2*Math.PI*Double.parseDouble(CylinderR)*(Double.parseDouble(CylinderH)+Double.parseDouble(CylinderR));
                txtCylinderSurfaceArea.setText(String.valueOf(df.format(area)));
             }
             else if(shapeName.equals("Square Pyramid"))
             {
                area=Math.pow(Double.parseDouble(SquarePyramidA),2)+2*Double.parseDouble(SquarePyramidA)*
                Math.sqrt((Math.pow(Double.parseDouble(SquarePyramidA),2)/4)+Math.pow(Double.parseDouble(SquarePyramidH),2));
                txtSquarePyramidSurfaceArea.setText(String.valueOf(df.format(area)));
             }
             else if(shapeName.equals("Pentagonal Prism"))
             {
                area=5*Double.parseDouble(PentagonalPrismB)*Double.parseDouble(PentagonalPrismH)
                +0.5*Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(Double.parseDouble(PentagonalPrismB),2);
                txtPentagonalPrismSurfaceArea.setText(String.valueOf(df.format(area)));
             }
          }
         }
       }
       else if(e.getSource() == btnClear)
       {
          txtCubeA.setText("");
          txtCubeVolume.setText("");
          txtCubeSurfaceArea.setText("");
          
          txtCuboidH.setText("");
          txtCuboidL.setText("");
          txtCuboidW.setText("");
          txtCuboidVolume.setText("");
          txtCuboidSurfaceArea.setText("");
          
          txtConeH.setText("");
          txtConeR.setText("");
          txtConeVolume.setText("");
          txtConeSurfaceArea.setText("");
          
          txtSphereR.setText("");
          txtSphereVolume.setText("");
          txtSphereSurfaceArea.setText("");
          
          txtCylinderH.setText("");
          txtCylinderR.setText("");
          txtCylinderVolume.setText("");
          txtCylinderSurfaceArea.setText("");
          
          txtSquarePyramidA.setText("");
          txtSquarePyramidH.setText("");
          txtSquarePyramidVolume.setText("");
          txtSquarePyramidSurfaceArea.setText("");
          
          txtPentagonalPrismB.setText("");
          txtPentagonalPrismH.setText("");
          txtPentagonalPrismVolume.setText("");
          txtPentagonalPrismSurfaceArea.setText("");
          
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
        shape3DGUI  ddd = new shape3DGUI();        
    }    
}
