
import javax.swing.*;

public class Frame extends JFrame {

	public Frame() {
		Menu pInicio;

		setBounds(300,300,825,505);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PIXEL WAR II");



		pInicio = new Menu();
		setBounds(100, 100, 1100, 700);
		getContentPane().add(pInicio);
		setVisible(true);
	}
}