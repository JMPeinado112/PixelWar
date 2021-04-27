import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class Reglas extends JPanel implements ActionListener {

	private JButton volver, iz,de;
	private JLabel imgEq;
	private ArrayList<String> fotos = new ArrayList<String>();

	public Reglas() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);

		volver = new JButton("VOLVER");
		volver.setBounds(44, 580, 110, 50);
		add(volver);

		iz = new JButton("New button");
		iz.setBounds(79, 285, 75, 62);
		add(iz);

		de = new JButton("derecha");
		de.setBounds(964, 285, 75, 62);
		add(de);

		de.addActionListener(this);
		iz.addActionListener(this);
		volver.addActionListener(this);

		imgEq = new JLabel();
		imgEq.setBounds(164, 28, 790, 583);
		add(imgEq);

		fotos.add("pag1");
		fotos.add("pag2");
		fotos.add("pag3");
		fotos.add("pag4");
		fotos.add("pag5");



	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==volver) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Menu());
			Marco.setVisible(true);

		}


		do {
			for ( int i = 0; i < fotos.size(); i++)
			{
				
					imgEq=new JLabel(new ImageIcon("assets/fondos/"+ fotos.get(i)+".png"));
					imgEq.setBounds(164, 28, 790, 583);
					add(imgEq);

				
			}

		}while(e.getSource()==de);

	}
}



