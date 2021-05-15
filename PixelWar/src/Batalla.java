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
import java.util.Random;
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
	ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	Random random  =new Random();
	int cantidades;
	int sub[];

	public Batalla(int cantidad, String tipos[], String nom[]) {
		cantidades = cantidad;
		int subi [] = new int[cantidades];
		sub = subi;
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
		atk.setMaximum(Equipo.getmisilestipo(tipos[equipo]));

		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setMaximum(Equipo.getmisilestipo(tipos[equipo]));

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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
			equipos.add(equipo5);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
			equipos.add(equipo5);
			equipos.add(equipo6);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
			equipos.add(equipo5);
			equipos.add(equipo6);
			equipos.add(equipo7);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
			equipos.add(equipo5);
			equipos.add(equipo6);
			equipos.add(equipo7);
			equipos.add(equipo8);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
			equipos.add(equipo5);
			equipos.add(equipo6);
			equipos.add(equipo7);
			equipos.add(equipo8);
			equipos.add(equipo9);
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
			equipos.add(equipo1);
			equipos.add(equipo2);
			equipos.add(equipo3);
			equipos.add(equipo4);
			equipos.add(equipo5);
			equipos.add(equipo6);
			equipos.add(equipo7);
			equipos.add(equipo8);
			equipos.add(equipo9);
			equipos.add(equipo10);
		}
		this.characters = nom;
		textField.setText(nom[0]);
		comboBox.setModel(new DefaultComboBoxModel(characters));
		this.misilesAtck = Integer.parseInt(ma);
		this.misilesDef = Integer.parseInt(md);
		atack.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int num = Integer.valueOf(textField_1.getText());
				int num2 = Integer.valueOf(textField_2.getText()) * 2;
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
					JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo", 0);
					cont++;
				}

				if (num4 > nmisiles) {
					JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE " + nmisiles + " Recuerda los misiles de defensa cuestan el doble",
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
					
					equipoa = s = (String) comboBox.getSelectedItem();
					int equipoma = mA;
					int equipomd = mD;
					int posicion = comboBox.getSelectedIndex();
					String equipoObj = equipoa;
					resumen.add(nom[equipo] + " a atacado con " + equipoma + " a " + equipoObj
							+ " y se ha defendido con " + equipomd + "\n");
					// aqui empieza el sistema de daño
					atacar(posicion, equipoma, equipomd, equipo, cantidad, tipos[equipo]);
					// Aqui acaba

					equipo = equipo + 1;
					if (equipo == cantidad) {
						JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
						finalizar(cantidad, tipos, nom);
						FinalRonda.contador++;
					}
					if (equipo < cantidad) {
						textField.setText(nom[equipo]);
						slider(tipos);
					}

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

	public void finalizar(int cantidad, String tipos[], String nom[]) {

		JFrame Marco = (JFrame) SwingUtilities.getWindowAncestor(this);
		Marco.remove(this);
		Marco.getContentPane().add(new FinalRonda(resumen, cantidad, tipos, nom));
		Marco.setVisible(true);

	}
	public void atacar(int enemigo, int equipoma, int equipomd, int tu, int cantidad, String tipo) {
		int cont = 0;
		int equi[] = new int[cantidad];
		int equiO[] = new int[cantidad];
		int previda [] = new int[cantidad];
		previda[cont] = equipos.get(tu).hp;
		equi[cont] = tu;
		equiO[cont] = enemigo;
		equipos.get(tu).misila = equipoma;
		equipos.get(tu).misild = equipomd;
		ataquesespeciales(tipo, tu, previda[tu], cantidad, enemigo);
		equipos.get(tu).hp = equipos.get(tu).hp + equipomd;
		equipos.get(enemigo).hp = equipos.get(enemigo).hp - equipoma;
		
		if(equipo == cantidad) {
			for(int i = 0; i < cantidad; i++) {
			if(sub[i] == equiO[i]+1 && sub[i] > 0) {
				equipos.get(equiO[i]).misila = 0;
				equipos.get(equiO[i]).misild = 0;
			}
			}
			for(int i = 0; i < cantidad; i++) {
				if(equipos.get(equi[i]).hp > previda[i]) {
					equipos.get(equi[i]).hp = previda[i];
				}
			}
			
		}
		cont++;
	}
	public void ataquesespeciales(String tipo, int a, int previda, int cantidad, int enemigo) {
		if(tipo.equals("Stickman")) {
			
		}
		if(tipo.equals("Link")) {
			int aleatorio = random.nextInt(100)+1;
			if(aleatorio <= 15) {
				equipos.get(a).misila = equipos.get(a).misila + 35;
			}
		}
		if(tipo.equals("Sonic")) {
			int aleatorio = random.nextInt(100)+1;
			if(aleatorio <= 10) {
				equipos.get(a).hp = previda;
			}
		}
		if(tipo.equals("Goku")) {
			int turno =FinalRonda.contador;
			if(turno == 5) {
				equipos.get(a).misila = equipos.get(a).misila + 25;
				turno = 0;
			}
		}
		if(tipo.equals("Creeper")) {
			if(equipos.get(a).hp <= 80) {
				
				
			}
			
		}
		if(tipo.equals("Pikachu")) {
			int aleatorio = random.nextInt(100)+1;
			if(aleatorio <= 30) {
				if(a-1 >= 0) {
					equipos.get(a-1).hp = equipos.get(a-1).hp - (equipos.get(a).hp/2);
				}
				if(a+1 < cantidad) {
					equipos.get(a+1).hp = equipos.get(a+1).hp - (equipos.get(a).hp/2);
				}
			}
			
		}
		if(tipo.equals("Donkey Kong")) {
			
		}
		if(tipo.equals("Sub-Zero")) {
			int aleatorio = random.nextInt(100)+1;
			if(aleatorio <= 10) {
				sub[equipo]=enemigo+1;
			}
		}
	}
	public void slider(String tipos[]) {
		atk.setMaximum(Equipo.getmisilestipo(tipos[equipo]));
		def.setMaximum(Equipo.getmisilestipo(tipos[equipo]));
	}
}
