
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Batalla extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack;
	private JProgressBar vida1;
	String characters[] = { null, "Stickman", "Mario", "Link", "Pikachu", "Donkey Kong", "Sonic", "Creeper", "Goku",
			"Ratchet & Clank", "Sub-Zero" };
	private JTextField txtMariano;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Create the panel.
	 */
	public Batalla() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);

		vida1 = new JProgressBar();
		vida1.setBounds(307, 120, 329, 53);
		add(vida1);

		textField = new JTextField();
		textField.setBounds(307, 47, 163, 40);
		add(textField);
		textField.setColumns(10);

		restar = new JButton("-");
		restar.setBounds(249, 415, 48, 47);
		add(restar);
		restar = new JButton("-");
		restar.setBounds(499, 415, 48, 47);
		add(restar);

		sumar = new JButton("+");
		sumar.setBounds(663, 415, 48, 47);
		add(sumar);

		sumar = new JButton("+");
		sumar.setBounds(413, 415, 48, 47);
		add(sumar);

		textField_1 = new JTextField();
		textField_1.setBounds(307, 415, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(557, 415, 96, 46);
		add(textField_2);

		atack = new JButton("atac");
		atack.setBounds(401, 561, 163, 76);
		add(atack);

		JLabel lblNewLabel_1 = new JLabel("atakc");
		lblNewLabel_1.setBounds(307, 289, 96, 83);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("def");
		lblNewLabel_1_1.setBounds(557, 289, 96, 83);
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

		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(866, 152, 146, 14);
		add(progressBar_1);

		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(866, 93, 72, 14);
		add(progressBar_2);

		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(816, 127, 40, 40);
		add(lblNewLabel_3_1);

		textField_4 = new JTextField();
		textField_4.setText("Mariano");
		textField_4.setColumns(10);
		textField_4.setBounds(866, 189, 129, 14);
		add(textField_4);

		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setBounds(866, 210, 146, 14);
		add(progressBar_3);

		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setBounds(816, 189, 40, 40);
		add(lblNewLabel_3_2);

		textField_5 = new JTextField();
		textField_5.setText("Mariano");
		textField_5.setColumns(10);
		textField_5.setBounds(866, 269, 96, 14);
		add(textField_5);

		JProgressBar progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setBounds(866, 294, 146, 14);
		add(progressBar_1_1);

		JProgressBar progressBar_2_1 = new JProgressBar();
		progressBar_2_1.setBounds(866, 235, 72, 14);
		add(progressBar_2_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1.setBounds(816, 269, 40, 40);
		add(lblNewLabel_3_1_1);

		textField_6 = new JTextField();
		textField_6.setText("Mariano");
		textField_6.setColumns(10);
		textField_6.setBounds(866, 328, 96, 14);
		add(textField_6);

		JProgressBar progressBar_1_1_1 = new JProgressBar();
		progressBar_1_1_1.setBounds(866, 353, 146, 14);
		add(progressBar_1_1_1);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1.setBounds(816, 328, 40, 40);
		add(lblNewLabel_3_1_1_1);

		textField_7 = new JTextField();
		textField_7.setText("Mariano");
		textField_7.setColumns(10);
		textField_7.setBounds(866, 387, 96, 14);
		add(textField_7);

		JProgressBar progressBar_1_1_1_1 = new JProgressBar();
		progressBar_1_1_1_1.setBounds(866, 412, 146, 14);
		add(progressBar_1_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1_1.setBounds(816, 387, 40, 40);
		add(lblNewLabel_3_1_1_1_1);

		textField_8 = new JTextField();
		textField_8.setText("Mariano");
		textField_8.setColumns(10);
		textField_8.setBounds(866, 446, 96, 14);
		add(textField_8);

		JProgressBar progressBar_1_1_1_1_1 = new JProgressBar();
		progressBar_1_1_1_1_1.setBounds(866, 471, 146, 14);
		add(progressBar_1_1_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1_1_1.setBounds(816, 446, 40, 40);
		add(lblNewLabel_3_1_1_1_1_1);

		textField_9 = new JTextField();
		textField_9.setText("Mariano");
		textField_9.setColumns(10);
		textField_9.setBounds(866, 503, 96, 14);
		add(textField_9);

		JProgressBar progressBar_1_1_1_1_1_1 = new JProgressBar();
		progressBar_1_1_1_1_1_1.setBounds(866, 528, 146, 14);
		add(progressBar_1_1_1_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1_1_1_1.setBounds(816, 503, 40, 40);
		add(lblNewLabel_3_1_1_1_1_1_1);

		textField_10 = new JTextField();
		textField_10.setText("Mariano");
		textField_10.setColumns(10);
		textField_10.setBounds(866, 561, 96, 14);
		add(textField_10);

		JProgressBar progressBar_1_1_1_1_1_1_1 = new JProgressBar();
		progressBar_1_1_1_1_1_1_1.setBounds(866, 586, 146, 14);
		add(progressBar_1_1_1_1_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(816, 561, 40, 40);
		add(lblNewLabel_3_1_1_1_1_1_1_1);

		textField_11 = new JTextField();
		textField_11.setText("Mariano");
		textField_11.setColumns(10);
		textField_11.setBounds(866, 618, 96, 14);
		add(textField_11);

		JProgressBar progressBar_1_1_1_1_1_1_1_1 = new JProgressBar();
		progressBar_1_1_1_1_1_1_1_1.setBounds(866, 643, 146, 14);
		add(progressBar_1_1_1_1_1_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1_1_1_1_1_1.setBounds(816, 618, 40, 40);
		add(lblNewLabel_3_1_1_1_1_1_1_1_1);

		JLabel fondo = new JLabel("New label");
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);
	}
}
