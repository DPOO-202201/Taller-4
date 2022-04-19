package uniandes.dpoo.taller4.interfaz;

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
		btnNuevo = new JButton("NUEVO");
		btnReiniciar = new JButton("REINICIAR");
		btnTop10 = new JButton("TOP-10");
		btnCambiarJugador = new JButton("CAMBIAR JUGADOR");
		
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
