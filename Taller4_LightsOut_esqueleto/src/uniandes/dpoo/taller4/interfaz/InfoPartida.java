package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import javax.swing.*;


public class InfoPartida extends JPanel {
	private JLabel lblJugadas;
	private int numJugadas;
	private JTextField txtfNumJugadas;
	private JLabel lblJugador;
	private JTextField txtfNomJugador;
	
	public InfoPartida() {
		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(new GridLayout());
		lblJugadas = new JLabel ("Jugadas:");
		numJugadas = 0;
		txtfNumJugadas = new JTextField (numJugadas);
		lblJugador = new JLabel ("Jugador:");
		txtfNomJugador = new JTextField ("");
		panelInfo.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panelInfo.add(lblJugadas);
		panelInfo.add(txtfNumJugadas);
		panelInfo.add(lblJugador);
		panelInfo.add(txtfNomJugador);
	}
	
	public void contarJugada() {
		numJugadas = numJugadas + 1;
		txtfNumJugadas.setText(String.valueOf(numJugadas));
	}
}
