// Java“ü–å
// http://www5c.biglobe.ne.jp/~ecb/java/java00.html

import java.awt.*;
import java.awt.event.*;

class actiontest01 implements ActionListener{
	static Button btn1 = new Button("north");
	static Button btn2 = new Button("east");
	static Button btn3 = new Button("west");
	static Button btn4 = new Button("south");
	static Button btn5 = new Button("center");
	
	public actiontest01(){
		Frame frm = new Frame("18-13 example:ActionListener");
		frm.setLayout(new BorderLayout() );
		frm.setSize( new Dimension(200,100) );
		
		frm.add( btn1, BorderLayout.NORTH);
		frm.add( btn2, BorderLayout.EAST);
		frm.add( btn3, BorderLayout.WEST);
		frm.add( btn4, BorderLayout.SOUTH);
		frm.add( btn5, BorderLayout.CENTER);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		frm.setVisible(true);
	}
	
	public static void main( String args[]){
		new actiontest01();
	}
	
	
	public void actionPerformed( ActionEvent e ){
		System.out.print( e.getSource() );
		System.out.println(" ‚ª‰Ÿ‚³‚ê‚Ü‚µ‚½");
	}
}

