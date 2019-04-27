package calculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;


public class application extends JFrame {

	private JFrame frame;
	private JTextField textFieldoutPut;
	
	double firstnum;
	double secndnum;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application window = new application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		//String k=JOptionPane.showInputDialog(null,"hello future");
	}

	/**
	 * Create the application.
	 * 
	 */
	public application() {//method
		initialize();// Create the application.
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//window__________________________________________________________________________________
		frame = new JFrame("Calculator");//set te name
		frame.setBounds(100, 100, 299, 365);//x y hight weight
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit of the frame
		frame.getContentPane().setLayout(null);//show the window 
		//row 6____________________________________________________________________________________
		textFieldoutPut = new JTextField();
		textFieldoutPut.setBackground(Color.WHITE);//set the color to the text
		textFieldoutPut.setFont(new Font("Courier New", Font.BOLD, 16));//set the kind of letter, color and size
		textFieldoutPut.setBounds(5, 11, 268, 69);//set x y and size hight and wight
		frame.getContentPane().add(textFieldoutPut);//show the textfile
		textFieldoutPut.setColumns(10);//?
		//row 5____________________________________________________________________________________
		JButton btnAC = new JButton("AC");
		   btnAC.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				   textFieldoutPut.setText(null);
			   }
		   });
		btnAC.setBounds(5, 94, 65, 37);
		frame.getContentPane().add(btnAC);//show the button
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textFieldoutPut.getText());
				textFieldoutPut.setText("");
				operation="/";
			}
		});
		btnDivision.setBounds(74, 94, 65, 37);
		frame.getContentPane().add(btnDivision);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   firstnum=Double.parseDouble(textFieldoutPut.getText());
			   textFieldoutPut.setText("");
			   operation="*";
			}
		});
		btnMultiplication.setBounds(144, 94, 65, 37);
		frame.getContentPane().add(btnMultiplication);
		
		JButton btnDelete = new JButton("<=");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   String backspace=null;
			   				//number 12345>0
			      if(textFieldoutPut.getText().length()>0){
			    	       //gets the text
			    	 StringBuilder strB=new StringBuilder(textFieldoutPut.getText());
			    	      //delete char number -1
			    	 strB.deleteCharAt(textFieldoutPut.getText().length()-1);
			    	 	  //return to string
			    	 backspace=strB.toString();
			    	 	  //set to window
			    	 textFieldoutPut.setText(backspace);
			      }
			}
		});
		btnDelete.setBounds(212, 94, 65, 37);
		frame.getContentPane().add(btnDelete);
		//row 4__________________________________________________________________________________
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textFieldoutPut.getText());
				textFieldoutPut.setText("");
				operation="%";
			//	btnPercent.setEnabled(false);
			btnPercent.setEnabled(true);
			}
			
		});
		btnPercent.setBounds(213, 142, 65, 37);
		frame.getContentPane().add(btnPercent);
		
		JButton btnNine = new JButton("9");
		   btnNine.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {//action
		                         //box.get the number     //take the number name	    
					String inputD=textFieldoutPut.getText()+btnNine.getText();
									//send the number to window
					textFieldoutPut.setText(inputD);
			 }
		});
		btnNine.setBounds(144, 142, 65, 37);
		frame.getContentPane().add(btnNine);
		
		JButton btnEight = new JButton("8");
		   btnEight.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
            	String inputD=textFieldoutPut.getText()+btnEight.getText(); 
            	textFieldoutPut.setText(inputD);
             }
		});	
		btnEight.setBounds(74, 142, 65, 37);
		frame.getContentPane().add(btnEight);
		
		
		JButton btnSeven = new JButton("7");
		   btnSeven.addActionListener(new ActionListener() {//action
			  public void actionPerformed(ActionEvent arg0) {
				 String inputD=textFieldoutPut.getText()+btnSeven.getText();
				 textFieldoutPut.setText(inputD);
			  }
		});
		btnSeven.setBounds(5, 142, 65, 37);
		frame.getContentPane().add(btnSeven);
		
		//row 3__________________________________________________________________________________
		
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textFieldoutPut.getText());
				textFieldoutPut.setText("");
				operation="-";
				btnSubtraction.setEnabled(false);
			}
		});
		   btnSubtraction.setBounds(213, 190, 65, 37);
		frame.getContentPane().add(btnSubtraction);
		
		JButton btnSix = new JButton("6");
		    btnSix.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				 String inputD=textFieldoutPut.getText()+btnSix.getText();
				 textFieldoutPut.setText(inputD);
			   }
		});
		btnSix.setBounds(144, 190, 65, 37);
		frame.getContentPane().add(btnSix);
				
		JButton btnFive = new JButton("5");
		    btnFive.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
            	 String inputD=textFieldoutPut.getText()+btnFive.getText();
    		     textFieldoutPut.setText(inputD);

               }
		 });
		btnFive.setBounds(74, 190, 65, 37);
		frame.getContentPane().add(btnFive);
		
		JButton btnFour = new JButton("4");
			btnFour.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
					String inputD=textFieldoutPut.getText()+btnFour.getText();
				   	textFieldoutPut.setText(inputD);
			   }
		});
		   btnFour.setBounds(5, 190, 65, 37);
		frame.getContentPane().add(btnFour);
		//row 2____________________________________________________________________________________
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		                //casting text's number of the box	  
			   firstnum=Double.parseDouble(textFieldoutPut.getText());
			   textFieldoutPut.setText("");
			   operation="+";
		   }
		});
		btnSuma.setBounds(213, 238, 65, 37);
		frame.getContentPane().add(btnSuma);
		
		JButton btnThree= new JButton("3");
		   btnThree.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e){
				  String inputD=textFieldoutPut.getText()+btnThree.getText();
				  textFieldoutPut.setText(inputD);
			  }
		});
		btnThree.setBounds(145, 238, 65, 37);
		frame.getContentPane().add(btnThree);
		
		JButton btnTwo=new JButton("2");
		   btnTwo.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				   String inputD=textFieldoutPut.getText()+btnTwo.getText();
				   textFieldoutPut.setText(inputD);
			   }
		   });
		btnTwo.setBounds(74,238,65,37);
		frame.getContentPane().add(btnTwo);
		
		JButton btnOne= new JButton("1");
		   btnOne.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				   String inputD=textFieldoutPut.getText()+btnOne.getText();
				   textFieldoutPut.setText(inputD);
			   }
		   });
		btnOne.setBounds(5, 238, 65, 37);
		frame.getContentPane().add(btnOne);
		//row 1__________________________________________________________________________________
		
			
		JButton btnZero = new JButton("0");
		   btnZero.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				   String inputD=textFieldoutPut.getText()+btnZero.getText();
				   textFieldoutPut.setText(inputD);
			   }
		   });
		btnZero.setBounds(5, 286, 134, 37);
		frame.getContentPane().add(btnZero);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
											//has
				if(! textFieldoutPut.getText().contains(".")){
					textFieldoutPut.setText(textFieldoutPut.getText()+btnDot.getText());
				}
			}
		});
		btnDot.setBounds(144, 286, 65, 37);
		frame.getContentPane().add(btnDot);
		
		
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secndnum=Double.parseDouble(textFieldoutPut.getText());
				   if(operation=="+"){
					   result=firstnum+secndnum;
					   answer=String.format("%.2f", result);
					   textFieldoutPut.setText(answer);
				   }else if(operation=="-"){
					   result=firstnum-secndnum;
					   answer=String.format("%.2f", result);
					   textFieldoutPut.setText(answer);
				   }else if(operation=="*"){
					   result=firstnum*secndnum;
					   answer=String.format("%.2f", result);
					   textFieldoutPut.setText(answer);
				   }else if(operation=="/"){
					   result=firstnum/secndnum;
					   answer=String.format("%.2f",result);
					   textFieldoutPut.setText(answer);
				   }else if(operation=="%"){
					   result=firstnum%secndnum;
					   answer=String.format("%.2f", result);
					   textFieldoutPut.setText(answer);
				   }else if(operation=="."){
					   textFieldoutPut.setText(textFieldoutPut.getText()+".");
				   }
			}
		});
		btnEquals.setBounds(212, 286, 65, 37);
		frame.getContentPane().add(btnEquals);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
