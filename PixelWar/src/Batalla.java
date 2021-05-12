import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

public class Batalla extends JPanel {
	private JTextField textField;
	private JSlider atk, def;
	private JTextField textField_cohete;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack, sumar2, restar2;
	private JComboBox comboBox;
	String characters[] = { null, };
	private JTextField txtMariano;
	private JTextField textField_3;
	private JProgressBar vida;
	int misilesAtck;
	int misilesDef;
	String ma = "0";
	String md = "0";
	int original = 0;
	int equipo = 0;
	ArrayList<String> resumen = new ArrayList<String>();
	int nmisiles;

	public Batalla(int cantidad, String tipos[], String nom[]) {
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		nmisiles = Equipo.getmisilestipo(tipos[equipo]);
		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(270, 42, 163, 40);
		add(textField);
		textField.setColumns(10);

		textField_cohete = new JTextField();
		textField_cohete.setText(nmisiles + "");
		textField_cohete.setEnabled(false);
		textField_cohete.setBounds(200, 200, 48, 47);
		add(textField_cohete);
		textField_cohete.setColumns(10);

		restar = new JButton("-");
		restar.setBounds(264, 263, 48, 47);
		add(restar);
		restar2 = new JButton("-");
		restar2.setBounds(514, 263, 48, 47);
		add(restar2);

		sumar = new JButton("+");
		sumar.setBounds(678, 263, 48, 47);
		add(sumar);

		sumar2 = new JButton("+");
		sumar2.setBounds(428, 263, 48, 47);
		add(sumar2);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText(ma);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(322, 263, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText(md);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(572, 263, 96, 46);
		add(textField_2);

		atk = new JSlider();
		atk.setMaximum(50);

		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setMaximum(50);

		def.setValue(0);
		def.setBounds(522, 340, 200, 26);

		atack = new JButton("atac");
		atack.setBounds(416, 409, 163, 76);
		add(atack);

		JLabel lblNewLabel_1 = new JLabel("atakc");
		lblNewLabel_1.setBounds(322, 137, 96, 83);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("def");
		lblNewLabel_1_1.setBounds(572, 137, 96, 83);
		add(lblNewLabel_1_1);

		comboBox = new JComboBox();

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
			String nob[] = { nom[0], nom[1], nom[2] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();

					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > nmisiles) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE " + nmisiles,
								"Error de misiles", 0);
					}

					if (num4 < nmisiles) {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < nmisiles + 1 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);

						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						
							textField.setText(nom[equipo+1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipoObj = equipoa;
							resumen.add(nom[equipo] + " a atacado con " + equipoma + " a " + equipoObj
									+ " y se ha defendido con " + equipomd + "\n");
						equipo1.hp=1;
						
						if (equipo == cantidad) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
						
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							
						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3], nom[4] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");

						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							textField.setText(nom[4]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 4) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[4] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3], nom[4], nom[5] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");

						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							textField.setText(nom[4]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 4) {
							textField.setText(nom[5]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[4] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 5) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[5] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3], nom[4], nom[5], nom[6] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");

						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							textField.setText(nom[4]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 4) {
							textField.setText(nom[5]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[4] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 5) {
							textField.setText(nom[6]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[5] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 6) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[6] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3], nom[4], nom[5], nom[6], nom[7] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");

						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							textField.setText(nom[4]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 4) {
							textField.setText(nom[5]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[4] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 5) {
							textField.setText(nom[6]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[5] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 6) {
							textField.setText(nom[7]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[6] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 7) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[7] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3], nom[4], nom[5], nom[6], nom[7], nom[8] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");

						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							textField.setText(nom[4]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 4) {
							textField.setText(nom[5]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[4] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 5) {
							textField.setText(nom[6]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[5] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 6) {
							textField.setText(nom[7]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[6] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 7) {
							textField.setText(nom[8]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[7] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 8) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[8] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
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
			String nob[] = { nom[0], nom[1], nom[2], nom[3], nom[4], nom[5], nom[6], nom[7], nom[8], nom[9] };
			this.characters = nob;
			textField.setText(nom[0]);
			comboBox.setModel(new DefaultComboBoxModel(characters));
			this.misilesAtck = Integer.parseInt(ma);
			this.misilesDef = Integer.parseInt(md);
			atack.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int num = Integer.valueOf(textField_1.getText());
					int num2 = Integer.valueOf(textField_2.getText());
					int num4 = num + num2;
					int num3 = Integer.valueOf(textField_cohete.getText());
					int mA = 0;
					mA = num + mA;
					int mD = 0;
					mD = num2 + mD;
					int cont = 0;
					num3 = num3 - num4;
					String equipoa = "";
					String s;
					String s1;
					s1 = s = (String) comboBox.getSelectedItem();
					if (s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo",
								0);
						cont++;
					}

					if (num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles",
								0);
					}

					if (num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if (num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}

					if (num4 < 51 && num4 > 0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if (tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if (equipo == 0) {
							textField.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");

						}
						if (equipo == 1) {
							textField.setText(nom[2]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 2) {
							textField.setText(nom[3]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 3) {
							textField.setText(nom[4]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[3] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 4) {
							textField.setText(nom[5]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[4] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 5) {
							textField.setText(nom[6]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[5] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 6) {
							textField.setText(nom[7]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[6] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 7) {
							textField.setText(nom[8]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[7] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 8) {
							textField.setText(nom[9]);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[8] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
						}
						if (equipo == 9) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa = s1;
							int equipoma = mA;
							int equipomd = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0] + " a atacado con " + equipoma + " a " + equipo1Obj
									+ " y se ha defendido con " + equipomd + "\n");
							finalizar(cantidad, tipos, nom);
						}
						equipo = equipo + 1;
						if (equipo < cantidad) {
							nmisiles = Equipo.getmisilestipo(tipos[equipo]);
						}
						textField_cohete.setText(Integer.toString(nmisiles));
					}
					cont = 0;
				}
			});
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);

				}
			});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck = Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
				}
			});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef = Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
				}
			});
			atk.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_1.setText(String.valueOf(atk.getValue()));
				}
			});
			add(atk);
			def.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				}
			});
			add(def);
		}

	}

	public void finalizar(int cantidad, String tipos[], String nom[]) {

		JFrame Marco = (JFrame) SwingUtilities.getWindowAncestor(this);
		Marco.remove(this);
		Marco.getContentPane().add(new FinalRonda(resumen, cantidad, tipos, nom));
		Marco.setVisible(true);

	}
}