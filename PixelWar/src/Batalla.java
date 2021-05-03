import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

public class Batalla extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack, sumar2, restar2;
	String characters[] = { null, };
	private JTextField txtMariano;
	private JTextField textField_3;
	private JProgressBar vida;

	/**
	 * Create the panel.
	 */
	public Batalla(int cantidad, String tipos[], String nom[]) {

		String tipo;
		String nombre;
		String a;
		if (cantidad == 3) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2]};
			this.characters = nob;
			int misilesAtck = textField_1.getText();
			int misilesDef = textField_2.getText();
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					misilesAtck--;
}});
			
		}
		if (cantidad == 4) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2], nom[3]};
			this.characters = nob;
		}
		if (cantidad == 5) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4]};
			this.characters = nob;
		}
		if (cantidad == 6) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5]};
			this.characters = nob;
		}
		if (cantidad == 7) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6]};
			this.characters = nob;
		}
		if (cantidad == 8) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			tipo = tipos[7];
			nombre = nom[7];
			Equipo equipo8 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6],nom[7]};
			this.characters = nob;
		}
		if (cantidad == 9) {

			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			tipo = tipos[7];
			nombre = nom[7];
			Equipo equipo8 = new Equipo(tipo, nombre);
			tipo = tipos[8];
			nombre = nom[8];
			Equipo equipo9 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6],nom[7],nom[8]};
			this.characters = nob;
		}
		if (cantidad == 10) {

			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			tipo = tipos[7];
			nombre = nom[7];
			Equipo equipo8 = new Equipo(tipo, nombre);
			tipo = tipos[8];
			nombre = nom[8];
			Equipo equipo9 = new Equipo(tipo, nombre);
			tipo = tipos[9];
			nombre = nom[9];
			Equipo equipo10 = new Equipo(tipo, nombre);
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6],nom[7],nom[8],nom[9]};
			this.characters = nob;
		}


		setBounds(100, 100, 1100, 700);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(270, 42, 163, 40);
		add(textField);
		textField.setColumns(10);

		restar = new JButton("-");
		restar.setBounds(264, 263, 48, 47);
		add(restar);
		restar2 = new JButton("-");
		restar2.setBounds(514, 263, 48, 47);
		add(restar2);

		sumar = new JButton("+");
		sumar.setBounds(678, 263, 48, 47);
		add(sumar);

		sumar2= new JButton("+");
		sumar2.setBounds(428, 263, 48, 47);
		add(sumar2);

		textField_1 = new JTextField();
		textField_1.setBounds(322, 263, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(572, 263, 96, 46);
		add(textField_2);

		atack = new JButton("atac");
		atack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		atack.setBounds(416, 409, 163, 76);
		add(atack);

		JLabel lblNewLabel_1 = new JLabel("atakc");
		lblNewLabel_1.setBounds(322, 137, 96, 83);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("def");
		lblNewLabel_1_1.setBounds(572, 137, 96, 83);
		add(lblNewLabel_1_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(characters));
		comboBox.setBounds(10, 373, 185, 22);
		add(comboBox);

		txtMariano = new JTextField();
		txtMariano.setText("Mariano");
		txtMariano.setBounds(866, 47, 129, 14);
		add(txtMariano);
		txtMariano.setColumns(10);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(866, 68, 146, 14);
		add(progressBar);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(816, 47, 40, 40);
		add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setText("Mariano");
		textField_3.setColumns(10);
		textField_3.setBounds(866, 127, 96, 14);
		add(textField_3);

		vida = new JProgressBar();
		vida.setBounds(866, 152, 146, 14);
		add(vida);

		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(866, 93, 72, 14);
		add(progressBar_2);

		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(816, 127, 40, 40);
		add(lblNewLabel_3_1);

		JLabel fondo = new JLabel("New label");
		fondo.setBounds(0, 0, 1100, 700);

		add(fondo);

	}
}