package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel {
	
	private JButton btnNuevo;
	private JButton btnReiniciar;
	private JButton btnTop10;
	private JButton btnCambiarJugador;
	
	public PanelOpciones() {
		
		setLayout(new GridLayout(23,1));
		setBackground(Color.GRAY);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.setBackground(Color.DARK_GRAY);
		btnNuevo.setForeground(Color.WHITE);
		
		btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setBackground(Color.DARK_GRAY);
		btnReiniciar.setForeground(Color.WHITE);
		
		btnTop10 = new JButton("TOP-10");
		btnTop10.setBackground(Color.DARK_GRAY);
		btnTop10.setForeground(Color.WHITE);
		
		btnCambiarJugador = new JButton("CAMBIAR JUGADOR");
		btnCambiarJugador.setBackground(Color.DARK_GRAY);
		btnCambiarJugador.setForeground(Color.WHITE);
		
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(btnNuevo);
		add(new JLabel("	"));
		add(btnReiniciar);
		add(new JLabel("	"));
		add(btnTop10);
		add(new JLabel("	"));
		add(btnCambiarJugador);
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		add(new JLabel("	"));
		
	}
	
}
