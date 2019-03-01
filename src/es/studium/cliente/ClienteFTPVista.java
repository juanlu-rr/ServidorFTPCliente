package es.studium.cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ClienteFTPVista {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteFTPVista window = new ClienteFTPVista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ClienteFTPVista() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 298, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton btnNewButton_3 = new JButton("New button");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("New button");
		
		JButton btnNewButton_5 = new JButton("New button");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_4)
									.addGap(18)
									.addComponent(btnNewButton_5))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(btnNewButton)
										.addGap(18)
										.addComponent(btnNewButton_3))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_1)
										.addGap(18)
										.addComponent(btnNewButton_2)))))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
					.addGap(874))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_1))
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_3))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_5))
					.addContainerGap(381, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
