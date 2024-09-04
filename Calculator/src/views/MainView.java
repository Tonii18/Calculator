package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField screen;
	
	private ArrayList<JButton> buttons = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 590);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(71, 71, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel textPanel = new JPanel();
		textPanel.setBorder(null);
		textPanel.setBackground(new Color(184, 184, 184));
		textPanel.setBounds(10, 20, 326, 76);
		contentPane.add(textPanel);
		textPanel.setLayout(null);
		
		screen = new JTextField();
		screen.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		screen.setBorder(null);
		screen.setMargin(new Insets(2, 2, 2, 15));
		screen.setText("0");
		screen.setEditable(false);  // Make the text field non-editable
        screen.setFocusable(false);  // Prevent the field from gaining focus
        screen.setCursor(null);
		screen.setForeground(new Color(255, 255, 255));
		screen.setFont(new Font("Inter 28pt Black", Font.PLAIN, 45));
		screen.setBackground(new Color(184, 184, 184));
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setBounds(10, 10, 306, 56);
		textPanel.add(screen);
		screen.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(104, 104, 104));
		panel.setBounds(10, 121, 326, 422);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton zero = new JButton("  0");
		zero.setForeground(new Color(255, 255, 255));
		zero.setBorder(null);
		zero.setBackground(new Color(174, 168, 168));
		zero.setHorizontalAlignment(SwingConstants.LEFT);
		zero.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		zero.setBounds(14, 350, 135, 55);
		panel.add(zero);
		
		JButton coma = new JButton("  ,");
		coma.setActionCommand(",");
		coma.setHorizontalAlignment(SwingConstants.LEFT);
		coma.setForeground(Color.WHITE);
		coma.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		coma.setBorder(null);
		coma.setBackground(new Color(174, 168, 168));
		coma.setBounds(161, 350, 60, 55);
		panel.add(coma);
		
		JButton equal = new JButton("=");
		equal.setForeground(Color.WHITE);
		equal.setFont(new Font("Inter 28pt Black", Font.PLAIN, 30));
		equal.setBorder(null);
		equal.setBackground(new Color(12, 237, 196));
		equal.setBounds(248, 287, 68, 118);
		panel.add(equal);
		
		JButton division = new JButton("/");
		division.setForeground(Color.WHITE);
		division.setFont(new Font("Inter 28pt Black", Font.PLAIN, 30));
		division.setBorder(null);
		division.setBackground(new Color(255, 153, 0));
		division.setBounds(248, 32, 68, 50);
		panel.add(division);
		
		JButton product = new JButton("X");
		product.setForeground(Color.WHITE);
		product.setFont(new Font("Inter 28pt Black", Font.PLAIN, 30));
		product.setBorder(null);
		product.setBackground(new Color(255, 153, 0));
		product.setBounds(248, 92, 68, 50);
		panel.add(product);
		
		JButton minus = new JButton("-");
		minus.setForeground(Color.WHITE);
		minus.setFont(new Font("Inter 28pt Black", Font.PLAIN, 30));
		minus.setBorder(null);
		minus.setBackground(new Color(255, 153, 0));
		minus.setBounds(248, 152, 68, 50);
		panel.add(minus);
		
		JButton sum = new JButton("+");
		sum.setForeground(Color.WHITE);
		sum.setFont(new Font("Inter 28pt Black", Font.PLAIN, 30));
		sum.setBorder(null);
		sum.setBackground(new Color(255, 153, 0));
		sum.setBounds(248, 212, 68, 50);
		panel.add(sum);
		
		JButton one = new JButton("1");
		one.setForeground(Color.WHITE);
		one.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		one.setBorder(null);
		one.setBackground(new Color(174, 168, 168));
		one.setBounds(14, 271, 60, 55);
		panel.add(one);
		
		JButton three = new JButton("3");
		three.setForeground(Color.WHITE);
		three.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		three.setBorder(null);
		three.setBackground(new Color(174, 168, 168));
		three.setBounds(160, 271, 60, 55);
		panel.add(three);
		
		JButton two = new JButton("2");
		two.setForeground(Color.WHITE);
		two.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		two.setBorder(null);
		two.setBackground(new Color(174, 168, 168));
		two.setBounds(87, 271, 60, 55);
		panel.add(two);
		
		JButton four = new JButton("4");
		four.setForeground(Color.WHITE);
		four.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		four.setBorder(null);
		four.setBackground(new Color(174, 168, 168));
		four.setBounds(14, 197, 60, 55);
		panel.add(four);
		
		JButton five = new JButton("5");
		five.setForeground(Color.WHITE);
		five.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		five.setBorder(null);
		five.setBackground(new Color(174, 168, 168));
		five.setBounds(87, 197, 60, 55);
		panel.add(five);
		
		JButton six = new JButton("6");
		six.setForeground(Color.WHITE);
		six.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		six.setBorder(null);
		six.setBackground(new Color(174, 168, 168));
		six.setBounds(160, 197, 60, 55);
		panel.add(six);
		
		JButton seven = new JButton("7");
		seven.setForeground(Color.WHITE);
		seven.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		seven.setBorder(null);
		seven.setBackground(new Color(174, 168, 168));
		seven.setBounds(14, 121, 60, 55);
		panel.add(seven);
		
		JButton eight = new JButton("8");
		eight.setForeground(Color.WHITE);
		eight.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		eight.setBorder(null);
		eight.setBackground(new Color(174, 168, 168));
		eight.setBounds(87, 121, 60, 55);
		panel.add(eight);
		
		JButton nine = new JButton("9");
		nine.setForeground(Color.WHITE);
		nine.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		nine.setBorder(null);
		nine.setBackground(new Color(174, 168, 168));
		nine.setBounds(160, 121, 60, 55);
		panel.add(nine);
		
		JButton erase = new JButton("  ");
		erase.setHorizontalAlignment(SwingConstants.RIGHT);
		erase.setForeground(Color.WHITE);
		erase.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		erase.setBorder(null);
		erase.setBackground(new Color(255, 83, 114));
		erase.setIcon(new ImageIcon(getClass().getResource("/Delete.png")));
		erase.setBounds(14, 32, 135, 55);
		panel.add(erase);
		
		JButton delete = new JButton("C");
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Inter 28pt Black", Font.PLAIN, 35));
		delete.setBorder(null);
		delete.setBackground(new Color(69, 69, 69));
		delete.setBounds(161, 32, 60, 55);
		panel.add(delete);
		
		buttons.add(zero);
		buttons.add(coma);
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(erase);
		buttons.add(delete);
		buttons.add(equal);
		buttons.add(sum);
		buttons.add(minus);
		buttons.add(product);
		buttons.add(division);
		
		//Bucle For para controlar el pulsado de las teclas
		
		for(int i = 0; i < buttons.size(); i++) {
			buttons.get(i).addKeyListener(new KeyAdapter() {
			    @Override
			    public void keyTyped(KeyEvent e) {
			        char keyChar = e.getKeyChar();

			        // If the screen shows "0" and a digit is typed, clear the "0"
			        if (screen.getText().equals("0") && Character.isDigit(keyChar)) {
			            screen.setText(""); // Clear "0" before adding a new digit
			        }

			        // Append the digit to the screen
			        if (Character.isDigit(keyChar)) {
			            screen.setText(screen.getText() + keyChar);
			        }
			    }
			    
			    @Override
			    public void keyPressed(KeyEvent e) {
			        // Handle Backspace key
			        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			            String currentText = screen.getText();

			            if (currentText.length() == 1) {
			                screen.setText("0");  // Set to "0" when the last character is deleted
			            } else if (currentText.length() > 1) {
			                screen.setText(currentText.substring(0, currentText.length() - 1));
			            }
			            e.consume(); // Prevent further processing of the event
			        }
			    }
			});
			
			buttons.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clickedButton = (JButton)e.getSource();
					String buttonText = clickedButton.getText();
					
					if(buttonText.equals("C")) {
						screen.setText("0");
					}else if(buttonText.equals("  ")) {
						if(screen.getText().length() == 1) {
							screen.setText("0");
						}else {
							screen.setText(screen.getText().substring(0, screen.getText().length()-1));
						}
					}else {
						if (screen.getText().equals("0")) {
	                        screen.setText("");
	                    }
	                    screen.setText(screen.getText() + buttonText);
					}
				}
				
			});
		}
		
		// Resto de codigo
		
	}
}
