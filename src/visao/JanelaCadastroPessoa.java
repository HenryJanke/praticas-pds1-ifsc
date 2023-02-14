package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel btnCpf = new JLabel("Cpf: ");
		btnCpf.setBounds(75, 97, 72, 17);
		contentPane.add(btnCpf);

		txtCpf = new JTextField();
		txtCpf.setBounds(157, 95, 184, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();
				String cpfstr = txtCpf.getText();

				FuncionarioDAO funcionario = new FuncionarioDAO();
				funcionario.setCpf(cpfstr);
				funcionario.setNome(nome);
				
				
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Neunhum nome preenchido");
				}else {
					JOptionPane.showMessageDialog(null, "Nome preenchido");
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(178, 207, 100, 23);
		contentPane.add(btnNewButton);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(157, 141, 184, 20);
		contentPane.add(txtNome);

		JLabel btnNome = new JLabel("Nome: ");
		btnNome.setBounds(75, 144, 72, 17);
		contentPane.add(btnNome);
	}
}
