import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	public static void main(String[] args) {
		ColorTeacher teacher = new ColorTeacher();
		teacher.popup();
	}

	void popup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		one.setBackground(Color.YELLOW);
		one.setOpaque(true);
		two.setBackground(Color.RED);
		two.setOpaque(true);
		three.setBackground(Color.BLUE);
		three.setOpaque(true);
		four.setBackground(Color.GREEN);
		four.setOpaque(true);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ((JButton) e.getSource() == one) {
			System.out.println("working");
			speak("yellow");
		} else if ((JButton) e.getSource() == two) {
			speak("red");
		} else if ((JButton) e.getSource() == three) {
			speak("blue");
		} else if ((JButton) e.getSource() == four) {
			speak("green");
		}
	}

	 void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
