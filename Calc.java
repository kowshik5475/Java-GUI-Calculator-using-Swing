import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.*;
class Calc implements ActionListener
{
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	static double a=0,b=0,result=0;
	static int operator=0;
	Calc()
		{
			f=new JFrame("Calculator");
			f.setIconImage(new ImageIcon("icon.png").getImage());
			t=new JTextField();
			b1=new JButton("1");
			b2=new JButton("2");
			b3=new JButton("3");
			b4=new JButton("4");
			b5=new JButton("5");
			b6=new JButton("6");
			b7=new JButton("7");
			b8=new JButton("8");
			b9=new JButton("9");
			b0=new JButton("0");
			bdiv=new JButton("/");
			bmul=new JButton("*");
			bsub=new JButton("-");
			badd=new JButton("+");
			bdec=new JButton(".");
			beq=new JButton("=");
			bdel=new JButton("Delete");
			bclr=new JButton("Clear");
			t.setBounds(60,50,290,50);
			b7.setBounds(50,110,60,50);
			b8.setBounds(120,110,60,50);
			b9.setBounds(190,110,60,50);
			bdiv.setBounds(260,110,60,50);
			b4.setBounds(50,180,60,50);
			b5.setBounds(120,180,60,50);
			b6.setBounds(190,180,60,50);
			bmul.setBounds(260,180,60,50);
			b1.setBounds(50,250,60,50);
			b2.setBounds(120,250,60,50);
			b3.setBounds(190,250,60,50);
			bsub.setBounds(260,250,60,50);
			bdec.setBounds(50,320,60,50);
			b0.setBounds(120,320,60,50);
			beq.setBounds(190,320,60,50);
			badd.setBounds(260,320,60,50);
			bdel.setBounds(70,390,110,50);
			bclr.setBounds(190,390,110,50);
			f.add(t);
			f.add(b7);
			f.add(b8);
			f.add(b9);
			f.add(bdiv);
			f.add(b4);
			f.add(b5);
			f.add(b6);
			f.add(bmul);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(bsub);
			f.add(bdec);
			f.add(b0);
			f.add(beq);
			f.add(badd);
			f.add(bdel);
			f.add(bclr);
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(450,600);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setResizable(false);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b0.addActionListener(this);
			badd.addActionListener(this);
			bdiv.addActionListener(this);
			bmul.addActionListener(this);
			bsub.addActionListener(this);
			bdec.addActionListener(this);
			beq.addActionListener(this);
			bdel.addActionListener(this);
			bclr.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
				t.setText(t.getText().concat("1"));
			if(e.getSource()==b2)
				t.setText(t.getText().concat("2"));
			if(e.getSource()==b3)
				t.setText(t.getText().concat("3"));
			if(e.getSource()==b4)
				t.setText(t.getText().concat("4"));
			if(e.getSource()==b5)
				t.setText(t.getText().concat("5"));
			if(e.getSource()==b6)
				t.setText(t.getText().concat("6"));
			if(e.getSource()==b7)
				t.setText(t.getText().concat("7"));
			if(e.getSource()==b8)
				t.setText(t.getText().concat("8"));
			if(e.getSource()==b9)
				t.setText(t.getText().concat("9"));
			if(e.getSource()==b0)
				t.setText(t.getText().concat("0"));
			if(e.getSource()==bdec)
				t.setText(t.getText().concat("."));
			if(e.getSource()==badd)
				{
					a=Double.parseDouble(t.getText());
					operator=1;
					t.setText("");
				}
			if(e.getSource()==bsub)
				{
					a=Double.parseDouble(t.getText());
					operator=2;
					t.setText("");
				}
			if(e.getSource()==bmul)
				{
					a=Double.parseDouble(t.getText());
					operator=3;
					t.setText("");
				}
			if(e.getSource()==bdiv)
				{
					a=Double.parseDouble(t.getText());
					operator=4;
					t.setText("");
				}
			if(e.getSource()==beq)
				{
					b=Double.parseDouble(t.getText());
					switch(operator)
						{
							case 1: result=a+b; 
									break;
							case 2: result=a-b;
									break;
							case 3: result=a*b;
									break;
							case 4: result=a/b;
									break;
							default: result=0;
						}
					t.setText(""+result);
				}
			if(e.getSource()==bclr) t.setText("");
			if(e.getSource()==bdel)
				{
					String s=t.getText();
					t.setText("");
					for(int i=0;i<s.length()-1;i++) t.setText(t.getText()+s.charAt(i));
				}
		}
	public static void main(String...s)
		{
			new Calc();
		}
}