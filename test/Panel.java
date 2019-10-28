package test;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author rodomod   28.10.2019
 */
public class Panel  extends JPanel {
    private static final long serialVersionUID = 0xfL;
    private JButton num[]=new JButton[10];
    private Font font=new Font("Tahoma",Font.PLAIN,13);
    private JTextField display=new JTextField();
	
    private JButton backspace=new JButton("C"),
    	    pow=new JButton("^3"),
    	    ops=new JButton("-/+"),
    	    pnt=new JButton("."),
    	    sum=new JButton("+"),
    	    sub=new JButton("-"),
    	    sqrt=new JButton("sqrt"),
    	    mul=new JButton("*"),
    	    div=new JButton("/"),
    	    eqals=new JButton("=");
    String operation = "+-*/";
    double sm,fm;

public Panel() {

	setLayout(null);
	setFocusable(true);
	grabFocus();

	
	backspace.setBounds(10, 250, 50, 50);
	backspace.setFont(font);
	backspace.addActionListener((ActionEvent e) -> {
	        String tmp;
	        tmp = display.getText();
	display.setText(tmp.substring(0, tmp.length() - 1));
	    }); 
	add(backspace);
	
	sum.setBounds(190, 70, 50, 50);
	sum.setFont(font);
	sum.addActionListener((ActionEvent e) -> {
		  fm = Double.parseDouble(display.getText()); 
          display.setText(""); 
          operation = "+";
	    });
	add(sum);
	
	sub.setBounds(190, 130, 50, 50);
	sub.setFont(font);
	sub.addActionListener((ActionEvent e) -> {
		  fm = Double.parseDouble(display.getText()); 
          display.setText(""); 
          operation = "-";
	    });
	add(sub);
	
	mul.setBounds(190, 190, 50, 50);
	mul.setFont(font);
	mul.addActionListener((ActionEvent e) -> {
		  fm = Double.parseDouble(display.getText()); 
          display.setText(""); 
          operation = "*";
	    });
	add(mul);
	
	div.setBounds(190, 250, 50, 50);
	div.setFont(font);
	div.addActionListener((ActionEvent e) -> {
		  fm = Double.parseDouble(display.getText()); 
          display.setText(""); 
          operation = "/";
	    });
	add(div);
	
	eqals.setBounds(190, 310, 50, 50);
    eqals.setFont(font);
	eqals.addActionListener((ActionEvent e)->{
        double sm = Double.parseDouble(display.getText()); 
switch(operation)  { 
            case "+" : display.setText(fm + sm + ""); 
       break; 
            case "-" : display.setText(fm - sm + ""); 
       break; 
            case "*" : display.setText(fm * sm + "");  
       break; 
            case "/" : display.setText(fm / sm + "");    
       break; 
               } 
	 });
	add(eqals);
	
	ops.setBounds(130, 250, 50, 50);
	ops.setFont(new Font("Tahoma",Font.PLAIN,9));
	ops.addActionListener((ActionEvent e) -> {
		 double op=Double.parseDouble(String.valueOf(display.getText()));
		  op*=-1D;
		  display.setText(String.valueOf(op));
	     });
	add(ops);
	
	  sqrt.setBounds(130, 310, 50, 50);
	  sqrt.setFont(new Font("Tahoma",Font.PLAIN,9));
	  sqrt.addActionListener((ActionEvent e) -> {
		    double xm = Double.parseDouble(display.getText()); 
		    double ym = Double.parseDouble(display.getText()); 
		    String str = display.getText(); 
		    if (str.indexOf("") == 0) { 
		        display.setText(Math.sqrt(xm*xm/ym)+ "");
		        }
	        });
	  add(sqrt);
	  
	  pow.setBounds(10, 310, 50, 50);
	  pow.setFont(font);
	  pow.addActionListener((ActionEvent e) -> {
		  double faq=Double.parseDouble(display.getText());
			String Pow=display.getText();
			if(Pow.indexOf("")==0){display.setText(Math.pow(faq,3)+"");}
	  });
	  add(pow);
	  
	  pnt.setBounds(70, 310, 50, 50);
	  pnt.setFont(new Font("Tahoma",Font.PLAIN,13));
	  pnt.addActionListener((ActionEvent e) -> {
	   String Pnt=display.getText();
	   if(!Pnt.contains("."))display.setText(display.getText()+".");
	  });
	  add(pnt);
  
  num[0]=new JButton("0");
  num[0].setBounds(70, 250, 50, 50);
  num[0].setFont(font);
  add(num[0]);
  
for(int x=0;x<3;x++) {
     for(int y=0;y<3;y++) {
	  num[x*3+y+1]=new JButton((x*3+y+1)+"");
	  num[x*3+y+1].setBounds(x*(50+10)+10, y*(50+10)+70, 50, 50);
	  num[x*3+y+1].setFont(font);
	  add(num[x*3+y+1]);
      }
  }
  display.setBounds(5, 10, 240, 50);
  display.setFont(new Font("Tahoma",Font.PLAIN,21));
  display.setHorizontalAlignment(SwingConstants.RIGHT);
  display.setEditable(false);
  add(display);
  
  ActionListener al=(ActionEvent e)-> {
      JButton b=(JButton)e.getSource();
      display.setText(display.getText()+b.getText());
  
      };
for(JButton b : num) {
    b.addActionListener(al);
  }
addKeyListener(new KeyAdapter() {
    @Override
 public void keyPressed(KeyEvent e) {
	char symbol=e.getKeyChar();
if(!Character.isDigit(symbol))
    return;
display.setText(display.getText()+symbol);
         }
});
	
    }

}
class Main {
    private final JFrame fr;
    public Main() {
	fr=new JFrame("Java'21'");
	fr.setSize(257,397);
	fr.add(new Panel());
	fr.setLocationRelativeTo(null);
	fr.setResizable(false);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.setVisible(true);
    }
    public static void main(String[] args) {
           SwingUtilities.invokeLater(() -> {
        Main main = new Main();
    });
}
    }
    