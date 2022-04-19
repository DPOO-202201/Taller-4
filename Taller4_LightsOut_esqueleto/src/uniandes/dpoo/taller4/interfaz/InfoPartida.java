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
		
		setLayout(new GridLayout(1,4));
		lblJugadas = new JLabel ("Jugadas:");
		txtfNumJugadas = new JTextField ("0");
		txtfNumJugadas.setEditable(false);
		lblJugador = new JLabel ("Jugador:");
		txtfNomJugador = new JTextField ("");
		txtfNomJugador.setEditable(false);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		add(lblJugadas);
		add(txtfNumJugadas);
		add(lblJugador);
		add(txtfNomJugador);
	}
	
	public void anctualizarNumJugadas(int numJugadas) {
		
		txtfNumJugadas.setText(String.valueOf(numJugadas));
	}
}
