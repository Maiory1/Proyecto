package cinesElorrietaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CineElorrieta_Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_Registro;
	private JTextField textF_Nombre;
	private JTextField textF_Apellido;
	private JTextField textF_DNI;
	private JTextField textF_Sexo;
	private JTextField textF_Contrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CineElorrieta_Registro frame = new CineElorrieta_Registro();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CineElorrieta_Registro() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1530, 880);
		panel_Registro = new JPanel();
		panel_Registro.setBackground(new Color(245, 245, 245));
		panel_Registro.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_Registro);
		panel_Registro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblNewLabel.setBounds(699, 287, 141, 38);
		panel_Registro.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblApellido.setBounds(699, 336, 141, 38);
		panel_Registro.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblDni.setBounds(699, 385, 141, 38);
		panel_Registro.add(lblDni);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblSexo.setBounds(699, 434, 141, 38);
		panel_Registro.add(lblSexo);
		
		JLabel lblContrasenia = new JLabel("Contrasenia:");
		lblContrasenia.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblContrasenia.setBounds(699, 483, 141, 38);
		panel_Registro.add(lblContrasenia);
		
		JLabel lbl_Logo = new JLabel("");
		lbl_Logo.setIcon(new ImageIcon(CineElorrieta_Registro.class.getResource("/images/Logo.png")));
		lbl_Logo.setBounds(10, 166, 500, 500);
		panel_Registro.add(lbl_Logo);
		
		textF_Nombre = new JTextField();
		textF_Nombre.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Nombre.setBounds(835, 287, 280, 29);
		panel_Registro.add(textF_Nombre);
		textF_Nombre.setColumns(10);
		
		textF_Apellido = new JTextField();
		textF_Apellido.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Apellido.setColumns(10);
		textF_Apellido.setBounds(835, 336, 280, 29);
		panel_Registro.add(textF_Apellido);
		
		textF_DNI = new JTextField();
		textF_DNI.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_DNI.setColumns(10);
		textF_DNI.setBounds(835, 385, 280, 29);
		panel_Registro.add(textF_DNI);
		
		textF_Sexo = new JTextField();
		textF_Sexo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Sexo.setColumns(10);
		textF_Sexo.setBounds(835, 434, 280, 29);
		panel_Registro.add(textF_Sexo);
		
		textF_Contrasenia = new JTextField();
		textF_Contrasenia.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Contrasenia.setColumns(10);
		textF_Contrasenia.setBounds(835, 483, 280, 29);
		panel_Registro.add(textF_Contrasenia);
		
		JLabel lbl_DecorationRegistro = new JLabel("");
		lbl_DecorationRegistro.setIcon(new ImageIcon(CineElorrieta_Registro.class.getResource("/images/Decoration_Registro.png")));
		lbl_DecorationRegistro.setBounds(531, 114, 842, 106);
		panel_Registro.add(lbl_DecorationRegistro);
		
		JLabel lbl_DecorationRegistro1 = new JLabel("");
		lbl_DecorationRegistro1.setIcon(new ImageIcon(CineElorrieta_Registro.class.getResource("/images/Decoration_Registro.png")));
		lbl_DecorationRegistro1.setBounds(531, 618, 842, 106);
		panel_Registro.add(lbl_DecorationRegistro1);
		
		JButton btn_panelCines = new JButton("Siguiente");
		btn_panelCines.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_panelCines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_panelCines.setBounds(175, 714, 172, 43);
		panel_Registro.add(btn_panelCines);
		
		JButton btn_Registro = new JButton("Registrarse");
		btn_Registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Registro.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_Registro.setBounds(872, 566, 172, 41);
		panel_Registro.add(btn_Registro);
		
		JLabel lbl_Informativo = new JLabel("¿Ya tienes cuenta?");
		lbl_Informativo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Informativo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		lbl_Informativo.setBounds(175, 674, 180, 29);
		panel_Registro.add(lbl_Informativo);
			
		}
	}
