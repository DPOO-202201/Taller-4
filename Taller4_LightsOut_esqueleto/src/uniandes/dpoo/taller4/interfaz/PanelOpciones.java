package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel implements ActionListener {
	
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
		
		btnTop10.addActionListener(this);
		
		btnTop10.setActionCommand("TOP10");
		
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
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equals("TOP10")) {
			new VentanaTop10().setVisible(true);
		}
	}
	
}
