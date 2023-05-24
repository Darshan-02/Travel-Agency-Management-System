
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,deletePersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackage,bookPackage,viewPackage,viewHotels,destinations,bookHotels,viewBookedHotel;
    
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new  Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
       
       
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new  Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,50,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,30));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,100,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,150,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,140));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
       
        
        checkPackage = new JButton("Check Package");
        checkPackage.setBounds(0,200,300,50);
        checkPackage.setBackground(new Color(0,0,102));
        checkPackage.setForeground(Color.white);
        checkPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackage.setMargin(new Insets(0,0,0,110));
        checkPackage.addActionListener(this);
        p2.add(checkPackage);
        
        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0,250,300,50);
        bookPackage.setBackground(new Color(0,0,102));
        bookPackage.setForeground(Color.white);
        bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackage.setMargin(new Insets(0,0,0,120));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);
        
        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0,300,300,50);
        viewPackage.setBackground(new Color(0,0,102));
        viewPackage.setForeground(Color.white);
        viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackage.setMargin(new Insets(0,0,0,120));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setForeground(Color.white);
        viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewHotels.setMargin(new Insets(0,0,0,140));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);
        
        bookHotels = new JButton("Book Hotel");
        bookHotels.setBounds(0,400,300,50);
        bookHotels.setBackground(new Color(0,0,102));
        bookHotels.setForeground(Color.white);
        bookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookHotels.setMargin(new Insets(0,0,0,150));
        bookHotels.addActionListener(this);
        p2.add(bookHotels);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,450,300,50);
        viewBookedHotel.setBackground(new Color(0,0,102));
        viewBookedHotel.setForeground(Color.white);
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0,0,0,80));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        
        
        
        
        destinations = new JButton("Destination");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,140));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        
        
       
        
       
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0,  1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel Agency Management System");
        text.setBounds(500,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkPackage){
            new CheckPackage();
        }
        else if(ae.getSource()==bookPackage){
            new BookPackage(username);
        }
        else if(ae.getSource()==viewPackage){
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewHotels){
            new CheckHotels();
        }
        else if(ae.getSource()==destinations){
            new Destinations();
        }
        else if(ae.getSource()==bookHotels){
            new BookHotel(username);
        }
        else if(ae.getSource()==viewBookedHotel){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource()==deletePersonalDetails){
            new DeleteCustomer(username);
        }
        
    }
    
    public static void main(String[] args){
        new Dashboard("");
    }
}
