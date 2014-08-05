import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class GuiMenu implements ActionListener {
JFrame f;
private JLabel statusLabel;
private JTextArea jTextArea;
final JFileChooser fileDialog = new JFileChooser();
GuiMenu() {
f = new JFrame("Menu Demo");
f.setSize(220, 200);
f.setLayout(new BorderLayout());
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar jmb = new JMenuBar();

JMenu jmFile = new JMenu("Game");
JMenuItem jmiOpen = new JMenuItem("Open");
JMenuItem jmiClose = new JMenuItem("Close");
JMenuItem jmiSave = new JMenuItem("Save");
JMenuItem jmiExit = new JMenuItem("Exit");
jmFile.add(jmiOpen);
jmFile.add(jmiClose);
jmFile.add(jmiSave);
jmFile.addSeparator();
jmFile.add(jmiExit);
jmb.add(jmFile);
statusLabel = new JLabel("Status Bar");
statusLabel.setSize(350,100);
f.add(statusLabel,BorderLayout.NORTH);
jTextArea=new JTextArea();
f.add(jTextArea,BorderLayout.CENTER);
JMenu jmOptions = new JMenu("Options");
JMenu a = new JMenu("A");
JMenuItem b = new JMenuItem("B");
JMenuItem c = new JMenuItem("C");
JMenuItem d = new JMenuItem("D");
a.add(b);
a.add(c);
a.add(d);
jmOptions.add(a);

JMenu e = new JMenu("E");
e.add(new JMenuItem("F"));
e.add(new JMenuItem("G"));
jmOptions.add(e);

jmb.add(jmOptions);

JMenu jmHelp = new JMenu("Help");
JMenuItem jmiAbout = new JMenuItem("About");
jmHelp.add(jmiAbout);
jmb.add(jmHelp);

jmiOpen.addActionListener(this);
jmiOpen.setActionCommand("Open");
jmiClose.addActionListener(this);
jmiClose.setActionCommand("close");
jmiSave.addActionListener(this);
jmiSave.setActionCommand("save");
jmiExit.addActionListener(this);
jmiExit.setActionCommand("Exit");
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
jmiAbout.addActionListener(this);
f.setLocationRelativeTo(null);
f.setJMenuBar(jmb);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
String comStr = ae.getActionCommand();
if(comStr.equalsIgnoreCase("About"))
{
statusLabel.setText("This is simple Notepad application");
}
if(comStr.equalsIgnoreCase("Exit")||comStr.equalsIgnoreCase("close"))
{
f.dispose();
}
else if(comStr.equalsIgnoreCase("Open"))
{
int returnVal = fileDialog.showOpenDialog(f);
if (returnVal == JFileChooser.APPROVE_OPTION) {
java.io.File file = fileDialog.getSelectedFile();
statusLabel.setText("File Selected :"
+ file.getName());
if(file.exists())
{
try
{
FileReader fr=new FileReader(file.getAbsolutePath());
BufferedReader br=new BufferedReader(fr);
String s1,s2="";
while((s1=br.readLine())!=null)
{
s2=s2+s1+"\n";
}
jTextArea.setText(s2);
}
catch (FileNotFoundException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
catch (IOException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}
else if(comStr.equalsIgnoreCase("save"))
{
int returnValsave = fileDialog.showSaveDialog(f);
if (returnValsave == JFileChooser.APPROVE_OPTION) {
java.io.File file = fileDialog.getSelectedFile();
statusLabel.setText("File Selected :"
+ file.getName());
if(file.exists())
{
try
{
FileWriter fw=new FileWriter(file);
BufferedWriter bw=new BufferedWriter(fw);
String getContent=jTextArea.getText();
System.out.println(getContent);
bw.write(getContent);
bw.flush();
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
else{
statusLabel.setText("Open command cancelled by user." );
}
}
//System.out.println(comStr + " Selected");
}
public static void main(String args[]) {
new GuiMenu();
}
}