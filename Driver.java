<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.util.*;
import java.io.*;

public class Driver extends JFrame{

    public static Dimension size = new Dimension(1000,730);
    public static String name = "BS";

    public Driver(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(size);
	setTitle(name);
	setLocationRelativeTo(null);//centers screen
	setResizable(false);
	setLayout(new GridLayout(1,1,0,0));
	//Panel p = new Panel(this);
	//add(p);
	setVisible(true);
	getContentPane().setBackground(Color.GREEN);
    }


    public static void main(String[] args){
	Driver d = new Driver();
    }




}
=======
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.util.*;
import java.io.*;

public class Driver extends JFrame{

    public static Dimension size = new Dimension(1000,730);
    public static String name = "BS";

    public Driver(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(size);
	setTitle(name);
	setLocationRelativeTo(null);//centers screen
	setResizable(false);
	setLayout(new GridLayout(1,1,0,0));
   	//Panel p = new Panel(this);
	//add(p);
	setVisible(true);
	Music m = new Music();
	m.play();
    }





    public static void main(String[] args){
	Driver d = new Driver();

    }




}

>>>>>>> FETCH_HEAD