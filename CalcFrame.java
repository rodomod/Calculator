import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;

/**
 * 
 * @author rodomod
 *
 */
public class CalcFrame extends JFrame {   
 	
	private static final long serialVersionUID = 5422112077645876171L;
JTextArea  display=new JTextArea(); 
JPanel buttonPanel=new JPanel(new GridLayout(5,17));
JButton button0 = new JButton("0");
JButton button1 = new JButton("1");
JButton button2 = new JButton("2");
JButton button3 = new JButton("3");  
JButton button4 = new JButton("4");
JButton button5 = new JButton("5");
JButton button6 = new JButton("6");
JButton button7 = new JButton("7");
JButton button8 = new JButton("8");
JButton button9 = new JButton("9");
JButton buttonBack=new JButton("C");
JButton buttonSum=new JButton("+");
JButton buttonMul=new JButton("*");
JButton buttonDivide=new JButton("/");
JButton buttonSub=new JButton("-");	
JButton buttonStart=new JButton("=");
 
     String operation = "+,-,*,/";
	 double firstValue=0;

 
CalcFrame(){     
super("Calculator");
     
	      button0.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "0");   
		           }   
		         });
		   
		 
		   button1.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "1");   
		           }   
		         });
		  
		   
		   button2.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "2");   
		           }   
		         });
		  
		 
		   button3.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "3");   
		           }   
		         });  
		  
		   
		   button4.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "4");   
		           }   
		         });   
		
		   
		   button5.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "5");   
		           }   
		         });	   
		  
		   
		   button6.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "6");   
		           }   
		         });
		   
		   
		   button7.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "7");   
		           }   
		         });
		   
		  
		   button8.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "8");   
		           }   
		         });
		   
		   
		     button9.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + "9");   
		           }   
		         });
		    
		   buttonPanel.add(buttonBack);
        buttonBack.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		String temp=display.getText();
        		display.setText(temp.substring(0,temp.length()-1));
        	}
        });
      
        buttonPanel.add(buttonSum);
buttonSum.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.valueOf(display.getText());
		display.setText("");
		operation="+";
	}
});

buttonPanel.add(buttonMul);
buttonMul.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.valueOf(display.getText());
		display.setText("");
		operation="*";
	}
});

buttonPanel.add(buttonDivide);
buttonDivide.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.valueOf(display.getText());
		display.setText("");
		operation="/";
	}
});

buttonPanel.add(buttonSub);
buttonSub.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.valueOf(display.getText());
		display.setText("");
		operation="-";
	}
});


buttonPanel.add(buttonStart);
 buttonStart.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double secondValue=Double.valueOf(display.getText());
		if("+".equals(operation)){
			display.setText((firstValue+secondValue)+"");
		}
		if("-".equals(operation)){
			display.setText((firstValue-secondValue)+"");
		}
		if("*".equals(operation)){
			display.setText((firstValue*secondValue)+"");
		}
		if("/".equals(operation)){
			display.setText((firstValue/secondValue )+ "");
		}
		  operation ="+,-,*,/";
		 double firstValue=0;
	}
});
	
setBounds(300,300,300,300);
setLayout(new BorderLayout());
add(display,BorderLayout.NORTH);
add(buttonPanel,BorderLayout.CENTER);
add(buttonStart,BorderLayout.SOUTH);
 buttonPanel.add(button0);
 buttonPanel.add(button1);
 buttonPanel.add(button2);
 buttonPanel.add(button3);
 buttonPanel.add(button4);
 buttonPanel.add(button5);
 buttonPanel.add(button6);
 buttonPanel.add(button7);
 buttonPanel.add(button8);
 buttonPanel.add(button9);
 buttonPanel.add(buttonSum);
 buttonPanel.add(buttonSub);
 buttonPanel.add(buttonMul);
 buttonPanel.add(buttonBack);
 buttonPanel.add(buttonDivide);
 setVisible(true); 
        }
public static void main(String[]args){
	new CalcFrame();
         }
}