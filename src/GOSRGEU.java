import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.xml.ws.handler.MessageContext;

import java.awt.Font;
import java.awt.event.ActionListener;


public class GOSRGEU {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GOSRGEU window = new GOSRGEU();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GOSRGEU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 379, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		
		JRadioButton radioButton = new JRadioButton("\u041C\u0435\u043D\u0435\u0434\u0436\u043C\u0435\u043D\u0442\u0430 \u0438 \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u043D\u0438\u043C\u0430\u0442\u0435\u043B\u044C\u0441\u0442\u0432\u0430");
		buttonGroup.add(radioButton);
		radioButton.setBounds(6, 40, 299, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0422\u043E\u0440\u0433\u043E\u0432\u043E\u0433\u043E \u0434\u0435\u043B\u0430");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(6, 66, 299, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u041A\u043E\u043C\u043F\u044C\u044E\u0442\u0435\u0440\u043D\u044B\u0445 \u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0439 \u0438 \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u043E\u0439 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(6, 92, 351, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\u0423\u0447\u0435\u0442\u043D\u043E-\u044D\u043A\u043E\u043D\u043E\u043C\u0438\u0447\u0435\u0441\u043A\u0438\u0439");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(6, 118, 299, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\u042D\u043A\u043E\u043D\u043E\u043C\u0438\u043A\u0438 \u0438 \u0444\u0438\u043D\u0430\u043D\u0441\u043E\u0432");
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(6, 144, 299, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439");
		buttonGroup.add(radioButton_5);
		radioButton_5.setBounds(6, 170, 299, 23);
		frame.getContentPane().add(radioButton_5);
		
		JLabel label = new JLabel("\u0424\u0430\u043A\u0443\u043B\u044C\u0442\u0435\u0442:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(16, 11, 149, 22);
		frame.getContentPane().add(label);
		
		JRadioButton radioButton_6 = new JRadioButton("\u041B\u0438\u043D\u0433\u0432\u0438\u0441\u0442\u0438\u043A\u0438 \u0438 \u0436\u0443\u0440\u043D\u0430\u043B\u0438\u0441\u0442\u0438\u043A\u0438");
		buttonGroup.add(radioButton_6);
		radioButton_6.setBounds(6, 196, 299, 23);
		frame.getContentPane().add(radioButton_6);
		
		JButton button = new JButton("\u0414\u0430\u043B\u0435\u0435");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_2.isSelected()){
					JOptionPane.showMessageDialog(frame, "piupiu");
				}
			}
		});
		button.setBounds(135, 228, 89, 23);
		frame.getContentPane().add(button);
		
		

		
		
	}
}
