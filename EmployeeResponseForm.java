import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class EmployeeResponseForm implements ListSelectionListener, ActionListener, ItemListener 
{ 
   JFrame jf;
   JButton b,c;
   StringBuilder detailsline= new StringBuilder("");
   StringBuilder errorline= new StringBuilder("");
   String Ename,Eno,gender,Qual,Dept,DD,MM,YY, Addr,Email,Extra;
   JLabel ename, eno, sex, qual, dept, dob, addr, email, hobby, extra;
   JTextField ename1, eno1, qual1, addr1, email1;
   JRadioButton male,female;
   JTextArea details;
   JCheckBox jhobby1,jhobby2,jhobby3,jhobby4;
   int count=0;
   String depts[]={"Management", "Finance", "IT", "HR/PR", "Sales", "Marketing"};

   String dd[]={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
   String mm[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   String yy[]={"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001"};

 String extraact[]={"Sports", "Dance", "Singing", "Instrumental", "Drama/Theatre", "Debate", "Others"};

JList <String> jdept;
JComboBox <String> jdd;
JComboBox <String> jmm;
JComboBox <String> jyy;
JComboBox <String> jex;


public EmployeeResponseForm()
{  jf=new JFrame();
   jf.setTitle("Employee Response Form");
   
    JLabel eno=new JLabel("Employee No. :", JLabel.CENTER);
    eno1= new JTextField(15);
    
    JLabel ename=new JLabel("Name: ", JLabel.CENTER);
    ename1= new JTextField(25);
   
    JLabel addr=new JLabel("Address: ", JLabel.CENTER);
    addr1= new JTextField(25);
   
    JLabel email=new JLabel("Email: ", JLabel.CENTER);
    email1= new JTextField(15);

    JLabel sex=new JLabel("        Sex: ", JLabel.CENTER);
    male= new JRadioButton("Male");
    female= new JRadioButton("Female");
    male.setBackground(new Color(255,185,0));
    female.setBackground(new Color(255,185,0));

    JLabel qual=new JLabel("        Qualification: ", JLabel.CENTER);
    qual1= new JTextField(15);

    JLabel dept=new JLabel("                       Department: ", JLabel.RIGHT);
    jdept= new JList<String> (depts);
    jdept.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     jdept.addListSelectionListener(this);
    JScrollPane sc= new JScrollPane(jdept);
    sc.setPreferredSize(new Dimension(100,70));
    
    JLabel dob=new JLabel("         Date of Birth: ", JLabel.CENTER);
    jdd= new JComboBox<String> (dd);
    jmm= new JComboBox<String> (mm);
    jyy= new JComboBox<String> (yy);   
  
    JLabel hobby=new JLabel("            Hobbies: ", JLabel.RIGHT);
    jhobby1= new JCheckBox ("Singing/Dancing");
    jhobby2= new JCheckBox ("Reading Novels");
    jhobby3= new JCheckBox ("Painting");
    jhobby4= new JCheckBox ("Others");
   

    JLabel extra=new JLabel("         Extracurricular Activities: ", JLabel.RIGHT);
    jex= new JComboBox<String> (extraact);
    
   c=new JButton("Check details");
   c.addActionListener(this);

   b=new JButton("Submit"); 
   b.setEnabled(false);
   b.addActionListener(this);

   details= new JTextArea(30,30);
   details.setBounds(600,80,300,300);
 
   jf.add(eno);
   jf.add(eno1);
   jf.add(ename);
   jf.add(ename1);
   jf.add(addr);
   jf.add(addr1);
   jf.add(email);
   jf.add(email1);
   jf.add(sex);
   jf.add(male);
   jf.add(female);
   ButtonGroup bg=new ButtonGroup();
   bg.add(male);
   bg.add(female);
   male.addItemListener(this);
   female.addItemListener(this);
   jf.add(qual);
   jf.add(qual1);
   jf.add(qual);
   jf.add(qual1);
   jf.add(dept);
   jf.add(sc);
   jf.add(dob); 
   jf.add(jdd);
   jf.add(jmm);
   jf.add(jyy); 
   jdd.addActionListener(this);
   jmm.addActionListener(this);
   jyy.addActionListener(this);
   jf.add(hobby);
   jf.add(jhobby1);
   jf.add(jhobby2);
   jf.add(jhobby3);
   jf.add(jhobby4);
   jhobby1.addItemListener(this);
   jhobby2.addItemListener(this);
   jhobby3.addItemListener(this);
   jhobby4.addItemListener(this);
   jf.add(extra);   
   jf.add(jex);
   jex.addActionListener(this);
   jf.add(c);
   jf.add(b);
   jf.add(details);
   
   jf.setSize(620,630);
   
   jf.setLayout(new FlowLayout());
   jf.setVisible(true); 
   jf.getContentPane().setBackground(new Color(255,185,0));  
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}



public void valueChanged(ListSelectionEvent ls)
{ 
}

public void itemStateChanged(ItemEvent ae)
{  
   if(male.isSelected())
   gender="male";
   
   if(female.isSelected())
   gender="female";
    
}

public void actionPerformed(ActionEvent e)
{  String s=e.getActionCommand();

    Eno=eno1.getText();
   Ename=ename1.getText();
   Addr=addr1.getText();
   Email=email1.getText();
   Qual=qual1.getText();
   DD=(String)jdd.getSelectedItem();
   MM=(String)jmm.getSelectedItem();
   YY=(String)jyy.getSelectedItem();


   Extra=(String)jex.getSelectedItem();
   
  if(s.equals("Check details"))
   {   int flag=0;
       errorline.setLength(0);
        if(Eno.length()!=9)
       { 
   {errorline.append("\nEmployee Number should be of 9 digits! ");
     flag=1;}
}

    if(Ename.length()<1)
       {errorline.append("\nEmployee Name field cannot be empty! ");
         flag=1;}

  String error1=errorline.toString();

  if(flag==0)
  {details.setText("\nEntered details are correct! ");
    b.setEnabled(true);}

   else
   details.setText(error1);
}

if(s.equals("Submit"))
{  detailsline.setLength(0);
   detailsline.append("Employee number is "+Eno+"\n");  
   detailsline.append("Employee's name is "+Ename+"\n");
   detailsline.append("Employee's Address is "+Addr+"\n");
    detailsline.append("Employee's email address is "+Email+"\n");
    detailsline.append("Employee's gender is "+gender+"\n");
   detailsline.append("Employee's qualification is "+Qual+"\n");
   detailsline.append("Employee's Department is ");
    int[] index=jdept.getSelectedIndices();
   for(int i=0;i<index.length;i++)
    detailsline.append(depts[index[i]] + ", ");
  
   detailsline.append("\nEmployee's Date of Birth is "+DD+" "+MM+" "+YY+ "\n");
   detailsline.append("Employee's hobby is ");
  
 if(jhobby1.isSelected())
 detailsline.append(jhobby1.getText()+", ");
  
 if(jhobby2.isSelected())
 detailsline.append(jhobby2.getText()+", ");
 
 if(jhobby3.isSelected())
 detailsline.append(jhobby3.getText()+", ");
 
 if(jhobby4.isSelected())
 detailsline.append(jhobby4.getText()+", ");
 
  
   detailsline.append("\nEmployee participates in "+Extra+ "\n");
   

 String details1=detailsline.toString(); 
    details.setText(details1);
}  
}


public static void main(String a[])
{
EmployeeResponseForm e= new EmployeeResponseForm();
}
}