/*
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.*;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

/**

 * @author FIRAT
 */
public class gui_main extends javax.swing.JFrame {

    
     
    
     
  ArrayList<Car> cars;
  ArrayList<Truck> trucks;
  ArrayList<Motorcycle> motors;
   static String plates[][] = new String[3][15]; 
    
    static boolean place[][] = {{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true}}; 
    //int carCapacity[][] = {{5},{5},{5}};
    //int TruckCapacity[][] = {{5},{5},{5}};
    //int MotorcycleCapacity[][] = {{5},{5},{5}};
    
    public void getData(String plate, String hour , int floor, int ky, String type){
        setDataToThePlaces(plate,hour,floor,ky,type);
        
    }
    public double totalHourCalc(String entranceTime){
        LocalDateTime now = LocalDateTime.now();
        String nowString = now.toString();
        int hour = Integer.parseInt(nowString.substring(11,13));
        double minToHour = Double.parseDouble(nowString.substring(14,16))/60;
        int hourE = Integer.parseInt(entranceTime.substring(11,13));
        double minToHourE = Double.parseDouble(entranceTime.substring(14,16))/60;
        
        double totalHour  = (double)Math.abs((hour+minToHour)-(hourE+minToHourE));
        
        
        return totalHour;
    }
    public String findHour(String plate){
        try{
        File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
        Scanner in = new Scanner(f);
        while(in.hasNextLine()){
            String temp = in.nextLine();
            if(temp.equals(plate)){
                String hour = in.nextLine();
                return hour;
            }
        }
        }catch(Exception e){
        
        }
        return "";
        
    }
    public void setDataToThePlaces(String plate, String hour, int floor, int ky, String type){
        int i = floor;
        int j = ky;
        if(type.equals("TRUCK")){
            System.out.println("type inned; i:" + i + " j:" + j);
            
                    if(i==0){
                           
                          if(j==10){
                              jButton17.setText(plate);
                              jButton17.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }  
                          else if(j==11){
                              jButton16.setText(plate);
                              jButton16.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==12){
                              jButton20.setText(plate);
                              jButton20.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==13){
                              jButton18.setText(plate);
                              jButton18.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==14){
                              jButton19.setText(plate);
                              jButton19.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
                        else if(i==1){
                            
                          if(j==10){
                              jButton26.setText(plate);
                              jButton26.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==11){
                             jButton27.setText(plate);
                              jButton27.setBackground(new java.awt.Color(220,20,60)); 
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==12){
                              jButton28.setText(plate);
                              jButton28.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==13){
                              jButton29.setText(plate);
                              jButton29.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==14){
                              jButton25.setText(plate);
                              jButton25.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
                        else if(i==2){
                            
                          if(j==10){
                              jButton41.setText(plate);
                              jButton41.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==11){
                              jButton42.setText(plate);
                              jButton42.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==12){
                              jButton43.setText(plate);
                              jButton43.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==13){
                              jButton44.setText(plate);
                              jButton44.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==14){
                              jButton40.setText(plate);
                              jButton40.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
        }
        else if(type.equals("CAR")){
            if(i==0){
                           
                          if(j==0){
                              jButton6.setText(plate);
                              jButton6.setBackground(new java.awt.Color(220,20,60));
                              System.out.println("calisti:");
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==1){
                              jButton7.setText(plate);
                              jButton7.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==2){
                              jButton8.setText(plate);
                              jButton8.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }
                          else if(j==3){
                              jButton9.setText(plate);
                              jButton9.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==4){
                              jButton10.setText(plate);
                              jButton10.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
                        else if(i==1){
                            
                           if(j==0){
                              jButton21.setText(plate);
                              jButton21.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==1){
                              jButton22.setText(plate);
                              jButton22.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==2){
                              jButton23.setText(plate);
                              jButton23.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }
                          else if(j==3){
                              jButton24.setText(plate);
                              jButton24.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==4){
                              jButton35.setText(plate);
                              jButton35.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
                        else if(i==2){
                            
                           if(j==0){
                              jButton36.setText(plate);
                              jButton36.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==1){
                              jButton37.setText(plate);
                              jButton37.setBackground(new java.awt.Color(220,20,60));
                            place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==2){
                              jButton38.setText(plate);
                              jButton38.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }
                          else if(j==3){
                              jButton39.setText(plate);
                              jButton39.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==4){
                              jButton50.setText(plate);
                              jButton50.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
        }
        else if(type.equals("MOTORCYCLE")){
            if(i==0){
                           
                          if(j==5){
                              jButton11.setText(plate);
                              jButton11.setBackground(new java.awt.Color(220,20,60));
                              System.out.println("calisti:");
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==6){
                              jButton12.setText(plate);
                              jButton12.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==7){
                              jButton13.setText(plate);
                              jButton13.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }
                          else if(j==8){
                              jButton14.setText(plate);
                              jButton14.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==9){
                              jButton15.setText(plate);
                              jButton15.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
                        else if(i==1){
                            
                           if(j==5){
                              jButton34.setText(plate);
                              jButton34.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==6){
                              jButton33.setText(plate);
                              jButton33.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==7){
                              jButton32.setText(plate);
                              jButton32.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }
                          else if(j==8){
                              jButton31.setText(plate);
                              jButton31.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==9){
                              jButton30.setText(plate);
                              jButton30.setBackground(new java.awt.Color(220,20,60));
                              place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
                        else if(i==2){
                            
                           if(j==5){
                              jButton49.setText(plate);
                              jButton49.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }  
                          else if(j==6){
                              jButton48.setText(plate);
                              jButton48.setBackground(new java.awt.Color(220,20,60));
                            place[i][j]=false;
                              plates[i][j] = plate;
                             
                          }
                          else if(j==7){
                              jButton47.setText(plate);
                              jButton47.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                              
                          }
                          else if(j==8){
                              jButton46.setText(plate);
                              jButton46.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                          else if(j==9){
                              jButton45.setText(plate);
                              jButton45.setBackground(new java.awt.Color(220,20,60));
                             place[i][j]=false;
                              plates[i][j] = plate;
                          }
                        }
        }
    }
    public void deleteUN(){
        
    
    try{
        File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
        Scanner in = new Scanner(f);
        int i = 0;
        String ans="";
        boolean a= true;
        while(in.hasNextLine()){
            
               String temp = in.nextLine();
               if(temp.equals("-") && a){
                   continue;
               }
               else{
                   a= false;
                   ans+=temp + "\n";
               }
                   
            
        }
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
                checkData(); 
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public  void checkData() {
        try{
        File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
        Scanner in = new Scanner(f);
        int i = 0;
        while(in.hasNextLine()){
                
                
                String plate = in.nextLine();
                String hour = in.nextLine();
                String floor = in.nextLine();
                String key = in.nextLine(); 
                int fl = Integer.parseInt(floor);
                int ky = Integer.parseInt(key);
                plates[fl][ky] = plate; 
                System.out.println("plate:" + plate);
                System.out.println(fl + " " + ky);
                changePlace(fl,ky);
                i=0;
                String type = in.nextLine();
                System.out.println("type:" +type);
                    
                getData(plate,hour,fl,ky,type);
                
                in.nextLine();
                
                
                        
                        
            
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void changePlace(int fl, int ky){
        place[fl][ky] = false;
    }
    public gui_main(){
        initComponents();
        deleteUN();
        
    }
    
    public String currentType;
    public String plaque;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(16, 46, 110));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("New entrance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(16, 46, 110));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Parking area");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\FIRAT\\Desktop\\java proje\\trash\\111.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jTabbedPane2.setOpaque(true);

        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton6.setText("A1-1-C");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton7.setText("A1-2-C");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton8.setText("A1-3-C");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton9.setText("A1-4-C");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton10.setText("A1-5-C");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton11.setText("A1-6-M");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton12.setText("A1-7-M");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton13.setText("A1-8-M");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton14.setText("A1-9-M");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton15.setText("A1-10-M");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton16.setText("A1-12-T");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton17.setText("A1-11-T");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton18.setText("A1-14-T");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton19.setText("A1-15-T");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton20.setText("A1-13-T");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Floor 1", jPanel5);

        jButton21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton21.setText("A2-1-C");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton22.setText("A2-2-C");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton23.setText("A2-3-C");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton24.setText("A2-4-C");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton25.setText("A2-15-T");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton26.setText("A2-11-T");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton27.setText("A2-12-T");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton28.setText("A2-13-T");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton29.setText("A2-14-T");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton30.setText("A2-10-M");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton31.setText("A2-9-M");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton32.setText("A2-8-M");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton33.setText("A2-7-M");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton34.setText("A2-6-M");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton35.setText("A2-5-C");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Floor 2", jPanel6);

        jButton36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton36.setText("A3-1-C");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton37.setText("A3-2-C");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton38.setText("A3-3-C");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton39.setText("A3-4-C");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton40.setText("A3-15-T");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton41.setText("A3-11-T");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton42.setText("A3-12-T");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton43.setText("A3-13-T");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton44.setText("A3-14-T");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton45.setText("A3-10-M");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton46.setText("A3-9-M");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton47.setText("A3-8-M");
        jButton47.setToolTipText("");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton48.setText("A3-7-M");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton49.setText("A3-6-M");
        jButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton49MousePressed(evt);
            }
        });
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton50.setText("A3-5-C");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Floor 3", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Plate :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("12.00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("0$");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Leave Time : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("2 Hours");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("06HS21");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Entrance Time :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("14.00");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Total Time :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Vehicle Type :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Total Cost :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Car");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel7))))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Type :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Plate :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Truck", "Motorcycle" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton4.setText("Register");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, -46, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTabbedPane1.setSelectedIndex(0);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTabbedPane1.setSelectedIndex(2);
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        currentType = (String) jComboBox2.getSelectedItem();
        System.out.println(currentType);
        
    }//GEN-LAST:event_jComboBox2ActionPerformed
    private void placeHold(int a){
        if(a==1){
            jButton7.setText("06HS25 Car");
            jButton7.setBackground(new java.awt.Color(220,20,60));
        }
    }
    public void write(String plate, int floor, int key, String type){
        try{
        File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
        FileWriter w = new FileWriter(f,true);
        PrintWriter p = new PrintWriter(w);
        LocalDateTime now = LocalDateTime.now();
        String nowString = now.toString();
        p.append(plate);
        p.append("\n");
        p.append(nowString);
        p.append("\n");
        p.append(String.valueOf(floor));
        p.append("\n");
        p.append(String.valueOf(key));
        p.append("\n");
        p.append(type);
        p.append("\n");
        p.append("-");
        p.append("\n");
        p.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1ActionPerformed(evt);
        if(plaque!=null){
        if(currentType.equals("Truck")){
            Truck t = new Truck(plaque);
            boolean b = true;
            for(int i=0; i<3; i++){
                if(b){
                for(int j=10; j<15; j++){
                    if(place[i][j]==true){
                        place[i][j] = false;
                        b=false;
                        if(i==0){
                           
                          if(j==10){
                              jButton17.setText(plaque);
                              jButton17.setBackground(new java.awt.Color(220,20,60));
                              
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              
                              break;
                          }  
                          else if(j==11){
                              jButton16.setText(plaque);
                              jButton16.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==12){
                              jButton20.setText(plaque);
                              jButton20.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==13){
                              jButton18.setText(plaque);
                              jButton18.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==14){
                              jButton19.setText(plaque);
                              jButton19.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                        }
                        else if(i==1){
                            
                          if(j==10){
                              jButton26.setText(plaque);
                              jButton26.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==11){
                             jButton27.setText(plaque);
                              jButton27.setBackground(new java.awt.Color(220,20,60)); 
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==12){
                              jButton28.setText(plaque);
                              jButton28.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==13){
                              jButton29.setText(plaque);
                              jButton29.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==14){
                              jButton25.setText(plaque);
                              jButton25.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                        }
                        else if(i==2){
                            
                          if(j==10){
                              jButton41.setText(plaque);
                              jButton41.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==11){
                              jButton42.setText(plaque);
                              jButton42.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==12){
                              jButton43.setText(plaque);
                              jButton43.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==13){
                              jButton44.setText(plaque);
                              jButton44.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==14){
                              jButton40.setText(plaque);
                              jButton40.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"TRUCK");
                              plates[i][j] = plaque;
                              break;
                          }
                        }
                    }
                    
                }
                }  
            }
            
            if(b){
                JOptionPane.showMessageDialog(this, "Parking area is full For Trucks");
            }
            
        }
        else if(currentType.equals("Car")){
            Car c = new Car(plaque);
            boolean b = true;
            for(int i=0; i<3; i++){
                if(b){
                for(int j=0; j<5; j++){
                    if(place[i][j]==true){
                        place[i][j] = false;
                        b=false;
                        if(i==0){
                           
                          if(j==0){
                              jButton6.setText(plaque);
                              jButton6.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");
                              plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==1){
                              jButton7.setText(plaque);
                              jButton7.setBackground(new java.awt.Color(220,20,60));
                               write(plaque,i,j,"CAR");
                               plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==2){
                              jButton8.setText(plaque);
                              jButton8.setBackground(new java.awt.Color(220,20,60));
                               write(plaque,i,j,"CAR");
                               plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==3){
                              jButton9.setText(plaque);
                              jButton9.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");
                              plates[i][j] = plaque;
                              break;
                          }
                          else if(j==4){
                              jButton10.setText(plaque);
                              jButton10.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");
                              plates[i][j] = plaque;
                              break;
                          }
                        }
                        else if(i==1){
                            
                           if(j==0){
                              jButton21.setText(plaque);
                              jButton21.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");
                              plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==1){
                              jButton22.setText(plaque);
                              jButton22.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");
                              plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==2){
                              jButton23.setText(plaque);
                              jButton23.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");
                              plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==3){
                              jButton24.setText(plaque);
                              jButton24.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");plates[i][j] = plaque;
                              break;
                          }
                          else if(j==4){
                              jButton35.setText(plaque);
                              jButton35.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");plates[i][j] = plaque;
                              break;
                          }
                        }
                        else if(i==2){
                            
                           if(j==0){
                              jButton36.setText(plaque);
                              jButton36.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==1){
                              jButton37.setText(plaque);
                              jButton37.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==2){
                              jButton38.setText(plaque);
                              jButton38.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==3){
                              jButton39.setText(plaque);
                              jButton39.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"CAR");plates[i][j] = plaque;
                              break;
                          }
                          else if(j==4){
                              jButton50.setText(plaque);
                              jButton50.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                        }
                    }
                    
                }
                }  
            }
            
            if(b){
                JOptionPane.showMessageDialog(this, "Parking area is full For Cars");
            }
        }
        else if(currentType.equals("Motorcycle")){
            Motorcycle m = new Motorcycle(plaque);
            boolean b = true;
            for(int i=0; i<3; i++){
                if(b){
                for(int j=5; j<10; j++){
                    if(place[i][j]==true){
                        place[i][j] = false;
                        b=false;
                        if(i==0){
                           
                          if(j==5){
                              jButton11.setText(plaque);
                              jButton11.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==6){
                              jButton12.setText(plaque);
                              jButton12.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==7){
                              jButton13.setText(plaque);
                              jButton13.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==8){
                              jButton14.setText(plaque);
                              jButton14.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                          else if(j==9){
                              jButton15.setText(plaque);
                              jButton15.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                        }
                        else if(i==1){
                            
                          if(j==5){
                              jButton34.setText(plaque);
                              jButton34.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==6){
                              jButton33.setText(plaque);
                              jButton33.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==7){
                              jButton32.setText(plaque);
                              jButton32.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==8){
                              jButton31.setText(plaque);
                              jButton31.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                          else if(j==9){
                              jButton30.setText(plaque);
                              jButton30.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                        }
                        else if(i==2){
                            
                          if(j==5){
                              jButton49.setText(plaque);
                              jButton49.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }  
                          else if(j==6){
                              jButton48.setText(plaque);
                              jButton48.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                             
                          }
                          else if(j==7){
                              jButton47.setText(plaque);
                              jButton47.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                              
                          }
                          else if(j==8){
                              jButton46.setText(plaque);
                              jButton46.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                          else if(j==9){
                              jButton45.setText(plaque);
                              jButton45.setBackground(new java.awt.Color(220,20,60));
                              write(plaque,i,j,"MOTORCYCLE");plates[i][j] = plaque;
                              break;
                          }
                        }
                    }
                    
                }
                }  
            }
            
            if(b){
                JOptionPane.showMessageDialog(this, "Parking area is full For Motorcycles");
            }
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        plaque = jTextField1.getText();
        plaque = plaque.toUpperCase();
        System.out.println(plaque);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton49MousePressed

    }//GEN-LAST:event_jButton49MousePressed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        if(place[2][6]==false){
        String plate = plates[2][6];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[2][6] = true;
            jButton48.setText("A3-7-M");
            jButton48.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        if(place[2][7]==false){
        String plate = plates[2][7];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[2][7] = true;
            jButton47.setText("A3-8-M");
            jButton47.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        if(place[2][8]==false){
        String plate = plates[2][8];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[2][8] = true;
            jButton46.setText("A3-9-M");
            jButton46.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        if(place[2][9]==false){
        String plate = plates[2][9];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[2][9] = true;
            jButton45.setText("A3-10-M");
            jButton45.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        if(place[2][13]==false){
        String plate = plates[2][13];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[2][13] = true;
            jButton44.setText("A3-14-T");
            jButton44.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        if(place[2][12]==false){
        String plate = plates[2][12];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[2][12] = true;
            jButton44.setText("A3-13-T");
            jButton44.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        if(place[2][11]==false){
        String plate = plates[2][11];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[2][11] = true;
            jButton42.setText("A3-12-T");
            jButton42.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        if(place[2][10]==false){
        String plate = plates[2][10];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[2][10] = true;
            jButton41.setText("A3-11-T");
            jButton41.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        if(place[2][14]==false){
        String plate = plates[2][14];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[2][14] = true;
            jButton40.setText("A3-15-T");
            jButton40.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if(place[2][1]==false){
        String plate = plates[2][1];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[2][1] = true;
            jButton37.setText("A3-2-C");
            jButton37.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if(place[2][0]==false){
        String plate = plates[2][0];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[2][0] = true;
            jButton36.setText("A3-1-C");
            jButton36.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if(place[1][6]==false){
        String plate = plates[1][6];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
           jLabel15.setText("Motorcycle");
            
            place[1][6] = true;
            jButton33.setText("A2-7-M");
            jButton33.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        if(place[1][7]==false){
        String plate = plates[1][7];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[1][7] = true;
            jButton32.setText("A2-8-M");
            jButton32.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if(place[1][8]==false){
        String plate = plates[1][8];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[1][8] = true;
            jButton31.setText("A2-9-M");
            jButton31.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if(place[1][9]==false){
        String plate = plates[1][9];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[1][9] = true;
            jButton30.setText("A2-10-M");
            jButton30.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        if(place[1][13]==false){
        String plate = plates[1][13];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[1][13] = true;
            jButton29.setText("A2-14-T");
            jButton29.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        if(place[1][12]==false){
        String plate = plates[1][12];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[1][12] = true;
            jButton28.setText("A2-13-T");
            jButton28.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if(place[1][11]==false){
        String plate = plates[1][11];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[1][11] = true;
            jButton27.setText("A2-12-T");
            jButton27.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if(place[1][10]==false){
        String plate = plates[1][10];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[1][10] = true;
            jButton26.setText("A2-11-T");
            jButton26.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(place[1][14]==false){
        String plate = plates[1][14];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[1][14] = true;
            jButton25.setText("A2-15-T");
            jButton25.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here
        if(place[1][1]==false){
        String plate = plates[1][1];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[1][1] = true;
            jButton22.setText("A2-2-C");
            jButton22.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if(place[1][0]==false){
        String plate = plates[1][0];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[1][0] = true;
            jButton21.setText("A2-1-C");
            jButton21.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }         
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if(place[0][12]==false){
        String plate = plates[0][12];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[0][12] = true;
            jButton20.setText("A1-13-T");
            jButton20.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if(place[0][14]==false){
        String plate = plates[0][14];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[0][14] = true;
            jButton19.setText("A1-15-T");
            jButton19.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(place[0][13]==false){
        String plate = plates[0][13];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[0][13] = true;
            jButton18.setText("A1-14-T");
            jButton18.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(place[0][10]==false){
        String plate = plates[0][10];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[0][10] = true;
            jButton17.setText("A1-10-T");
            jButton17.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton17ActionPerformed
    
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(place[0][11]==false){
        String plate = plates[0][11];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Truck");
            place[0][11] = true;
            jButton16.setText("A1-11-T");
            jButton16.setBackground(null);
            double totalCost = 20*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
            if(place[0][9]==false){
        String plate = plates[0][9];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[0][9] = true;
            jButton15.setText("A1-10-M");
            jButton15.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(place[0][8]==false){
        String plate = plates[0][8];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[0][8] = true;
            jButton14.setText("A1-9-M");
            jButton14.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(place[0][7]==false){
        String plate = plates[0][7];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[0][7] = true;
            jButton13.setText("A1-8-M");
            jButton13.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(place[0][6]==false){
        String plate = plates[0][6];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[0][6] = true;
            jButton12.setText("A1-7-M");
            jButton12.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(place[0][1]==false){
        String plate = plates[0][1];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[0][1] = true;
            jButton7.setText("A1-2-C");
            jButton7.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        //06a1
                        //2020
                        //0
                        //0
                        //-
                        
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            
        if(place[0][0]==false){
        String plate = plates[0][0];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[0][0] = true;
            jButton6.setText("A1-1-C");
            jButton6.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        if(place[2][2]==false){
        String plate = plates[2][2];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[2][2] = true;
            jButton38.setText("A3-3-C");
            jButton38.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
       if(place[1][4]==false){
        String plate = plates[1][4];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[1][4] = true;
            jButton35.setText("A2-5-C");
            jButton35.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(place[0][2]==false){
        String plate = plates[0][2];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[0][2] = true;
            jButton8.setText("A1-3-C");
            jButton8.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(place[0][3]==false){
        String plate = plates[0][3];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[0][3] = true;
            jButton9.setText("A1-4-C");
            jButton9.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(place[0][4]==false){
        String plate = plates[0][4];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[0][4] = true;
            jButton10.setText("A1-5-C");
            jButton10.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(place[1][2]==false){
        String plate = plates[1][2];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[1][2] = true;
            jButton23.setText("A2-3-C");
            jButton23.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if(place[1][3]==false){
        String plate = plates[1][3];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[1][3] = true;
            jButton24.setText("A2-4-C");
            jButton24.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        if(place[2][3]==false){
        String plate = plates[2][3];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel4.setText("Car");
            place[2][3] = true;
            jButton39.setText("A3-4-C");
            jButton39.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        if(place[2][4]==false){
        String plate = plates[2][4];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel5.setText("Motorcycle");
            place[2][4] = true;
            jButton50.setText("A3-5-C");
            jButton50.setBackground(null);
            double totalCost = 10*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(place[0][5]==false){
        String plate = plates[0][5];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[0][5] = true;
            jButton11.setText("A1-6-M");
            jButton11.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        if(place[1][5]==false){
        String plate = plates[1][5];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[1][5] = true;
            jButton34.setText("A2-6-M");
            jButton34.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        if(place[2][5]==false){
        String plate = plates[2][5];
            String entranceTime = findHour(plate);
           double totalHour = totalHourCalc(entranceTime);
           entranceTime = entranceTime.substring(11,16);
            jLabel3.setText(entranceTime);
            jLabel9.setText(plate);
            String total = String.valueOf(totalHour);
            total = total.substring(0,3) + " Hours";
            jLabel8.setText(total);
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.toString().substring(11,16);
            jLabel11.setText(nowString);
            jLabel15.setText("Motorcycle");
            place[2][5] = true;
            jButton49.setText("A3-6-M");
            jButton49.setBackground(null);
            double totalCost = 5*totalHour;
            String StotalCost = String.valueOf(totalCost).substring(0,3) + " $";
            jLabel4.setText(StotalCost);
            try{
                File f = new File("C:\\Users\\FIRAT\\Documents\\NetBeansProjects\\gui\\src\\main\\java\\file.txt");
                Scanner in = new Scanner(f);
                String ans="";
                while(in.hasNextLine()){
                    String temp = in.nextLine();
                    if(!temp.equals(plate)){
                        ans+=temp + "\n";
                    }else{
                        
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                        in.nextLine();
                    }
                }
                in.close();
                FileWriter fw = new FileWriter(f);
                PrintWriter p = new PrintWriter(fw);
                p.print(ans);
                p.close();
            
            }
            catch(Exception e){
                System.out.println("exp : " + e);
            }
            
            
            jTabbedPane1.setSelectedIndex(1);
        
        
        
    }    
    }//GEN-LAST:event_jButton49ActionPerformed
     int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run(){
                new gui_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
