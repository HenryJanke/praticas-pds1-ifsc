package ex01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PrecoLitro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecoLitro frame = new PrecoLitro();
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
	public PrecoLitro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		String precoLitrostr = JOptionPane.showInputDialog("Preço litro");
		Double precoLitro = Double.valueOf(precoLitrostr);
		String quantLitrostr = JOptionPane.showInputDialog("Quant. Litros");
		Integer quantLitros = Integer.valueOf(quantLitrostr);
		
		totalPagamento(quantLitros,precoLitro);
		setContentPane(contentPane);
	}
	public void totalPagamento(Integer quantLitros, Double precoLitro) {
		
		JOptionPane.showMessageDialog(null,quantLitros * precoLitro );
		
	}
}
