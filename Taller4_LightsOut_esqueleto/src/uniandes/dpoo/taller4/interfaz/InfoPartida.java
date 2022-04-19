package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class InfoPartida extends JPanel {
	private JLabel lblJugadas;
	private JTextField txtfNumJugadas;
	private JLabel lblJugador;
	private JTextField txtfNomJugador;
	
	public InfoPartida() {
		
		setLayout(new GridLayout(1,7));
		setBackground(Color.GRAY);
		
		lblJugadas = new JLabel ("Jugadas:");
		lblJugadas.setForeground(Color.WHITE);
		
		txtfNumJugadas = new JTextField ("0");
		txtfNumJugadas.setBackground(Color.DARK_GRAY);
		txtfNumJugadas.setForeground(Color.WHITE);
		txtfNumJugadas.setEditable(false);
		
		lblJugador = new JLabel ("Jugador:");
		lblJugador.setForeground(Color.WHITE);
		
		txtfNomJugador = new JTextField ("Player");
		txtfNomJugador.setBackground(Color.DARK_GRAY);
		txtfNomJugador.setForeground(Color.WHITE);
		txtfNomJugador.setEditable(false);
		
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		add(new JLabel("	"));
		add(lblJugadas);
		add(txtfNumJugadas);
		add(new JLabel("	"));
		add(lblJugador);
		add(txtfNomJugador);
		add(new JLabel("	"));
	}
	
	public void anctualizarNumJugadas(int numJugadas) {
		
		txtfNumJugadas.setText(String.valueOf(numJugadas));
	}
}
