
import java.awt.EventQueue;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JustineBano {

	private JFrame frame;
	Random rand = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JustineBano window = new JustineBano();
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
	public JustineBano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 640);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image image = new ImageIcon("begEmoji.jpg").getImage();
		Image scaledImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
		
		JLabel imageLabel = new JLabel(icon);
		imageLabel.setBounds( 600, 200, 300, 300);
		frame.getContentPane().add(imageLabel);
		
		JButton yesButton = new JButton("Yes");
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		yesButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		yesButton.setBounds(260, 259, 105, 29);
		frame.getContentPane().add(yesButton);
		
		JButton noButton = new JButton("No");
		noButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = 30;
				int y = 1;
				noButton.setBounds(466, 258, 105 - x, 29 -y);
				noButton.setFont(new Font("Tahoma", Font.PLAIN, 17-y));
				
				int z = rand.nextInt(100, 800);
				int w = rand.nextInt(20, 400);
				yesButton.setBounds(z, w,105 + x, 29 + y);
				}
		});
		noButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		noButton.setBounds(466, 258, 105, 29);
		frame.getContentPane().add(noButton);
		
		JLabel lblNewLabel = new JLabel("Would you go out with me this friday?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(211, 184, 404, 30);
		frame.getContentPane().add(lblNewLabel);
	}
}