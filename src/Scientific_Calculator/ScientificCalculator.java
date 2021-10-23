package Scientific_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField textDisplay;
	private JTextField jtextConverts;
	private JTextField button_textField1;
	private JTextField button_textField2;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	
	double[] i = new double[5];
	double Bangladesh_taka = 82.00;
	double India_rupee = 68.00;
	double USA_dollar = 1.00;
	double UK_pound = 0.76;
	double China_yuan = 6.69;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 850, 340);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 275, 367);
				textDisplay.setBounds(10, 11, 243, 37);
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientafic = new JMenuItem("Scientafic");
		mntmScientafic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 525, 367);
				textDisplay.setBounds(10, 11, 494, 37);
			}
		});
		mnFile.add(mntmScientafic);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Unit Conversion");
				frmStandardCalculator.setBounds(100, 100, 884, 367);
				textDisplay.setBounds(10, 11, 494, 37);
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);;
			}
		});
		mnFile.add(mntmExit);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setBounds(10, 11, 243, 37);
		frmStandardCalculator.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton button = new JButton("\u2190");
		button.setBounds(8, 51, 46, 37);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if (textDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length()-1);
					backspace = strB.toString();
					textDisplay.setText(backspace);
					
				}
			}
		});
		frmStandardCalculator.getContentPane().add(button);
		
		JButton button_root = new JButton("\u221A");
		button_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.sqrt(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_root.setBounds(207, 51, 46, 37);
		button_root.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_root);
		
		JButton button_plus_minus = new JButton("\u00B1");
		button_plus_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_plus_minus.setBounds(158, 51, 46, 37);
		button_plus_minus.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_plus_minus);
		
		JButton button_C = new JButton("C");
		button_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textDisplay.setText(null);
			}
		});
		button_C.setBounds(107, 51, 46, 37);
		button_C.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_C);
		
		JButton button_CE = new JButton("CE");
		button_CE.setBounds(57, 51, 50, 37);
		button_CE.setFont(new Font("Tahoma", Font.BOLD, 9));
		frmStandardCalculator.getContentPane().add(button_CE);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_7.getText();
				textDisplay.setText(INum);
			}
		});
		button_7.setBounds(8, 92, 46, 37);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_8.getText();
				textDisplay.setText(INum);
			}
		});
		button_8.setBounds(57, 92, 46, 37);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_9.getText();
				textDisplay.setText(INum);
			}
		});
		button_9.setBounds(107, 92, 46, 37);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_9);
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		button_div.setBounds(158, 92, 46, 37);
		button_div.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_div);
		
		JButton button_per = new JButton("%");
		button_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		button_per.setBounds(207, 92, 46, 37);
		button_per.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_per);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_4.getText();
				textDisplay.setText(INum);
			}
		});
		button_4.setBounds(10, 135, 46, 37);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_5.getText();
				textDisplay.setText(INum);
			}
		});
		button_5.setBounds(59, 135, 46, 37);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_6.getText();
				textDisplay.setText(INum);
			}
		});
		button_6.setBounds(109, 135, 46, 37);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_6);
		
		JButton button_mul = new JButton("*");
		button_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		button_mul.setBounds(160, 135, 46, 37);
		button_mul.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_mul);
		
		JButton button_one_by_x = new JButton("1/x");
		button_one_by_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.pow(ops,-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_one_by_x.setBounds(209, 135, 46, 37);
		button_one_by_x.setFont(new Font("Tahoma", Font.BOLD, 7));
		frmStandardCalculator.getContentPane().add(button_one_by_x);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_1.getText();
				textDisplay.setText(INum);
			}
		});
		button_1.setBounds(8, 177, 46, 37);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_2.getText();
				textDisplay.setText(INum);
			}
		});
		button_2.setBounds(57, 177, 46, 37);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_3.getText();
				textDisplay.setText(INum);
			}
		});
		button_3.setBounds(107, 177, 46, 37);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_3);
		
		JButton button_min = new JButton("-");
		button_min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		button_min.setBounds(158, 177, 46, 37);
		button_min.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_min);
		
		JButton button_equal = new JButton("=");
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textDisplay.getText());
				if (operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}
		});
		button_equal.setBounds(207, 177, 46, 79);
		button_equal.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_equal);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String INum = textDisplay.getText() + button_0.getText();
				textDisplay.setText(INum);
			}
		});
		button_0.setBounds(8, 219, 95, 37);
		button_0.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_0);
		
		JButton button_point = new JButton(".");
		button_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_point.setBounds(107, 219, 46, 37);
		button_point.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_point);
		
		JButton button_19 = new JButton("+");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		button_19.setBounds(158, 219, 46, 37);
		button_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmStandardCalculator.getContentPane().add(button_19);
		
		JButton button_Log = new JButton("Log");
		button_Log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.log(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Log.setBounds(270, 51, 52, 37);
		button_Log.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Log);
		
		JButton button_Sin = new JButton("Sin");
		button_Sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.sin(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Sin.setBounds(325, 51, 52, 37);
		button_Sin.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Sin);
		
		JButton button_Sinh = new JButton("Sinh");
		button_Sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.sinh(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Sinh.setBounds(380, 51, 56, 37);
		button_Sinh.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Sinh);
		
		JButton button_Mod = new JButton("Mod");
		button_Mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "Mod";	
			}
		});
		button_Mod.setBounds(438, 51, 57, 37);
		button_Mod.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Mod);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.log10(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnLnx.setBounds(440, 92, 54, 37);
		btnLnx.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(btnLnx);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.cosh(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setBounds(379, 92, 59, 37);
		btnCosh.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton button_Cos = new JButton("Cos");
		button_Cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.cos(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Cos.setBounds(325, 92, 52, 37);
		button_Cos.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Cos);
		
		JButton button_Pi = new JButton("\u03C0");
		button_Pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Pi.setBounds(270, 92, 52, 37);
		button_Pi.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Pi);
		
		JButton btnC = new JButton("Exp");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "Exp";	
			}
		});
		btnC.setBounds(442, 135, 52, 37);
		btnC.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(btnC);
		
		JButton button_Tanh = new JButton("Tanh");
		button_Tanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.tanh(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Tanh.setBounds(380, 135, 60, 37);
		button_Tanh.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Tanh);
		
		JButton button_Tan = new JButton("Tan");
		button_Tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.tan(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Tan.setBounds(325, 135, 54, 37);
		button_Tan.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Tan);
		
		JButton button_xofy = new JButton("x^y");
		button_xofy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.pow(ops,ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_xofy.setBounds(268, 135, 55, 37);
		button_xofy.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_xofy);
		
		JButton btnr = new JButton("2\u03C0r");
		btnr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnr.setBounds(440, 177, 55, 37);
		btnr.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(btnr);
		
		JButton button_Rund = new JButton("Rund");
		button_Rund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.round(ops);
				textDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_Rund.setBounds(380, 177, 60, 37);
		button_Rund.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Rund);
		
		JButton button_Cbr = new JButton("Cbr");
		button_Cbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.cbrt(ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_Cbr.setBounds(325, 177, 52, 37);
		button_Cbr.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Cbr);
		
		JButton button_xof2 = new JButton("x^2");
		button_xof2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = (ops * ops);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_xof2.setBounds(268, 177, 55, 37);
		button_xof2.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_xof2);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textDisplay.getText()); //Octal
				textDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setBounds(440, 219, 58, 37);
		btnOctal.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(btnOctal);
		
		JButton button_Hex = new JButton("Hex");
		button_Hex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textDisplay.getText()); //Hex
				textDisplay.setText(Integer.toString(a,16));
			}
		});
		button_Hex.setBounds(380, 219, 55, 37);
		button_Hex.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Hex);
		
		JButton button_Bin = new JButton("Bin");
		button_Bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textDisplay.getText()); //Binary
				textDisplay.setText(Integer.toString(a,2));
			}
		});
		button_Bin.setBounds(325, 219, 52, 37);
		button_Bin.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_Bin);
		
		JButton button_xof3 = new JButton("x^3");
		button_xof3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.pow(ops,3);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		button_xof3.setBounds(270, 219, 55, 37);
		button_xof3.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(button_xof3);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(519, 18, 342, 245);
		frmStandardCalculator.getContentPane().add(desktopPane);
		desktopPane.setLayout(null);
		
		jtextConverts = new JTextField();
		jtextConverts.setBounds(10, 11, 322, 36);
		jtextConverts.setHorizontalAlignment(SwingConstants.CENTER);
		jtextConverts.setFont(new Font("Tahoma", Font.BOLD, 26));
		jtextConverts.setText("Currency Converter");
		desktopPane.add(jtextConverts);
		jtextConverts.setColumns(10);
		
		button_textField1 = new JTextField();
		button_textField1.setBounds(80, 107, 186, 36);
		desktopPane.add(button_textField1);
		button_textField1.setColumns(10);
		
		JButton button_Convert = new JButton("Convert");
		button_Convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//double USA_dollar = Double.parseDouble(jtextConverts.getText());
				//if(button_comboBox.getSelectedItem().equals("Bangladesh"))
				//{
				//	String cCovert1 = String.format("T %.2f", USA_dollar*Bangladesh_taka);
				//	button_Convert.setText( cCovert1);
				//}
				
				
			}
		});
		button_Convert.setBounds(71, 201, 95, 33);
		desktopPane.add(button_Convert);
		
		JButton button_Clear = new JButton("Clear");
		button_Clear.setBounds(191, 201, 104, 33);
		desktopPane.add(button_Clear);
		
		button_textField2 = new JTextField();
		button_textField2.setBounds(81, 154, 185, 36);
		desktopPane.add(button_textField2);
		button_textField2.setColumns(10);
		
		JComboBox button_comboBox = new JComboBox();
		button_comboBox.setModel(new DefaultComboBoxModel(new String[] {"           Choose One...", "Bangladesh", "India", "USA", "UK", "China"}));
		button_comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_comboBox.setBounds(80, 58, 186, 41);
		desktopPane.add(button_comboBox);
	}
}
