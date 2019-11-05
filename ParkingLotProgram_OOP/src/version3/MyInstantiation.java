package version3;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class MyInstantiation extends FrameMain{
//public static ArrayList<User> list = ListUsers();
public static ArrayList<User> list;
static int logsIterator = 0;
      
      public static void LoginInfo(){
            
      }
      
      public static void buttonShower(int o){
            
            DefaultTableModel modelOverview = (DefaultTableModel) jTableOverview.getModel();
            
                  FrameUserInfo.txtName.setText(modelOverview.getValueAt(o, 4).toString());
                  FrameUserInfo.txtPlateno.setText(modelOverview.getValueAt(o, 3).toString());
                  FrameUserInfo.txtTimein.setText(modelOverview.getValueAt(o, 2).toString());
                  
      }
      
      
      public static void logsPopulate(){
            DefaultTableModel modelOverview = (DefaultTableModel) jTableLogs.getModel();
//            list = ListUsers();

            Object rowData[] = new Object[4];
            
                  String alocation = cmbLocation.getSelectedItem().toString();
                  
//                  int index = cmbLocation.getSelectedIndex()-1;
//                  String aavailability;
//                  if(cmbLocation.getSelectedIndex()!=0){
//                              aavailability = "Occupied";
//                        }else{
//                              aavailability = "Vacant";
//                        }
                  
                  SimpleDateFormat sdf = new SimpleDateFormat("h:mma d MMM yyyy");
                  Date date = new Date();
                  String atimein = sdf.format(date).toString();
                  String aplateno = txtFieldPlateno.getText();
                  String aname = txtFieldName.getText();
                  
            for (int i = 0; i < 4; i++){
                  rowData[0] = alocation;             //location
                  rowData[1] = atimein;                //timein
                  rowData[2] = aplateno;              //plateno
                  rowData[3] = aname;                //name
                  
            }
                  modelOverview.addRow(rowData);            

      }
      
      public static void buttonEnabler(int a){
            switch (a){
                  case 1: jButton1.setEnabled(true); break;
                  case 2: jButton2.setEnabled(true); break;
                  case 3: jButton3.setEnabled(true); break;
                  case 4: jButton4.setEnabled(true); break;
                  case 5: jButton5.setEnabled(true); break;                        
                  case 6: jButton16.setEnabled(true); break;
                  case 7: jButton17.setEnabled(true); break;
                  case 8: jButton18.setEnabled(true); break;
                  case 9: jButton19.setEnabled(true); break;
                  case 10: jButton20.setEnabled(true); break;                        
                  case 11: jButton6.setEnabled(true); break;
                  case 12: jButton7.setEnabled(true); break;
                  case 13: jButton8.setEnabled(true); break;
                  case 14: jButton9.setEnabled(true); break;
                  case 15: jButton10.setEnabled(true); break;                        
                  case 16: jButton11.setEnabled(true); break;
                  case 17: jButton12.setEnabled(true); break;
                  case 18: jButton13.setEnabled(true); break;
                  case 19: jButton14.setEnabled(true); break;
                  case 20: jButton15.setEnabled(true); break;                        
            }
            
      }
      
      public static void buttonDisabler(String a){
            int x;
            switch (a){
                  case "A1":
                        jButton1.setEnabled(false); x = 0; timeOutFromRow(x,a); break;
                  case "A2":
                        jButton2.setEnabled(false); x = 1; timeOutFromRow(x,a); break;
                  case "A3":
                        jButton3.setEnabled(false); x = 2; timeOutFromRow(x,a); break;
                  case "A4":
                        jButton4.setEnabled(false); x = 3; timeOutFromRow(x,a); break;
                  case "A5":
                        jButton5.setEnabled(false); x = 4; timeOutFromRow(x,a); break;  
                        
                  case "B1":
                        jButton16.setEnabled(false); x = 5; timeOutFromRow(x,a); break;
                  case "B2":
                        jButton17.setEnabled(false); x = 6; timeOutFromRow(x,a); break;
                  case "B3":
                        jButton18.setEnabled(false); x = 7; timeOutFromRow(x,a); break;
                  case "B4":
                        jButton19.setEnabled(false); x = 8; timeOutFromRow(x,a); break;
                  case "B5":
                        jButton20.setEnabled(false); x = 9; timeOutFromRow(x,a); break;  
                        
                  case "C1":
                        jButton6.setEnabled(false); x = 10; timeOutFromRow(x,a); break;
                  case "C2":
                        jButton7.setEnabled(false); x = 11; timeOutFromRow(x,a); break;
                  case "C3":
                        jButton8.setEnabled(false); x = 12; timeOutFromRow(x,a); break;
                  case "C4":
                        jButton9.setEnabled(false); x = 13; timeOutFromRow(x,a); break;
                  case "C5":
                        jButton10.setEnabled(false); x = 14; timeOutFromRow(x,a); break;  
                        
                  case "D1":
                        jButton11.setEnabled(false); x = 15; timeOutFromRow(x,a); break;
                  case "D2":
                        jButton12.setEnabled(false); x = 16; timeOutFromRow(x,a); break;
                  case "D3":
                        jButton13.setEnabled(false); x = 17; timeOutFromRow(x,a); break;
                  case "D4":
                        jButton14.setEnabled(false); x = 18; timeOutFromRow(x,a); break;
                  case "D5":
                        jButton15.setEnabled(false); x = 19; timeOutFromRow(x,a); break;  
                   
            }            
      }
      
      
      
      public static void timeOutFromRow(int i, String a){            
            DefaultTableModel modelOverview = (DefaultTableModel) jTableOverview.getModel();
            
            modelOverview.setValueAt(a , i,0);
            modelOverview.setValueAt("Vacant" , i,1);
            modelOverview.setValueAt("", i,2);
            modelOverview.setValueAt("" , i,3);
            modelOverview.setValueAt("" , i,4);
      }
      
      public static void addToRow(){
            DefaultTableModel modelOverview = (DefaultTableModel) jTableOverview.getModel();
//            list = ListUsers();

            Object rowData[] = new Object[5];
            
                  String alocation = cmbLocation.getSelectedItem().toString();
                  int index = cmbLocation.getSelectedIndex()-1;
                  String aavailability;
                  if(cmbLocation.getSelectedIndex()!=0){
                              aavailability = "Occupied";
                        }else{
                              aavailability = "Vacant";
                        }
                  SimpleDateFormat sdf = new SimpleDateFormat("h:mma d MMM yyyy");
                  Date date = new Date();
                  String atimein = sdf.format(date).toString();
                  String aplateno = txtFieldPlateno.getText();
                  String aname = txtFieldName.getText();
            
            modelOverview.setValueAt(aavailability , index,1);
            modelOverview.setValueAt(atimein , index,2);
            modelOverview.setValueAt(aplateno , index,3);
            modelOverview.setValueAt(aname , index,4);
            
            
            
            
            
      }
      
      
      
      
      
      
      
      
      public static class User{
            public String location;
            public String availability;
            public String timein;
            public String plateno;
            public String name;
            
            public User(String loc, String av, String tmin, String plno, String nme){
                  this.location = loc;
                  this.availability = av;
                  this.timein = tmin;
                  this.plateno = plno;
                  this.name = nme;
            }
      }

      
      public static ArrayList ListUsers(){
            ArrayList<User> listOverview = new ArrayList<User>();
                  User u1 = new User("A1",  "Vacant", "", "", "");
                  listOverview.add(u1);

            return listOverview;
      }
      

      
      public static ArrayList DefaultListUsers(){
            ArrayList<User> listOverview = new ArrayList<User>();
            
//                  User u1 = new User("A1", aavailability, atimein, aplateno, aname);
                  User u1 = new User("A1",  "Vacant", "", "", ""); User u2 = new User("A2",  "Vacant", "", "", ""); User u3 = new User("A3",  "Vacant", "", "", ""); User u4 = new User("A4",  "Vacant", "", "", ""); User u5 = new User("A5",  "Vacant", "", "", "");
                  User u6 = new User("B1",  "Vacant", "", "", ""); User u7 = new User("B2",  "Vacant", "", "", ""); User u8 = new User("B3",  "Vacant", "", "", ""); User u9 = new User("B4",  "Vacant", "", "", ""); User u10 = new User("B5",  "Vacant", "", "", "");
                  User u11 = new User("C1",  "Vacant", "", "", ""); User u12 = new User("C2",  "Vacant", "", "", ""); User u13 = new User("C3",  "Vacant", "", "", ""); User u14 = new User("C4",  "Vacant", "", "", ""); User u15 = new User("C5",  "Vacant", "", "", "");
                  User u16 = new User("D1",  "Vacant", "", "", ""); User u17 = new User("D2",  "Vacant", "", "", ""); User u18 = new User("D3",  "Vacant", "", "", ""); User u19 = new User("D4",  "Vacant", "", "", ""); User u20 = new User("D5",  "Vacant", "", "", "");
                  
//            User u1 = new User(1,"Jun Loue","Caiña",16);
//            User u2 = new User(2,"Jay Dave","Dilag",16);
//            User u3 = new User(3,"Kaiser","Guisihan",16);
//            User u4 = new User(4,"Dan Mark","Javier",16);
//            User u5 = new User(4,"Kean","Daguino",16);

            listOverview.add(u1); listOverview.add(u2); listOverview.add(u3); listOverview.add(u4); listOverview.add(u5);
            listOverview.add(u6); listOverview.add(u7); listOverview.add(u8); listOverview.add(u9); listOverview.add(u10);
            listOverview.add(u11); listOverview.add(u12); listOverview.add(u13); listOverview.add(u14); listOverview.add(u15);
            listOverview.add(u16); listOverview.add(u17); listOverview.add(u18); listOverview.add(u19); listOverview.add(u20);
           
            return listOverview;
      }
      
      public static void defaultRow(){
            DefaultTableModel modelOverview = (DefaultTableModel) jTableOverview.getModel();
            list = DefaultListUsers();
            Object rowData[] = new Object[5];
            
            for (int i = 0; i < list.size(); i++){
                  rowData[0] = list.get(i).location;
                  rowData[1] = list.get(i).availability;
                  rowData[2] = list.get(i).timein;
                  rowData[3] = list.get(i).plateno;
                  rowData[4] = list.get(i).name;
                  modelOverview.addRow(rowData);
            }     
      }
            
      

      
      
  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      public static void mouseEntered(JPanel p, JLabel l) {
            l.setForeground(Color.WHITE);
            p.setBackground(new Color(233, 87, 63));
      }
      public static void mouseExited(JPanel p, JLabel l) {
            l.setForeground(Color.WHITE);
            p.setBackground(new Color(51, 51, 51));
      }
      public static void mouseClicked(JPanel p, JPanel pp, JPanel ppp) {
            p.setVisible(false);
            pp.setVisible(false);
            ppp.setVisible(true);
            ppp.setBackground(new Color(51,255,51));
      }      
}
