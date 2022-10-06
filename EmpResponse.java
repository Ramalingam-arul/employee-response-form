import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.*;
class EmpResponse extends JFrame implements ActionListener ,ListSelectionListener
{
JLabel result,title,f_name,l_name,no,gender,dob,addr,hobby,xtra,depart,deg,qualifi,cgpa,email,output;
JTextField name1,name2,num,add,cg,em,q;
JRadioButton m,f,o;
ButtonGroup gen,bg;
JComboBox department,degree,date,mont,year;
JCheckBox hob1,hob2,hob3,hob4,term;
JTextArea details;
JButton sub,clear;
JPanel jp;
JScrollPane jsp;
static int t=0;
String d[]={ "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31"};
String month[]={"January", "Febraury", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"};
String y[]={"1990", "1991", "1992", "1993",
            "1994", "1995" ,"1995","1996","1997","1999","2000","2001","2002","2003"};
String emp_depart[]={"Select","HR","Engineering","Marketing","Administrator","sales","production","retail"};
String degr[]={"Select","B.Tech","M.Tech","MSc","BSc","MSc","MBA","BArch","MCA","HRD"};
String[] activity = {"select","Singing","Tennis","Playing cricket","Photography","Gardening","Knitting","Hiking","Gym","video games","others.."};
String[] l= new String[20];
JList<String> li;
public EmpResponse()
{
setTitle("response form");
jp=new JPanel();
jp.setLayout(null);
jp.setPreferredSize(new Dimension(1000, 1000));
title=new JLabel("EMPLOYEE RESPONSE FORM");
title.setBounds(100,100,300,20);
jp.add(title);
f_name=new JLabel("First name:");
f_name.setBounds(100,150,200,20);
jp.add(f_name);
name1=new JTextField("");
name1.setBounds(200,150,100,20);
jp.add(name1);
l_name= new JLabel("Last name:");
l_name.setBounds(320,150,180,20);
jp.add(l_name);
name2=new JTextField();
name2.setBounds(400,150,100,20);
jp.add(name2);
no=new JLabel("Emp number:");
no.setBounds(100,190,200,20);
jp.add(no);
num=new JTextField(20);
num.setBounds(200,190,100,20);
jp.add(num);
gender=new JLabel("Gender");
gender.setBounds(320,190,200,20);
jp.add(gender);
m=new JRadioButton("Male");
m.setBounds(400,190,70,20);
jp.add(m);
f=new JRadioButton("Female");
f.setBounds(470,190,70,20);
o=new JRadioButton("Other",true);
o.setBounds(550,190,70,20);
gen=new ButtonGroup();
gen.add(m);
gen.add(f);
gen.add(o);
jp.add(m);
jp.add(f);
jp.add(o);
dob=new JLabel("DOB");
dob.setBounds(100,230,100,20);
jp.add(dob);
date=new JComboBox(d);
date.setBounds(200,230,50,20);
jp.add(date);
mont=new JComboBox(month);
mont.setBounds(260,230,100,20);
jp.add(mont);
year=new JComboBox(y);
year.setBounds(370,230,70,20);
jp.add(year);
addr=new JLabel("Address:");
addr.setBounds(100,280,190,20);
jp.add(addr);
add=new JTextField(300);
add.setBounds(200,280,300,20);
jp.add(add);
email=new JLabel("Email ID:");
email.setBounds(520,280,150,20);
jp.add(email);
em=new JTextField(90);
em.setBounds(620,280,200,20);
jp.add(em);
cgpa=new JLabel("CGPA:");
cgpa.setBounds(320,360,300,20);
jp.add(cgpa);
cg=new JTextField(90);
cg.setBounds( 420,360,120,20);
jp.add(cg);
depart=new JLabel("Department:");
depart.setBounds(320,330,200,20);
jp.add(depart);
department=new JComboBox(emp_depart);
department.setBounds(420,330,120,20);
jp.add(department);
deg=new JLabel("Degree:");
deg.setBounds(100,360,200,20);
jp.add(deg);
degree=new JComboBox(degr);
degree.setBounds(200,360,100,20);
jp.add(degree);
qualifi=new JLabel("Qualification:");
qualifi.setBounds(100,330,90,20);
jp.add(qualifi);
q=new JTextField(100);
q.setBounds(200,330,100,20);
jp.add(q);
hobby=new JLabel("Hobbies");
hobby.setBounds(100,400,100,20);
jp.add(hobby);
hob1=new JCheckBox("Reading novels");
hob1.setBounds(200,400,150,20);
hob2=new JCheckBox("Stamp collection");
hob2.setBounds(350,400,150,20);
hob3=new JCheckBox("Dancing");
hob3.setBounds(500,400,100,20);
hob4=new JCheckBox("Others...");
hob4.setBounds(600,400,150,20);
jp.add(hob1);
jp.add(hob2);
jp.add(hob3);
jp.add(hob4);
xtra=new JLabel("Extra curricular Activities:");
xtra.setBounds(100,450,200,20);
jp.add(xtra);

li= new JList<String> (activity);
li.setVisible(true);
li.setBounds(350,450,200,120);
li.setFixedCellHeight(20);
li.setFixedCellWidth(100);
li.setLayoutOrientation(JList.HORIZONTAL_WRAP);
jp.add(li); 

/*li.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
li.addListSelectionListener(this);
JScrollPane sc= new JScrollPane(li);
sc.setPreferredSize(new Dimension(100,70));
jp.add(sc); */


sub=new JButton("SUBMIT");
sub.setBounds(100,600,100,20);
jp.add(sub);
clear=new JButton("RESET");
clear.setBounds(220,600,100,20);
jp.add(clear);
output=new JLabel("OUTPUT:");
output.setBounds(100, 650, 100, 20);
details=new JTextArea();
details.setBounds(100,680,400,200);
jp.add(details);
sub.addActionListener(this);
clear.addActionListener(this);
li.addListSelectionListener(this);
JScrollPane S=new JScrollPane(jp);
jp.setVisible(true);
add(S);
setSize(600,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public void actionPerformed(ActionEvent ae){
if(ae.getSource()==sub)
{
String d1,d2,d3,d4,d5,d6,d7;
details.setText("");
if(((num.getText()).length()!=9)||name1.getText().equals("")||add.getText().equals("")||em.getText().equals("")||q.getText().equals(""))
{
    if(name1.getText().equals(""))
     details.append("Enter your name to submit"+"\n");
     if((num.getText()).length()!=9)
     details.append("Enter Employee number of 9 digits to submit"+"\n");
     if(add.getText().equals(""))
     details.append("Enter your address to submit"+"\n");
     if(em.getText().equals(""))
     details.append("Enter your email id to submit"+"\n");
     if(q.getText().equals(""))
     details.append("Enter your qualification to submit"+"\n");
}
else
{
String data="First Name:"+name1.getText()+"\n"+"Last name:"+name2.getText()+"\n"+
          "Employee number:"+num.getText()+"\n";
if(m.isSelected())
   d1="Gender: Male"+"\n";
else if(f.isSelected())
    d1="Gender: Female"+"\n";
else  
    d1="Gender: Other"+"\n";
d2= "DOB : "+ (String)date.getSelectedItem()
                      + "/" + (String)mont.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
d3="Address:"+add.getText()+"\n"+"Email id:"+em.getText()+"\n"+
         "CGPA:"+cg.getText()+"\n";
d4="Department:"+ (String)degree.getSelectedItem()+"\n";
d5="Qualification:"+q.getText()+"\n";
details.setText(data+d1+d2+d3+d4+d5);
if(hob1.isSelected()){
   d6="Hobby: Reading novels"+"\n";
   details.append(d6);}
else if(hob2.isSelected()){
   d6="Hobby: Stamp collection"+"\n";
    details.append(d6);}
else if(hob3.isSelected()){
   d6="Hobby: Dancing"+"\n";
    details.append(d6);}
    else if(hob4.isSelected()){
        d6="Hobby: others"+"\n";
         details.append(d6);}
         details.append("extra curicular activities: "+"\n");
         for(int i=0;i<t;i++)
         {
             details.append(l[i]+",  ");
         }
}
}
if(ae.getSource()==clear){
name1.setText("");
name2.setText("");
num.setText("");
add.setText("");
cg.setText("");
q.setText("");
em.setText("");
details.setText("");
m.setSelected(false);
f.setSelected(false);
o.setSelected(false);
date.setSelectedIndex(0);
mont.setSelectedIndex(0);
year.setSelectedIndex(0);
degree.setSelectedIndex(0);
department.setSelectedIndex(0);
hob1.setSelected(false);
hob2.setSelected(false);
hob3.setSelected(false);
li.setSelectedIndex(0);
for(int i=0;i<t;i++)
{
    l[i]="";
}
t=0;

}
}
public void valueChanged(ListSelectionEvent e)
{
l[t]=li.getSelectedValue();
t++;
}

public static void main(String args[])
{
 EmpResponse emp=new EmpResponse();
}
}